package yxinfo.shop.inf.service.order;

/**
 * Created by dy on 2016/8/25.
 */
public interface OrderCancelService {

    /**
     * 取消订单
     * @code
     * @param orderId
     * @param memberId
     */
    void cancelOrder( Integer orderId, Integer memberId );
}
