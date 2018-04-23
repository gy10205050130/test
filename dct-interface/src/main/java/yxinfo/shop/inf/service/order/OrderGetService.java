package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.order.*;
import yxinfo.shop.inf.dto.order.get.OrderCoreDetailsDTO;
import yxinfo.shop.inf.dto.order.get.SchOrderListPageDTO;
import yxinfo.shop.inf.dto.order.get.SumPriceDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/1.
 */
public interface OrderGetService {

    /**
     * 按用户id及其他条件分页查询订单
     * @code 100006
     * @param schOrderListPageDTOPageDTO
     * @return
     */
    PageDTO<List<OrderCoreDTO>> getOrderListPageByMemberId( PageDTO<SchOrderListPageDTO> schOrderListPageDTOPageDTO );

    /**
     * 按商户id及其他条件分页查询订单
     * @code 100011
     * @param schOrderListPageDTOPageDTO
     * @return
     */
    PageDTO<List<OrderCoreDTO>> getOrderListPageByMerId( PageDTO<SchOrderListPageDTO> schOrderListPageDTOPageDTO );

    /**
     * 按商户id及其他条件统计总金额
     * @code 100027
     * @param schPageDTO
     * @return
     */
    SumPriceDTO sumPriceByMerId( PageDTO<SchOrderListPageDTO> schPageDTO );

    /**
     * 库存管理
     * @code 100025
     * @code 100026
     * @param schPage
     * <p>
     *     partyId  必传
     *     memberId 传递则查询用户相关订单
     *     isIntowh true已入库/false未入库
     * </p>
     * @return
     */
    PageDTO<List<OrderCoreDTO>> getOrderListPageByWH( PageDTO<SchOrderListPageDTO> schPage );

    /**
     * 库存管理
     * @code 108125
     * @param schPage
     * <p>
     *     orgId
     *     partyId  与orgId必传一个
     *     memberId 传递则查询用户相关订单
     *     isIntowh true已入库/false未入库
     * </p>
     * @return
     */
    PageDTO<List<OrderDetailDTO>> getOrderDetailListPageByWH( PageDTO<SchOrderListPageDTO> schPage );

    /**
     * 获取订单详情
     * @code 100007/100012/100021
     * @param memberId 100007必传
     * @param merId 100012必传
     * @param partyId 100021必传
     * @param orderId
     * @param approveRecodeId
     * @return
     */
    OrderCoreDetailsDTO getOrderCoreDetails(
            Integer memberId, Integer merId, Integer partyId, Integer orderId, Integer approveRecodeId );

    /**
     * 查询订单数量
     * @param merId
     * @param memberId
     * @param dateFrom
     * @param dateTo
     * @param fstatus
     * @return
     */
    int getOrderCountByMbrIdAndMerId( Integer merId, Integer memberId, Date dateFrom, Date dateTo, Short fstatus );

    /**
     * 根据id获取订单简要信息
     * <p>包括订单基础信息和订单明细<p/>
     * @code 107002
     * @param orderId
     * @return
     */
    OrderCoreDTO getOrderCoreDTOSimple( Integer orderId );

    /**
     * 根据id获取订单全部信息
     * @param orderId
     * @return
     */
    OrderCoreDTO getOrderCoreDTODetail( Integer orderId );

    /**
     * 根据id只获取订单基础信息
     * @param orderId
     * @return
     */
    OrderCoreDTO getOrderCoreDTOOnly( Integer orderId );

    /**
     * 根据id只获取订单明细基础信息
     * @param orderDetailId
     * @return
     */
    OrderDetailDTO getOrderDetailDTOOnly( Integer orderDetailId );
}
