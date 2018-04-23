package yxinfo.shop.inf.dto.order.zcmu;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.order.apv.Step1;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import java.math.BigDecimal;
import java.util.Date;

public class OrderZcmuFundsPayDTO extends BaseDTO {

    private static final long serialVersionUID = 5147035339300637376L;

    private Integer id;

    private Integer orderId;

    private Integer merId;

    private Date createAt;

    // 经费负责人用户id
    private Integer memberId;

    // 经费负责人姓名
    private String mbrRealName;

    // 经费负责人工号
    private String mbrCode;

    // 经费卡号
    @NotEmpty( groups = { Default.class, Step1.class }, message = ErrorCode.NOT_EMPTY )
    @Length( min = 5, groups = { Default.class, Step1.class }, message = ErrorCode.LENGTH )
    private String cardNo;

    // 项目名称（经费卡名称）
    @NotEmpty( groups = { Default.class, Step1.class }, message = ErrorCode.NOT_EMPTY )
    private String projectName;

    // 金额（分）
    private Integer amt;

    // 金额（元）
    @NotNull( groups = { Default.class, Step1.class }, message = ErrorCode.NOT_NULL )
    private BigDecimal amtYuan;

    // 使用方id
    private Integer partyId;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getMbrRealName() {
        return mbrRealName;
    }

    public void setMbrRealName( String mbrRealName ) {
        this.mbrRealName = mbrRealName;
    }

    public String getMbrCode() {
        return mbrCode;
    }

    public void setMbrCode( String mbrCode ) {
        this.mbrCode = mbrCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo( String cardNo ) {
        this.cardNo = cardNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName( String projectName ) {
        this.projectName = projectName;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt( Integer amt ) {
        this.amt = amt;
    }

    public BigDecimal getAmtYuan() {
        return amtYuan;
    }

    public void setAmtYuan( BigDecimal amtYuan ) {
        this.amtYuan = amtYuan;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }
}