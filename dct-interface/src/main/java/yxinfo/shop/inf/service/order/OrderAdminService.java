package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;
import yxinfo.shop.inf.dto.order.get.OrderCoreDetailsDTO;
import yxinfo.shop.inf.dto.order.get.SchOrderListAdminDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/16.
 */
public interface OrderAdminService {

    /**
     * 管理员订单列表
     * @code 100038/100040
     * @param schPage
     * @return
     */
    PageDTO<List<OrderCoreDTO>> getOrderListPageByMemberId( PageDTO<SchOrderListAdminDTO> schPage );

    /**
     * 管理员订单详情
     * @code 100039/100041
     * @param partyId
     * @param orderId
     * @param approveRecodeId
     * @return
     */
    OrderCoreDetailsDTO getOrderCoreDetails( Integer partyId, Integer orderId, Integer approveRecodeId );
}
