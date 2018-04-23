package yxinfo.shop.inf.service.tran;

import yxinfo.shop.inf.dto.tran.TranCoreDTO;

/**
 * Created by dy on 2016/8/28.
 */
public interface TranService {

    /**
     * 添加支付记录
     * @param tranCore
     * @return
     */
    int addTran( TranCoreDTO tranCore );
}
