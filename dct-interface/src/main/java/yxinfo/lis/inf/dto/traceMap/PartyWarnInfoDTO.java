package yxinfo.lis.inf.dto.traceMap;

import yxinfo.dct.inteface.dto.chem.tv.TvSummaryDTO;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.party.PartyCoreDTO;

/**
 * Created by cy on 2017/1/6.
 */
public class PartyWarnInfoDTO extends BaseDTO {

    /**
     * 单位dto
     */
    private PartyCoreDTO partyCoreDTO;

    private TvSummaryDTO tvSummaryDTO;

    /**
     * 是否有预警信息（1：无 2：有）
     */
    private String hasWarnInfo;

    /**
     * 预警信息条数
     */
    private Integer warnInfoCount;

    /**
     * 查询条件
     */
    private String partyName;

    public PartyCoreDTO getPartyCoreDTO() {
        return partyCoreDTO;
    }

    public void setPartyCoreDTO(PartyCoreDTO partyCoreDTO) {
        this.partyCoreDTO = partyCoreDTO;
    }

    public String getHasWarnInfo() {
        return hasWarnInfo;
    }

    public void setHasWarnInfo(String hasWarnInfo) {
        this.hasWarnInfo = hasWarnInfo;
    }

    public TvSummaryDTO getTvSummaryDTO() {
        return tvSummaryDTO;
    }

    public void setTvSummaryDTO(TvSummaryDTO tvSummaryDTO) {
        this.tvSummaryDTO = tvSummaryDTO;
    }

    public Integer getWarnInfoCount() {
        return warnInfoCount;
    }

    public void setWarnInfoCount(Integer warnInfoCount) {
        this.warnInfoCount = warnInfoCount;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }
}
