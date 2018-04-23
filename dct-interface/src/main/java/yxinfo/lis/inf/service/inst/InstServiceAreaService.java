package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.InstServiceAreaDTO;

import java.util.List;

/**
 * Created by xww on 2016/9/14.
 */
public interface InstServiceAreaService {


    /**
     * 添加服务领域
     *
     * @return
     */
    Integer addServiceAreaByExample(Integer instId, List<InstServiceAreaDTO> instServiceAreaDTOList);

    /**
     * 获取服务领域列表
     *
     * @param instId
     * @return
     */
    List<InstServiceAreaDTO> getServiceAreaById(Integer instId);

    /**
     * 通过instId来删除仪器服务领域
     *
     * @param instId
     * @return
     */
    Integer deleteInstServiceAreaById(Integer instId);


}
