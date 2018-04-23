package yxinfo.shop.inf.dto.mq.order;

import yxinfo.dct.inteface.dto.evt.EvtNotifyDTO;
import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 购买流程审核消息推送 - 消息队列消息DTO
 * Created by dy on 2016/9/4.
 */
public class ApvPushMQ extends BaseDTO {

    private static final long serialVersionUID = -7552233934678079041L;

    // 推送内容
    private EvtNotifyDTO notify;

    // 使用方id
    private Integer partyId;

    // 订单id
    private Integer orderId;

    public EvtNotifyDTO getNotify() {
        return notify;
    }

    public void setNotify( EvtNotifyDTO notify ) {
        this.notify = notify;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }
}
