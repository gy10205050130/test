package yxinfo.lis.inf.dto.order.apv;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.lis.inf.dto.BaseDTO;

import java.util.Date;

/**
 * 订单审核列表DTO
 * Created by dy on 2016/8/25.
 */
public class ApvRdDTO extends BaseDTO {

    private static final long serialVersionUID = 6077239444817241898L;

    // 订单信息
    //private OrderCoreDTO order;

    // 申请人
    private MemberDTO member;

    // 审核分类
    private String apvCat;

    // 提交审核时间
    private Date submitApvTime;

    // 状态（s审核通过, f审核不通过）
    private String status;

    // 审核记录id
    private Integer approveRecodeId;

    // 当前审核所处步骤
    private Integer onStep;

    /*public OrderCoreDTO getOrder() {
        return order;
    }

    public void setOrder( OrderCoreDTO order ) {
        this.order = order;
    }*/

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public String getApvCat() {
        return apvCat;
    }

    public void setApvCat( String apvCat ) {
        this.apvCat = apvCat;
    }

    public Date getSubmitApvTime() {
        return submitApvTime;
    }

    public void setSubmitApvTime( Date submitApvTime ) {
        this.submitApvTime = submitApvTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public Integer getOnStep() {
        return onStep;
    }

    public void setOnStep( Integer onStep ) {
        this.onStep = onStep;
    }
}
