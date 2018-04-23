package yxinfo.lis.inf.dto.order;

import org.hibernate.validator.constraints.Length;
import yxinfo.dct.inteface.validation.groups.Add;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.inst.InstBindleDTO;
import yxinfo.lis.inf.dto.inst.InstChargeRuleDTO;
import yxinfo.lis.inf.dto.inst.InstInstrumentDTO;
import yxinfo.lis.inf.dto.order.judge.JudgeDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/6.
 */
public class InstOrderDTO extends BaseDTO {

    //订单id
    @NotNull(groups = {Add.class}, message = ErrorCode.NOT_NULL)
    private Integer id;

    //订单号
    private String orderNo;

    //仪器id
    private Integer instId;

    //实验室id
    private Integer LabId;

    //仪器地址
    private String address;

    //检测内容
    @NotNull(groups = {Add.class}, message = ErrorCode.NOT_NULL)
    @Length(max = 50, message = ErrorCode.LENGTH)
    private String testItem;

    //仪器型号
    private String modelNo;

    //仪器名称
    private String instName;

    //使用开始时间
    private Date startTime;

    //使用结束时间
    private Date endTime;

    //备注信息
    private String orderRemark;

    //是否自带耗材(1是，2否)
    private Boolean isTakeMaterials;

    //是否委托检验(1是，2否)
    private Boolean isEntrustedTest;

    //预约者组织id
    private Integer bookerPartyId;

    //预约者id
    private Integer bookerId;

    //预约者名字
    private String bookerName;

    //预约者电话号码
    private String bookerTel;

    //预约者服务单位
    private String bookerOrg;

    //主状态(1审核，2使用，3支付，4评价，5取消，6关闭，7完成，8退款)
    private Integer fstatus;

    //预约状态(1待审核，2审核中，3审核通过，4未通过)
    private Integer bookStatus;

    //审核状态(1待审核，2审核中，3审核通过，4未通过)
    private Integer reviewStatus;

    //支付状态1待支付，2支付取消，3已支付
    private Integer payStatus;

    //使用状态(1未使用，2待使用，3使用中，4使用完成)
    private Integer useStatus;

    //退款状态(1退款中，2已退款)
    private Integer refundStatus;

    //评价状态(1待评价，2评价完成)
    private Integer judgeStatus;

    //是否取消(0未取消，1已取消)
    private Boolean isCancel;

    //取消原因
    private String cancelReason;

    //费用合计(分)
    private Long costCount;

    //费用说明
    private String costRemark;

    //是否完成预约(0未完成，1完成)
    private Boolean isSuccess;

    //负责人id
    private Integer memberId;

    //负责人名字
    private String memberName;

    //负责人电话号码
    private String memberTel;

    //负责人服务单位
    private String memberOrg;

    //订单创建时间
    private Date createAt;

    //不通过原因
    private String passReason;

    //仪器收费标准
    private String chargeStd;

    //仪器
    private InstInstrumentDTO instInstrumentDTO;

    //评价信息
    private JudgeDTO judgeDTO;

    //获取审核通过的天数
    private Integer amount;

    //使用开始时间
    private Date startUseTime;

    //使用结束时间
    private Date endUseTime;

    //电源、控制器绑定列表
    private List<InstBindleDTO> instBindleDTOList;

    //实验文档id
    private Integer exeprimentDocId;

    //时间段
    private String orderDate;

    //预约时间段
    private List<InstOrderTimesDTO> instOrderTimesDTOList;

    //仪器收费规则
    private InstChargeRuleDTO instChargeRuleDTO;

    //预约时间段
    private String times;

    //预约时间段Android
    private String androidTimes;

    //大时间段的状态
    private Map<String, String> timesStatus;

    //总价(分)
    private Long totalPrice;

    //委托检测价格(分)
    private Long testPrice;

    //通过仪器id获取指定时间的时间段(1.0版本的时间段数据)
//    private List<String> timeList;

    //查询订单状态
    private Integer orderType;

    //仪器组织id
    private Integer instPartyId;

    //iPad的Mac地址
    private String ipadMac;

    //做实验所需的样、次、针数
    @Length(max = 4, message = ErrorCode.LENGTH)
    private Integer experimentNeedNum;

    //1时间收费2样收费3针收费4次收费
    private Short chargeType;

    //实验时间超出的钱
    private Long overTimeMoney;

    //推送人的memberId
    private Integer pushMemberId;

    public Integer getLabId() {
        return LabId;
    }

    public void setLabId(Integer labId) {
        LabId = labId;
    }

    public Map<String, String> getTimesStatus() {
        return timesStatus;
    }

    public void setTimesStatus(Map<String, String> timesStatus) {
        this.timesStatus = timesStatus;
    }

    public String getAndroidTimes() {
        return androidTimes;
    }

    public void setAndroidTimes(String androidTimes) {
        this.androidTimes = androidTimes;
    }

    public Long getOverTimeMoney() {
        return overTimeMoney;
    }

    public void setOverTimeMoney(Long overTimeMoney) {
        this.overTimeMoney = overTimeMoney;
    }

    public Short getChargeType() {
        return chargeType;
    }

    public void setChargeType(Short chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getExperimentNeedNum() {
        return experimentNeedNum;
    }

    public void setExperimentNeedNum(Integer experimentNeedNum) {
        this.experimentNeedNum = experimentNeedNum;
    }

    public String getIpadMac() {
        return ipadMac;
    }

    public void setIpadMac(String ipadMac) {
        this.ipadMac = ipadMac;
    }

    public Date getEndUseTime() {
        return endUseTime;
    }

    public void setEndUseTime(Date endUseTime) {
        this.endUseTime = endUseTime;
    }

    public Date getStartUseTime() {
        return startUseTime;
    }

    public void setStartUseTime(Date startUseTime) {
        this.startUseTime = startUseTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBookerId() {
        return bookerId;
    }

    public void setBookerId(Integer bookerId) {
        this.bookerId = bookerId;
    }

    public List<InstBindleDTO> getInstBindleDTOList() {
        return instBindleDTOList;
    }

    public void setInstBindleDTOList(List<InstBindleDTO> instBindleDTOList) {
        this.instBindleDTOList = instBindleDTOList;
    }

    public String getBookerName() {
        return bookerName;
    }

    public void setBookerName(String bookerName) {
        this.bookerName = bookerName;
    }

    public String getBookerOrg() {
        return bookerOrg;
    }

    public void setBookerOrg(String bookerOrg) {
        this.bookerOrg = bookerOrg;
    }

    public Integer getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Long getCostCount() {
        return costCount;
    }

    public void setCostCount(Long costCount) {
        this.costCount = costCount;
    }

    public String getCostRemark() {
        return costRemark;
    }

    public void setCostRemark(String costRemark) {
        this.costRemark = costRemark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public Boolean getIsEntrustedTest() {
        return isEntrustedTest;
    }

    public void setIsEntrustedTest(Boolean entrustedTest) {
        isEntrustedTest = entrustedTest;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Boolean getIsTakeMaterials() {
        return isTakeMaterials;
    }

    public void setIsTakeMaterials(Boolean takeMaterials) {
        isTakeMaterials = takeMaterials;
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

    public String getMemberOrg() {
        return memberOrg;
    }

    public void setMemberOrg(String memberOrg) {
        this.memberOrg = memberOrg;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTestItem() {
        return testItem;
    }

    public void setTestItem(String testItem) {
        this.testItem = testItem;
    }

    public String getBookerTel() {
        return bookerTel;
    }

    public void setBookerTel(String bookerTel) {
        this.bookerTel = bookerTel;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }

    public Boolean getCancel() {
        return isCancel;
    }

    public void setCancel(Boolean cancel) {
        isCancel = cancel;
    }

    public Integer getJudgeStatus() {
        return judgeStatus;
    }

    public void setJudgeStatus(Integer judgeStatus) {
        this.judgeStatus = judgeStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public String getPassReason() {
        return passReason;
    }

    public void setPassReason(String passReason) {
        this.passReason = passReason;
    }

    public String getChargeStd() {
        return chargeStd;
    }

    public void setChargeStd(String chargeStd) {
        this.chargeStd = chargeStd;
    }

    public InstInstrumentDTO getInstInstrumentDTO() {
        return instInstrumentDTO;
    }

    public void setInstInstrumentDTO(InstInstrumentDTO instInstrumentDTO) {
        this.instInstrumentDTO = instInstrumentDTO;
    }

    public JudgeDTO getJudgeDTO() {
        return judgeDTO;
    }

    public void setJudgeDTO(JudgeDTO judgeDTO) {
        this.judgeDTO = judgeDTO;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBookerPartyId() {
        return bookerPartyId;
    }

    public void setBookerPartyId(Integer bookerPartyId) {
        this.bookerPartyId = bookerPartyId;
    }

    public Integer getExeprimentDocId() {
        return exeprimentDocId;
    }

    public void setExeprimentDocId(Integer exeprimentDocId) {
        this.exeprimentDocId = exeprimentDocId;
    }

    public List<InstOrderTimesDTO> getInstOrderTimesDTOList() {
        return instOrderTimesDTOList;
    }

    public void setInstOrderTimesDTOList(List<InstOrderTimesDTO> instOrderTimesDTOList) {
        this.instOrderTimesDTOList = instOrderTimesDTOList;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public InstChargeRuleDTO getInstChargeRuleDTO() {
        return instChargeRuleDTO;
    }

    public void setInstChargeRuleDTO(InstChargeRuleDTO instChargeRuleDTO) {
        this.instChargeRuleDTO = instChargeRuleDTO;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Long getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(Long testPrice) {
        this.testPrice = testPrice;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public Integer getInstPartyId() {
        return instPartyId;
    }

    public void setInstPartyId(Integer instPartyId) {
        this.instPartyId = instPartyId;
    }

    public Integer getPushMemberId() {
        return pushMemberId;
    }

    public void setPushMemberId(Integer pushMemberId) {
        this.pushMemberId = pushMemberId;
    }

    @Override
    public String toString() {
        return "InstOrderDTO{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", instId=" + instId +
                ", testItem='" + testItem + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", instName='" + instName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", orderRemark='" + orderRemark + '\'' +
                ", isTakeMaterials=" + isTakeMaterials +
                ", isEntrustedTest=" + isEntrustedTest +
                ", bookerPartyId=" + bookerPartyId +
                ", bookerId=" + bookerId +
                ", bookerName='" + bookerName + '\'' +
                ", bookerTel='" + bookerTel + '\'' +
                ", bookerOrg='" + bookerOrg + '\'' +
                ", fstatus=" + fstatus +
                ", bookStatus=" + bookStatus +
                ", reviewStatus=" + reviewStatus +
                ", payStatus=" + payStatus +
                ", useStatus=" + useStatus +
                ", refundStatus=" + refundStatus +
                ", judgeStatus=" + judgeStatus +
                ", isCancel=" + isCancel +
                ", cancelReason='" + cancelReason + '\'' +
                ", costCount=" + costCount +
                ", costRemark='" + costRemark + '\'' +
                ", isSuccess=" + isSuccess +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberTel='" + memberTel + '\'' +
                ", memberOrg='" + memberOrg + '\'' +
                ", createAt=" + createAt +
                ", passReason='" + passReason + '\'' +
                ", chargeStd='" + chargeStd + '\'' +
                ", instInstrumentDTO=" + instInstrumentDTO +
                ", judgeDTO=" + judgeDTO +
                ", amount=" + amount +
                ", startUseTime=" + startUseTime +
                ", endUseTime=" + endUseTime +
                ", instBindleDTOList=" + instBindleDTOList +
                ", exeprimentDocId=" + exeprimentDocId +
                ", orderDate='" + orderDate + '\'' +
                ", instOrderTimesDTOList=" + instOrderTimesDTOList +
                ", instChargeRuleDTO=" + instChargeRuleDTO +
                ", times='" + times + '\'' +
                ", totalPrice=" + totalPrice +
                ", testPrice=" + testPrice +
                ", orderType=" + orderType +
                ", instPartyId=" + instPartyId +
                '}';
    }
}
