package yxinfo.dct.inteface.service.chem.traj;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.traj.ChemTrajDTO;

import java.util.List;

/**
 * Created by dy on 2016/7/21.
 */
public interface ReagentTrajService {

    /**
     * 分页查询试剂轨迹
     * @code 108030
     * @param chemTrajDTO
     * @return
     */
    PageDTO<List<ChemTrajDTO>> getTrajPage( PageDTO<ChemTrajDTO> chemTrajDTOPageDTO );

    /**
     * 查询试剂轨迹
     * <p>根据id获取试剂轨迹</p>
     * @code 108031
     * @param chemTrajDTO
     * @return
     */
    List<ChemTrajDTO> getTrajList( ChemTrajDTO chemTrajDTO );

    /**
     * 根据id获取试剂轨迹
     * @code 108042
     * @param trajId
     * @return
     */
    ChemTrajDTO getTrajByKey( Integer trajId );

    /**
     * 获取某试剂指定轨迹的前一条轨迹
     * @param trajId 轨迹id
     * @param reagentId 试剂id
     * @return
     */
    ChemTrajDTO getPreviousOneTraj( Integer trajId, Integer reagentId );

    /**
     * 添加试剂轨迹
     * @param equNo 设备号
     * @param rfcode 标签码
     * @param staticId 抓拍图片id
     * @return
     */
    int addTraj( String equNo, String rfcode, Integer staticId );

    /**
     * 添加试剂轨迹
     * @param chemTrajDTO
     * @return
     */
    int addTraj( ChemTrajDTO chemTrajDTO );
}
