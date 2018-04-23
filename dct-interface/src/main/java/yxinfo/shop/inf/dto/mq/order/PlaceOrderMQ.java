package yxinfo.shop.inf.dto.mq.order;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;

import java.util.List;

/**
 * 下单消息
 * Created by dy on 2016/8/29.
 */
public class PlaceOrderMQ extends BaseDTO {

    private static final long serialVersionUID = -9170683485353233302L;

    private Integer partyId;

    private Integer memberId;

    private Integer tranChannelId;

    private Short payType;

    // *id/merId/price/epsPrice/actualPay
    private List<OrderCoreDTO> orders;

    private Short placeType;

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

    public List<OrderCoreDTO> getOrders() {
        return orders;
    }

    public void setOrders( List<OrderCoreDTO> orders ) {
        this.orders = orders;
    }

    public Short getPlaceType() {
        return placeType;
    }

    public void setPlaceType( Short placeType ) {
        this.placeType = placeType;
    }
}
