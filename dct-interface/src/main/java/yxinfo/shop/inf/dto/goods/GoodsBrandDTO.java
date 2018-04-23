package yxinfo.shop.inf.dto.goods;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 商品品牌dto
 *
 * Created by cy on 2016/8/1.
 */
public class GoodsBrandDTO extends BaseDTO {

    /**
     * 品牌名称
     */
    @Length(max = 20, message = ErrorCode.LENGTH)
    private String brand;

    /**
     * 商户id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer merId;

    /**
     * 分类id
     */
    private Integer catId;

    //是否显示
    private Boolean isShow;

    //排序
    private Integer sort;

    public GoodsBrandDTO() {
    }

    public GoodsBrandDTO(String brand, Integer merId ,Boolean isShow, Integer sort) {
        this.brand = brand;
        this.merId = merId;
        this.isShow=isShow;
        this.sort=sort;
    }

    public GoodsBrandDTO(String brand, Integer merId, Integer catId,Boolean isShow, Integer sort) {
        this.brand = brand;
        this.merId = merId;
        this.catId = catId;
        this.isShow=isShow;
        this.sort=sort;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "GoodsBrandDTO{" +
                "brand='" + brand + '\'' +
                ", merId=" + merId +
                ", catId=" + catId +
                ", isShow=" + isShow +
                ", sort=" + sort +
                '}';
    }
}
