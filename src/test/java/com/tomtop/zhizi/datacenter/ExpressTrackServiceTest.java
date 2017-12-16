package com.tomtop.zhizi.datacenter;

import com.tomtop.zhizi.datacenter.crawler.impl.track.CacesaPostalTrack;
import com.tomtop.zhizi.datacenter.crawler.elasticsearch.track.ExpressTrack;
import com.tomtop.zhizi.datacenter.crawler.elasticsearch.track.ExpressTrackRepository;
import com.tomtop.zhizi.datacenter.crawler.elasticsearch.track.TrackNews;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpressTrackServiceTest {
    @Autowired
    private ExpressTrackRepository repository;

    public void deleteAll(){
        this.repository.deleteAll();
    }

    public void saveExpressTrack() {
        List<Map.Entry<String, String>> tracks = new ArrayList<>();
        tracks.add(new AbstractMap.SimpleEntry<String, String>("65557162", "RX622248820CH"));
        tracks.add(new AbstractMap.SimpleEntry<String, String>("62494904", "RX622105106CH"));
        for (Map.Entry<String,String> trackKeys : tracks){
            ExpressTrack track = new ExpressTrack(trackKeys.getKey(), trackKeys.getValue());
            try {
                List<TrackNews> trackNews = new CacesaPostalTrack().queryTrackDetailList(track.getTransCode());
                track.setTrackNewsList(trackNews);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("------------------------------------------------");
            }
            this.repository.save(track);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void fetchAllExpressTracks() {
        System.out.println("ExpressTrack found with findAll():");
        System.out.println("-------------------------------");
        for (ExpressTrack track : this.repository.findAll()) {
            System.out.println(track);
        }
        System.out.println();
    }

    public void fetchIndividualExpressTrack() {
        System.out.println("ExpressTrack found with findByOrderId('52911935'):");
        System.out.println("--------------------------------");
        System.out.println(this.repository.findByOrderId("52911935"));

        System.out.println("ExpressTrack found with findByTransCode('RL908325532CH'):");
        System.out.println("--------------------------------");
        for (ExpressTrack track : this.repository.findByTransCode("RL908325532CH")) {
            System.out.println(track);
        }
    }

    public long count(){
        return this.repository.count();
    }
}
