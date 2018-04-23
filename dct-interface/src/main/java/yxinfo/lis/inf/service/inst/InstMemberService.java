package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.InstMemberDTO;

import java.util.List;

/**
 * Created by xww on 2016/11/8.
 */
public interface InstMemberService {

    /**
     * 添加负责人
     *
     * @param instMemberDTOList
     * @return
     */
    Integer addInstMember(List<InstMemberDTO> instMemberDTOList);

    /**
     * 编辑仪器负责人
     * code
     *
     * @param instMemberDTO
     * @return
     */
    Integer updateInstMember(InstMemberDTO instMemberDTO);

    /**
     * 删除仪器负责人
     *
     * @param instMemberDTO
     * @return
     */
    Integer deleteInstMemberById(InstMemberDTO instMemberDTO);

    /**
     * 根据仪器id获取负责人列表
     *
     * @param instMemberDTO
     * @return
     */
    List<InstMemberDTO> getInstMemberDtoIdxList(InstMemberDTO instMemberDTO);

}
