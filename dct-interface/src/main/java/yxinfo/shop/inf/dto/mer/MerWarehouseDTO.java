package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/8/1.
 */
public class MerWarehouseDTO extends BaseDTO{
    private Integer id;

    //商户id
    private Integer merId;

    //国家，<FK>area_core.id
    private Integer country;

    private String countryName;

    //省，<FK>area_core.id
    private Integer province;

    private String provinceName;

    //市，<FK>area_core.id
    private Integer city;

    private String cityName;

    //区/县，<FK>area_core.id
    private Integer district;

    private String districtName;

    //仓库名称
    private String fname;

    //地址
    private String address;

    //创建时间
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Override
    public String toString() {
        return "MerWarehouseDTO{" +
                "id=" + id +
                ", merId=" + merId +
                ", country=" + country +
                ", countryName='" + countryName + '\'' +
                ", province=" + province +
                ", provinceName='" + provinceName + '\'' +
                ", city=" + city +
                ", cityName='" + cityName + '\'' +
                ", district=" + district +
                ", districtName='" + districtName + '\'' +
                ", fname='" + fname + '\'' +
                ", address='" + address + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
