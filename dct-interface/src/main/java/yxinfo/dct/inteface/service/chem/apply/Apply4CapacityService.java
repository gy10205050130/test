package yxinfo.dct.inteface.service.chem.apply;

import yxinfo.dct.inteface.dto.chem.apply.Apply4NumRetDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyCoreDTO;
import yxinfo.dct.inteface.dto.chem.apply.GetTotalOnApplyDTO;
import yxinfo.dct.inteface.dto.chem.apply.TotalOnApplyDTO;

import java.util.List;

/**
 * 按量申领试剂服务
 * Created by dy on 2017/1/21.
 */
public interface Apply4CapacityService {

    /**
     * 按量申领时获取库存
     * @code 108131
     * @param applyDetailDTO
     * @return
     */
    List<TotalOnApplyDTO> getTotalOnApply4Capacity( GetTotalOnApplyDTO applyDetailDTO );

    /**
     * 按量申请领取
     * @code 108133
     * @param applyCoreDTO
     * @param terminalCode
     * @return
     */
    Apply4NumRetDTO apply4Capacity( ApplyCoreDTO applyCoreDTO, String terminalCode );
}
