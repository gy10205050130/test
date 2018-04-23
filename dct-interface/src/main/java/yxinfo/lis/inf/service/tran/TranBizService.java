package yxinfo.lis.inf.service.tran;

import yxinfo.lis.inf.dto.tran.TranRequestDTO;
import yxinfo.lis.inf.dto.tran.TranRetDTO;

/**
 * Created by dy on 2016/8/16.
 */
public interface TranBizService {

    /**
     * 支付类交易请求
     * <p>根据orders生成对应数量的支付信息, 合并为一条支付请求发往交易渠道<p/>
     * @param tranRequest
     * @return
     */
    TranRetDTO tran(TranRequestDTO tranRequest );
}
