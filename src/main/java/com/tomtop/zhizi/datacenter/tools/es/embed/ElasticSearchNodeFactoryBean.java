package com.tomtop.zhizi.datacenter.tools.es.embed;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Factory bean that creates an embedded ElasticSearch node
 *
 */
@Profile("it")
@Component
public class ElasticSearchNodeFactoryBean implements FactoryBean<Node> {

    private Node node;

    @Value("${elasticsearch.clustername}")
    private String esClusterName;

    @Override
    public Node getObject() throws Exception {
        return getNode();
    }

    @Override
    public Class getObjectType() {
        return Node.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    private Node getNode() {

        Settings.Builder settingsBuilder = Settings.settingsBuilder();

        settingsBuilder.put("node.name", "jason");
        //settingsBuilder.put("path.data", "MyElasticSearch");
        settingsBuilder.put("path.home", "MyElasticSearchPathHome");
        settingsBuilder.put("http.enabled", false);

        Settings settings = settingsBuilder.build();

        node = NodeBuilder.nodeBuilder()
                .settings(settings)
                .clusterName("tomtop")
                .data(true).local(true).node();
        return node;
    }
}