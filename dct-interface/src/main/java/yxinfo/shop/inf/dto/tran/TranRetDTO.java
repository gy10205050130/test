package yxinfo.shop.inf.dto.tran;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;

import java.util.Date;
import java.util.List;

/**
 * 订单支付返回数据DTO
 * Created by dy on 2016/8/16.
 */
public class TranRetDTO extends BaseDTO {

    private static final long serialVersionUID = -1791242936158343821L;

    // 支付的订单
    private TranRequestDTO tranRequest;

    // 交易订单号
    private String tranOrderNo;

    // 交易总金额（分）
    private Integer totalAmt;

    // 交易状态（1未交易，2交易处理中，3交易成功，4交易失败）
    private Short fstatus;

    // 第三方流水号
    private String thirdSerial;

    // 返回码
    private String retCode;

    // 返回描述
    private String retDesc;

    public TranRequestDTO getTranRequest() {
        return tranRequest;
    }

    public void setTranRequest( TranRequestDTO tranRequest ) {
        this.tranRequest = tranRequest;
    }

    public String getTranOrderNo() {
        return tranOrderNo;
    }

    public void setTranOrderNo( String tranOrderNo ) {
        this.tranOrderNo = tranOrderNo;
    }

    public Integer getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt( Integer totalAmt ) {
        this.totalAmt = totalAmt;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus( Short fstatus ) {
        this.fstatus = fstatus;
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
}
