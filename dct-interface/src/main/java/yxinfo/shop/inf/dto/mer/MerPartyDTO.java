package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.party.PartyCoreDTO;

/**
 * Created by ZH on 2016/8/10.
 */
public class MerPartyDTO extends BaseDTO{

    //商户id
    private Integer merId;

    //使用方id
    private Integer partyId;

    //类型（1入驻，2合作）
    private Short ftype;

    //合作分类
    private String classify;

    //排序，desc
    private Integer sort;

    private PartyCoreDTO partyCoreDTO;

    private MerCoreDTO merCoreDTO;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO(MerCoreDTO merCoreDTO) {
        this.merCoreDTO = merCoreDTO;
    }

    public PartyCoreDTO getPartyCoreDTO() {
        return partyCoreDTO;
    }

    public void setPartyCoreDTO(PartyCoreDTO partyCoreDTO) {
        this.partyCoreDTO = partyCoreDTO;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype(Short ftype) {
        this.ftype = ftype;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "MerPartyDTO{" +
                "merId=" + merId +
                ", partyId=" + partyId +
                ", ftype=" + ftype +
                ", classify='" + classify + '\'' +
                ", sort=" + sort +
                ", partyCoreDTO=" + partyCoreDTO +
                ", merCoreDTO=" + merCoreDTO +
                '}';
    }
}
