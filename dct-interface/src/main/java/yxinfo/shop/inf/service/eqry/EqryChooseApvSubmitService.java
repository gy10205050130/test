package yxinfo.shop.inf.service.eqry;

import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;
import yxinfo.shop.inf.dto.eqry.EqryChooseOfferDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;

/**
 * Created by dy on 2016/9/30.
 */
public interface EqryChooseApvSubmitService {

    /**
     * 提交报价选择审核
     * @param eqry
     * @param chooseOffer
     * @param eqryChooseOfferId
     * @return
     */
    ApproveRecodeDTO submitEqryChooseApv( EqryCoreDTO eqry, EqryChooseOfferDTO chooseOffer, Integer eqryChooseOfferId );
}
