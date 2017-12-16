package com.tomtop.zhizi.datacenter.crawler.impl.track;

import com.tomtop.zhizi.datacenter.crawler.Crawler;
import com.tomtop.zhizi.datacenter.crawler.elasticsearch.track.TrackNews;
import com.tomtop.zhizi.datacenter.tools.TimeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
以色列邮政
 */
public class IsraelTrack implements Crawler {
    private final String PostUrl = "http://www.israelpost.co.il/itemtrace.nsf/mainsearchNOHE?OpenForm&L=EN&itemcode=";

    @Override
    public List<TrackNews> queryTrackDetailList(String transCode) throws Exception {
        Document doc = Jsoup.connect(PostUrl + transCode).get();
        Elements rows = doc.select("div#itemcodeinfo table tbody tr");
        // 以色列的物流显示比较奇葩,目前发现两种显示:
        // first: 四列
        //Date	Postal Unit	City	Description
        //21/11/2017	Mobile postal unit כרמיאל	settlement Rakefet	Undergoing processing for delivery to addressee
        //
        //second:两列
        //Date	Description
        //28/11/2017 12:48	The EMS item is undergoing customs processing . Notice sent to the addressee.

        // 分析物流信息头部得到指定字段的下标
        int dateIdx = -1;
        int locationIdx = -1;
        int descIdx = -1;
        Element header = rows.get(0);
        Elements colNames = header.getElementsByTag("td");
        int idx = 0;
        for (Element colName : colNames) {
            if (colName.text().equals("Date")) {
                dateIdx = idx;
            } else if (colName.text().equals("Description")) {
                descIdx = idx;
            } else if (colName.text().equals("City")) {
                locationIdx = idx;
            }
            idx++;
        }

        if (dateIdx == -1 || descIdx == -1) {
            return null;
        }

        List<TrackNews> trackNewsList = new ArrayList<>();
        List<Element> details = rows.subList(1, rows.size());
        for (Element row : details) {
            TrackNews trackNews = new TrackNews();
            Elements cols = row.getElementsByTag("td");
            trackNews.setTime(normalizeDate(cols.get(dateIdx).text()));
            trackNews.setEvent(cols.get(descIdx).text());
            if (locationIdx != -1) {
                trackNews.setPosition(cols.get(locationIdx).text());
            }
            trackNewsList.add(trackNews);
        }

        return null;
    }

    private static String normalizeDate(String date_time) throws Exception {
        if (StringUtils.isBlank(date_time)) {
            return null;
        }

        String[] parsePatterns = {"dd/MM/yyyy HH:mm", "dd/MM/yyyy"};
        Date time = DateUtils.parseDate(date_time, parsePatterns);
        return TimeUtils.convert(time, "yyyy-MM-dd HH:mm:ss");
    }
}
