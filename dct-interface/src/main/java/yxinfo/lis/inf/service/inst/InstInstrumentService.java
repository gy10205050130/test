package yxinfo.lis.inf.service.inst;


import yxinfo.dct.inteface.dto.lab.LaboratoryDTO;
import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.inst.InstInstrumentDTO;

import java.util.List;
import java.util.Map;

/**
 * @author sxd
 * @date 2016/8/2 17:24
 */
public interface InstInstrumentService {

    /**
     * 根据id获取仪器信息
     * code
     *
     * @param instInstrumentDTO 仪器编号
     * @return
     */
    InstInstrumentDTO getInst(InstInstrumentDTO instInstrumentDTO);

    /**
     * 发布仪器
     * code
     *
     * @param instInstrumentDTO
     * @return
     */
    Integer sendInst(InstInstrumentDTO instInstrumentDTO);

    /**
     * 根據id删除仪器
     * code
     *
     * @param instInstrumentDTO
     */
    Integer deleteInstById(InstInstrumentDTO instInstrumentDTO);

    /**
     * 根据id编辑仪器
     * code
     *
     * @param instInstrumentDTO
     * @return
     */
    Integer updateInst(InstInstrumentDTO instInstrumentDTO);

    /**
     * 通过关键词来索引仪器列表
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstInstrumentDTO>> getInstDtoIdxListByKey(PageDTO<InstInstrumentDTO> pageQuery);

    /**
     * 根据平台、仪器名字、组织id获取仪器列表
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstInstrumentDTO>> getInstListByInstGroup(PageDTO<InstInstrumentDTO> pageQuery);

    /**
     * 获取仪器列表
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstInstrumentDTO>> getInstListByCondition(PageDTO<InstInstrumentDTO> pageQuery);

    /**
     * 根据平台获取仪器列表数量
     *
     * @param instInstrumentDTO
     * @retrn
     */
    Integer getInstCountByInstGroup(InstInstrumentDTO instInstrumentDTO);

    /**
     * 通过partyId来获取仪器详情
     *
     * @param instInstrumentDTO
     * @return
     */
    List<InstInstrumentDTO> getInstDTOListByPartyId(InstInstrumentDTO instInstrumentDTO);

    /**
     * 通过负责人id来获取仪器列表
     *
     * @param instInstrumentDTO
     * @return
     */
    List<Map<String, Object>> getInstDTOListByMbrId(InstInstrumentDTO instInstrumentDTO);

    /**
     * 根据条件获取仪器信息(数据量少)
     *
     * @param instInstrumentDTO
     * @return
     */
    List<InstInstrumentDTO> getInstDTO(InstInstrumentDTO instInstrumentDTO);

    /**
     * 获取仪器详情
     *
     * @param instInstrumentDTO
     * @return
     */
    InstInstrumentDTO getInstInfoDTO(InstInstrumentDTO instInstrumentDTO);

    /**
     * 获取实验室监控信息
     *
     * @param instInstrumentDTO
     * @return
     */
    List<LaboratoryDTO> getLaboratoryDTOs(InstInstrumentDTO instInstrumentDTO);

    /**
     * 通过组织id来获取仪器列表信息
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstInstrumentDTO>> getInstDtoIdxListByKeyForDCT(PageDTO<InstInstrumentDTO> pageQuery);

}
