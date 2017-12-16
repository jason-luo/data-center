package com.tomtop.zhizi.datacenter.erp;

import com.tomtop.zhizi.datacenter.erp.model.order.ErpOrderResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class ErpRestApi {
    private final static RestTemplate restTemplate = new RestTemplate();

    private static String url = "http://192.168.0.54:8105/order/queryOrder?api_key=MzUzYjMwMmM0NDU3NGY1NjUwNDU2ODdlNTM0ZTdkNmE6Mjg2OTI0Njk3ZTYxNWE2NzJhNjQ";
    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
    }


    public static ErpOrderResponse queryOrderByOrderId(Integer orderId){
        OrderQueryCondition queryCondition = new OrderQueryCondition();
        queryCondition.setOrder_ids(String.valueOf(orderId));

        return queryOrderByCondition(queryCondition);
    }



    public static ErpOrderResponse queryOrderByCondition(OrderQueryCondition queryCondition){
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<OrderQueryCondition> httpEntity = new HttpEntity(queryCondition, headers);
        return (ErpOrderResponse)restTemplate.postForObject(url, httpEntity, ErpOrderResponse.class);
    }
}
