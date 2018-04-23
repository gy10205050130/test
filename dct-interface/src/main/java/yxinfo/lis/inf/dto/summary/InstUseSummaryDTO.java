package yxinfo.lis.inf.dto.summary;

import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.inst.InstInstrumentDTO;
import yxinfo.lis.inf.dto.mbr.MemberCoreDTO;
import yxinfo.lis.inf.dto.platform.LisPlatformDTO;

import java.util.Date;

/**
 * 订单使用情况dto
 *
 * Created by cy on 2016/10/28.
 */
public class InstUseSummaryDTO extends BaseDTO {

    private Integer id;

    //仪器id
    private Integer instId;
    private String instName;
    private InstInstrumentDTO instInstrumentDTO;

    //平台id
    private Integer platId;
    private String platName;
    private LisPlatformDTO lisPlatformDTO;

    //仪器负责人id
    private Integer memberId;
    private String memberName;
    private String mobile;
    private MemberCoreDTO memberCoreDTO;

    //实验室id
    private Integer labId;

    //汇总日期
    private String summaryDate;

    //所属单位
    private Integer partyId;

    //当天订单数量
    private Integer orderCount;

    //实际的订单数量（根据是否有开始时间）
    private Integer effectiveOrderCount;

    //总收入
    private Long income;

    //预约总时长
    private Integer appointTimeLen;

    //实际使用时长
    private Integer realUseTimeLen;

    //仪器当天开放时长
    private Integer openTimeLen;

    private Date createAt;

    //查询开始时间
    private Date queryStartAt;

    //查询结束时间
    private Date queryEndAt;

    //汇总时间条件（201611或2016）
    private String querySummaryDate;

    public InstUseSummaryDTO() {
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

    public InstInstrumentDTO getInstInstrumentDTO() {
        return instInstrumentDTO;
    }

    public void setInstInstrumentDTO(InstInstrumentDTO instInstrumentDTO) {
        this.instInstrumentDTO = instInstrumentDTO;
    }

    public Integer getEffectiveOrderCount() {
        return effectiveOrderCount;
    }

    public void setEffectiveOrderCount(Integer effectiveOrderCount) {
        this.effectiveOrderCount = effectiveOrderCount;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public LisPlatformDTO getLisPlatformDTO() {
        return lisPlatformDTO;
    }

    public void setLisPlatformDTO(LisPlatformDTO lisPlatformDTO) {
        this.lisPlatformDTO = lisPlatformDTO;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO(MemberCoreDTO memberCoreDTO) {
        this.memberCoreDTO = memberCoreDTO;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(String summaryDate) {
        this.summaryDate = summaryDate;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public Integer getAppointTimeLen() {
        return appointTimeLen;
    }

    public void setAppointTimeLen(Integer appointTimeLen) {
        this.appointTimeLen = appointTimeLen;
    }

    public Integer getRealUseTimeLen() {
        return realUseTimeLen;
    }

    public void setRealUseTimeLen(Integer realUseTimeLen) {
        this.realUseTimeLen = realUseTimeLen;
    }

    public Integer getOpenTimeLen() {
        return openTimeLen;
    }

    public void setOpenTimeLen(Integer openTimeLen) {
        this.openTimeLen = openTimeLen;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getQueryStartAt() {
        return queryStartAt;
    }

    public void setQueryStartAt(Date queryStartAt) {
        this.queryStartAt = queryStartAt;
    }

    public Date getQueryEndAt() {
        return queryEndAt;
    }

    public void setQueryEndAt(Date queryEndAt) {
        this.queryEndAt = queryEndAt;
    }

    public String getQuerySummaryDate() {
        return querySummaryDate;
    }

    public void setQuerySummaryDate(String querySummaryDate) {
        this.querySummaryDate = querySummaryDate;
    }

    @Override
    public String toString() {
        return "InstUseSummaryDTO{" +
                "id=" + id +
                ", instId=" + instId +
                ", instName='" + instName + '\'' +
                ", platId=" + platId +
                ", platName='" + platName + '\'' +
                ", lisPlatformDTO=" + lisPlatformDTO +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", memberCoreDTO=" + memberCoreDTO +
                ", labId=" + labId +
                ", summaryDate='" + summaryDate + '\'' +
                ", partyId=" + partyId +
                ", orderCount=" + orderCount +
                ", income=" + income +
                ", appointTimeLen=" + appointTimeLen +
                ", openTimeLen=" + openTimeLen +
                ", createAt=" + createAt +
                '}';
    }
}
