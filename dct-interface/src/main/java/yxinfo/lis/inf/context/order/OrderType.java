package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/10/31.
 */
public interface OrderType {

    // 待支付
    Integer WAIT_PAY = 1;

    // 待使用
    Integer WAIT_USE = 2;

    // 取消
    Integer CANCEL = 3;

    // 完成
    Integer SUCCESS = 4;

    // 退款中
    Integer REFUNDING = 5;

    // 退款成功
    Integer REFUNDED = 6;

    // 使用中
    Integer USEING = 7;

    // 订单过期
    Integer OUT_TIME = 8;


}
