package yxinfo.shop.inf.context.order;

/**
 * Created by dy on 2016/8/15.
 */
public interface OrderStatus {

    // 售前
    Short PRE_SALE = 1;

    // 售后
    Short AFTER_SALE = 2;

    // 完成
    Short FINISH = 3;

    // 关闭
    Short CLOSE = 4;

    // 取消
    Short CANCEL = 5;

    // 支付状态
    interface Pay {

        // 待支付
        Short WAIT = 1;

        // 支付中
        Short IN = 2;

        // 付款成功
        Short SUCCESS = 3;
    }

    // 审核状态
    interface Apv {

        // 待审核
        Short WAIT = 1;

        // 审核中
        Short IN = 2;

        // 审核成功
        Short SUCCESS = 3;

        // 审核失败
        Short FAIL = 4;
    }

    // 售后状态
    interface As {

        // 待售后
        Short WAIT = 1;

        // 退货中
        Short IN_RETURN = 2;

        // 换货中
        Short IN_EXCHANGE = 3;

        // 售后驳回
        Short REJECT = 4;

        // 售后成功
        Short SUCCESS = 5;
    }

    // 物流状态
    interface Eps {

        // 待发货
        Short WAIT_SENT = 1;

        // 已发货
        Short HAS_SENT = 2;
    }
}
