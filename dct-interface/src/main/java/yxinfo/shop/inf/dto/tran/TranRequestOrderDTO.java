package yxinfo.shop.inf.dto.tran;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/8/17.
 */
public class TranRequestOrderDTO extends BaseDTO {

    private static final long serialVersionUID = -3745095411966722483L;

    // 订单号
    private String orderNo;

    // 金额
    private Integer amt;

    public TranRequestOrderDTO() {}

    public TranRequestOrderDTO( String orderNo, Integer amt ) {
        this.orderNo = orderNo;
        this.amt = amt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt( Integer amt ) {
        this.amt = amt;
    }
}
