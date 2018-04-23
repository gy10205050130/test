package yxinfo.lis.inf.dto.order.eps;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.order.eps.DeliverGoods;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/8/26.
 */
public class ConfirmReceiptDTO extends BaseDTO {

    private static final long serialVersionUID = -2158335392174606632L;

    @NotNull( groups = DeliverGoods.class, message = ErrorCode.NOT_EMPTY )
    private Integer orderId;

    @NotNull( groups = DeliverGoods.class, message = ErrorCode.NOT_EMPTY )
    private Integer memberId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }
}
