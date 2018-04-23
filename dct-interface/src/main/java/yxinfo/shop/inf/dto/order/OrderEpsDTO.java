package yxinfo.shop.inf.dto.order;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class OrderEpsDTO extends BaseDTO {

    private static final long serialVersionUID = -1518040255893827701L;

    private Integer id;

    //订单id
    private Integer orderId;

    //订单售后信息id
    private Integer orderAsRecordId;

    //物流公司
    private String companyName;

    //物流电话
    private String epsTel;

    //运单号
    private String epsNo;

    //资质静态资源id
    private Integer qualStaticId;

    //批准文号
    private String approvalNo;

    private Date createAt;

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

    public Integer getOrderAsRecordId() {
        return orderAsRecordId;
    }

    public void setOrderAsRecordId( Integer orderAsRecordId ) {
        this.orderAsRecordId = orderAsRecordId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName( String companyName ) {
        this.companyName = companyName;
    }

    public String getEpsTel() {
        return epsTel;
    }

    public void setEpsTel( String epsTel ) {
        this.epsTel = epsTel;
    }

    public String getEpsNo() {
        return epsNo;
    }

    public void setEpsNo( String epsNo ) {
        this.epsNo = epsNo;
    }

    public Integer getQualStaticId() {
        return qualStaticId;
    }

    public void setQualStaticId( Integer qualStaticId ) {
        this.qualStaticId = qualStaticId;
    }

    public String getApprovalNo() {
        return approvalNo;
    }

    public void setApprovalNo( String approvalNo ) {
        this.approvalNo = approvalNo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }
}