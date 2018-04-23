package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mer.MerCoreDTO;

import java.util.List;

public class MemberLoginInfoDTO extends BaseDTO {

    private static final long serialVersionUID = -2230535812834385151L;

    private MemberCoreDTO memberCoreDTO;

    private MerCoreDTO merCoreDTO;

    private AccessTokDTO accessTokenDTO;

    private List<RoleMenuDTO> menus;

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO( MemberCoreDTO memberCoreDTO ) {
        this.memberCoreDTO = memberCoreDTO;
    }

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO( MerCoreDTO merCoreDTO ) {
        this.merCoreDTO = merCoreDTO;
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

    public void setMenus( List<RoleMenuDTO> menus ) {
        this.menus = menus;
    }
}
