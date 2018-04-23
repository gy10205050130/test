package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.inst.InstIndependentUserDTO;

import java.util.List;

/**
 * Created by xww on 2016/10/23.
 */
public interface InstIndependentUserService {

    /**
     * 上传独立资格上机人员
     *
     * @param instIndependentUserDTO
     * @return
     */
    Integer addInstIndependentUser(InstIndependentUserDTO instIndependentUserDTO);

    /**
     * 编辑独立资格上机人员
     * code
     *
     * @param instIndependentUserDTO
     * @return
     */
    Integer updateInstIndependentUser(InstIndependentUserDTO instIndependentUserDTO);

    /**
     * 删除独立资格上机人员
     *
     * @param instIndependentUserDTO
     * @return
     */
    Integer deleteInstIndependentUserById(InstIndependentUserDTO instIndependentUserDTO);

    /**
     * 分页获取独立资格上机人员
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstIndependentUserDTO>> getInstIndependentUserDtoIdxList(PageDTO<InstIndependentUserDTO> pageQuery);

    /**
     * 获取独立资格上机人员
     *
     * @param instIndependentUserDTO
     * @return
     */
    List<InstIndependentUserDTO> getInstIndependentUserDtoList(InstIndependentUserDTO instIndependentUserDTO);

    /**
     * 获取独立资格上机人员是否唯为空
     *
     * @param instIndependentUserDTO
     * @return
     */
    Boolean getInstIndependentUserIsEmpty(InstIndependentUserDTO instIndependentUserDTO);


}
