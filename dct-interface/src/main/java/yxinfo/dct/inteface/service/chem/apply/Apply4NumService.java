package yxinfo.dct.inteface.service.chem.apply;

import yxinfo.dct.inteface.dto.chem.apply.*;

import java.util.List;

/**
 * 按瓶数申领试剂服务
 * Created by dy on 2017/1/4.
 */
public interface Apply4NumService {

    /**
     * 按瓶数申领时获取库存
     * @code 108103
     * @param applyDetailDTO
     * @return
     */
    List<TotalOnApplyDTO> getTotalOnApply4Num( GetTotalOnApplyDTO applyDetailDTO );

    /**
     * 按瓶数申领时分配库存
     * <p>按如下优先级分配<p/>
     * <p>1. 属于自己的试剂<p/>
     * <p>2. applyBelongToCodes对应归属人的试剂<p/>
     * <p>3. 无归属人的试剂<p/>
     * @code 108104
     * @param allotOnApply
     * @param memberId
     * @return
     */
    List<AllotOnApplyRetDTO> allotOnApply4Num( AllotOnApplyDTO allotOnApply, Integer memberId );

    /**
     * 按瓶申请领取
     * @code 108105
     * @param applyCoreDTO
     * @param terminalCode
     * @return
     */
    Apply4NumRetDTO apply4Num( ApplyCoreDTO applyCoreDTO, String terminalCode );
}
