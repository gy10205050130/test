package yxinfo.shop.inf.service.eqry;

import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;

/**
 * Created by dy on 2016/9/26.
 */
public interface EqrySubmitService {

    String SERVICE_NAME = "eqrySubmitService";

    /**
     * 提交询价单
     * @code 108002
     * @param eqrySubmit
     */
    void submitEqryAndApv( EqryCoreDTO eqrySubmit );

    /**
     * 保存询价单并提交审核
     * @param eqrySubmit
     * @return
     */
    ApproveRecodeDTO addEqryAndSubmitEqryApv( EqryCoreDTO eqrySubmit );
}
