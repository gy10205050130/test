package yxinfo.shop.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.RegexpStr;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Select;
import yxinfo.shop.inf.validation.groups.Update;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class MemberCneeDTO extends BaseDTO {

    private static final long serialVersionUID = 523537530117957232L;

    private Integer id;

    // 用户id
    @NotNull( groups = { Add.class, Update.class, Select.class }, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 收货人
    @NotEmpty( groups = { Add.class }, message = ErrorCode.NOT_EMPTY )
    private String consignee;

    // 国家
    private Integer country;
    private String countryName;

    // 省
    @NotNull( groups = { Add.class }, message = ErrorCode.NOT_NULL )
    private Integer province;
    private String provinceName;

    // 市
    @NotNull( groups = { Add.class }, message = ErrorCode.NOT_NULL )
    private Integer city;
    private String cityName;

    // 区
    @NotNull( groups = { Add.class }, message = ErrorCode.NOT_NULL )
    private Integer district;
    private String districtName;

    // 街道
    private Integer street;
    private String streetName;

    // 地址
    @NotEmpty( groups = { Add.class }, message = ErrorCode.NOT_EMPTY )
    private String address;

    // 手机号
    @NotEmpty( groups = { Add.class }, message = ErrorCode.NOT_EMPTY )
    @Pattern( groups = { Add.class, Update.class }, regexp = RegexpStr.MOBILE,
            message = ErrorCode.Memeber.MOBILE_ERROR )
    private String mobile;

    // 固定电话
    private String tel;

    // 邮政编码
    private String zip;

    // 邮箱
    private String email;

    // 是否默认地址
    private Boolean isDefault;

    // 创建时间
    private Date createAt;

    // 是否可编辑
    private Boolean canEdit;

    // 类型
    private Short type;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee( String consignee ) {
        this.consignee = consignee;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry( Integer country ) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince( Integer province ) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity( Integer city ) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict( Integer district ) {
        this.district = district;
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

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault( Boolean isDefault ) {
        this.isDefault = isDefault;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getStreet() {
        return street;
    }

    public void setStreet( Integer street ) {
        this.street = street;
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

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName( String streetName ) {
        this.streetName = streetName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName( String countryName ) {
        this.countryName = countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName( String provinceName ) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName( String cityName ) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName( String districtName ) {
        this.districtName = districtName;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit( Boolean canEdit ) {
        this.canEdit = canEdit;
    }

    public Short getType() {
        return type;
    }

    public void setType( Short type ) {
        this.type = type;
    }
}
