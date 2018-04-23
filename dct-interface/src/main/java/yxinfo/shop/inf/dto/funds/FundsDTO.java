package yxinfo.shop.inf.dto.funds;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/10/11.
 */
public class FundsDTO extends BaseDTO {

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FundsDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
