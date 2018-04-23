package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.eqry.EqryApvDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;
import yxinfo.shop.inf.dto.eqry.EqryTranDTO;

/**
 * Created by dy on 2016/9/26.
 */
public interface EqryService {

    /**
     * 添加询价单
     * @param eqryCore
     * @return
     */
    int addEqry( EqryCoreDTO eqryCore );

    /**
     * 更新价单基础信息
     * @param eqryId
     * @param eqry
     * @return
     */
    int updateEqry( Integer eqryId, EqryCoreDTO eqry );

    /**
     * 更新询价单审核信息
     * @param eqryId
     * @param eqryApv
     * @return
     */
    int updateEqryApv( Integer eqryId, EqryApvDTO eqryApv );

    /**
     * 更新询价单支付信息
     * @param eqryId
     * @param eqryTranDTO
     * @return
     */
    int updateEqryTran( Integer eqryId, EqryTranDTO eqryTranDTO );
}
