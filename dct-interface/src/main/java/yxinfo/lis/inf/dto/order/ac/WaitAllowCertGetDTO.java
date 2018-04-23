package yxinfo.lis.inf.dto.order.ac;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2016/8/27.
 */
public class WaitAllowCertGetDTO extends BaseDTO {

    private static final long serialVersionUID = -6263988017220475057L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    private Integer catId;

    private List<Integer> orderDetailIds;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId( Integer catId ) {
        this.catId = catId;
    }

    public List<Integer> getOrderDetailIds() {
        return orderDetailIds;
    }

    public void setOrderDetailIds( List<Integer> orderDetailIds ) {
        this.orderDetailIds = orderDetailIds;
    }
}
