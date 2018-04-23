package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/1.
 */
public class MerPosDTO extends BaseDTO{

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

    //地址
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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


}
