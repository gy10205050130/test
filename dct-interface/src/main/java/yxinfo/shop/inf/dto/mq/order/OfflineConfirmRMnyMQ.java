package yxinfo.shop.inf.dto.mq.order;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 线下支付确认收款消息
 * Created by dy on 2016/10/13.
 */
public class OfflineConfirmRMnyMQ extends BaseDTO {

    private static final long serialVersionUID = 2708862843580180664L;

    private Integer partyId;

    private Integer merId;

    private Integer memberId;

    private Integer tranChannelId;

    private Short payType;

    private Integer orderId;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
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
}
