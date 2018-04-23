package yxinfo.lis.inf.context.mq;

/**
 * 消息标签
 * Created by dy on 2016/8/4.
 */
public interface MQLisTag {

    // 预约订单
    interface Order {
        //大仪中订单的destination
        String TOPIC_LIS_ORDER_PUSH = "TOPIC_LIS_ORDER_PUSH";
        //大仪中订单的subscription
        String TOPIC_LIS_ORDER_CONSUMER = "TOPIC_LIS_ORDER_CONSUMER";

        //仪器预约支付/退款destination
        String TOPIC_LIS_PAYMENT_PUSH = "TOPIC_LIS_PAYMENT_PUSH";
        //仪器预约支付/退款subscription
        String TOPIC_LIS_PAYMENT_CONSUMER = "TOPIC_LIS_PAYMENT_CONSUMER";

    }
}
