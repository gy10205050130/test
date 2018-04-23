package yxinfo.lis.inf.dto.platform;

import yxinfo.lis.inf.dto.BaseDTO;

/**
 * 国别dto
 *
 * Created by cy on 2016/10/30.
 */
public class CountryDTO extends BaseDTO {

    //国别id
    private Integer id;

    //国家代码
    private Integer code;

    //国家和地区
    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "id=" + id +
                ", code=" + code +
                ", country='" + country + '\'' +
                '}';
    }
}
