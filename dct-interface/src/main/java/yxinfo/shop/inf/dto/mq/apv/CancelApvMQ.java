package yxinfo.shop.inf.dto.mq.apv;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 置审核失败消息
 * Created by dy on 2016/10/14.
 */
public class CancelApvMQ extends BaseDTO {

    private static final long serialVersionUID = 5231060314834721540L;

    private Integer extraMsgId;

    private String itemNo;

    public Integer getExtraMsgId() {
        return extraMsgId;
    }

    public void setExtraMsgId( Integer extraMsgId ) {
        this.extraMsgId = extraMsgId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }
}
