package yxinfo.lis.inf.dto.topic;

import org.hibernate.validator.constraints.Length;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.Add;
import yxinfo.lis.inf.validation.groups.Update;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by cy on 2016/10/11.
 *
 * 课题dto
 */
public class LisTopicDTO extends BaseDTO {

    /**
     * id
     */
    private Integer id;

    /**
     * 课题名称
     */
    @Length(max = 80, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private String fname;

    /**
     * 课题编号
     */
    @Length(max = 30, message = ErrorCode.LENGTH)
    private String fcode;

    /**
     * 父课题节点id(默认为0)
     */
    private Integer pid;

    /**
     * 创建人id(课题管理人)
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Add.class}, message = ErrorCode.NOT_NULL)
    private Integer memberId;
    private String memberName;
    private String memberMobile;
    //代金券总额（分）
    private Integer voucherAmount;
    //个人账户余额(预存款)
    private Integer accBalanceImprest;
    //信用积分
    private Integer creditScore;

    /**
     * 单位id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Add.class}, message = ErrorCode.NOT_NULL)
    private Integer partyId;

    /**
     * 经费卡号
     */
    @Length(max = 50, message = ErrorCode.LENGTH)
    private String fundsCardNo;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 备注
     */
    @Length(max = 200, message = ErrorCode.LENGTH)
    private String fremark;

    /**
     * 子节点list
     */
    private List<LisTopicDTO> childTopicDTOList;

    /**
     * 课题下人员list
     */
    private List<LisTopicMemberDTO> topicMemberDTOList;

    //所属单位
    private Integer belongsGroup;

    private Date startTime;

    private Date endTime;

    //课题类型（1：已导入课题 2：预付款课题）
    private Integer ftype;

    //支付方式 2：经费卡 3：代金券 4：预存款
    private Integer payType;

    public LisTopicDTO() {
    }

    public LisTopicDTO(Integer pid) {
        this.pid = pid;
    }

    public LisTopicDTO(Date endTime, Date startTime, Integer id, String fname, String fcode, Integer pid, Integer memberId, String memberName, String memberMobile, Integer partyId, String fundsCardNo, Date createAt, Date updateAt, String fremark, List<LisTopicDTO> childTopicDTOList, List<LisTopicMemberDTO> topicMemberDTOList, Integer belongsGroup) {
        this.endTime = endTime;
        this.startTime = startTime;
        this.id = id;
        this.fname = fname;
        this.fcode = fcode;
        this.pid = pid;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
        this.partyId = partyId;
        this.fundsCardNo = fundsCardNo;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.fremark = fremark;
        this.childTopicDTOList = childTopicDTOList;
        this.topicMemberDTOList = topicMemberDTOList;
        this.belongsGroup = belongsGroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public Integer getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(Integer voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
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

    public String getFremark() {
        return fremark;
    }

    public void setFremark(String fremark) {
        this.fremark = fremark;
    }

    public List<LisTopicDTO> getChildTopicDTOList() {
        return childTopicDTOList;
    }

    public void setChildTopicDTOList(List<LisTopicDTO> childTopicDTOList) {
        this.childTopicDTOList = childTopicDTOList;
    }

    public List<LisTopicMemberDTO> getTopicMemberDTOList() {
        return topicMemberDTOList;
    }

    public void setTopicMemberDTOList(List<LisTopicMemberDTO> topicMemberDTOList) {
        this.topicMemberDTOList = topicMemberDTOList;
    }

    public Integer getBelongsGroup() {
        return belongsGroup;
    }

    public void setBelongsGroup(Integer belongsGroup) {
        this.belongsGroup = belongsGroup;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public Integer getAccBalanceImprest() {
        return accBalanceImprest;
    }

    public void setAccBalanceImprest(Integer accBalanceImprest) {
        this.accBalanceImprest = accBalanceImprest;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        return "LisTopicDTO{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", fcode='" + fcode + '\'' +
                ", pid=" + pid +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", partyId=" + partyId +
                ", fundsCardNo='" + fundsCardNo + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", fremark='" + fremark + '\'' +
                ", childTopicDTOList=" + childTopicDTOList +
                ", topicMemberDTOList=" + topicMemberDTOList +
                '}';
    }
}
