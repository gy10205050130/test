package yxinfo.ow.inf.dto.mbr;


import yxinfo.ow.inf.dto.BaseDTO;

public class MemberRoleDTO extends BaseDTO {

    private static final long serialVersionUID = 5044234357351580300L;

    private Integer memberId;

    private Integer roleId;

    private Integer partyId;

    private String roleName;

    private Integer sort;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }
}