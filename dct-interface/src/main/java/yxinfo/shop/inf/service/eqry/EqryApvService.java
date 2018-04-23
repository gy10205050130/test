package yxinfo.shop.inf.service.eqry;

import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;
import yxinfo.shop.inf.dto.eqry.EqryApvExecDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;
import yxinfo.shop.inf.dto.eqry.apv.ApvEqryDTO;

/**
 * Created by dy on 2016/8/16.
 */
public interface EqryApvService {

    /**
     * 获取询价单审核方案
     * @param eqrySubmit
     * @return
     */
    EqryApvExecDTO getApvExec( EqryCoreDTO eqrySubmit );

    /**
     * 提交询价单审核
     * @param eqrySubmit
     * @param memberId
     * @return
     */
    ApproveRecodeDTO submitEqryApv( EqryCoreDTO eqrySubmit, Integer memberId );

    /**
     * 审核询价单
     * @code 108003
     * @param apvEqryDTO
     */
    void eqryApv( ApvEqryDTO apvEqryDTO );
}
