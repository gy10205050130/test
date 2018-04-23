package yxinfo.shop.inf.dto.mq.order;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * 商品库存补偿消息
 * Created by dy on 2016/10/13.
 */
public class GoodsStockBakMQ extends BaseDTO {

    private static final long serialVersionUID = -2642087670342736578L;

    private Integer partyId;

    private Integer memberId;

    private Integer tranChannelId;

    private Short payType;

    private Integer orderId;

    private List<OrderDetailMQ> orderDetails;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getTranChannelId() {
        return tranChannelId;
    }

    public void setTranChannelId( Integer tranChannelId ) {
        this.tranChannelId = tranChannelId;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType( Short payType ) {
        this.payType = payType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public List<OrderDetailMQ> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails( List<OrderDetailMQ> orderDetails ) {
        this.orderDetails = orderDetails;
    }
}
