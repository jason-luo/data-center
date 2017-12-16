package com.tomtop.zhizi.datacenter.erp.model.order;


import com.tomtop.zhizi.datacenter.common.Constants;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 6404768466458655315L;

    /**
     * 追踪号追踪更新时间
     */
    private Integer order_refund_border;
    /**
     * 追踪号追踪更新时间
     */
    private String track_updated;
    /**
     * 发货时间(最后的发货时间)
     */
    private String take_delivery_date;
    /**
     * 订单状态
     */
    private Integer order_status;
    /**
     * 平邮跟踪号
     */
    private String localTrackNumber;
    /**
     * 跟踪号
     */
    private String track_number;
    /**
     * "ID", dataType = "Long")
     */
    private String _id;
    /**
     * "SKU", dataType = "String")
     */
    private List<String> sku;
    /**
     * "数量", dataType = "Integer")
     */
    private Integer qty;
    /**
     * "商品毛收入（RMB）", dataType = "Double")
     */
    private Double gross_default;
    /**
     * "商品利润", dataType = "Double")
     */
    private Double profit;
    /**
     * "商品成本", dataType = "Double")
     */
    private Double product_cost;
    /**
     * "仓库id", dataType = "Integer")
     */
    private Integer stock_id;
    /**
     * "销售状态", dataType = "Integer")
     */
    private Integer sale_status;
    /**
     * "商品SPU", dataType = "String")
     */
    private String spu;
    /**
     * "订单号", dataType = "String")
     */
    private String item_no;
    /**
     * "商品ID", dataType = "Integer")
     */
    private Integer product_id;
    /**
     * "订单ID", dataType = "Long")
     */
    private Long order_id;
    /**
     * "退款日期", dataType = "String")
     */
    private String return_date;
    /**
     * "发货日期", dataType = "String")
     */
    private String ship_confirm_date;
    /**
     * "质检日期", dataType = "String")
     */
    private String quality_testing_date;
    /**
     * "采购时间", dataType = "String")
     */
    private String purchase_date;
    /**
     * "订单录入时间", dataType = "String")
     */
    private String input_date;
    /**
     * "平台", dataType = "String")
     */
    private String platform;
    /**
     * "退款金额（RMB）", dataType = "Double")
     */
    private Double return_rmb_cost;
    /**
     * "创建类型", dataType = "String")
     */
    private String create_type;
    /**
     * "itemId", dataType = "String")
     */
    private String item_id;
    /**
     * "录入人/客服", dataType = "String")
     */
    private String input_user;
    /**
     * "运费", dataType = "String")
     */
    private String shipping_cost;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getOrder_refund_border() {
        return order_refund_border;
    }

    public void setOrder_refund_border(Integer order_refund_border) {
        this.order_refund_border = order_refund_border;
    }

    public String getTrack_updated() {
        return track_updated;
    }

    public void setTrack_updated(String track_updated) {
        this.track_updated = track_updated;
    }

    public String getTake_delivery_date() {
        return take_delivery_date;
    }

    public void setTake_delivery_date(String take_delivery_date) {
        this.take_delivery_date = take_delivery_date;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getLocalTrackNumber() {
        return localTrackNumber;
    }

    public void setLocalTrackNumber(String localTrackNumber) {
        this.localTrackNumber = localTrackNumber;
    }

    public String getTrack_number() {
        return track_number;
    }

    public void setTrack_number(String track_number) {
        this.track_number = track_number;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<String> getSku() {
        return sku;
    }

    public void setSku(List<String> sku) {
        this.sku = sku;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getGross_default() {
        return gross_default;
    }

    public void setGross_default(Double gross_default) {
        this.gross_default = gross_default;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getProduct_cost() {
        return product_cost;
    }

    public void setProduct_cost(Double product_cost) {
        this.product_cost = product_cost;
    }

    public Integer getStock_id() {
        return stock_id;
    }

    public void setStock_id(Integer stock_id) {
        this.stock_id = stock_id;
    }

    public Integer getSale_status() {
        return sale_status;
    }

    public void setSale_status(Integer sale_status) {
        this.sale_status = sale_status;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getShip_confirm_date() {
        return ship_confirm_date;
    }

    public void setShip_confirm_date(String ship_confirm_date) {
        this.ship_confirm_date = ship_confirm_date;
    }

    public String getQuality_testing_date() {
        return quality_testing_date;
    }

    public void setQuality_testing_date(String quality_testing_date) {
        this.quality_testing_date = quality_testing_date;
    }

    public String getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getInput_date() {
        return input_date;
    }

    public void setInput_date(String input_date) {
        this.input_date = input_date;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getReturn_rmb_cost() {
        return return_rmb_cost;
    }

    public void setReturn_rmb_cost(Double return_rmb_cost) {
        this.return_rmb_cost = return_rmb_cost;
    }

    public String getCreate_type() {
        return create_type;
    }

    public void setCreate_type(String create_type) {
        this.create_type = create_type;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getInput_user() {
        return input_user;
    }

    public void setInput_user(String input_user) {
        this.input_user = input_user;
    }

    public String getShipping_cost() {
        return shipping_cost;
    }

    public void setShipping_cost(String shipping_cost) {
        this.shipping_cost = shipping_cost;
    }

    public String getIs_register() {
        return is_register;
    }

    public void setIs_register(String is_register) {
        this.is_register = is_register;
    }

    public Integer getShipping_company_id() {
        return shipping_company_id;
    }

    public void setShipping_company_id(Integer shipping_company_id) {
        this.shipping_company_id = shipping_company_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTo_email() {
        return to_email;
    }

    public void setTo_email(String to_email) {
        this.to_email = to_email;
    }

    public String getFake_sku() {
        return fake_sku;
    }

    public void setFake_sku(String fake_sku) {
        this.fake_sku = fake_sku;
    }

    public String getOrder_gross_default() {
        return order_gross_default;
    }

    public void setOrder_gross_default(String order_gross_default) {
        this.order_gross_default = order_gross_default;
    }

    public String getOrder_profit() {
        return order_profit;
    }

    public void setOrder_profit(String order_profit) {
        this.order_profit = order_profit;
    }

    public Double getOrder_shipping_cost() {
        return order_shipping_cost;
    }

    public void setOrder_shipping_cost(Double order_shipping_cost) {
        this.order_shipping_cost = order_shipping_cost;
    }

    public Double getOrder_return_rmb_cost() {
        return order_return_rmb_cost;
    }

    public void setOrder_return_rmb_cost(Double order_return_rmb_cost) {
        this.order_return_rmb_cost = order_return_rmb_cost;
    }

    public Double getOrder_product_cost() {
        return order_product_cost;
    }

    public void setOrder_product_cost(Double order_product_cost) {
        this.order_product_cost = order_product_cost;
    }

    public Integer getRefund_verify_type() {
        return refund_verify_type;
    }

    public void setRefund_verify_type(Integer refund_verify_type) {
        this.refund_verify_type = refund_verify_type;
    }

    public String getCheck_date() {
        return check_date;
    }

    public void setCheck_date(String check_date) {
        this.check_date = check_date;
    }

    public String getBursary_check_date() {
        return bursary_check_date;
    }

    public void setBursary_check_date(String bursary_check_date) {
        this.bursary_check_date = bursary_check_date;
    }

    public String getWait_create_batch_date() {
        return wait_create_batch_date;
    }

    public void setWait_create_batch_date(String wait_create_batch_date) {
        this.wait_create_batch_date = wait_create_batch_date;
    }

    public String getPrint_label_date() {
        return print_label_date;
    }

    public void setPrint_label_date(String print_label_date) {
        this.print_label_date = print_label_date;
    }

    public String getCollection_verify_date() {
        return collection_verify_date;
    }

    public void setCollection_verify_date(String collection_verify_date) {
        this.collection_verify_date = collection_verify_date;
    }

    public String getShipping_verify_date() {
        return shipping_verify_date;
    }

    public void setShipping_verify_date(String shipping_verify_date) {
        this.shipping_verify_date = shipping_verify_date;
    }

    public Double getTransfer_fee() {
        return transfer_fee;
    }

    public void setTransfer_fee(Double transfer_fee) {
        this.transfer_fee = transfer_fee;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getShipping_type() {
        return shipping_type;
    }

    public void setShipping_type(Integer shipping_type) {
        this.shipping_type = shipping_type;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getEbay_transaction_id() {
        return ebay_transaction_id;
    }

    public void setEbay_transaction_id(String ebay_transaction_id) {
        this.ebay_transaction_id = ebay_transaction_id;
    }

    public Double getOriginal_product_cost() {
        return original_product_cost;
    }

    public void setOriginal_product_cost(Double original_product_cost) {
        this.original_product_cost = original_product_cost;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public Double getNet_default() {
        return net_default;
    }

    public void setNet_default(Double net_default) {
        this.net_default = net_default;
    }

    public Double getReturn_cost_default() {
        return return_cost_default;
    }

    public void setReturn_cost_default(Double return_cost_default) {
        this.return_cost_default = return_cost_default;
    }

    public String getUpload_tracking_number_time() {
        return upload_tracking_number_time;
    }

    public void setUpload_tracking_number_time(String upload_tracking_number_time) {
        this.upload_tracking_number_time = upload_tracking_number_time;
    }

    public String getPrint_label_user() {
        return print_label_user;
    }

    public void setPrint_label_user(String print_label_user) {
        this.print_label_user = print_label_user;
    }

    public Integer getCollection_verify_user() {
        return collection_verify_user;
    }

    public void setCollection_verify_user(Integer collection_verify_user) {
        this.collection_verify_user = collection_verify_user;
    }

    public Integer getPackage_user_id() {
        return package_user_id;
    }

    public void setPackage_user_id(Integer package_user_id) {
        this.package_user_id = package_user_id;
    }

    public String getShip_confirm_user() {
        return ship_confirm_user;
    }

    public void setShip_confirm_user(String ship_confirm_user) {
        this.ship_confirm_user = ship_confirm_user;
    }

    public Double getShipping_weight() {
        return shipping_weight;
    }

    public void setShipping_weight(Double shipping_weight) {
        this.shipping_weight = shipping_weight;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    /**
     * "发货代码", dataType = "String")
     */
    private String is_register;
    /**
     * "渠道id", dataType = "String")
     */
    private Integer shipping_company_id;
    /**
     * "国家", dataType = "String")
     */
    private String country;
    /**
     * "公司邮箱", dataType = "String")
     */
    private String to_email;
    /**
     * "虚拟SKU", dataType = "String")
     */
    private String fake_sku;
    /**
     * "订单毛收入（RMB）", dataType = "String")
     */
    private String order_gross_default;
    /**
     * "订单利润（RMB）", dataType = "String")
     */
    private String order_profit;
    /**
     * "运费", dataType = "Double")
     */
    private Double order_shipping_cost;
    /**
     * "退款金额（RMB）", dataType = "Double")
     */
    private Double order_return_rmb_cost;
    /**
     * "订单商品总成本", dataType = "Double")
     */
    private Double order_product_cost;
    /**
     * "退款类型", dataType = "String")
     */
    private Integer refund_verify_type;
    /**
     * "确认订单时间", dataType = "String")
     */
    private String check_date;
    /**
     * "财务确认订单时间", dataType = "String")
     */
    private String bursary_check_date;
    /**
     * "生成波次日期", dataType = "String")
     */
    private String wait_create_batch_date;
    /**
     * "捡货时间", dataType = "String")
     */
    private String print_label_date;
    /**
     * "验货时间/包装时间", dataType = "String")
     */
    private String collection_verify_date;
    /**
     * "渠道复核时间", dataType = "String")
     */
    private String shipping_verify_date;
    /**
     * "转仓费用", dataType = "Double")
     */
    private Double transfer_fee;
    /**
     * "更新时间(格式：2000-01-01 00:00:00)", dataType = "String")
     */
    private String updated;
    /**
     * "订单渠道", dataType = "Integer")
     */
    private Integer shipping_type;
    /**
     * "货品标题", dataType = "String")
     */
    private String item_title = "";
    /**
     * "eBay交易信息ID", dataType = "String")
     */
    private String ebay_transaction_id;
    /**
     * "原商品成本", dataType = "Double")
     */
    private Double original_product_cost = 0.0;
    /**
     * "创建日期", dataType = "String")
     */
    private String created_date;
    /**
     * "商品净收入, dataType = "Double")
     */
    private Double net_default = 0.0;
    /**
     * "退款金额", dataType = "Double")
     */
    private Double return_cost_default = 0.0;
    /**
     * "上传追踪号时间", dataType = "String")
     */
    private String upload_tracking_number_time;
    /**
     * "捡货人", dataType = "String")
     */
    private String print_label_user;
    /**
     * "验货人/包装人", dataType = "String")
     */
    private Integer collection_verify_user;
    private Integer package_user_id;
    /**
     * "发货人", dataType = "String")
     */
    private String ship_confirm_user;
    /**
     * "订单包裹重量")
     */
    private Double shipping_weight;
    /**
     * "平台账号标识")
     */
    private String invoice_number;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("订单号:").append(order_id).append(Constants.SPILT_UNIDLINE);
        sb.append("跟踪号:").append(track_number).append(Constants.SPILT_UNIDLINE);
        sb.append("平邮跟踪号:").append(localTrackNumber)
                .append(Constants.SPILT_UNIDLINE);
        sb.append("国内退件状态值:").append(order_refund_border)
                .append(Constants.SPILT_UNIDLINE);
        sb.append("仓库ID:").append(stock_id).append(Constants.SPILT_UNIDLINE);
        sb.append("发货代码:").append(is_register).append(Constants.SPILT_UNIDLINE);
        sb.append("渠道ID:").append(shipping_company_id)
                .append(Constants.SPILT_UNIDLINE);
        sb.append("订单状态:").append(order_status)
                .append(Constants.SPILT_UNIDLINE);
        sb.append("目的国:").append(country).append(Constants.SPILT_UNIDLINE);
        sb.append("平台:").append(platform).append(Constants.SPILT_UNIDLINE);
        sb.append("订单更新时间:").append(track_updated)
                .append(Constants.SPILT_UNIDLINE);
        sb.append("发货时间:").append(ship_confirm_date);
        return sb.toString();
    }
}
