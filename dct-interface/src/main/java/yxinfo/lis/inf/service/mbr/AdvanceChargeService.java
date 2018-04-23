package yxinfo.lis.inf.service.mbr;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.mbr.LisAdvanceChargeDTO;

import java.util.List;

/**
 * 预存款service
 *
 * Created by cy on 2016/12/20.
 */
public interface AdvanceChargeService {


    /**
     * 新增预付款分配记录
     *
     * @param lisAdvanceChargeDTO
     * @return
     */
    Integer addAdvanceCharge(LisAdvanceChargeDTO lisAdvanceChargeDTO);

    /**
     * 获取预付款分配记录
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<LisAdvanceChargeDTO>> getAdvanceChargeList(PageDTO<LisAdvanceChargeDTO> queryPage);
}
