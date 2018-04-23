package yxinfo.shop.inf.dto.order;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.order.PlaceOrder;

import javax.validation.constraints.NotNull;

public class OrderDistDTO extends BaseDTO {

    private static final long serialVersionUID = -2461745875517885466L;

    private Integer orderId;

    // 配送方式（1供应商物流，2平台物流）
    @NotNull( groups = PlaceOrder.class, message = ErrorCode.NOT_EMPTY )
    private Short distMode;

    // 收货时间
    private String receiptTime;

    //买家留言
    private String leaveMsg;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
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