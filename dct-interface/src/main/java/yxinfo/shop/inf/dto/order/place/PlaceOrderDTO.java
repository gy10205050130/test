package yxinfo.shop.inf.dto.order.place;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mbr.MemberCoreDTO;
import yxinfo.shop.inf.dto.order.*;
import yxinfo.shop.inf.dto.order.zcmu.OrderZcmuFundsPayDTO;
import yxinfo.shop.inf.dto.party.PartyCoreDTO;
import yxinfo.shop.inf.dto.tran.TranChannelDTO;
import yxinfo.shop.inf.validation.groups.order.CheckPlaceOrder;
import yxinfo.shop.inf.validation.groups.order.PlaceOrder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 下单请求参数DTO
 * Created by dy on 2016/8/11.
 */
public class PlaceOrderDTO extends BaseDTO {

    private static final long serialVersionUID = 2714334706542106963L;

    // 使用方id
    @NotNull( groups = { PlaceOrder.class, CheckPlaceOrder.class }, message = ErrorCode.NOT_EMPTY )
    private Integer partyId;

    // 下单人用户id
    @NotNull( groups = { PlaceOrder.class, CheckPlaceOrder.class }, message = ErrorCode.NOT_EMPTY )
    private Integer memberId;

    // 下单人收货信息id
    private Integer cneeId;

    // 下单人收货地址类型（1用户地址, 2使用方地址）
    private Short cneeType;

    // 支付渠道id
    @NotNull( groups = { PlaceOrder.class, CheckPlaceOrder.class }, message = ErrorCode.NOT_EMPTY )
    private Integer tranChannelId;

    // 配送方式
    @NotNull( groups = PlaceOrder.class, message = ErrorCode.NOT_EMPTY )
    @Valid
    private OrderDistDTO dist;

    // 发票信息
    private Integer invId;

    // 审核信息(用途等)
    private OrderApvDTO apv;

    // 下单的商品
    @NotEmpty( groups = { PlaceOrder.class, CheckPlaceOrder.class }, message = ErrorCode.NOT_EMPTY )
    @Valid
    private List<PlaceGoodsDTO> goods;

    // 买家留言
    private List<PlaceLeaveMsgDTO> leaveMsgs;

    // --------------------------- 以下为扩展DTO ---------------------------
    // 支付渠道
    private TranChannelDTO tranChannel;

    // 下单用户
    private MemberCoreDTO member;

    // 使用方
    private PartyCoreDTO party;

    // 订单支付信息
    private OrderTranDTO orderTran;

    // 第一个审核人
    private MemberCoreDTO firstApvMember;

    // 下单人收货信息
    private OrderCneeDTO cnee;

    // 下单人发票信息
    private OrderInvDTO inv;

    // --------------------------- 浙江中医药大学 ---------------------------
    // 经费负责人用户id
    private Integer fundsPersonMbrId;

    // 浙江中医药大学经费支付卡信息
    private List<OrderZcmuFundsPayDTO> zcmuFunds;

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

    public Integer getCneeId() {
        return cneeId;
    }

    public void setCneeId( Integer cneeId ) {
        this.cneeId = cneeId;
    }

    public Short getCneeType() {
        return cneeType;
    }

    public void setCneeType( Short cneeType ) {
        this.cneeType = cneeType;
    }

    public Integer getTranChannelId() {
        return tranChannelId;
    }

    public void setTranChannelId( Integer tranChannelId ) {
        this.tranChannelId = tranChannelId;
    }

    public OrderDistDTO getDist() {
        return dist;
    }

    public void setDist( OrderDistDTO dist ) {
        this.dist = dist;
    }

    public Integer getInvId() {
        return invId;
    }

    public void setInvId( Integer invId ) {
        this.invId = invId;
    }

    public OrderApvDTO getApv() {
        return apv;
    }

    public void setApv( OrderApvDTO apv ) {
        this.apv = apv;
    }

    public List<PlaceGoodsDTO> getGoods() {
        return goods;
    }

    public void setGoods( List<PlaceGoodsDTO> goods ) {
        this.goods = goods;
    }

    public List<PlaceLeaveMsgDTO> getLeaveMsgs() {
        return leaveMsgs;
    }

    public void setLeaveMsgs( List<PlaceLeaveMsgDTO> leaveMsgs ) {
        this.leaveMsgs = leaveMsgs;
    }

    public TranChannelDTO getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel( TranChannelDTO tranChannel ) {
        this.tranChannel = tranChannel;
    }

    public MemberCoreDTO getMember() {
        return member;
    }

    public void setMember( MemberCoreDTO member ) {
        this.member = member;
    }

    public PartyCoreDTO getParty() {
        return party;
    }

    public void setParty( PartyCoreDTO party ) {
        this.party = party;
    }

    public OrderTranDTO getOrderTran() {
        return orderTran;
    }

    public void setOrderTran( OrderTranDTO orderTran ) {
        this.orderTran = orderTran;
    }

    public MemberCoreDTO getFirstApvMember() {
        return firstApvMember;
    }

    public void setFirstApvMember( MemberCoreDTO firstApvMember ) {
        this.firstApvMember = firstApvMember;
    }

    public OrderCneeDTO getCnee() {
        return cnee;
    }

    public void setCnee( OrderCneeDTO cnee ) {
        this.cnee = cnee;
    }

    public OrderInvDTO getInv() {
        return inv;
    }

    public void setInv( OrderInvDTO inv ) {
        this.inv = inv;
    }

    public Integer getFundsPersonMbrId() {
        return fundsPersonMbrId;
    }

    public void setFundsPersonMbrId( Integer fundsPersonMbrId ) {
        this.fundsPersonMbrId = fundsPersonMbrId;
    }

    public List<OrderZcmuFundsPayDTO> getZcmuFunds() {
        return zcmuFunds;
    }

    public void setZcmuFunds( List<OrderZcmuFundsPayDTO> zcmuFunds ) {
        this.zcmuFunds = zcmuFunds;
    }
}
