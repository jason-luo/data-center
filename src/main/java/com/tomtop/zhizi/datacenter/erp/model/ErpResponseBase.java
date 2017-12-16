package com.tomtop.zhizi.datacenter.erp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ErpResponseBase<T> implements Serializable{
    protected long timestamp = new Date().getTime();
    protected int code = 200;
    protected String message;
    private String version = "1.0";
    private int page_index;
    private int page_size;
    private Long total_count;
    private int page_total;
    private Boolean has_next_page = false;
    private Boolean has_data = false;
    private List<T> result;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPage_index() {
        return page_index;
    }

    public void setPage_index(int page_index) {
        this.page_index = page_index;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public Long getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Long total_count) {
        this.total_count = total_count;
    }

    public int getPage_total() {
        return page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public Boolean getHas_next_page() {
        return has_next_page;
    }

    public void setHas_next_page(Boolean has_next_page) {
        this.has_next_page = has_next_page;
    }

    public Boolean getHas_data() {
        return has_data;
    }

    public void setHas_data(Boolean has_data) {
        this.has_data = has_data;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
