package yxinfo.shop.inf.dto.cmnt;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2016/9/21.
 */
public class CmntOrderDTO extends BaseDTO {

    private static final long serialVersionUID = 4848273003410947753L;

    // 用户id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 是否匿名评论
    @NotNull( message = ErrorCode.NOT_NULL )
    private Boolean isAnon;

    // 订单ID
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer orderId;

    @Valid
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private List<CmntDTO> cmnts;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Boolean getIsAnon() {
        return isAnon;
    }

    public void setIsAnon( Boolean anon ) {
        isAnon = anon;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public List<CmntDTO> getCmnts() {
        return cmnts;
    }

    public void setCmnts( List<CmntDTO> cmnts ) {
        this.cmnts = cmnts;
    }
}
