package yxinfo.shop.inf.dto.order;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.order.zcmu.OrderZcmuFundsPayDTO;
import yxinfo.shop.inf.dto.party.PartyCoreDTO;

import java.util.Date;
import java.util.List;

public class OrderCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -1279276783723325289L;

    private Integer id;

    // 商户id
    private Integer merId;

    // 商户名称
    private String merName;

    // 购买成员id
    private Integer memberId;

    // 订单来源使用方id
    private Integer partyId;

    // 平台订单号
    private String orderNo;

    // 支付类型（1线下支付，2线上支付）
    private Short payType;

    // 交易渠道id
    private Integer tranChannel;

    // 主状态（1售前，2售后，3完成，4关闭，5取消）
    private Short fstatus;

    // 支付状态（1待支付，2支付中，3付款成功，4退款中，5退款成功）
    private Short payStatus;

    // 审核状态（1待审核，2审核中，3审核成功，4审核失败）
    private Short apvStatus;

    // 售后状态（1待售后，2退货中，3换货中，4售后驳回，5售后成功）
    private Short asStatus;

    // 物流状态（1待发货，2已发货）
    private Short epsStatus;

    // 订单总金额（分），含运费
    private Integer price;

    // 运费（分）
    private Integer epsPrice;

    // 实付金额（分）
    private Integer actualPay;

    // 创建时间
    private Date createAt;

    // 是否评论
    private Boolean isCmnt;

    // 下单类型
    private Short placeType;

    // 0未入库，1已入库，2已出库
    private Short intowhStatus;

    // 入库时间
    private Date intowhAt;

    // 是否报销
    private Boolean isExpense;

    // 取消时间
    private Date cancelAt;

    // 确认收货时间
    private Date receiptAt;

    // 支付时间
    private Date payAt;

    // 购买用户姓名
    private String memberName;

    // 购买用户登录名
    private String memberLgName;

    // 购买用户手机
    private String memberMobile;

    // --------------------------- 以下为扩展 ---------------------------
    // 订单审核信息
    private OrderApvDTO apv;

    // 订单支付卡信息
    private OrderTranDTO tran;

    // 订单收货信息
    private OrderCneeDTO cnee;

    // 订单明细
    private List<OrderDetailDTO> orderDetails;

    // 订单配送信息
    private OrderDistDTO dist;

    // 订单发票信息
    private OrderInvDTO inv;

    // 商户下单号
    private String merPlaceNo;

    // 客户姓名
    private String memberRealName;

    // 使用方
    private PartyCoreDTO party;

    // 准购证总张数
    private Integer allowCertTotal;

    // 已上传准购证张数
    private Integer allowCertHas;

    // 是否需要准购证
    private Boolean needAllowCert;

    // 平台用户
    private MemberDTO baseMember;

    // 物流信息
    private OrderEpsDTO eps;

    // 浙江中医药大学经费支付卡信息
    private List<OrderZcmuFundsPayDTO> zcmuFunds;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName( String merName ) {
        this.merName = merName;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType( Short payType ) {
        this.payType = payType;
    }

    public Integer getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel( Integer tranChannel ) {
        this.tranChannel = tranChannel;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus( Short fstatus ) {
        this.fstatus = fstatus;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus( Short payStatus ) {
        this.payStatus = payStatus;
    }

    public Short getApvStatus() {
        return apvStatus;
    }

    public void setApvStatus( Short apvStatus ) {
        this.apvStatus = apvStatus;
    }

    public Short getAsStatus() {
        return asStatus;
    }

    public void setAsStatus( Short asStatus ) {
        this.asStatus = asStatus;
    }

    public Short getEpsStatus() {
        return epsStatus;
    }

    public void setEpsStatus( Short epsStatus ) {
        this.epsStatus = epsStatus;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price ) {
        this.price = price;
    }

    public Integer getEpsPrice() {
        return epsPrice;
    }

    public void setEpsPrice( Integer epsPrice ) {
        this.epsPrice = epsPrice;
    }

    public Integer getActualPay() {
        return actualPay;
    }

    public void setActualPay( Integer actualPay ) {
        this.actualPay = actualPay;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Boolean getIsCmnt() {
        return isCmnt;
    }

    public void setIsCmnt( Boolean cmnt ) {
        isCmnt = cmnt;
    }

    public Short getPlaceType() {
        return placeType;
    }

    public void setPlaceType( Short placeType ) {
        this.placeType = placeType;
    }

    public Short getIntowhStatus() {
        return intowhStatus;
    }

    public void setIntowhStatus( Short intowhStatus ) {
        this.intowhStatus = intowhStatus;
    }

    public Date getIntowhAt() {
        return intowhAt;
    }

    public void setIntowhAt( Date intowhAt ) {
        this.intowhAt = intowhAt;
    }

    public Boolean getIsExpense() {
        return isExpense;
    }

    public void setIsExpense( Boolean expense ) {
        isExpense = expense;
    }

    public Date getCancelAt() {
        return cancelAt;
    }

    public void setCancelAt( Date cancelAt ) {
        this.cancelAt = cancelAt;
    }

    public Date getReceiptAt() {
        return receiptAt;
    }

    public void setReceiptAt( Date receiptAt ) {
        this.receiptAt = receiptAt;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt( Date payAt ) {
        this.payAt = payAt;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName( String memberName ) {
        this.memberName = memberName;
    }

    public String getMemberLgName() {
        return memberLgName;
    }

    public void setMemberLgName( String memberLgName ) {
        this.memberLgName = memberLgName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile( String memberMobile ) {
        this.memberMobile = memberMobile;
    }

    public OrderApvDTO getApv() {
        return apv;
    }

    public void setApv( OrderApvDTO apv ) {
        this.apv = apv;
    }

    public OrderTranDTO getTran() {
        return tran;
    }

    public void setTran( OrderTranDTO tran ) {
        this.tran = tran;
    }

    public OrderCneeDTO getCnee() {
        return cnee;
    }

    public void setCnee( OrderCneeDTO cnee ) {
        this.cnee = cnee;
    }

    public List<OrderDetailDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails( List<OrderDetailDTO> orderDetails ) {
        this.orderDetails = orderDetails;
    }

    public OrderDistDTO getDist() {
        return dist;
    }

    public void setDist( OrderDistDTO dist ) {
        this.dist = dist;
    }

    public OrderInvDTO getInv() {
        return inv;
    }

    public void setInv( OrderInvDTO inv ) {
        this.inv = inv;
    }

    public String getMerPlaceNo() {
        return merPlaceNo;
    }

    public void setMerPlaceNo( String merPlaceNo ) {
        this.merPlaceNo = merPlaceNo;
    }

    public String getMemberRealName() {
        return memberRealName;
    }

    public void setMemberRealName( String memberRealName ) {
        this.memberRealName = memberRealName;
    }

    public PartyCoreDTO getParty() {
        return party;
    }

    public void setParty( PartyCoreDTO party ) {
        this.party = party;
    }

    public Integer getAllowCertTotal() {
        return allowCertTotal;
    }

    public void setAllowCertTotal( Integer allowCertTotal ) {
        this.allowCertTotal = allowCertTotal;
    }

    public Integer getAllowCertHas() {
        return allowCertHas;
    }

    public void setAllowCertHas( Integer allowCertHas ) {
        this.allowCertHas = allowCertHas;
    }

    public Boolean getNeedAllowCert() {
        return needAllowCert;
    }

    public void setNeedAllowCert( Boolean needAllowCert ) {
        this.needAllowCert = needAllowCert;
    }

    public MemberDTO getBaseMember() {
        return baseMember;
    }

    public void setBaseMember( MemberDTO baseMember ) {
        this.baseMember = baseMember;
    }

    public OrderEpsDTO getEps() {
        return eps;
    }

    public void setEps( OrderEpsDTO eps ) {
        this.eps = eps;
    }

    public List<OrderZcmuFundsPayDTO> getZcmuFunds() {
        return zcmuFunds;
    }

    public void setZcmuFunds( List<OrderZcmuFundsPayDTO> zcmuFunds ) {
        this.zcmuFunds = zcmuFunds;
    }
}