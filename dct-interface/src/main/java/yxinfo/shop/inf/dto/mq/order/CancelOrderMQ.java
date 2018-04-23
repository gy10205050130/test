package yxinfo.shop.inf.dto.mq.order;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * 取消订单消息
 * Created by dy on 2016/8/31.
 */
public class CancelOrderMQ extends BaseDTO {

    private static final long serialVersionUID = -850029457371413330L;

    private Integer partyId;

    private Integer memberId;

    private Integer tranChannelId;

    private Short payType;

    private Integer orderId;

    private List<OrderDetailMQ> orderDetails;

    private Integer amt;

    private Integer merId;

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

    public Integer getAmt() {
        return amt;
    }

    public void setAmt( Integer amt ) {
        this.amt = amt;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }
}
