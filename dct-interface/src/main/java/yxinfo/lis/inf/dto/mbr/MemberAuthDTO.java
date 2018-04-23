package yxinfo.lis.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;


import javax.validation.constraints.NotNull;

public class MemberAuthDTO extends BaseDTO {

    private static final long serialVersionUID = 1934604569062960836L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer memberId;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer baseMemberId;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String realName;

    private String fcode;

    private String partyName;

    private Integer orgId;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getBaseMemberId() {
        return baseMemberId;
    }

    public void setBaseMemberId( Integer baseMemberId ) {
        this.baseMemberId = baseMemberId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName( String realName ) {
        this.realName = realName;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode( String fcode ) {
        this.fcode = fcode;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName( String partyName ) {
        this.partyName = partyName;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }
}
