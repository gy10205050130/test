package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/3.
 */
public class MerSettingDTO extends BaseDTO{

    private Integer id;

    private Integer merId;

    private Short fkey;

    //设置内容
    private String val;

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

    public Short getFkey() {
        return fkey;
    }

    public void setFkey(Short fkey) {
        this.fkey = fkey;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "MerSettingDTO{" +
                "id=" + id +
                ", merId=" + merId +
                ", fkey=" + fkey +
                ", val='" + val + '\'' +
                '}';
    }
}
