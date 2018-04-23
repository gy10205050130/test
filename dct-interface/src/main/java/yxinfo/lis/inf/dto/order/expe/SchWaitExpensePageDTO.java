package yxinfo.lis.inf.dto.order.expe;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by dy on 2016/8/28.
 */
public class SchWaitExpensePageDTO extends BaseDTO {

    private static final long serialVersionUID = 2014519804806813797L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 下单时间From
    private Date createAtFrom;

    // 下单时间To
    private Date createAtTo;

    // 搜索词
    private String schText;

    //==========================================================================
    // 订单号
    private String orderNo;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Date getCreateAtFrom() {
        return createAtFrom;
    }

    public void setCreateAtFrom( Date createAtFrom ) {
        this.createAtFrom = createAtFrom;
    }

    public Date getCreateAtTo() {
        return createAtTo;
    }

    public void setCreateAtTo( Date createAtTo ) {
        this.createAtTo = createAtTo;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }
}
