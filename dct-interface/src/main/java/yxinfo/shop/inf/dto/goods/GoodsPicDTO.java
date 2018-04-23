package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Update;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * 商品图片dto
 *
 * Created by cy on 2016/8/1.
 */
public class GoodsPicDTO extends BaseDTO {

    /**
     * 静态资源id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private Integer staticId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 是否是封面
     */
    private Boolean isCover = false;

    /**
     * 排序
     */
    private Short sort = 0;

    public GoodsPicDTO() {
    }

    public GoodsPicDTO(Integer staticId, Integer goodsId, Boolean isCover, Short sort) {
        this.staticId = staticId;
        this.goodsId = goodsId;
        this.isCover = isCover;
        this.sort = sort;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getIsCover() {
        return isCover;
    }

    public void setIsCover(Boolean cover) {
        isCover = cover;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "GoodsPicDTO{" +
                "staticId=" + staticId +
                ", goodsId=" + goodsId +
                ", isCover=" + isCover +
                ", sort=" + sort +
                '}';
    }
}
