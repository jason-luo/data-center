package com.tomtop.zhizi.datacenter.common;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String TIMEEXCEPTION_TRACK_LOGGER = "timeExceptionTrackInfo";// 0号订单信息
    public static final String ZERO_TRACK_LOGGER = "zeroTrackInfo";// 0号订单信息
    public static final String CACHE_ORDER_LOGGER_NAME = "orderInfo";// 订单信息
    public static final String CACHE_UPDATE_ORDER_LOGGER_NAME = "updateOrderInfo";// 订单信息
    public static final String CACHE_BACKORDER = "returnOrderInfo";// 退件订单
    public static final String SPILT_UNDERLINE = "_";
    public static final String SPILT_UNIDLINE = "-";
    public static final String SPILT_COMMA = ",";// 英文逗号
    public static final String SPILT_COMMA_CH = "，";// 中文逗号
    public static final String SPILT_SPACE = " ";// 空格
    public static final String TEMP_TRANSFER = "transfer_";// 空格

    public static final String ETS = "etc";

    public static final String ROUTING_KEY = "express_priority_queue_key";
    public static final String DEFALUT_BEANID = "caiNiaoTrack";

    public static final String DEFALUT_OPERATOR = "Computer";

    /**
     * 虚拟运单号常量9个0
     */
    public static final String VIRTUAL_TRACK = "000000000";

    /**
     * 没有渠道和代码
     */
    public static final String NOCHANNLCODE = "NO_CHANNL_CODE";
    /**
     * 残缺订单数(如缺少:跟踪号、发货时间、国家等)
     */
    public static final String INCOMPLETEORDER = "INCOMPLETE_ORDER";
    /**
     * 订单更新查询记录
     */
    public static final String EXPRESSCHANAGERECORD = "ETS_ORDER_CHANAGE_RECORD";
    /**
     * 订单查询记录
     */
    public static final String EXPRESORDERRECORD = "ETS_ORDER_UPDATE_RECORD";
    /**
     * 目的国家
     */
    public static final String ORDERCOUNTRY = "ORDER_DESTINATION_COUNTRY";
    /**
     * 不需要跟踪的渠道信息
     */
    public static final String NOTRACKCHANNEL = "NO_TRACK_CHANNEL";
    /**
     * 重复订单列表
     */
    public static final String REPEATTRACKORDER = "REPEAT_TRACK_ORDER";
    /**
     * 订单接口查询起始时间
     */
    public static final String DATEBEGIN = "2017-02-16 00:00:59";

    /**
     * ES redis 自增ID
     */
    public static final String EXPRESS_PRODUCT_INCREAMENT_ID = "expressProductIncreamentId";
    /**
     * 自动跟踪运单打开
     */
    public static final String AUTO_TRACK_CLOSE = "false";
    /**
     * 自动跟踪运单开关
     */
    public static final String AUTO_TRACK_KEY = "express_auto_track_key";
    /**
     * 自动跟踪移库运单开关
     */
    public static final String AUTO_TRANSFER_TRACK_KEY = "express_auto_transfer_track_key";
    /**
     * ERP自动跟踪运单开关
     */
    public static final String ERP_AUTO_TRACK_KEY = "express_erp_auto_track_key";
    /**
     * ERP自动扫描订单跟踪运单开关
     */
    public static final String ERP_ORDER_AUTO_TRACK_KEY = "express_erp_order_auto_track_key";
    /**
     * ERP自动扫描更新订单
     */
    public static final String ERP_AUTO_UPDATE_TRACK_KEY = "express_erp_auto_update_track_key";

    /**
     * 快递需要调整送达天数
     */
    public final static Map<String, Integer> EXPRESS_ESTIMATEDELIVERYDAYS_ADJUST1 = new HashMap<String, Integer>() {
        {
            put("EMS_坂田线下E邮宝",7);
            put("EMS_坂田俄线下E邮宝",7);
            put("EMS_H2Y",7);
            put("EMS_17#H2RY",7);
            put("EMS_H2RY",7);
        }
    };
    /**
     * 快递需要调整送达天数
     */
    public final static Map<String, Integer> EXPRESS_ESTIMATEDELIVERYDAYS_ADJUST2 = new HashMap<String, Integer>() {
        {
            put("瑞典小包_捷递瑞典挂号_巴西",15);
            put("瑞士小包_壹电商瑞士挂号_巴西",15);
            put("新加坡邮政_新加坡小包挂号_巴西",15);
            put("新加坡邮政_BSGPT_巴西",15);
            put("新加坡邮政_HSGPT_巴西",15);
            put("邮政小包_郑州邮政挂号小包_巴西",15);
            put("邮政小包_深圳邮局_巴西",15);
            put("邮政小包_PTY_巴西",15);
            put("邮政小包_29#PT_巴西",15);
            put("邮政小包_163#PT_巴西",15);
            put("邮政小包_深圳邮局(广州)_巴西",15);
            put("邮政小包_创腾福州小包_巴西",15);
        }
    };
}
