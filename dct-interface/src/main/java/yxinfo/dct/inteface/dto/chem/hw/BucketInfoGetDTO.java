package yxinfo.dct.inteface.dto.chem.hw;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2016/11/4.
 */
public class BucketInfoGetDTO extends BaseDTO {

    private static final long serialVersionUID = -3882669537621675857L;

    private String rfcode;

    // qr二维码 / rf 标签码
    private String flag;

    public String getRfcode () {
        return rfcode;
    }

    public void setRfcode ( String rfcode ) {
        this.rfcode = rfcode;
    }

    public String getFlag () {
        return flag;
    }

    public void setFlag ( String flag ) {
        this.flag = flag;
    }
}
