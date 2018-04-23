package yxinfo.shop.inf.dto.order.zcmu;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class OrderZcmuExpenseDTO extends BaseDTO {

    private static final long serialVersionUID = 5601644967339255547L;

    private Integer id;

    // 商户id
    private Integer merId;

    // 商户名称
    private String merName;

    // 报销时间范围左值
    private Date dateFrom;

    // 报销时间范围右值
    private Date dateTo;

    private Date createAt;

    //总金额
    private Long sumAmt;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName( String merName ) {
        this.merName = merName;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom( Date dateFrom ) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo( Date dateTo ) {
        this.dateTo = dateTo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Long getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt( Long sumAmt ) {
        this.sumAmt = sumAmt;
    }
}