package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.OrderCoreDTO;
import yxinfo.shop.inf.dto.order.OrderPlaceDTO;
import yxinfo.shop.inf.dto.order.place.PlaceOrderDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/20.
 */
public interface OrderTranChannelService {

    /**
     * 下单前检查经费支付业务处理
     * @param placeOrderDTO
     * @return 提醒信息
     */
    String fundsPayCheckBeforePlaceOrder( PlaceOrderDTO placeOrderDTO );

    /**
     * 下单时经费支付业务处理
     * @param placeOrderDTO
     * @return 订单支付信息
     */
    void fundsPayOnPlaceOrder( PlaceOrderDTO placeOrderDTO );

    /**
     * 拆分订单后经费支付业务处理
     * @param orders
     * @param orderPlaces
     * @param placeOrderDTO
     */
    void fundsPayAfterSplitOrder( List<OrderCoreDTO> orders, List<OrderPlaceDTO> orderPlaces,
                                  PlaceOrderDTO placeOrderDTO );
}
