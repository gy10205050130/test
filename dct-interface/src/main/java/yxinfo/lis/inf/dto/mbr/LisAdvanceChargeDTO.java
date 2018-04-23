package yxinfo.lis.inf.dto.mbr;


import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 预付款
 * <p>
 * Created by cy on 2016/12/20.
 */
public class LisAdvanceChargeDTO extends BaseDTO {

    private Integer id;

    //预付款管理人id
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer memberId;
    private MemberCoreDTO memberCoreDto;

    //预付款管理人party
    private Integer partyId;

    //预付款金额
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer advanceCharge;

    //创建时间
    private Date createAt;

    //分配人id
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer creatorId;
    private MemberCoreDTO creatorCoreDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public MemberCoreDTO getMemberCoreDto() {
        return memberCoreDto;
    }

    public void setMemberCoreDto(MemberCoreDTO memberCoreDto) {
        this.memberCoreDto = memberCoreDto;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getAdvanceCharge() {
        return advanceCharge;
    }

    public void setAdvanceCharge(Integer advanceCharge) {
        this.advanceCharge = advanceCharge;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public MemberCoreDTO getCreatorCoreDto() {
        return creatorCoreDto;
    }

    public void setCreatorCoreDto(MemberCoreDTO creatorCoreDto) {
        this.creatorCoreDto = creatorCoreDto;
    }

    @Override
    public String toString() {
        return "LisAdvanceChargeDTO{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", memberCoreDto=" + memberCoreDto +
                ", partyId=" + partyId +
                ", advanceCharge=" + advanceCharge +
                ", createAt=" + createAt +
                ", creatorId=" + creatorId +
                ", creatorCoreDto=" + creatorCoreDto +
                '}';
    }
}
