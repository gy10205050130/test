package yxinfo.dct.inteface.dto.chem.apply;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.validation.groups.Add;
import yxinfo.dct.inteface.validation.groups.PageSelect;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class ApplyCoreDTO extends BaseDTO {

    private static final long serialVersionUID = 6468955870467664126L;

    private Integer id;

    // 申请人组织id
    @NotNull( groups = { Add.class, PageSelect.class }, message = ErrorCode.CHEM_APLY_ORG_ID_NOT_EMPTY )
    private Integer orgId;

    // 申请人成员id
    @NotNull( groups = { Add.class }, message = ErrorCode.CHEM_APLY_MEMBER_ID_NOT_EMPTY )
    private Integer memberId;

    // 第二申请人成员id
    private Integer memberIdSec;

    // 双人管理类型，取值与chem_reagent.double_mgt一致
    private String doubleMgt;

    // 领取申请编号
    private String fcode;

    // 领取状态（0未生效，1审核中，2待领用，3已领完，4已驳回，5已逾期）
    private String receiveSta;

    // 课题名称 / 订单号
    @Length( max = 30, message = ErrorCode.CHEM_APLY_ISSUESNAME_LENGTH )
    private String issuesName;

    // 用途（1教学, 2科研），对应chem_reagent.flag
    private String purpose;

    // 项目id
    private Integer proId;

    // 备注 / 用途（企业版）
    private String remark;

    private Date createAt;

    // 预约时间
    private Date appointAt;

    // 审核item_no
    private String apvItemNo;

    // 审核老师姓名
    private String apvName;

    //````````````````````````````````````````````````````````````````````````````
    // 申领明细
    @Valid
    @NotEmpty( groups = { Add.class }, message = ErrorCode.CHEM_APLY_REAGENTS_NOT_EMPTY )
    private List<ApplyDetailDTO> applyDetails;

    // 指定审核人id
    private Integer apvMemberId;

    // 审核流程
    private List<ApplyApvFlowDTO> apvFlow;

    // 审核状态
    private String apvStatus;

    // 领用同行人
    private MemberDTO memberSec;

    // 申领人
    private MemberDTO member;

    // 审核记录id
    private Integer approveRecodeId;

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

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode( String fcode ) {
        this.fcode = fcode;
    }

    public String getReceiveSta() {
        return receiveSta;
    }

    public void setReceiveSta( String receiveSta ) {
        this.receiveSta = receiveSta;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName( String issuesName ) {
        this.issuesName = issuesName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose( String purpose ) {
        this.purpose = purpose;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId( Integer proId ) {
        this.proId = proId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getAppointAt() {
        return appointAt;
    }

    public void setAppointAt( Date appointAt ) {
        this.appointAt = appointAt;
    }

    public String getApvItemNo() {
        return apvItemNo;
    }

    public void setApvItemNo( String apvItemNo ) {
        this.apvItemNo = apvItemNo;
    }

    public String getApvName() {
        return apvName;
    }

    public void setApvName( String apvName ) {
        this.apvName = apvName;
    }

    public List<ApplyDetailDTO> getApplyDetails() {
        return applyDetails;
    }

    public void setApplyDetails( List<ApplyDetailDTO> applyDetails ) {
        this.applyDetails = applyDetails;
    }

    public Integer getApvMemberId() {
        return apvMemberId;
    }

    public void setApvMemberId( Integer apvMemberId ) {
        this.apvMemberId = apvMemberId;
    }

    public List<ApplyApvFlowDTO> getApvFlow() {
        return apvFlow;
    }

    public void setApvFlow( List<ApplyApvFlowDTO> apvFlow ) {
        this.apvFlow = apvFlow;
    }

    public String getApvStatus() {
        return apvStatus;
    }

    public void setApvStatus( String apvStatus ) {
        this.apvStatus = apvStatus;
    }

    public MemberDTO getMemberSec() {
        return memberSec;
    }

    public void setMemberSec( MemberDTO memberSec ) {
        this.memberSec = memberSec;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }
}