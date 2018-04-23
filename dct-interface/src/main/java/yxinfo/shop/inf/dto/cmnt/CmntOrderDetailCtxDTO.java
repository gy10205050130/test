package yxinfo.shop.inf.dto.cmnt;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.order.OrderCoreDTO;
import yxinfo.shop.inf.dto.order.OrderDetailDTO;

import java.util.Date;
import java.util.List;

public class CmntOrderDetailCtxDTO extends BaseDTO {

    private static final long serialVersionUID = -523543072618034023L;

    // 订单明细id
    private Integer orderDetailId;

    // 评价内容
    private String cmntCtx;

    private Date createAt;

    // 用户id
    private Integer memberId;

    private String memberName;

    // 是否匿名评论
    private Boolean isAnon;

    // 使用方id
    private Integer partyId;

    // 商户id
    private Integer merId;

    // 商品id
    private Integer goodsId;

    // 平台订单号
    private String orderNo;

    // 是否审核中
    private Boolean isOnApv;

    // 是否差评
    private Boolean isBad;

    // 分数
    private String scores;

    // 是否被删除
    private Boolean isDel;

    //===============================================================
    private OrderDetailDTO orderDetail;

    private List<CmntScoreDTO> scoresObj;

    private String merName;

    private String schText;

    private OrderCoreDTO order;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
    }

    public String getCmntCtx() {
        return cmntCtx;
    }

    public void setCmntCtx( String cmntCtx ) {
        this.cmntCtx = cmntCtx;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName( String memberName ) {
        this.memberName = memberName;
    }

    public Boolean getIsAnon() {
        return isAnon;
    }

    public void setIsAnon( Boolean anon ) {
        isAnon = anon;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId( Integer goodsId ) {
        this.goodsId = goodsId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }

    public Boolean getIsOnApv() {
        return isOnApv;
    }

    public void setIsOnApv( Boolean onApv ) {
        isOnApv = onApv;
    }

    public Boolean getIsBad() {
        return isBad;
    }

    public void setIsBad( Boolean bad ) {
        isBad = bad;
    }

    public String getScores() {
        return scores;
    }

    public void setScores( String scores ) {
        this.scores = scores;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel( Boolean del ) {
        isDel = del;
    }

    public OrderDetailDTO getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail( OrderDetailDTO orderDetail ) {
        this.orderDetail = orderDetail;
    }

    public List<CmntScoreDTO> getScoresObj() {
        return scoresObj;
    }

    public void setScoresObj( List<CmntScoreDTO> scoresObj ) {
        this.scoresObj = scoresObj;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName( String merName ) {
        this.merName = merName;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public OrderCoreDTO getOrder() {
        return order;
    }

    public void setOrder( OrderCoreDTO order ) {
        this.order = order;
    }
}