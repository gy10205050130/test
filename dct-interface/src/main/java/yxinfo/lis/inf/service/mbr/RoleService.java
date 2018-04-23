package yxinfo.lis.inf.service.mbr;


import yxinfo.lis.inf.dto.mbr.MemberCoreDTO;
import yxinfo.lis.inf.dto.mbr.MemberRoleDTO;
import yxinfo.lis.inf.dto.mbr.LisRoleDTO;
import yxinfo.lis.inf.dto.mbr.RoleMenuDTO;

import java.util.List;

/**
 * Created by tj on 2016/9/2.
 */
public interface RoleService {

    /**
     * 获取用户角色
     *
     * @param memberId
     * @return
     */
    List<MemberRoleDTO> getRoleByMbrId(Integer memberId);

    /**
     * 获取用户角色
     *
     * @param memberCoreDTO
     * @return
     */
    List<MemberRoleDTO> getMemberRoleList(MemberCoreDTO memberCoreDTO);
    /**
     * 根据memberId获取用户菜单
     *
     * @param memberId
     * @return
     */
    List<RoleMenuDTO> getRoleMenuByMbrId(Integer memberId);

    /**
     * 根据memberId获取用户菜单
     *
     * @param memberCoreDTO
     * @return
     */
    List<RoleMenuDTO> getRoleMenu(MemberCoreDTO memberCoreDTO);
    /**
     * 根据baseMemberId获取用户菜单
     *
     * @param baseMemberId
     * @return
     */
    List<RoleMenuDTO> getRoleMenuByBaseMbrId(Integer baseMemberId);

    /**
     * 获取角色列表信息
     *
     * @param
     * @return
     */
    List<LisRoleDTO> getRoleDtoList(LisRoleDTO roleDTO);

    /**
     * 新增获取修改用户的角色信息
     *
     * @param roleDTO
     * @return
     */
    Integer addMemberRole(LisRoleDTO roleDTO);
}
