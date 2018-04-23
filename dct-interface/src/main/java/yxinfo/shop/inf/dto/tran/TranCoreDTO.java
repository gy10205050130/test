package yxinfo.shop.inf.dto.tran;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class TranCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -3430887860788090607L;

    private Integer id;

    //平台订单号
    private String orderNo;

    //交易订单号
    private String tranOrderNo;

    //交易渠道id
    private Integer tranChannel;

    //二级支付渠道
    private Integer secondTranChl;

    //交易金额（分）
    private Integer amt;

    //交易状态（1未交易，2交易处理中，3交易成功，4交易失败）
    private Short fstatus;

    //创建时间
    private Date createAt;

    //第三方流水号
    private String thirdSerial;

    //返回码
    private String retCode;

    //返回描述
    private String retDesc;

    //交易完成时间
    private Date tranAt;

    //操作人id，线上支付为付款用户id，线下支付为确认收款人用户id
    private Integer operator;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }

    public String getTranOrderNo() {
        return tranOrderNo;
    }

    public void setTranOrderNo( String tranOrderNo ) {
        this.tranOrderNo = tranOrderNo;
    }

    public Integer getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel( Integer tranChannel ) {
        this.tranChannel = tranChannel;
    }

    public Integer getSecondTranChl() {
        return secondTranChl;
    }

    public void setSecondTranChl( Integer secondTranChl ) {
        this.secondTranChl = secondTranChl;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt( Integer amt ) {
        this.amt = amt;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus( Short fstatus ) {
        this.fstatus = fstatus;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getThirdSerial() {
        return thirdSerial;
    }

    public void setThirdSerial( String thirdSerial ) {
        this.thirdSerial = thirdSerial;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode( String retCode ) {
        this.retCode = retCode;
    }

    public String getRetDesc() {
        return retDesc;
    }

    public void setRetDesc( String retDesc ) {
        this.retDesc = retDesc;
    }

    public Date getTranAt() {
        return tranAt;
    }

    public void setTranAt( Date tranAt ) {
        this.tranAt = tranAt;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator( Integer operator ) {
        this.operator = operator;
    }
}