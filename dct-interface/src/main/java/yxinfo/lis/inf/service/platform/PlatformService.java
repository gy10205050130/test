package yxinfo.lis.inf.service.platform;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.platform.LisPlatformDTO;

import java.util.List;

/**
 * 平台管理service
 *
 * Created by cy on 2016/10/20.
 */
public interface PlatformService {

    /**
     * 新增平台信息
     *
     * @param platformDTO
     * @return
     */
    Integer addPlatformInfo(LisPlatformDTO platformDTO);

    /**
     * 更新平台信息
     *
     * @param platformDTO
     * @return
     */
    Integer updatePlatformInfo(LisPlatformDTO platformDTO);

    /**
     * 删除平台信息
     *
     * @param platId
     * @return
     */
    Integer deletePlatformInfoByKey(Integer platId);

    /**
     * 分页查询平台信息
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<LisPlatformDTO>> getPagePlatformList(PageDTO<LisPlatformDTO> queryPage);

    /**
     * 根据id获取平台信息
     *
     * @param platId
     * @return
     */
    LisPlatformDTO getLisPlatformByKey(Integer platId);
}
