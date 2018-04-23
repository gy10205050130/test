package yxinfo.shop.inf.dto.order;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.SelectPage;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class OrderAllowCertDTO extends BaseDTO {

    private static final long serialVersionUID = -1671711333650057669L;

    //准购批次
    private String batchNo;

    //使用方id
    @NotNull( groups = SelectPage.class, message = ErrorCode.NOT_NULL )
    private Integer partyId;

    //准购证静态资源id
    private Integer allowCert;

    //所属分类
    private String cat;

    //商品名称
    private String fname;

    //商品规格
    private String spec;

    private Date createAt;

    // ===============================================================
    //时间范围
    private Date createAtFrom;

    private Date createAtTo;

    private String schText;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo( String batchNo ) {
        this.batchNo = batchNo;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getAllowCert() {
        return allowCert;
    }

    public void setAllowCert( Integer allowCert ) {
        this.allowCert = allowCert;
    }

    public String getCat() {
        return cat;
    }

    public void setCat( String cat ) {
        this.cat = cat;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec( String spec ) {
        this.spec = spec;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getCreateAtFrom() {
        return createAtFrom;
    }

    public void setCreateAtFrom( Date createAtFrom ) {
        this.createAtFrom = createAtFrom;
    }

    public Date getCreateAtTo() {
        return createAtTo;
    }

    public void setCreateAtTo( Date createAtTo ) {
        this.createAtTo = createAtTo;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}