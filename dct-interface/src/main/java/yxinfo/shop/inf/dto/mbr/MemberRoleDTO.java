package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.dto.BaseDTO;

public class MemberRoleDTO extends BaseDTO {

    private static final long serialVersionUID = 5044234357351580300L;

    private Integer memberId;

    private Integer roleId;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId( Integer roleId ) {
        this.roleId = roleId;
    }
}