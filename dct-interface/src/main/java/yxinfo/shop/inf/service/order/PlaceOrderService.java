package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.OrderCoreDTO;
import yxinfo.shop.inf.dto.order.OrderPlaceDTO;
import yxinfo.shop.inf.dto.order.apv.SubmitOrderApvRetDTO;
import yxinfo.shop.inf.dto.order.place.PlaceOrderDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/11.
 */
public interface PlaceOrderService {

    String SERVICE_NAME = "placeOrderService";

    /**
     * 下单
     * @code 100001
     * @param placeOrderDTO
     * @return 订单id
     */
    List<Integer> placeOrder( PlaceOrderDTO placeOrderDTO );

    /**
     * 下单并提交审核
     * <p>仅支持线下支付<p/>
     * @code 100004
     * @param placeOrderDTO
     * @return 订单id
     */
    List<Integer> placeOrderAndSubmitApv( PlaceOrderDTO placeOrderDTO );

    /**
     * 保存订单并提交审核
     * <p>保存订单及其扩展信息, 同时扣除库存, 然后提交审核<p/>
     * @param orders
     * @param orderPlaces
     * @param placeOrderDTO
     * @return
     */
    SubmitOrderApvRetDTO addOrderAndSubmitOrderApv(
            List<OrderCoreDTO> orders, List<OrderPlaceDTO> orderPlaces, PlaceOrderDTO placeOrderDTO );
}
