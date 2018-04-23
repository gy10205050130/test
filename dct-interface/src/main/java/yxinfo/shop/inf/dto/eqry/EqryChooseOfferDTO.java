package yxinfo.shop.inf.dto.eqry;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.eqry.zcmu.EqryZcmuFundsPayDTO;
import yxinfo.shop.inf.dto.party.PartyCoreDTO;
import yxinfo.shop.inf.validation.groups.Add;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class EqryChooseOfferDTO extends BaseDTO {

    private static final long serialVersionUID = -6273134559507499208L;

    private Integer id;

    private Integer eqryId;

    private Integer merId;

    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer offerId;

    private Integer memberId;

    private Date createAt;

    // 备注
    private String note;

    // 审核状态（1未审核，2审核中，3成功，4失败）
    private Short apvStatus;

    // 审核意见
    private String apvOpinion;

    // 审核时间
    private Date apvAt;

    // =======================================================================
    // 下单人收货信息id
    private Integer cneeId;

    // 下单人收货地址类型（1用户地址, 2使用方地址）
    private Short cneeType;

    // 配送方式
    @NotNull( groups = Add.class, message = ErrorCode.NOT_EMPTY )
    @Valid
    private EqryDistDTO dist;

    // 发票信息
    private Integer invId;

    // 下单人收货信息
    private EqryCneeDTO cnee;

    // 下单人发票信息
    private EqryInvDTO inv;

    // 使用方信息
    private PartyCoreDTO party;

    // 浙江中医药大学经费支付卡信息
    private List<EqryZcmuFundsPayDTO> zcmuFunds;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getEqryId() {
        return eqryId;
    }

    public void setEqryId( Integer eqryId ) {
        this.eqryId = eqryId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId( Integer offerId ) {
        this.offerId = offerId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getNote() {
        return note;
    }

    public void setNote( String note ) {
        this.note = note;
    }

    public Short getApvStatus() {
        return apvStatus;
    }

    public void setApvStatus( Short apvStatus ) {
        this.apvStatus = apvStatus;
    }

    public String getApvOpinion() {
        return apvOpinion;
    }

    public void setApvOpinion( String apvOpinion ) {
        this.apvOpinion = apvOpinion;
    }

    public Date getApvAt() {
        return apvAt;
    }

    public void setApvAt( Date apvAt ) {
        this.apvAt = apvAt;
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

    public EqryDistDTO getDist() {
        return dist;
    }

    public void setDist( EqryDistDTO dist ) {
        this.dist = dist;
    }

    public Integer getInvId() {
        return invId;
    }

    public void setInvId( Integer invId ) {
        this.invId = invId;
    }

    public EqryCneeDTO getCnee() {
        return cnee;
    }

    public void setCnee( EqryCneeDTO cnee ) {
        this.cnee = cnee;
    }

    public EqryInvDTO getInv() {
        return inv;
    }

    public void setInv( EqryInvDTO inv ) {
        this.inv = inv;
    }

    public PartyCoreDTO getParty() {
        return party;
    }

    public void setParty( PartyCoreDTO party ) {
        this.party = party;
    }

    public List<EqryZcmuFundsPayDTO> getZcmuFunds() {
        return zcmuFunds;
    }

    public void setZcmuFunds( List<EqryZcmuFundsPayDTO> zcmuFunds ) {
        this.zcmuFunds = zcmuFunds;
    }
}