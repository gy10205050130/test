package yxinfo.shop.inf.context.order;

/**
 * Created by dy on 2016/8/29.
 */
public interface OrderStatsItem {

    // 审核订单数
    Short ORDER_APV_TOTAL = 8;

    // 待发货订单数
    Short ORDER_WAIT_DELIVER_GOODS_TOTAL = 9;

    // 完成订单数
    Short ORDER_FINISH_TOTAL = 10;
}
