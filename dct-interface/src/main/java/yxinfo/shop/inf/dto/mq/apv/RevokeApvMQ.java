package yxinfo.shop.inf.dto.mq.apv;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/10/14.
 */
public class RevokeApvMQ extends BaseDTO {

    private static final long serialVersionUID = 7092580228563573330L;

    private Integer approveRecodeId;

    private Integer memberId;

    private Integer step;

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep( Integer step ) {
        this.step = step;
    }
}
