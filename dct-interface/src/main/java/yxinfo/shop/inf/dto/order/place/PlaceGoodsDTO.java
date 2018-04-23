package yxinfo.shop.inf.dto.order.place;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.order.PlaceOrder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 下单商品DTO
 * Created by dy on 2016/8/11.
 */
public class PlaceGoodsDTO extends BaseDTO {

    private static final long serialVersionUID = 1624126733337262806L;

    // 商品id
    @NotNull( groups = PlaceOrder.class, message = ErrorCode.NOT_EMPTY )
    private Integer goodsId;

    // 数量
    @NotNull( groups = PlaceOrder.class, message = ErrorCode.NOT_EMPTY )
    @Min( groups = PlaceOrder.class, value = 1, message = ErrorCode.Order.PLACE_GOODS_NUM_ZERO )
    private Integer num;

    // 商品版本
    private Short version;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }
}
