package yxinfo.shop.inf.dto.order.apv;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * 审核订单提交参数DTO
 * Created by dy on 2016/8/20.
 */
public class ApvOrderRevokeDTO extends BaseDTO {

    private static final long serialVersionUID = 3318508668016893649L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer approveRecodeId;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer baseMemberId;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer step;

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public Integer getBaseMemberId() {
        return baseMemberId;
    }

    public void setBaseMemberId( Integer baseMemberId ) {
        this.baseMemberId = baseMemberId;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep( Integer step ) {
        this.step = step;
    }
}
