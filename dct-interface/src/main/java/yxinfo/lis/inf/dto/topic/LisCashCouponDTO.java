package yxinfo.lis.inf.dto.topic;

import org.hibernate.validator.constraints.Length;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.Add;
import yxinfo.lis.inf.validation.groups.Update;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 代金券dto
 *
 * Created by cy on 2016/10/21.
 */
public class LisCashCouponDTO extends BaseDTO {


    private Integer id;

    //课题id
    private Integer topicId;

    private Date startTime;

    private Date endTime;

    //课题名称
    @Length(max = 80, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private String topicName;

    //
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer topicTotalFunds;

    //申请人id
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer applyMemberId;

    //申请人姓名
    private String applyMemberName;

    private String applyMemberMobile;

    //申请人所在部门
    private String applyMemberGroup;

    //职称
    private String applyMemberAcademic;

    //课题性质（1基础研究2应用研究3技术开发）
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer tipicNature;

    //申请类别（1普通资助2新员工专项）
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer applyType;

    //状态（1未审核2未通过3通过4受理）
    private Integer fstatu;

    //批准金额（分）
    private Integer approveAmount;

    //申请总金额（分）
    private Integer applyTotalAmount;

    //资助比例
    private String fundRatio;

    //解决的问题及要求
    @Length(max = 500, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private String solveProblem;

    //预期成果
    @Length(max = 500, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private String expectResult;

    private Date createAt;

    private Date updateAt;

    //审核人id
    private Integer reviewMemberId;

    //审核人电话号码
    private String reviewMemberMobile;

    //单位id
    private Integer partyId;

    //经费卡号
    private String fundsCardNo;

    //查询条件：开始时间
    private Date queryStartTime;

    //查询条件：结束时间
    private Date queryEndTime;

    //查询类型（1， 查询自己的代金券 2.查询单位所有的代金券）
    private Integer queryType;

    public LisCashCouponDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Integer getTopicTotalFunds() {
        return topicTotalFunds;
    }

    public void setTopicTotalFunds(Integer topicTotalFunds) {
        this.topicTotalFunds = topicTotalFunds;
    }

    public Integer getApplyMemberId() {
        return applyMemberId;
    }

    public void setApplyMemberId(Integer applyMemberId) {
        this.applyMemberId = applyMemberId;
    }

    public String getApplyMemberName() {
        return applyMemberName;
    }

    public void setApplyMemberName(String applyMemberName) {
        this.applyMemberName = applyMemberName;
    }

    public String getApplyMemberMobile() {
        return applyMemberMobile;
    }

    public void setApplyMemberMobile(String applyMemberMobile) {
        this.applyMemberMobile = applyMemberMobile;
    }

    public String getApplyMemberGroup() {
        return applyMemberGroup;
    }

    public void setApplyMemberGroup(String applyMemberGroup) {
        this.applyMemberGroup = applyMemberGroup;
    }

    public String getApplyMemberAcademic() {
        return applyMemberAcademic;
    }

    public void setApplyMemberAcademic(String applyMemberAcademic) {
        this.applyMemberAcademic = applyMemberAcademic;
    }

    public Integer getTipicNature() {
        return tipicNature;
    }

    public void setTipicNature(Integer tipicNature) {
        this.tipicNature = tipicNature;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Integer getFstatu() {
        return fstatu;
    }

    public void setFstatu(Integer fstatu) {
        this.fstatu = fstatu;
    }

    public Integer getApproveAmount() {
        return approveAmount;
    }

    public void setApproveAmount(Integer approveAmount) {
        this.approveAmount = approveAmount;
    }

    public Integer getApplyTotalAmount() {
        return applyTotalAmount;
    }

    public void setApplyTotalAmount(Integer applyTotalAmount) {
        this.applyTotalAmount = applyTotalAmount;
    }

    public String getFundRatio() {
        return fundRatio;
    }

    public void setFundRatio(String fundRatio) {
        this.fundRatio = fundRatio;
    }

    public String getSolveProblem() {
        return solveProblem;
    }

    public void setSolveProblem(String solveProblem) {
        this.solveProblem = solveProblem;
    }

    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getReviewMemberId() {
        return reviewMemberId;
    }

    public void setReviewMemberId(Integer reviewMemberId) {
        this.reviewMemberId = reviewMemberId;
    }

    public String getReviewMemberMobile() {
        return reviewMemberMobile;
    }

    public void setReviewMemberMobile(String reviewMemberMobile) {
        this.reviewMemberMobile = reviewMemberMobile;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getFundsCardNo() {
        return fundsCardNo;
    }

    public void setFundsCardNo(String fundsCardNo) {
        this.fundsCardNo = fundsCardNo;
    }

    public Date getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(Date queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    public Date getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(Date queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    @Override
    public String toString() {
        return "LisCashCouponDTO{" +
                "id=" + id +
                ", topicId=" + topicId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", topicName='" + topicName + '\'' +
                ", topicTotalFunds=" + topicTotalFunds +
                ", applyMemberId=" + applyMemberId +
                ", applyMemberName='" + applyMemberName + '\'' +
                ", applyMemberGroup='" + applyMemberGroup + '\'' +
                ", applyMemberAcademic='" + applyMemberAcademic + '\'' +
                ", tipicNature=" + tipicNature +
                ", applyType=" + applyType +
                ", fstatu=" + fstatu +
                ", approveAmount=" + approveAmount +
                ", applyTotalAmount=" + applyTotalAmount +
                ", fundRatio='" + fundRatio + '\'' +
                ", solveProblem='" + solveProblem + '\'' +
                ", expectResult='" + expectResult + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", reviewMemberId=" + reviewMemberId +
                ", reviewMemberMobile='" + reviewMemberMobile + '\'' +
                ", partyId=" + partyId +
                '}';
    }
}
