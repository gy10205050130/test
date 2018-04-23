package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.LisServiceAreaDTO;

import java.util.List;

/**
 * Created by Administrator on 2016/9/5.
 */
public interface LisServiceAreaService {

    /**
     * 获取服务领域列表
     *
     * @return
     */
    List<LisServiceAreaDTO> getServiceAreaByExample();

    /**
     * 通过id来获取服务领域
     *
     * @param serviceAreaId
     * @return
     */
    LisServiceAreaDTO getServiceAreaById(Integer serviceAreaId);

    /**
     * 通过仪器id来获取服务领域
     *
     * @param instId
     * @return
     */
    List<LisServiceAreaDTO> getServiceAreaList(Integer instId);

}
