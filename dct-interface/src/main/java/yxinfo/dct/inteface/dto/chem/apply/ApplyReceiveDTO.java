package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

import java.util.Date;

public class ApplyReceiveDTO extends BaseDTO {

    private static final long serialVersionUID = -5805143299398849482L;

    private Integer id;

    // 领取组织id
    private Integer orgId;

    // 领取成员id
    private Integer memberId;

    // 第二领取成员id
    private Integer memberIdSec;

    // 试剂id
    private Integer reagentId;

    //
    private Integer stockId;

    // 实际领取的量
    private Integer used;

    // 领取申请id
    private Integer applyId;

    // 创建时间
    private Date createAt;

    // 领取批次id
    private Integer batchId;

    // 领取成员
    private MemberDTO member;

    // 试剂
    private ChemReagentDTO reagent;

    // 领取申请
    private ApplyCoreDTO apply;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getMemberIdSec() {
        return memberIdSec;
    }

    public void setMemberIdSec( Integer memberIdSec ) {
        this.memberIdSec = memberIdSec;
    }

    public Integer getReagentId() {
        return reagentId;
    }

    public void setReagentId( Integer reagentId ) {
        this.reagentId = reagentId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId( Integer stockId ) {
        this.stockId = stockId;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed( Integer used ) {
        this.used = used;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId( Integer applyId ) {
        this.applyId = applyId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId( Integer batchId ) {
        this.batchId = batchId;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public ChemReagentDTO getReagent() {
        return reagent;
    }

    public void setReagent( ChemReagentDTO reagent ) {
        this.reagent = reagent;
    }

    public ApplyCoreDTO getApply() {
        return apply;
    }

    public void setApply( ApplyCoreDTO apply ) {
        this.apply = apply;
    }
}