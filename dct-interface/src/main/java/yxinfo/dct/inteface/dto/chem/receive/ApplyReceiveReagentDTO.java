package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;

import javax.validation.constraints.NotNull;

public class ApplyReceiveReagentDTO extends BaseDTO {

    private static final long serialVersionUID = 4562793414214633090L;

    // 组织id
    @NotNull( message = ErrorCode.CHEM_REAGENT_ORG_ID_NOT_EMPTY )
    private Integer orgId;

    // 二维码
    @NotNull( message = ErrorCode.CHEM_REAGENT_RF_CODE_NOT_EMPTY )
    private String rfFcode;

    // 用户id
    @NotNull( message = ErrorCode.CHEM_MEMBER_ID_NOT_EMPTY )
    private Integer memberId;

    // 申领id
    private Integer applyId;

    // 同行人id
    private Integer memberIdSec;

    // 无归属人试剂是否区分用途, true区分
    private Boolean allocablePurpose;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getRfFcode() {
        return rfFcode;
    }

    public void setRfFcode( String rfFcode ) {
        this.rfFcode = rfFcode;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId( Integer applyId ) {
        this.applyId = applyId;
    }

    public Integer getMemberIdSec() {
        return memberIdSec;
    }

    public void setMemberIdSec( Integer memberIdSec ) {
        this.memberIdSec = memberIdSec;
    }

    public Boolean getAllocablePurpose() {
        return allocablePurpose;
    }

    public void setAllocablePurpose( Boolean allocablePurpose ) {
        this.allocablePurpose = allocablePurpose;
    }
}
