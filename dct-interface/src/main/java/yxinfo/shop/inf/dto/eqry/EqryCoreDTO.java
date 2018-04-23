package yxinfo.shop.inf.dto.eqry;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mbr.MemberCoreDTO;
import yxinfo.shop.inf.dto.party.PartyCoreDTO;
import yxinfo.shop.inf.validation.groups.eqry.EqrySubmit;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class EqryCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -588634264520605379L;

    private Integer id;

    // 询价成员id
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 询价单来源使用方id
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 平台订单号
    private String orderNo;

    // 主状态（1审核中，2报价中，3选择报价中，4成功，91取消，92审核失败，93失败）
    private Short fstatus;

    // 询价商品名称
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_NULL )
    private String fname;

    // 询价商品型号（CAS）
    private String fnumber;

    // 询价商品分类id
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_NULL )
    private Integer catId;

    // 询价数量
    private Integer num;

    // 询价数量单位
    private String numUnit;

    // 纯度
    private String purity;

    // 创建时间
    private Date createAt;

    // 订单id
    private Integer orderId;

    // 选择的金额（分）
    private Integer choosePrice;

    // 选择的商户id
    private Integer chooseMerId;

    // 选择报价id
    private Integer chooseOfferId;

    // 选择报价审核状态（1未审核，2审核中，3成功，4失败）
    private Short chooseApvStatus;

    // 等待商户报价天数
    @NotNull( groups = EqrySubmit.class, message = ErrorCode.NOT_NULL )
    private Short offerDays;

    // 出价数
    private Short offerNum;

    // 报价结束时间
    private Date offerEndAt;

    //取消备注
    private String cancelNote;

    //取消时间
    private Date cancelAt;

    // =====================================================================
    // 审核信息
    private EqryApvDTO apv;

    // 支付信息
    private EqryTranDTO tran;

    // 下单用户
    private MemberCoreDTO member;

    // 使用方
    private PartyCoreDTO party;

    // 第一个审核人
    private MemberCoreDTO firstApvMember;

    // 需求描述
    private String eqryDesc;

    // 发票信息
    private EqryInvDTO inv;

    // 收货信息
    private EqryCneeDTO cnee;

    // 商户报价
    private List<EqryOfferDTO> offers;

    // 搜索时间范围
    private Date createAtFrom;
    private Date createAtTo;

    // 搜索词
    private String schText;

    // 平台用户
    private MemberDTO baseMember;

    private String catName;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
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

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus( Short fstatus ) {
        this.fstatus = fstatus;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber( String fnumber ) {
        this.fnumber = fnumber;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId( Integer catId ) {
        this.catId = catId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public String getNumUnit() {
        return numUnit;
    }

    public void setNumUnit( String numUnit ) {
        this.numUnit = numUnit;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity( String purity ) {
        this.purity = purity;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public Integer getChoosePrice() {
        return choosePrice;
    }

    public void setChoosePrice( Integer choosePrice ) {
        this.choosePrice = choosePrice;
    }

    public Integer getChooseMerId() {
        return chooseMerId;
    }

    public void setChooseMerId( Integer chooseMerId ) {
        this.chooseMerId = chooseMerId;
    }

    public Integer getChooseOfferId() {
        return chooseOfferId;
    }

    public void setChooseOfferId( Integer chooseOfferId ) {
        this.chooseOfferId = chooseOfferId;
    }

    public Short getChooseApvStatus() {
        return chooseApvStatus;
    }

    public void setChooseApvStatus( Short chooseApvStatus ) {
        this.chooseApvStatus = chooseApvStatus;
    }

    public Short getOfferDays() {
        return offerDays;
    }

    public void setOfferDays( Short offerDays ) {
        this.offerDays = offerDays;
    }

    public Short getOfferNum() {
        return offerNum;
    }

    public void setOfferNum( Short offerNum ) {
        this.offerNum = offerNum;
    }

    public Date getOfferEndAt() {
        return offerEndAt;
    }

    public void setOfferEndAt( Date offerEndAt ) {
        this.offerEndAt = offerEndAt;
    }

    public String getCancelNote() {
        return cancelNote;
    }

    public void setCancelNote( String cancelNote ) {
        this.cancelNote = cancelNote;
    }

    public Date getCancelAt() {
        return cancelAt;
    }

    public void setCancelAt( Date cancelAt ) {
        this.cancelAt = cancelAt;
    }

    public EqryApvDTO getApv() {
        return apv;
    }

    public void setApv( EqryApvDTO apv ) {
        this.apv = apv;
    }

    public EqryTranDTO getTran() {
        return tran;
    }

    public void setTran( EqryTranDTO tran ) {
        this.tran = tran;
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

    public MemberCoreDTO getFirstApvMember() {
        return firstApvMember;
    }

    public void setFirstApvMember( MemberCoreDTO firstApvMember ) {
        this.firstApvMember = firstApvMember;
    }

    public String getEqryDesc() {
        return eqryDesc;
    }

    public void setEqryDesc( String eqryDesc ) {
        this.eqryDesc = eqryDesc;
    }

    public EqryInvDTO getInv() {
        return inv;
    }

    public void setInv( EqryInvDTO inv ) {
        this.inv = inv;
    }

    public EqryCneeDTO getCnee() {
        return cnee;
    }

    public void setCnee( EqryCneeDTO cnee ) {
        this.cnee = cnee;
    }

    public List<EqryOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers( List<EqryOfferDTO> offers ) {
        this.offers = offers;
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

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public MemberDTO getBaseMember() {
        return baseMember;
    }

    public void setBaseMember( MemberDTO baseMember ) {
        this.baseMember = baseMember;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName( String catName ) {
        this.catName = catName;
    }
}