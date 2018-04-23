package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 商品库存dto
 *
 * Created by cy on 2016/8/16.
 */
public class GoodsStockDTO extends BaseDTO {

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 库存
     */
    private Integer quantity;

    public GoodsStockDTO() {
    }

    public GoodsStockDTO(Integer goodsId, Integer quantity) {
        this.goodsId = goodsId;
        this.quantity = quantity;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
