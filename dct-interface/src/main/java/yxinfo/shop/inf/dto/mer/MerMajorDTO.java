package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/1.
 */
public class MerMajorDTO extends BaseDTO{

    private Integer merId;

    //主营范围
    private String majorBiz;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public String getMajorBiz() {
        return majorBiz;
    }

    public void setMajorBiz(String majorBiz) {
        this.majorBiz = majorBiz;
    }

    @Override
    public String toString() {
        return "MerMajorDTO{" +
                "merId=" + merId +
                ", majorBiz='" + majorBiz + '\'' +
                '}';
    }
}
