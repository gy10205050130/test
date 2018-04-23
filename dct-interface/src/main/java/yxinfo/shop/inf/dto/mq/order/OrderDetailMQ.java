package yxinfo.shop.inf.dto.mq.order;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/10/13.
 */
public class OrderDetailMQ extends BaseDTO {

    private static final long serialVersionUID = -3807877082648501019L;

    private Integer goodsId;

    private Integer num;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId( Integer goodsId ) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }
}
