package yxinfo.shop.inf.dto.order;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class OrderApvDTO extends BaseDTO {

    private static final long serialVersionUID = 7456036668754940580L;

    private Integer orderId;

    // 审核分类id
    private Integer apvCatId;

    // 审核项目编号
    private String apvItemNo;

    // 平台组织id
    private Integer orgId;

    private Date updateAt;

    // 经费负责人用户平台id
    private Integer fpBaseMbr;

    // 用途
    private String purpose;

    // 课题
    private String fsubject;

    // 额外信息
    private String extraMsg;

    // 经费负责人
    private MemberDTO fpBaseMember;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public Integer getApvCatId() {
        return apvCatId;
    }

    public void setApvCatId( Integer apvCatId ) {
        this.apvCatId = apvCatId;
    }

    public String getApvItemNo() {
        return apvItemNo;
    }

    public void setApvItemNo( String apvItemNo ) {
        this.apvItemNo = apvItemNo;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public Integer getFpBaseMbr() {
        return fpBaseMbr;
    }

    public void setFpBaseMbr( Integer fpBaseMbr ) {
        this.fpBaseMbr = fpBaseMbr;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose( String purpose ) {
        this.purpose = purpose;
    }

    public String getFsubject() {
        return fsubject;
    }

    public void setFsubject( String fsubject ) {
        this.fsubject = fsubject;
    }

    public String getExtraMsg() {
        return extraMsg;
    }

    public void setExtraMsg( String extraMsg ) {
        this.extraMsg = extraMsg;
    }

    public MemberDTO getFpBaseMember() {
        return fpBaseMember;
    }

    public void setFpBaseMember( MemberDTO fpBaseMember ) {
        this.fpBaseMember = fpBaseMember;
    }
}