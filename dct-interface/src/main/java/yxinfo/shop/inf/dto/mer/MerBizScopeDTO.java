package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/25.
 */
public class MerBizScopeDTO extends BaseDTO{

    //商户id
    private Integer merId;

    //经营分类
    private Integer catId;

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

    @Override
    public String toString() {
        return "MerBizScopeDTO{" +
                "merId=" + merId +
                ", catId=" + catId +
                '}';
    }
}
