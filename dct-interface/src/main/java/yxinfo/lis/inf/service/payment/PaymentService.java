package yxinfo.lis.inf.service.payment;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.payment.*;

import java.util.List;

/**
 * Created by cy on 2016/10/12.
 */
public interface PaymentService {

    /**
     * 生成预约记录后获取支付方式
     *
     * @param paymentTypeDTO
     * @return
     */
    PaymentTypeDTO getMemberPaymentType(PaymentTypeDTO paymentTypeDTO);

    /**
     * 使用代金券付款((orderIdList topicId memberId partyId 不可为空))
     *
     * @param paymentDTO
     * @return
     */
    List<Integer> payByMemberVoucher(PaymentDTO paymentDTO);

    /**
     * 使用预存款付款((orderIdList topicId memberId partyId 不可为空))
     *
     * @param paymentDTO
     * @return
     */
    List<Integer> payByPartyImprestMoney(PaymentDTO paymentDTO);

    /**
     * 使用支付宝支付（必传orderIdList）
     *
     * @param paymentDTO
     * @return
     */
    PaymentDTO payByAlipay(PaymentDTO paymentDTO);

    /**
     * 使用经费卡支付
     *
     * @param paymentDTO
     * @return
     */
    List<Integer> payByFundsCard(PaymentDTO paymentDTO);

    /**
     *  预约订单退款(必传orderId, memberId)
     *
     * @param
     * @return
     */
    Integer refundAppointOrder(PaymentDTO paymentDTO);

    /**
     * 获取订单消费一览
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<OrderConsumeDTO>> getOrderConsumeDetailList(PageDTO<OrderConsumeDTO> queryPage);

    /**
     * 支付宝支付notify_url处理
     *
     * @param queryStr
     * @return
     */
    String alipayCallbackHandler(String queryStr);

    /**
     * 获取退款dto
     *
     * @return
     * @param
     */
    RefundOrderDTO getRefundOrderInfo(RefundOrderDTO refundOrderDTO);

    /**
     * 支付宝退款notify_url
     *
     * @param queryStr
     * @return
     */
    String alipayRefundCallbackHandler(String queryStr);

    /**
     * 获取app支付的dto
     *
     * @param paymentAppDTO
     * @return
     */
    String getAppAlipayInfo(PaymentAppDTO paymentAppDTO);

    /**
     * 获取app支付的dto(app支付notify)
     *
     * @param queryStr
     * @return
     */
    String alipayAppCallbackHandler(String queryStr);

    /**
     * 条件下载消费记录
     *
     * @param orderConsumeDTO
     * @return
     */
    String downLoadOrderConsume(OrderConsumeDTO orderConsumeDTO);

}
