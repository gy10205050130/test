package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.OrderApvExecDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/25.
 */
public interface OrderApvExecService {

    /**
     * 获取使用方审核方案
     * @param partyId
     * @return
     */
    List<OrderApvExecDTO> getApvExecByPartyId( Integer partyId );
}
