package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerPlaceOrderDTO;

/**
 * Created by ZH on 2016/8/15.
 */
public interface MerPlaceOrderService {

    /**
     * 根据商户id 使用方id 获取商户所有的商品分类和 支付渠道
     * @param merId
     * @param partyId
     * @return
     */
    public MerPlaceOrderDTO getMerPlaceOrderDTO (Integer merId , Integer partyId );
}
