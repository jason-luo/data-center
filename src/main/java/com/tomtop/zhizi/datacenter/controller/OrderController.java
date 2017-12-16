package com.tomtop.zhizi.datacenter.controller;

import com.tomtop.zhizi.datacenter.erp.ErpRestApi;
import com.tomtop.zhizi.datacenter.erp.model.order.ErpOrderResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(value = "/order/query/{orderId}")
    public ErpOrderResponse userList(@PathVariable("orderId") Integer orderId){
        return ErpRestApi.queryOrderByOrderId(orderId);
    }
}
