package yxinfo.shop.inf.dto.order.expe;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.order.expe.ExpenseOrder;
import yxinfo.shop.inf.validation.groups.order.expe.ExpenseOrderPage;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import java.util.Date;

/**
 * Created by dy on 2016/8/28.
 */
public class SchWaitExpensePageDTO extends BaseDTO {

    private static final long serialVersionUID = 2014519804806813797L;

    @NotNull( groups = { Default.class, ExpenseOrder.class, ExpenseOrderPage.class },
            message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 下单时间From
    @NotNull( groups = { ExpenseOrder.class }, message = ErrorCode.NOT_NULL )
    private Date createAtFrom;

    // 下单时间To
    @NotNull( groups = { ExpenseOrder.class }, message = ErrorCode.NOT_NULL )
    private Date createAtTo;

    // 搜索词
    private String schText;

    // 商户id
    @NotNull( groups = { ExpenseOrder.class }, message = ErrorCode.NOT_NULL )
    private Integer merId;

    @NotNull( groups = { ExpenseOrderPage.class }, message = ErrorCode.NOT_NULL )
    private Integer expenseId;

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

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId( Integer expenseId ) {
        this.expenseId = expenseId;
    }
}
