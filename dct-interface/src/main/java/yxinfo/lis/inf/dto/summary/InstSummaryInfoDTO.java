package yxinfo.lis.inf.dto.summary;


import yxinfo.lis.inf.dto.BaseDTO;

/**
 * 仪器汇总信息dto
 *
 * Created by cy on 2016/10/29.
 */
public class InstSummaryInfoDTO extends BaseDTO {

    /**
     * 汇总时间
     */
    private String summaryDate;

    /**
     * 仪器数量
     */
    private Integer instCount;

    /**
     * 总共预约时间
     */
    private Integer totalAppointTime;

    /**
     * 总共实际使用时间
     */
    private Integer totalRealUseTime;

    /**
     * 总共开放时间
     */
    private Integer totalOpenTime;

    /**
     * 订单总数
     */
    private Integer totalOrderCount;

    /**
     * 实际使用的订单总数
     */
    private Integer totalEffecOrderCount;

    /**
     * 单位id
     */
    private Integer partyId;

    /**
     * 总收入
     */
    private Long totalIncome;

    private Integer sort;

    public InstSummaryInfoDTO() {
    }

    public String getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(String summaryDate) {
        this.summaryDate = summaryDate;
    }

    public Integer getInstCount() {
        return instCount;
    }

    public void setInstCount(Integer instCount) {
        this.instCount = instCount;
    }

    public Integer getTotalAppointTime() {
        return totalAppointTime;
    }

    public void setTotalAppointTime(Integer totalAppointTime) {
        this.totalAppointTime = totalAppointTime;
    }

    public Integer getTotalRealUseTime() {
        return totalRealUseTime;
    }

    public void setTotalRealUseTime(Integer totalRealUseTime) {
        this.totalRealUseTime = totalRealUseTime;
    }

    public Integer getTotalOpenTime() {
        return totalOpenTime;
    }

    public void setTotalOpenTime(Integer totalOpenTime) {
        this.totalOpenTime = totalOpenTime;
    }

    public Integer getTotalOrderCount() {
        return totalOrderCount;
    }

    public void setTotalOrderCount(Integer totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
    }

    public Integer getTotalEffecOrderCount() {
        return totalEffecOrderCount;
    }

    public void setTotalEffecOrderCount(Integer totalEffecOrderCount) {
        this.totalEffecOrderCount = totalEffecOrderCount;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Long getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Long totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "InstSummaryInfoDTO{" +
                "summaryDate='" + summaryDate + '\'' +
                ", instCount=" + instCount +
                ", totalAppointTime=" + totalAppointTime +
                ", totalRealUseTime=" + totalRealUseTime +
                ", totalOpenTime=" + totalOpenTime +
                ", totalOrderCount=" + totalOrderCount +
                ", partyId=" + partyId +
                ", totalIncome=" + totalIncome +
                '}';
    }
}
