package yxinfo.shop.inf.dto.party;

import yxinfo.shop.inf.dto.BaseDTO;

public class PartyInvDTO extends BaseDTO {

    private static final long serialVersionUID = 8441224731968220254L;

    private Integer id;

    // 使用方id
    private Integer partyId;

    // 发票类型（1增值税，2普通）
    private Short ftype;

    // 单位名称
    private String corpName;

    // 纳税人识别号
    private String idNo;

    // 注册地址
    private String regAddress;

    // 电话
    private String tel;

    // 开户行
    private String bank;

    // 银行帐号
    private String accNo;

    // 营业执照静态资源id
    private Integer bizLicense;

    // 税务登记证静态资源id
    private Integer taxRegCert;

    // 一般纳税人资格证书静态资源id
    private Integer taxQualCert;

    // 收票人姓名
    private String person;

    // 收票人手机
    private String mobile;

    // 收票人地址
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype( Short ftype ) {
        this.ftype = ftype;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName( String corpName ) {
        this.corpName = corpName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo( String idNo ) {
        this.idNo = idNo;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress( String regAddress ) {
        this.regAddress = regAddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel( String tel ) {
        this.tel = tel;
    }

    public String getBank() {
        return bank;
    }

    public void setBank( String bank ) {
        this.bank = bank;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo( String accNo ) {
        this.accNo = accNo;
    }

    public Integer getBizLicense() {
        return bizLicense;
    }

    public void setBizLicense( Integer bizLicense ) {
        this.bizLicense = bizLicense;
    }

    public Integer getTaxRegCert() {
        return taxRegCert;
    }

    public void setTaxRegCert( Integer taxRegCert ) {
        this.taxRegCert = taxRegCert;
    }

    public Integer getTaxQualCert() {
        return taxQualCert;
    }

    public void setTaxQualCert( Integer taxQualCert ) {
        this.taxQualCert = taxQualCert;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson( String person ) {
        this.person = person;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }
}