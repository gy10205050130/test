package yxinfo.lis.inf.dto.payment;

import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.order.InstOrderDTO;
import yxinfo.lis.inf.dto.topic.LisTopicDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by cy on 2016/10/12.
 */
public class PaymentTypeDTO extends BaseDTO {

    /**
     * 预约人id
     */
    private Integer memberId;

    /**
     * 订单id
     */
    private Integer orderId;
    private InstOrderDTO instOrderDTO;

    /**
     * 订单生成时间
     */
    private Date orderCreatAt;
    /**
     * 费用合计（单位为分）
     */
    private Long costCount;

    private Long totalPrice;

    private Long testPrice;

    /**
     * 代金券（单位分）
     */
    private List<LisTopicDTO> memberCashCoupon;

    /**
     * 代金券标记（1有一个选项 2多个选项 3没有）
     */
    private Integer couponPayType;

    /**
     * 人员所在课题list（经费卡付款课题集合）
     */
    private List<LisTopicDTO> topicDTOList;

    /**
     * 经费卡标记（1有一个选项 2多个选项 3没有）
     */
    private Integer fundsPayType;

    private List<Integer> orderIdList;

    /**
     * 单位是否有预存款（是否可以使用预存款付款 1有一个选项 2多个选项 3没有）
     */
    private Integer imprestMoneyType;

    /**
     * 预付款付款课题集合
     */
    private List<LisTopicDTO> imprestTopicList;

    private List<InstOrderDTO> orderDtoList;

    /**
     * 是否需要显示选择支付方式的标记（1：需要显示，且订单总金额不为0 2：需要显示，订单总金额为0 3：不需要显示）
     */
    private Integer payFlag;

    public PaymentTypeDTO() {
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderCreatAt() {
        return orderCreatAt;
    }

    public void setOrderCreatAt(Date orderCreatAt) {
        this.orderCreatAt = orderCreatAt;
    }

    public Long getCostCount() {
        return costCount;
    }

    public void setCostCount(Long costCount) {
        this.costCount = costCount;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(Long testPrice) {
        this.testPrice = testPrice;
    }

    public List<LisTopicDTO> getMemberCashCoupon() {
        return memberCashCoupon;
    }

    public void setMemberCashCoupon(List<LisTopicDTO> memberCashCoupon) {
        this.memberCashCoupon = memberCashCoupon;
    }

    public List<LisTopicDTO> getTopicDTOList() {
        return topicDTOList;
    }

    public void setTopicDTOList(List<LisTopicDTO> topicDTOList) {
        this.topicDTOList = topicDTOList;
    }

    public InstOrderDTO getInstOrderDTO() {
        return instOrderDTO;
    }

    public void setInstOrderDTO(InstOrderDTO instOrderDTO) {
        this.instOrderDTO = instOrderDTO;
    }

    public List<Integer> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<Integer> orderIdList) {
        this.orderIdList = orderIdList;
    }

    public List<InstOrderDTO> getOrderDtoList() {
        return orderDtoList;
    }

    public void setOrderDtoList(List<InstOrderDTO> orderDtoList) {
        this.orderDtoList = orderDtoList;
    }

    public Integer getCouponPayType() {
        return couponPayType;
    }

    public void setCouponPayType(Integer couponPayType) {
        this.couponPayType = couponPayType;
    }

    public Integer getFundsPayType() {
        return fundsPayType;
    }

    public void setFundsPayType(Integer fundsPayType) {
        this.fundsPayType = fundsPayType;
    }

    public Integer getImprestMoneyType() {
        return imprestMoneyType;
    }

    public void setImprestMoneyType(Integer imprestMoneyType) {
        this.imprestMoneyType = imprestMoneyType;
    }

    public List<LisTopicDTO> getImprestTopicList() {
        return imprestTopicList;
    }

    public void setImprestTopicList(List<LisTopicDTO> imprestTopicList) {
        this.imprestTopicList = imprestTopicList;
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }
}
