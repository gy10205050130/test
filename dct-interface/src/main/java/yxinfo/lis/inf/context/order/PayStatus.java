package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/9/7.
 */
public interface PayStatus {

    // 待支付
    Integer WAIT_PAY = 1;

    // 支付取消
    Integer CANCEL_PAY = 2;

    // 已支付
    Integer PAYED = 3;


}
