package yxinfo.shop.inf.dto.order.get;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/23.
 */
public class SchOrderListAdminDTO extends BaseDTO {

    private static final long serialVersionUID = 6604099711584628429L;

    // 使用方id
    private Integer partyId;

    // 下单时间From
    private Date createAtFrom;

    // 下单时间To
    private Date createAtTo;

    // 订单查询条件
    private List<OrderCoreDTO> orderStatusIn;

    // 是否评论
    private boolean waitCmnt;

    // 搜索词
    private String schText;

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

    public List<OrderCoreDTO> getOrderStatusIn() {
        return orderStatusIn;
    }

    public void setOrderStatusIn( List<OrderCoreDTO> orderStatusIn ) {
        this.orderStatusIn = orderStatusIn;
    }

    public boolean getWaitCmnt() {
        return waitCmnt;
    }

    public void setWaitCmnt( boolean waitCmnt ) {
        this.waitCmnt = waitCmnt;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}
