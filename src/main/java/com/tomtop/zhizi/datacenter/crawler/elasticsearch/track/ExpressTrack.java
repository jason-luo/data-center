package com.tomtop.zhizi.datacenter.crawler.elasticsearch.track;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.util.Date;
import java.util.List;

@Document(indexName = "express", type = "track_details", shards = 1, replicas = 0, refreshInterval = "-1")
public class ExpressTrack {
    @Id
    private String id;

    private String transCode;

    private String orderId;

    @Field(
            type = FieldType.Date,
            index = FieldIndex.not_analyzed,
            store = true,
            format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date crawlerTime;

    private List<TrackNews> trackNewsList;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Date getCrawlerTime() {
        return crawlerTime;
    }

    public void setCrawlerTime(Date crawlerTime) {
        this.crawlerTime = crawlerTime;
    }
    public List<TrackNews> getTrackNewsList() {
        return trackNewsList;
    }

    public void setTrackNewsList(List<TrackNews> trackNewsList) {
        this.trackNewsList = trackNewsList;
    }

    public ExpressTrack(){

    }
    public ExpressTrack(String orderId, String transCode){
        this.transCode = transCode;
        this.orderId = orderId;
        this.id = transCode + "_" + orderId;

    }
    @Override
    public String toString() {
        return "ExpressTrack{" +
                "id='" + id + '\'' +
                ", transCode='" + transCode + '\'' +
                ", orderId='" + orderId + '\'' +
                ", crawlerTime='" + crawlerTime + '\'' +
                ", trackNewsList=" + trackNewsList +
                '}';
    }


}
