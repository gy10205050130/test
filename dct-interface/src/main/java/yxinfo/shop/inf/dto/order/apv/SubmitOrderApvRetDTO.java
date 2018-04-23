package yxinfo.shop.inf.dto.order.apv;

import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;
import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * Created by dy on 2016/9/5.
 */
public class SubmitOrderApvRetDTO extends BaseDTO {

    private static final long serialVersionUID = 4079743109099473127L;

    private List<ApproveRecodeDTO> retARs;

    private List<Integer> orderIds;

    public List<ApproveRecodeDTO> getRetARs() {
        return retARs;
    }

    public void setRetARs( List<ApproveRecodeDTO> retARs ) {
        this.retARs = retARs;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds( List<Integer> orderIds ) {
        this.orderIds = orderIds;
    }
}
