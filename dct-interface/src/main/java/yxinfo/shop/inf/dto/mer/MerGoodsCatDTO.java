package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/3.
 */
public class MerGoodsCatDTO extends BaseDTO {

    //商户id
    private Integer merId;

    private Integer catId;

    private String catName;

    //使用方id
    private Integer partyId;

    //排序，desc
    private Integer sort;

    private MerCoreDTO merCoreDTO;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
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

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "MerGoodsCatDTO{" +
                "merId=" + merId +
                ", catId=" + catId +
                ", catName='" + catName + '\'' +
                ", partyId=" + partyId +
                ", sort=" + sort +
                ", merCoreDTO=" + merCoreDTO +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MerGoodsCatDTO that = (MerGoodsCatDTO) o;

        if (merId != null ? !merId.equals(that.merId) : that.merId != null) return false;
        if (catId != null ? !catId.equals(that.catId) : that.catId != null) return false;
        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = merId != null ? merId.hashCode() : 0;
        result = 31 * result + (catId != null ? catId.hashCode() : 0);
        result = 31 * result + (partyId != null ? partyId.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
