package yxinfo.shop.inf.service.order;

/**
 * 购买订单支付服务
 * Created by dy on 2016/8/16.
 */
public interface OrderTranService {

    /**
     * 线下支付确认收款
     * @code 100022
     * @param orderId
     * @param memberId
     */
    void offlineConfirmReceiptMoney( Integer orderId, Integer memberId );
}
