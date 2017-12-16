package com.tomtop.zhizi.datacenter.crawler.elasticsearch.track;

public class TrackNews {
    private String time;
    private String position;
    private String event;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "TrackNews{" +
                "time='" + time + '\'' +
                ", position='" + position + '\'' +
                ", event='" + event + '\'' +
                '}';
    }
}
