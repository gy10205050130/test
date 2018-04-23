package yxinfo.ow.inf.dto.mbr;

import yxinfo.ow.inf.dto.BaseDTO;

import java.util.List;

/**
 * @author tj
 * @date 2016/8/20 16:23
 */
public class MemberLoginInfoDTO extends BaseDTO {
    private static final long serialVersionUID = -2230535812834385151L;

    private MemberCoreDTO memberCoreDTO;

    private AccessTokDTO accessTokenDTO;

    private List<RoleMenuDTO> menus;

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO( MemberCoreDTO memberCoreDTO ) {
        this.memberCoreDTO = memberCoreDTO;
    }

    public AccessTokDTO getAccessTokenDTO() {
        return accessTokenDTO;
    }

    public void setAccessTokenDTO( AccessTokDTO accessTokenDTO ) {
        this.accessTokenDTO = accessTokenDTO;
    }

    public List<RoleMenuDTO> getMenus() {
        return menus;
    }

    public void setMenus(List<RoleMenuDTO> menus) {
        this.menus = menus;
    }
}

