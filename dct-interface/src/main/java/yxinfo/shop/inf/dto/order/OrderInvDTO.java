package yxinfo.shop.inf.dto.order;

import org.hibernate.validator.constraints.Length;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.order.inv.OrdInv;
import yxinfo.shop.inf.validation.groups.order.inv.ValAddedInv;

import javax.validation.constraints.NotNull;

public class OrderInvDTO extends BaseDTO {

    private static final long serialVersionUID = -3986978396871014509L;

    private Integer orderId;

    // 发票类型（1增值税，2普通）
    private Short ftype;

    // 单位名称
    @NotNull( groups = OrdInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = OrdInv.class, max = 100, message = ErrorCode.LENGTH )
    private String corpName;

    // 纳税人识别号
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = ValAddedInv.class, max = 100, message = ErrorCode.LENGTH )
    private String idNo;

    // 注册地址
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = ValAddedInv.class, max = 255, message = ErrorCode.LENGTH )
    private String regAddress;

    // 电话
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = ValAddedInv.class, max = 20, message = ErrorCode.LENGTH )
    private String tel;

    // 开户行
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = ValAddedInv.class, max = 30, message = ErrorCode.LENGTH )
    private String bank;

    // 银行帐号
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = ValAddedInv.class, max = 30, message = ErrorCode.LENGTH )
    private String accNo;

    // 收票人姓名
    @NotNull( groups = OrdInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = OrdInv.class, max = 30, message = ErrorCode.LENGTH )
    private String person;

    // 收票人手机
    @NotNull( groups = OrdInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = OrdInv.class, max = 11, message = ErrorCode.LENGTH )
    private String mobile;

    // 收票人地址
    @NotNull( groups = OrdInv.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = OrdInv.class, max = 255, message = ErrorCode.LENGTH )
    private String address;

    // 营业执照静态资源id
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    private Integer bizLicense;

    // 税务登记证静态资源id
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    private Integer taxRegCert;

    // 一般纳税人资格证书静态资源id
    @NotNull( groups = ValAddedInv.class, message = ErrorCode.NOT_EMPTY )
    private Integer taxQualCert;

    // 用户发票信息, 传递则不保存用户发票信息
    private Integer memberInvId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype(Short ftype) {
        this.ftype = ftype;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBizLicense() {
        return bizLicense;
    }

    public void setBizLicense(Integer bizLicense) {
        this.bizLicense = bizLicense;
    }

    public Integer getTaxRegCert() {
        return taxRegCert;
    }

    public void setTaxRegCert(Integer taxRegCert) {
        this.taxRegCert = taxRegCert;
    }

    public Integer getTaxQualCert() {
        return taxQualCert;
    }

    public void setTaxQualCert(Integer taxQualCert) {
        this.taxQualCert = taxQualCert;
    }

    public Integer getMemberInvId() {
        return memberInvId;
    }

    public void setMemberInvId( Integer memberInvId ) {
        this.memberInvId = memberInvId;
    }
}