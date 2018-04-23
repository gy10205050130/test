package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.place.PlaceOrderDTO;

/**
 * Created by dy on 2016/10/21.
 */
public interface PlaceOrderCheckService {

    /**
     * 下单前检查
     * @code 100037
     * @param placeOrderDTO
     * @return
     */
    String checkPlaceOrder( PlaceOrderDTO placeOrderDTO );
}
