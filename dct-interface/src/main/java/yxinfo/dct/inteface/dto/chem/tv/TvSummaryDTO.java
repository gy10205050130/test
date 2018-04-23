package yxinfo.dct.inteface.dto.chem.tv;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by dy on 2016/12/16.
 */
public class TvSummaryDTO extends BaseDTO {

    // 待审批领用申请数
    private Integer waitApvArNum;

    // 待回收桶数
    private Integer waitRecycBucketNum;

    // 回收危废性质占比
    private Map<String, BigDecimal> hwRecycNatureRatio;

    // 库存排行榜
    private List<ChemRankDTO> stockRank;

    // 领用排行榜
    private List<ChemRankDTO> receiveRank;

    // 采购排行榜
    List<ChemRankDTO> purchaseRank;

    public Integer getWaitApvArNum() {
        return waitApvArNum;
    }

    public void setWaitApvArNum( Integer waitApvArNum ) {
        this.waitApvArNum = waitApvArNum;
    }

    public Integer getWaitRecycBucketNum() {
        return waitRecycBucketNum;
    }

    public void setWaitRecycBucketNum( Integer waitRecycBucketNum ) {
        this.waitRecycBucketNum = waitRecycBucketNum;
    }

    public Map<String, BigDecimal> getHwRecycNatureRatio() {
        return hwRecycNatureRatio;
    }

    public void setHwRecycNatureRatio( Map<String, BigDecimal> hwRecycNatureRatio ) {
        this.hwRecycNatureRatio = hwRecycNatureRatio;
    }

    public List<ChemRankDTO> getStockRank() {
        return stockRank;
    }

    public void setStockRank( List<ChemRankDTO> stockRank ) {
        this.stockRank = stockRank;
    }

    public List<ChemRankDTO> getReceiveRank() {
        return receiveRank;
    }

    public void setReceiveRank( List<ChemRankDTO> receiveRank ) {
        this.receiveRank = receiveRank;
    }

    public List<ChemRankDTO> getPurchaseRank() {
        return purchaseRank;
    }

    public void setPurchaseRank( List<ChemRankDTO> purchaseRank ) {
        this.purchaseRank = purchaseRank;
    }
}
