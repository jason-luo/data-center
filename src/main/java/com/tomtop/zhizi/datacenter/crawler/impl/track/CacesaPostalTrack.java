package com.tomtop.zhizi.datacenter.crawler.impl.track;

import com.tomtop.zhizi.datacenter.crawler.Crawler;
import com.tomtop.zhizi.datacenter.crawler.elasticsearch.track.TrackNews;
import com.tomtop.zhizi.datacenter.tools.TimeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
瑞士小包
 */
@Component
public class CacesaPostalTrack implements Crawler {
    private static final String PostUrl = "http://www.cacesapostal.com/Tracking?q=";

    public List<TrackNews> queryTrackDetailList(String transCode) throws Exception {
        Document doc = Jsoup.connect(PostUrl + transCode).get();
        Element header = doc.getElementById("ctl00_contentLeftPublico_lblNumEnvio");

        Elements ulList = doc.getElementsByTag("ul");
        Element timeLine = null;
        for (Element ul : ulList) {
            if (ul.classNames().contains("timeline")) {
                timeLine = ul;
                break;
            }
        }
        if (timeLine == null) {
            return null;
        }

        List<TrackNews> trackNewsList = new ArrayList<>();

        Elements detailListBlock = timeLine.getElementsByTag("li");
        for (Element li : detailListBlock) {
            Elements timeBlock = li.select("div div.timeline-heading p small");
            Elements descBlock = li.select("div div.timeline-body p");

            String time = timeBlock.get(0).text();
            String event = descBlock.get(0).text();
            TrackNews news = new TrackNews();
            String normalizedTime = TimeUtils.convert(time, "dd/MM/yyyy HH:mm", "yyyy-MM-dd HH:mm:ss");
            news.setTime(normalizedTime);
            news.setEvent(event);
            trackNewsList.add(news);
        }
        return trackNewsList;
    }

    public static void main(String[] args) throws Exception {
        List<TrackNews> trackLists = new CacesaPostalTrack().queryTrackDetailList("RL908325532CH");
        System.out.println(trackLists);
    }
}
