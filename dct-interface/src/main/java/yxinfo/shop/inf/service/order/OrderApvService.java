package yxinfo.shop.inf.service.order;

import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;
import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.goods.GoodsSpecExDTO;
import yxinfo.shop.inf.dto.order.OrderApvExecDTO;
import yxinfo.shop.inf.dto.order.apv.ApvOrderDTO;
import yxinfo.shop.inf.dto.order.apv.ApvRdDTO;
import yxinfo.shop.inf.dto.order.apv.ApvRdSearchDTO;
import yxinfo.shop.inf.dto.order.place.PlaceOrderDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/16.
 */
public interface OrderApvService {

    /**
     * 获取商品审核方案
     * @param placeOrderDTO 下单数据, 需要经过{@link PlaceOrderServiceImpl.preparePlaceOrder}方法处理
     * @param goods 商品
     * @param num 购买商品数量
     * @return
     */
    OrderApvExecDTO getApvExec( PlaceOrderDTO placeOrderDTO, GoodsSpecExDTO goods, int num );

    /**
     * 提交订单审核
     * @code 100003
     * @param orderIds 待审核的订单id
     * @param memberId 提交人id
     * @return
     */
    List<ApproveRecodeDTO> submitOrderApv( List<Integer> orderIds, Integer memberId );

    /**
     * 审核订单
     * @code 100005
     * @param apvOrderDTO
     */
    void orderApv( ApvOrderDTO apvOrderDTO );

    /**
     * 获取待审核订单
     * @code 100008
     * @param apvRdSearchDTOPageDTO
     * @return
     */
    PageDTO<List<ApvRdDTO>> getWaitApvOrderPage( PageDTO<ApvRdSearchDTO> apvRdSearchDTOPageDTO );

    /**
     * 获取历史审核订单
     * @code 100009
     * @param apvRdSearchDTOPageDTO
     * @return
     */
    PageDTO<List<ApvRdDTO>> getHistoryApvOrderPage( PageDTO<ApvRdSearchDTO> apvRdSearchDTOPageDTO );
}
