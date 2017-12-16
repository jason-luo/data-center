package com.tomtop.zhizi.datacenter.erp;

public class OrderQueryCondition {
	/**
	 * 最后发货日期开始(格式：2000-01-01 00:00:00)
	 */
	private String take_delivery_date_begin;
	/**
	 * 最后发货日期截至(格式：2000-01-01 00:00:00)
	 */
	private String take_delivery_date_end;

	/**
	 * 运单跟踪号更新时间
	 */
	private String track_updated_begin;
	/**
	 * 运单跟踪号更新时间
	 */
	private String track_updated_end;

	/**
	 * 渠道ID
	 */
	private Integer shipping_company_id;
	/**
	 * 代码
	 */
	private String is_register;
	/**
	 * 订单查询
	 */
	private String order_ids;

	private String platform;
	/**
	 * 发货日期开始(格式：2000-01-01 00:00:00)
	 */
	private String ship_confirm_date_begin;
	/**
	 * 发货日期截至(格式：2000-01-01 00:00:00)
	 */
	private String ship_confirm_date_end;

	public int getPage_size() {
		return page_size;
	}

	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}

	public int getPage_index() {
		return page_index;
	}

	public void setPage_index(int page_index) {
		this.page_index = page_index;
	}

	private int page_size;
	private int page_index;

	public String getTake_delivery_date_begin() {
		return take_delivery_date_begin;
	}

	public void setTake_delivery_date_begin(String take_delivery_date_begin) {
		this.take_delivery_date_begin = take_delivery_date_begin;
	}

	public String getTake_delivery_date_end() {
		return take_delivery_date_end;
	}

	public void setTake_delivery_date_end(String take_delivery_date_end) {
		this.take_delivery_date_end = take_delivery_date_end;
	}

	public String getTrack_updated_begin() {
		return track_updated_begin;
	}

	public void setTrack_updated_begin(String track_updated_begin) {
		this.track_updated_begin = track_updated_begin;
	}

	public String getTrack_updated_end() {
		return track_updated_end;
	}

	public void setTrack_updated_end(String track_updated_end) {
		this.track_updated_end = track_updated_end;
	}

	public Integer getShipping_company_id() {
		return shipping_company_id;
	}

	public void setShipping_company_id(Integer shipping_company_id) {
		this.shipping_company_id = shipping_company_id;
	}

	public String getIs_register() {
		return is_register;
	}

	public void setIs_register(String is_register) {
		this.is_register = is_register;
	}

	public String getOrder_ids() {
		return order_ids;
	}

	public void setOrder_ids(String order_ids) {
		this.order_ids = order_ids;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getShip_confirm_date_begin() {
		return ship_confirm_date_begin;
	}

	public void setShip_confirm_date_begin(String ship_confirm_date_begin) {
		this.ship_confirm_date_begin = ship_confirm_date_begin;
	}

	public String getShip_confirm_date_end() {
		return ship_confirm_date_end;
	}

	public void setShip_confirm_date_end(String ship_confirm_date_end) {
		this.ship_confirm_date_end = ship_confirm_date_end;
	}
}
