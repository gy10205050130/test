package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 商品属性对应值dto
 *
 * Created by cy on 2016/8/10.
 */
public class GoodsPropValDTO extends BaseDTO {

    private Integer id;

    //属性id
    private Integer propId;

    //分类id
    private Integer catId;

    //取值
    private String val;

    public GoodsPropValDTO() {
    }

    public GoodsPropValDTO(Integer id, Integer propId, Integer catId, String val) {
        this.id = id;
        this.propId = propId;
        this.catId = catId;
        this.val = val;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "GoodsPropValDTO{" +
                "id=" + id +
                ", propId=" + propId +
                ", catId=" + catId +
                ", val='" + val + '\'' +
                '}';
    }
}
