package yxinfo.lis.inf.dto.order.apv;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import javax.validation.constraints.NotNull;

/**
 * 订单审核记录搜索DTO
 * Created by dy on 2016/8/22.
 */
public class ApvRdSearchDTO extends BaseDTO {

    private static final long serialVersionUID = 5373058778420799466L;

    // 提交人组织id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 用户id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 状态（s审核通过, f审核不通过）
    private String status;

    // 审核分类id
    private Integer apvCatId;

    // 订单号
    private String orderNo;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public Integer getApvCatId() {
        return apvCatId;
    }

    public void setApvCatId( Integer apvCatId ) {
        this.apvCatId = apvCatId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }
}
