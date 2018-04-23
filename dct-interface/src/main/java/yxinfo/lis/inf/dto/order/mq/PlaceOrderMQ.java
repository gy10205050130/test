package yxinfo.lis.inf.dto.order.mq;

import yxinfo.lis.inf.dto.BaseDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/29.
 */
public class PlaceOrderMQ extends BaseDTO {

    private static final long serialVersionUID = -9170683485353233302L;

    private List<Integer> orderIds;

    private Integer partyId;

    private Integer memberId;

    private Integer tranChannelId;

    private Integer payType;

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds( List<Integer> orderIds ) {
        this.orderIds = orderIds;
    }

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

    public Integer getPayType() {
        return payType;
    }

    public void setPayType( Integer payType ) {
        this.payType = payType;
    }
}
