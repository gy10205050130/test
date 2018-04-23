package yxinfo.lis.inf.dto.payment;

import yxinfo.lis.inf.dto.BaseDTO;

import java.util.List;

/**
 * app支付请求返回的dto
 *
 * Created by cy on 2016/11/7.
 */
public class PaymentAppDTO extends BaseDTO {

    private List<Integer> orderIdList;

    private Integer memberId;

    //应用id
    private String appId;

    //接口名称
    private String method;

    private String format;

    private String charset;

    private String signType;

    private String sign;

    private String timestamp;

    private String version;

    private String notifyUrl;

    private String bizContent;

    private String body;

    private String subject;

    private String outTradeNo;

    //订单总金额
    private String totalAmount;

    //销售产品码，商家和支付宝签约的产品码，为固定值QUICK_MSECURITY_PAY
    private String productCode;

    private String passbackParams;

    private String timeoutExpress;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getBizContent() {
        return bizContent;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPassbackParams() {
        return passbackParams;
    }

    public void setPassbackParams(String passbackParams) {
        this.passbackParams = passbackParams;
    }

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    @Override
    public String toString() {
        return "PaymentAppDTO{" +
                "orderIdList=" + orderIdList +
                ", memberId=" + memberId +
                ", appId='" + appId + '\'' +
                ", method='" + method + '\'' +
                ", format='" + format + '\'' +
                ", charset='" + charset + '\'' +
                ", signType='" + signType + '\'' +
                ", sign='" + sign + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", version='" + version + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", bizContent='" + bizContent + '\'' +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", productCode='" + productCode + '\'' +
                ", passbackParams='" + passbackParams + '\'' +
                '}';
    }
}
