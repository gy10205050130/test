package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberRoleDTO;
import yxinfo.shop.inf.dto.mbr.RoleMenuDTO;

import java.util.List;

/**
 * Created by dy on 2016/9/2.
 */
public interface RoleService {

    /**
     * 获取用户角色
     * @param memberId
     * @return
     */
    List<MemberRoleDTO> getRoleByMbrId( Integer memberId );

    /**
     * 根据memberId获取用户菜单
     * @param memberId
     * @return
     */
    List<RoleMenuDTO> getRoleMenuByMbrId( Integer memberId );

    /**
     * 根据baseMemberId获取用户菜单
     * @param baseMemberId
     * @return
     */
    List<RoleMenuDTO> getRoleMenuByBaseMbrId( Integer baseMemberId );

    /**
     * 授权为商户
     * @param memberId
     */
    void setMbrToMerchant( Integer memberId );
}
