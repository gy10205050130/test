package yxinfo.shop.inf.dto.eqry;

import yxinfo.shop.inf.dto.BaseDTO;

public class EqryApvDTO extends BaseDTO {

    private static final long serialVersionUID = -442921380646814794L;

    private Integer eqryId;

    // 审核分类id
    private Integer apvCatId;

    // 审核项目编号
    private String apvItemNo;

    // 平台组织id
    private Integer orgId;

    // 经费负责人用户平台id
    private Integer fpBaseMbr;

    // 用途
    private String purpose;

    // 课题
    private String fsubject;

    // 额外信息
    private String extraMsg;

    public Integer getEqryId() {
        return eqryId;
    }

    public void setEqryId( Integer eqryId ) {
        this.eqryId = eqryId;
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
}