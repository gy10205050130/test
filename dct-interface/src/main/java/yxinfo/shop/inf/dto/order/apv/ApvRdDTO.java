package yxinfo.shop.inf.dto.order.apv;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;

import java.util.Date;

/**
 * 订单审核列表DTO
 * Created by dy on 2016/8/25.
 */
public class ApvRdDTO extends BaseDTO {

    private static final long serialVersionUID = 6077239444817241898L;

    // 审核分类
    private String apvCat;

    // 审核itemNo
    private String itemNo;

    // 提交审核时间
    private Date submitApvTime;

    // 审核记录id
    private Integer approveRecodeId;

    // 状态（u未提交, o审核中, s审核通过, f审核不通过）
    private String status;

    // 当前审核所处步骤/节点所处步骤
    private Integer onStep;

    // 节点状态（s审核通过, f审核不通过）
    private String nodeStatus;

    // 审核意见
    private String opinion;

    // 申请人
    private MemberDTO member;

    // 询价单信息
    private EqryCoreDTO eqry;

    // 订单信息
    private OrderCoreDTO order;

    public String getApvCat() {
        return apvCat;
    }

    public void setApvCat( String apvCat ) {
        this.apvCat = apvCat;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }

    public Date getSubmitApvTime() {
        return submitApvTime;
    }

    public void setSubmitApvTime( Date submitApvTime ) {
        this.submitApvTime = submitApvTime;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public Integer getOnStep() {
        return onStep;
    }

    public void setOnStep( Integer onStep ) {
        this.onStep = onStep;
    }

    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus( String nodeStatus ) {
        this.nodeStatus = nodeStatus;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion( String opinion ) {
        this.opinion = opinion;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public EqryCoreDTO getEqry() {
        return eqry;
    }

    public void setEqry( EqryCoreDTO eqry ) {
        this.eqry = eqry;
    }

    public OrderCoreDTO getOrder() {
        return order;
    }

    public void setOrder( OrderCoreDTO order ) {
        this.order = order;
    }
}
