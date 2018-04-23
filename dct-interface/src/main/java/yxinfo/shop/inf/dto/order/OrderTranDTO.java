package yxinfo.shop.inf.dto.order;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class OrderTranDTO extends BaseDTO {

    private static final long serialVersionUID = 8942755163716218348L;

    private Integer orderId;

    // 支付卡号
    private String cardNo;

    // 支付人姓名
    private String fname;

    // 交易摘要
    private String summary;

    // 支付人
    private Integer memberId;

    // 交易订单号
    private String tranOrderNo;

    // 支付时间
    private Date tranTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo( String cardNo ) {
        this.cardNo = cardNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary( String summary ) {
        this.summary = summary;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getTranOrderNo() {
        return tranOrderNo;
    }

    public void setTranOrderNo( String tranOrderNo ) {
        this.tranOrderNo = tranOrderNo;
    }

    public Date getTranTime() {
        return tranTime;
    }

    public void setTranTime( Date tranTime ) {
        this.tranTime = tranTime;
    }
}