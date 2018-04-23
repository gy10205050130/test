package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.eqry.EqryChooseOfferDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;
import yxinfo.shop.inf.dto.eqry.EqryOfferDTO;

/**
 * Created by dy on 2016/9/27.
 */
public interface EqryTranChannelService {

    /**
     * 提交经费支付询价时调用
     * <p>处理支付渠道相关业务逻辑<p/>
     * @param eqrySubmit
     */
    void onSubmitEqryByFundsPay( EqryCoreDTO eqrySubmit );

    /**
     * 选择报价并下单时调用
     * <p>处理支付渠道相关业务逻辑<p/>
     * @param chooseOffer
     * @param offer
     * @param eqry
     */
    void onPlaceOrderByFundsPay( EqryChooseOfferDTO chooseOffer, EqryOfferDTO offer, EqryCoreDTO eqry );
}
