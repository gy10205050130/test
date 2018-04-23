package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;
import yxinfo.shop.inf.dto.order.expe.SchWaitExpensePageDTO;
import yxinfo.shop.inf.dto.order.zcmu.ZcmuExpenseDetailDTO;
import yxinfo.shop.inf.dto.order.zcmu.OrderZcmuExpenseDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/28.
 */
public interface FundsPayExpenseService {

    /**
     * 分页查询待报销经费支付订单
     * @code 100019
     * @param schOrderListPageDTOPageDTO
     * @return
     */
    PageDTO<List<OrderCoreDTO>> getWaitExpenseOrderPage( PageDTO<SchWaitExpensePageDTO> schOrderListPageDTOPageDTO );

    /**
     * 待报销经费支付订单总实付金额
     * @code 100028
     * @param schOrderListPageDTOPageDTO
     * @return
     */
    Long sumWaitExpenseOrderActualPay( PageDTO<SchWaitExpensePageDTO> schOrderListPageDTOPageDTO );

    /**
     * 报销经费支付订单
     * @code 100020
     * @param schData
     * @return
     */
    Integer expenseOrder( SchWaitExpensePageDTO schData );

    /**
     * 已报销列表
     * @code 100029
     * @param pageDTO
     * @param partyId
     * @return
     */
    PageDTO<List<OrderZcmuExpenseDTO>> hasExpensePage( PageDTO<OrderZcmuExpenseDTO> pageDTO, Integer partyId );

    /**
     * 报销单详情
     * @code 100030
     * @param expenseId
     * @param partyId
     * @return
     */
    ZcmuExpenseDetailDTO expenseDetail( Integer expenseId, Integer partyId );

    /**
     * 报销单对应订单
     * @code 100031
     * @param schPage
     * @return
     */
    PageDTO<List<OrderCoreDTO>> expenseOrderPage( PageDTO<SchWaitExpensePageDTO> schPage );

    /**
     * 撤销报销单
     * @code 100032
     * @param expenseId
     * @param partyId
     */
    void revokeExpense( Integer expenseId, Integer partyId );
}
