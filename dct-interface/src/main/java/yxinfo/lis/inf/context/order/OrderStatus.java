package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/8/15.
 */
public interface OrderStatus {

    // 审核状态
    Integer REVIEW = 1;

    // 使用状态
    Integer USEING = 2;

    // 支付状态
    Integer PAY = 3;

    // 评价状态
    Integer JUDGE = 4;

    // 取消状态
    Integer CANCEL = 5;

    // 关闭状态
    Integer CLOSE = 6;

    // 完成状态
    Integer SUCCESS = 7;

    // 退款状态
    Integer REFUND = 8;

    // 未支付订单存活时间
    Integer PAY_BEYOND_TIME = 30 * 60;

    // 过期订单最大存活时间
    Integer MAX_BEYOND_TIME = 3 * 24 * 60 * 60;

    // 订单结束前推送时间
    Integer PUSH_BEFORE_ENDTIME = 5 * 60;

    // 退款截止时间
    Integer REFUND_BEYOND_TIME = 60 * 60 * 24;

}
