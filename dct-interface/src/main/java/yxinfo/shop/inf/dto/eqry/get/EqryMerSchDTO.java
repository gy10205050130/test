package yxinfo.shop.inf.dto.eqry.get;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/9/29.
 */
public class EqryMerSchDTO extends BaseDTO {

    private static final long serialVersionUID = -1767578654390218440L;

    // 1进行中/2历史
    private Integer flag;

    // flag=2时, 1成功/2失败/3关闭
    private Short fstatus;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag( Integer flag ) {
        this.flag = flag;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus( Short fstatus ) {
        this.fstatus = fstatus;
    }
}
