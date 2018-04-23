package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.LisPowerControllerDTO;

import java.util.List;

/**
 * Created by cy on 2016/12/29.
 */
public interface LisPowerControllerService {

    /**
     * 保存电源的控制器信息
     *
     * @param powerControllerDTOList
     * @return 所有的mac
     */
    List<String> addLisPowerControllerList(List<LisPowerControllerDTO> powerControllerDTOList);

    /**
     * 主键查询电源信息
     *
     * @param mac
     * @return
     */
    LisPowerControllerDTO getLisPowerControllerByKey(String mac);
}
