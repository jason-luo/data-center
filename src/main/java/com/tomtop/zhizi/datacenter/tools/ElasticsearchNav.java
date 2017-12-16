package com.tomtop.zhizi.datacenter.tools;

import com.carrotsearch.hppc.cursors.ObjectObjectCursor;
import org.elasticsearch.action.admin.indices.get.GetIndexRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetMappingsRequest;
import org.elasticsearch.action.admin.indices.mapping.get.GetMappingsResponse;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.cluster.metadata.IndexMetaData;
import org.elasticsearch.cluster.metadata.MappingMetaData;
import org.elasticsearch.common.collect.ImmutableOpenMap;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;


import static org.elasticsearch.common.xcontent.XContentFactory.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class ElasticsearchNav {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    private TransportClient client;
    private static final String[] esHost = {"192.168.12.158"};
    private static final String clusterName = "elasticsearch";
    //private static final String[] esHost = {"192.168.0.190"};
    //private static final String clusterName = "tomtop";
    public Client open() throws UnknownHostException {
        Settings settings = Settings.settingsBuilder()
                .put("cluster.name", clusterName).build();

        client = TransportClient.builder().settings(settings).build();
        for (int i = 0; i < esHost.length; i++) {
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(esHost[i]), 9300));
        }
        return client;
    }

    public void put(Client client) throws IOException {
        IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
                .setSource(jsonBuilder()
                        .startObject()
                        .field("user", "kimchy")
                        .field("postDate", new Date())
                        .field("message", "trying out Elasticsearch")
                        .endObject()
                )
                .get();
        System.out.println(response.getId());
        System.out.println(response.getIndex());
        System.out.println(response.getType());
        System.out.println(response.getVersion());
    }




    private static void delete(Client client) {
        DeleteResponse response = client.prepareDelete("twitter", "tweet", "1").get();
        System.out.println(response.getId());
        System.out.println(response.getIndex());
        System.out.println(response.getType());
        System.out.println(response.getVersion());
    }

    private static void get(Client client) {
        GetResponse response = client.prepareGet("twitter", "tweet", "1")
                .get();


        Map<String, Object> source = response.getSource();
        for (Map.Entry<String, Object> e : source.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println(System.currentTimeMillis());
        ElasticsearchNav nav = new ElasticsearchNav();

        Client client = nav.open();
        //
        //ImmutableOpenMap<String, IndexMetaData> indices = client.admin().cluster()
        //        .prepareState().get().getState()
        //        .getMetaData().getIndices();


        // 获取所有索引和type
        String[] indices = client.admin()
                .indices()
                .getIndex(new GetIndexRequest())
                .actionGet()
                .getIndices();
        for (String indice : indices){
            System.out.println(indice);
            List<String> typeList = new ArrayList<String>();
            try {
                GetMappingsResponse res = client.admin().indices().getMappings(new GetMappingsRequest().indices(indice)).get();
                ImmutableOpenMap<String, MappingMetaData> mapping = res.mappings().get(indice);
                for (ObjectObjectCursor<String, MappingMetaData> c : mapping) {
                    typeList.add(c.key);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            for (String type : typeList) {
                System.out.println(type);
            }
        }


        //SearchResponse response = client.prepareSearch().execute().actionGet();
        //
        //nav.put(client);
        //
        //get(client);
        //
        //delete(client);
        //System.out.println(System.currentTimeMillis());

    }
}
