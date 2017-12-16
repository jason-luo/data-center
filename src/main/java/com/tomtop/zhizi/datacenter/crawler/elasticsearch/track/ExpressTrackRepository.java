package com.tomtop.zhizi.datacenter.crawler.elasticsearch.track;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ExpressTrackRepository
        extends ElasticsearchRepository<ExpressTrack, String>{
    public List<ExpressTrack> findByTransCode(String transCode);
    public List<ExpressTrack> findByOrderId(String orderId);
}
