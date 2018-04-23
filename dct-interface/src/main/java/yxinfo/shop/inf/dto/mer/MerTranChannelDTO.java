package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/15.
 */
public class MerTranChannelDTO extends BaseDTO{

    private Integer merId;

    //使用方id，<FK>party_core.id
    private Integer partyId;

    //支付渠道id，<FK>tran_channel.id
    private Integer tranChannelId;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getTranChannelId() {
        return tranChannelId;
    }

    public void setTranChannelId(Integer tranChannelId) {
        this.tranChannelId = tranChannelId;
    }

    @Override
    public String toString() {
        return "MerTranChannelDTO{" +
                "merId=" + merId +
                ", partyId=" + partyId +
                ", tranChannelId=" + tranChannelId +
                '}';
    }
}
