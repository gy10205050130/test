package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.LisLaboratoryMacDTO;

import java.util.List;

/**
 * Created by xww on 2016/12/14.
 */
public interface LisLaboratoryMacService {

    /**
     * 更新实验室
     *
     * @param lisLaboratoryMacDTO
     * @return
     */
    Integer updateLisLaboratoryMac(LisLaboratoryMacDTO lisLaboratoryMacDTO);

    /**
     * 获取实验室列表
     *
     * @param lisLaboratoryMacDTO
     * @return
     */
    List<LisLaboratoryMacDTO>  getLisLaboratoryMacDTOList(LisLaboratoryMacDTO lisLaboratoryMacDTO);

}
