package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.order.apv.ApvOrderRevokeDTO;

/**
 * Created by dy on 2016/10/15.
 */
public interface EqryApvRevokeService {

    /**
     * 撤销询价审核
     * @code 108021
     * @param apvEqryRevoke
     */
    void eqryApvRevoke( ApvOrderRevokeDTO apvEqryRevoke );
}
