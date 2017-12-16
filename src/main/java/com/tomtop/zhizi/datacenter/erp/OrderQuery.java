package com.tomtop.zhizi.datacenter.erp;

import com.tomtop.zhizi.datacenter.erp.model.order.ErpOrderResponse;
import com.tomtop.zhizi.datacenter.erp.model.order.Order;

public class OrderQuery {
    private OrderQueryCondition condition = null;
    private ErpOrderResponse rsp = null;
    private int nextPageIndex = 0;

    private OrderQuery(OrderQueryCondition condition) {
        this.condition = condition;
    }

    public static OrderQuery build(String beginDate, String endDate, int pageSize) {
        OrderQueryCondition condition = new OrderQueryCondition();
        condition.setShip_confirm_date_begin(beginDate);
        condition.setShip_confirm_date_end(endDate);
        condition.setPage_size(pageSize);
        condition.setPage_index(1);
        OrderQuery query = new OrderQuery(condition);
        ErpOrderResponse rsp = ErpRestApi.queryOrderByCondition(condition);
        query.rsp = rsp;
        return query;
    }

    public int getPageSize(){
        return condition.getPage_size();
    }

    public int getPageCount(){
        return rsp.getPage_total();
    }

    public long getTotalCount(){
        return rsp.getTotal_count();
    }

    public ErpOrderResponse next() {
        nextPageIndex++;
        return getPage(nextPageIndex);
    }


    public ErpOrderResponse getPage(int pageIndex) {
        if (pageIndex > rsp.getPage_total()){
            return null;
        }
        if (rsp.getPage_index() == nextPageIndex) {
            return rsp;
        }

        nextPageIndex = pageIndex;
        condition.setPage_index(nextPageIndex);
        rsp = ErpRestApi.queryOrderByCondition(condition);
        return rsp;
    }

    public static void main(String[] args) {
        OrderQuery query = OrderQuery.build("2017-12-10 01:01:00", "2017-12-11 01:30:00", 2000);
        while(true){
            ErpOrderResponse rsp = query.next();
            if (rsp == null){
                break;
            }
            for (Order order : rsp.getResult()){
                System.out.println(order);
            }
        }

    }
}
