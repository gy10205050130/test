package yxinfo.ow.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.ow.inf.context.ErrorCode;
import yxinfo.ow.inf.dto.BaseDTO;
import yxinfo.ow.inf.validation.groups.Add;

import javax.validation.constraints.NotNull;

/**
 * @author sxd
 * @date 2016/8/3 13:45
 */
public class MemberInvDTO extends BaseDTO {

    private Integer id;

    //用户id
    @NotNull(groups = {Add.class}, message = ErrorCode.NOT_NULL)
    private Integer memberId;

    //发票类型（1增值税，2普通）
    @NotNull(groups = {Add.class}, message = ErrorCode.NOT_NULL)
    private Short ftype;

    //抬头
    @NotEmpty(groups = Add.class, message = ErrorCode.NOT_EMPTY)
    private String corpName;

    //纳税人识别号
    private String idNo;

    //注册地址
    private String regAddress;

    //电话
    private String tel;

    //开户行
    private String bank;

    //银行帐号
    private String accNo;

    //收票人姓名
    @NotEmpty(groups = Add.class, message = ErrorCode.NOT_EMPTY)
    private String person;

    //收票人手机
    @NotEmpty(groups = Add.class, message = ErrorCode.NOT_EMPTY)
    private String mobile;

    //收票人地址
    @NotEmpty(groups = Add.class, message = ErrorCode.NOT_EMPTY)
    private String address;

    //营业执照静态资源id
    private Integer bizLicense;

    //税务登记证静态资源id
    private Integer taxRegCert;

    //一般纳税人资格证书静态资源id
    private Integer taxQualCert;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
}
