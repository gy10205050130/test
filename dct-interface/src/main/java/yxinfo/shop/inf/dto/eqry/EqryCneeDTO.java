package yxinfo.shop.inf.dto.eqry;

import org.hibernate.validator.constraints.Length;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.eqry.EqrySubmit;

import javax.validation.constraints.NotNull;

public class EqryCneeDTO extends BaseDTO {

    private static final long serialVersionUID = 9078810144659754647L;

    private Integer eqryId;

    //收货人
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = EqrySubmit.class, max = 30, message = ErrorCode.LENGTH )
    private String consignee;

    //国家
    private String country;

    //省
    private String province;

    //市
    private String city;

    //区
    private String district;

    //街道
    private String street;

    //地址
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = EqrySubmit.class, max = 255, message = ErrorCode.LENGTH )
    private String address;

    //手机号
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_EMPTY )
    @Length( groups = EqrySubmit.class, max = 20, message = ErrorCode.LENGTH )
    private String mobile;

    //固定电话
    private String tel;

    //邮政编码
    private String zip;

    //邮箱
    private String email;

    public Integer getEqryId() {
        return eqryId;
    }

    public void setEqryId( Integer eqryId ) {
        this.eqryId = eqryId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee( String consignee ) {
        this.consignee = consignee;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( String country ) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince( String province ) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict( String district ) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet( String street ) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel( String tel ) {
        this.tel = tel;
    }

    public String getZip() {
        return zip;
    }

    public void setZip( String zip ) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
}