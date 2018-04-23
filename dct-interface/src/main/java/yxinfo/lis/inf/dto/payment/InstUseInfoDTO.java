package yxinfo.lis.inf.dto.payment;

import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.inst.InstInstrumentDTO;

import java.util.Date;

/**
 * 仪器使用情况dto
 * <p>
 * Created by cy on 2016/10/19.
 */
public class InstUseInfoDTO extends BaseDTO {

    /**
     * 仪器信息dto
     */
    private InstInstrumentDTO instrumentDTO;

    /**
     * 仪器预约使用时长
     */
    private Long hourUseLength;

    /**
     * 仪器实际使用时长
     */
    private Long hourRealUseLength;

    /**
     * 合计收入
     */
    private Long totalIncome;

    private Integer partyId;

    /**
     * 开始时间（查询条件）
     */
    private Date startDate;

    /**
     * 结束时间（查询条件）
     */
    private Date endDate;

    /**
     * 负责人id
     */
    private Integer memberId;

    public InstUseInfoDTO() {
    }

    public InstInstrumentDTO getInstrumentDTO() {
        return instrumentDTO;
    }

    public void setInstrumentDTO(InstInstrumentDTO instrumentDTO) {
        this.instrumentDTO = instrumentDTO;
    }

    public Long getHourUseLength() {
        return hourUseLength;
    }

    public void setHourUseLength(Long hourUseLength) {
        this.hourUseLength = hourUseLength;
    }

    public Long getHourRealUseLength() {
        return hourRealUseLength;
    }

    public void setHourRealUseLength(Long hourRealUseLength) {
        this.hourRealUseLength = hourRealUseLength;
    }

    public Long getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Long totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "InstUseInfoDTO{" +
                "instrumentDTO=" + instrumentDTO +
                ", hourUseLength=" + hourUseLength +
                ", totalIncome=" + totalIncome +
                '}';
    }
}
