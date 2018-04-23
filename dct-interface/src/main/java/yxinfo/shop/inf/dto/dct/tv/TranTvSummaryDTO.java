package yxinfo.shop.inf.dto.dct.tv;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * 元欣追溯TV版交易总览DTO
 * Created by dy on 2016/12/20.
 */
public class TranTvSummaryDTO extends BaseDTO {

    private static final long serialVersionUID = -4832693957658651113L;

    // 待审批采购订单数
    private Integer onApvOrderNum;

    // 待入库订单数
    private Integer waitIntoWhNum;

    public Integer getOnApvOrderNum() {
        return onApvOrderNum;
    }

    public void setOnApvOrderNum( Integer onApvOrderNum ) {
        this.onApvOrderNum = onApvOrderNum;
    }

    public Integer getWaitIntoWhNum() {
        return waitIntoWhNum;
    }

    public void setWaitIntoWhNum( Integer waitIntoWhNum ) {
        this.waitIntoWhNum = waitIntoWhNum;
    }
}
