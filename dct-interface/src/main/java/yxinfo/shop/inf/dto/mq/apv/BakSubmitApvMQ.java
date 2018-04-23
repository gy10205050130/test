package yxinfo.shop.inf.dto.mq.apv;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 撤销审核单提交消息
 * Created by dy on 2016/10/13.
 */
public class BakSubmitApvMQ extends BaseDTO {

    private static final long serialVersionUID = -6579381368742308082L;

    private String itemNo;

    private Integer orgId;

    private Integer extraMsgId;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Integer getExtraMsgId() {
        return extraMsgId;
    }

    public void setExtraMsgId( Integer extraMsgId ) {
        this.extraMsgId = extraMsgId;
    }
}
