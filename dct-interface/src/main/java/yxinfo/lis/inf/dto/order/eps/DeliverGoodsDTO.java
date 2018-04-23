package yxinfo.lis.inf.dto.order.eps;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.order.eps.DeliverGoods;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/8/26.
 */
public class DeliverGoodsDTO extends BaseDTO {

    private static final long serialVersionUID = -276057361606001442L;

    @NotNull( groups = DeliverGoods.class, message = ErrorCode.NOT_EMPTY )
    private Integer merId;

    @NotNull( groups = DeliverGoods.class, message = ErrorCode.NOT_EMPTY )
    private Integer orderId;

    // 单号
    private String epsNo;

    // 电话
    private String epsTel;

    // 批准文号
    private String approvalNo;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public String getEpsNo() {
        return epsNo;
    }

    public void setEpsNo( String epsNo ) {
        this.epsNo = epsNo;
    }

    public String getEpsTel() {
        return epsTel;
    }

    public void setEpsTel( String epsTel ) {
        this.epsTel = epsTel;
    }

    public String getApprovalNo() {
        return approvalNo;
    }

    public void setApprovalNo( String approvalNo ) {
        this.approvalNo = approvalNo;
    }
}
