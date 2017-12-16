package com.tomtop.zhizi.datacenter.crawler;

import com.tomtop.zhizi.datacenter.crawler.elasticsearch.track.TrackNews;

import java.util.List;

public interface Crawler {
    List<TrackNews> queryTrackDetailList(String transCode) throws Exception;
}
