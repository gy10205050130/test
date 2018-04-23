package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.stats.OrderStatsGetDTO;
import yxinfo.shop.inf.dto.order.stats.OrderStatsRetDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/30.
 */
public interface OrderStatsService {

    Integer addStats( Date date, Short type, Integer relId, Short item, Long count );

    Integer plusCount( Date date, Short type, Integer relId, Short item, Long count );

    List<OrderStatsRetDTO> getStats( OrderStatsGetDTO schData );
}
