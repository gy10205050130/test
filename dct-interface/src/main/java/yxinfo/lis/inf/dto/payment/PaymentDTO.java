package yxinfo.lis.inf.dto.payment;


import yxinfo.lis.inf.dto.BaseDTO;

import java.util.List;

/**
 * 支付dto
 *
 * Created by cy on 2016/10/18.
 */
public class PaymentDTO extends BaseDTO {

    private Integer orderId;

    private List<Integer> orderIdList;

    //经费卡所有人id
    private Integer voucherOwnerId;

    //课题id
    private Integer topicId;

    //预约人id
    private Integer memberId;

    private Integer partyId;

    // 签约合作者身份ID
    private String partner;

    // 签约卖家支付宝账号
    private String sellerId;

    // 商户网站唯一订单号
    private String orderNo;

    // 名称
    private String subject;

    // 详情
    private String body;

    // 金额
    private String totalPrice;

    // 服务器异步通知页面路径
    private String notifyUrl;

    // 请求地址
    private String actionUrl;

    // 服务接口名称， 固定值
    private String service;

    // 支付类型， 固定值
    private String paymentType = "1";

    // 参数编码， 固定值
    private String inputCharset;

    // 支付宝处理完请求后，当前页面跳转到商户指定页面的路径，可空
    private String returnUrl;

    //商品展示的url
    private String showUrl;

    //签名
    private String sign;

    //签名类型
    private String signType;

    //支付宝其他信息
    private String extraCommonParam;

    //退款原因
    private String cancelReason;

    public PaymentDTO() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<Integer> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<Integer> orderIdList) {
        this.orderIdList = orderIdList;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getVoucherOwnerId() {
        return voucherOwnerId;
    }

    public void setVoucherOwnerId(Integer voucherOwnerId) {
        this.voucherOwnerId = voucherOwnerId;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getShowUrl() {
        return showUrl;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getExtraCommonParam() {
        return extraCommonParam;
    }

    public void setExtraCommonParam(String extraCommonParam) {
        this.extraCommonParam = extraCommonParam;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "orderId=" + orderId +
                ", voucherOwnerId=" + voucherOwnerId +
                ", memberId=" + memberId +
                ", partner='" + partner + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", totalPrice=" + totalPrice +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", service='" + service + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", inputCharset='" + inputCharset + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                ", showUrl='" + showUrl + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }


}
