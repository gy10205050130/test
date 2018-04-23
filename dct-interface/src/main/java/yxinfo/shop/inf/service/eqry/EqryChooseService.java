package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.eqry.EqryChooseOfferDTO;
import yxinfo.shop.inf.dto.eqry.apv.ApvEqryDTO;

/**
 * Created by dy on 2016/9/28.
 */
public interface EqryChooseService {

    /**
     * 选择商户报价
     * @code 108012
     * @param chooseOffer
     * @return 1需要审核/2成功选择
     */
    String chooseOffer( EqryChooseOfferDTO chooseOffer );

    /**
     * 审核选择的商户报价
     * @code 108013
     * @param apvEqryDTO
     */
    void eqryChooseApv( ApvEqryDTO apvEqryDTO );
}
