package yxinfo.shop.inf.dto.order.get;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;
import yxinfo.shop.inf.validation.groups.order.get.SelectPageMbr;
import yxinfo.shop.inf.validation.groups.order.get.SelectPageMer;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/23.
 */
public class SchOrderListPageDTO extends BaseDTO {

    private static final long serialVersionUID = -6243029383922340818L;

    // 用户id
    @NotNull( groups = SelectPageMbr.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    private String schText;

    // 下单时间From
    private Date createAtFrom;

    // 下单时间To
    private Date createAtTo;

    // 订单查询条件
    private List<OrderCoreDTO> orderStatusIn;

    // 商户id
    @NotNull( groups = SelectPageMer.class, message = ErrorCode.NOT_NULL )
    private Integer merId;

    private boolean waitCmnt;

    // 是否入库
    private Boolean isIntowh;

    // 使用方id
    private Integer partyId;

    // 组织id
    private Integer orgId;

    // ============================ 扩展信息 ============================
    // 商品信息
    private String goodsName;

    // 客户姓名
    private String memberName;

    // 订单号
    private String orderNo;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public Date getCreateAtFrom() {
        return createAtFrom;
    }

    public void setCreateAtFrom( Date createAtFrom ) {
        this.createAtFrom = createAtFrom;
    }

    public Date getCreateAtTo() {
        return createAtTo;
    }

    public void setCreateAtTo( Date createAtTo ) {
        this.createAtTo = createAtTo;
    }

    public List<OrderCoreDTO> getOrderStatusIn() {
        return orderStatusIn;
    }

    public void setOrderStatusIn( List<OrderCoreDTO> orderStatusIn ) {
        this.orderStatusIn = orderStatusIn;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public boolean getWaitCmnt() {
        return waitCmnt;
    }

    public void setWaitCmnt( boolean waitCmnt ) {
        this.waitCmnt = waitCmnt;
    }

    public Boolean getIsIntowh() {
        return isIntowh;
    }

    public void setIsIntowh( Boolean intowh ) {
        isIntowh = intowh;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName( String goodsName ) {
        this.goodsName = goodsName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName( String memberName ) {
        this.memberName = memberName;

    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }
}
