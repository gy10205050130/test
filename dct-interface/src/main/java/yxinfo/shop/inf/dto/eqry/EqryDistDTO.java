package yxinfo.shop.inf.dto.eqry;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;

import javax.validation.constraints.NotNull;

public class EqryDistDTO extends BaseDTO {

    private static final long serialVersionUID = 1836278051393191107L;

    private Integer eqryId;

    // 配送方式（1供应商物流，2平台物流）
    @NotNull( groups = Add.class, message = ErrorCode.NOT_EMPTY )
    private Short distMode;

    // 收货
    private String receiptTime;

    // 买家留言
    private String leaveMsg;

    public Integer getEqryId() {
        return eqryId;
    }

    public void setEqryId( Integer eqryId ) {
        this.eqryId = eqryId;
    }

    public Short getDistMode() {
        return distMode;
    }

    public void setDistMode( Short distMode ) {
        this.distMode = distMode;
    }

    public String getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime( String receiptTime ) {
        this.receiptTime = receiptTime;
    }

    public String getLeaveMsg() {
        return leaveMsg;
    }

    public void setLeaveMsg( String leaveMsg ) {
        this.leaveMsg = leaveMsg;
    }
}