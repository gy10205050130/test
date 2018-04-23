package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.eqry.cancel.CancelEqryDTO;

/**
 * Created by dy on 2016/10/6.
 */
public interface EqryCancelService {

    /**
     * 取消询价单
     * @code 108014
     * @param cancelEqry
     * @param memberId
     */
    void cancelEqry( CancelEqryDTO cancelEqry, Integer memberId );
}
