package yxinfo.shop.inf.dto.order.ac;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

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

    private String schText;

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

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}
