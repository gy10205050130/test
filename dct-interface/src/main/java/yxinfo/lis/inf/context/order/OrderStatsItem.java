package yxinfo.lis.inf.context.order;

/**
 * Created by dy on 2016/8/29.
 */
public interface OrderStatsItem {

    // 订单总数
    Short ORDER_TOTAL = 1;

    // 订单取消总数
    Short ORDER_CANCEL_TOTAL = 2;

    // 订单客户数
    Short ORDER_MBR_TOTAL = 3;

    // 订单取消客户数
    Short ORDER_CANCEL_MBR_TOTAL = 4;

    // 订单总金额
    Short ORDER_AMT = 5;

    // 订单取消总金额
    Short ORDER_CANCEL_AMT = 6;

    // 在线支付总金额
    Short ORDER_AMT_ONLINE = 7;
}
