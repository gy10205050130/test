package yxinfo.shop.inf.dto.order.zcmu;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.expe.OrderZcmuEDetailDTO;
import yxinfo.shop.inf.dto.order.zcmu.OrderZcmuExpenseDTO;

import java.util.List;

/**
 * Created by dy on 2016/10/13.
 */
public class ZcmuExpenseDetailDTO extends BaseDTO {

    private static final long serialVersionUID = -159527607334466786L;

    private List<OrderZcmuEDetailDTO> details;

    private OrderZcmuExpenseDTO expense;

    public List<OrderZcmuEDetailDTO> getDetails() {
        return details;
    }

    public void setDetails( List<OrderZcmuEDetailDTO> details ) {
        this.details = details;
    }

    public OrderZcmuExpenseDTO getExpense() {
        return expense;
    }

    public void setExpense( OrderZcmuExpenseDTO expense ) {
        this.expense = expense;
    }
}
