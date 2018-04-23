package yxinfo.lis.inf.dto.party;

import yxinfo.lis.inf.dto.BaseDTO;

public class PartyCneeDTO extends BaseDTO {

    private static final long serialVersionUID = -1683789980784981031L;

    private Integer id;

    //使用方id
    private Integer partyId;

    //收货人
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
    private String address;

    //手机号
    private String mobile;

    //固定电话
    private String tel;

    //邮政编码
    private String zip;

    //邮箱
    private String email;

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