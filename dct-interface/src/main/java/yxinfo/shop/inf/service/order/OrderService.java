package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.*;
import yxinfo.shop.inf.dto.order.place.PlaceOrderDTO;
import yxinfo.shop.inf.dto.order.zcmu.OrderZcmuFundsPayDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/1.
 */
public interface OrderService {

    /**
     * 保存订单
     * @param orders
     * @param orderPlaces
     * @param placeOrderDTO 下单数据, 仅扣库存用
     * @return 订单id
     */
    List<Integer> addOrder( List<OrderCoreDTO> orders, List<OrderPlaceDTO> orderPlaces, PlaceOrderDTO placeOrderDTO );

    /**
     * 保存订单
     * @param order
     * @return
     */
    Integer addOrder( OrderCoreDTO order );

    /**
     * 更新订单基础信息
     * <p>更新epsStatus/payStatus/asStatus/fstatus/cancelAt/receiptAt/payAt<p/>
     * @param orderId
     * @param orderCoreDTO
     */
    void updateOrderCore( Integer orderId, OrderCoreDTO orderCoreDTO );

    /**
     * [弃用]更新出入库相关信息
     * @param intowhStatus 出入库状态 0未入库/1已入库/2已出库
     * @param intoAt 入库时间
     * @param orderId
     */
    void updateWH( Short intowhStatus, Date intoAt, Integer orderId );

    /**
     * 更新订单基础信息审核状态
     * @param apvOrderIds
     * @param apvStatus
     */
    void updateOrderApvStatus( List<Integer> apvOrderIds, Short apvStatus );

    /**
     * 更新订单基础信息审核状态
     * @param apvOrderId
     * @param apvStatus
     */
    void updateOrderApvStatus( Integer apvOrderId, Short apvStatus );

    /**
     * 更新订单审核信息
     * <p>更新purpose/fsubject/xtraMsg<p/>
     * @param orderId
     * @param orderApvDTO
     * @return
     */
    int updateOrderApv( Integer orderId, OrderApvDTO orderApvDTO );

    /**
     * 更新订单交易信息
     * <p>更新cardNo/fname/memberId/tranOrderNo<p/>
     * @param orderId
     * @param orderTranDTO
     * @return
     */
    int updateOrderTran( Integer orderId, OrderTranDTO orderTranDTO );

    /**
     * 根据订单id获取订单明细
     * @param orderId
     * @return
     */
    List<OrderDetailDTO> getOrderDetailByOrderId( Integer orderId );

    /**
     * 获取订单审核信息
     * @param orderId
     * @return
     */
    OrderApvDTO getOrderApv( Integer orderId );

    /**
     * 获取订单收货信息
     * @param orderId
     * @return
     */
    OrderCneeDTO getOrderCnee( Integer orderId );

    /**
     * 获取订单配送信息
     * @param orderId
     * @return
     */
    OrderDistDTO getOrderDist( Integer orderId );

    /**
     * 获取订单发票信息
     * @param orderId
     * @return
     */
    OrderInvDTO getOrderInv( Integer orderId );

    /**
     * 获取订单交易信息
     * @param orderId
     * @return
     */
    OrderTranDTO getOrderTran( Integer orderId );

    /**
     * 经费支付信息（浙江中医药大学）
     * @param orderId
     * @return
     */
    List<OrderZcmuFundsPayDTO> getZcmuFundsPayByOrderId( Integer orderId );

    /**
     * 获取订单交易物流信息
     * @param orderId
     * @return
     */
    OrderEpsDTO getOrderEps( Integer orderId );
}
