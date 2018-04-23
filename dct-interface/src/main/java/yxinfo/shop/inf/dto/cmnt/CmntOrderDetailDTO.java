package yxinfo.shop.inf.dto.cmnt;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class CmntOrderDetailDTO extends BaseDTO {

    private static final long serialVersionUID = 5679552185983673493L;

    // 订单明细id
    private Integer orderDetailId;

    // 评论项目
    private Short cmntItem;

    // 分数
    private Short score;

    private Date createAt;

    // 使用方id
    private Integer partyId;

    // 商户id
    private Integer merId;

    // 商品id
    private Integer goodsId;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
    }

    public Short getCmntItem() {
        return cmntItem;
    }

    public void setCmntItem( Short cmntItem ) {
        this.cmntItem = cmntItem;
    }

    public Short getScore() {
        return score;
    }

    public void setScore( Short score ) {
        this.score = score;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
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
}