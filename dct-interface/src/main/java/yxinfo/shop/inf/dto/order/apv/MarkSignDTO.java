package yxinfo.shop.inf.dto.order.apv;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2016/10/17.
 */
public class MarkSignDTO extends BaseDTO {

    private static final long serialVersionUID = 6741508539995679849L;

    private String key;

    private Object sign;

    public String getKey() {
        return key;
    }

    public void setKey( String key ) {
        this.key = key;
    }

    public Object getSign() {
        return sign;
    }

    public void setSign( Object sign ) {
        this.sign = sign;
    }
}
