package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.eqry.EqryOfferDTO;

/**
 * Created by dy on 2016/9/29.
 */
public interface EqryMerOfferService {

    /**
     * 商户报价
     * @code 108011
     * @param offer
     */
    void merOffer( EqryOfferDTO offer );
}
