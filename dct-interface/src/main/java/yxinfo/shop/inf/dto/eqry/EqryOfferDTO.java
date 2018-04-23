package yxinfo.shop.inf.dto.eqry;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.context.eqry.MerOffer;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mer.MerCoreDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class EqryOfferDTO extends BaseDTO {

    private static final long serialVersionUID = -8720827686684792243L;

    private Integer id;

    @NotNull( groups = MerOffer.class, message = ErrorCode.NOT_NULL )
    private Integer eqryId;

    @NotNull( groups = MerOffer.class, message = ErrorCode.NOT_NULL )
    private Integer merId;

    private String merName;

    private Date createAt;

    // 报价（分）
    @NotNull( groups = MerOffer.class, message = ErrorCode.NOT_NULL )
    private Integer price;

    // 纯度
    private String purity;

    // 规格
    private String spec;

    // 备货期（天）
    private Short prepareTerm;

    // 备注
    private String note;

    // 出价人id
    @NotNull( groups = MerOffer.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 状态（1等待询价人选择，2报价成功，3报价失败）
    private Short fstatus;

    // ==========================================================
    private List<EqryChooseOfferDTO> chooseOffers;

    // 审核意见
    private String apvOpinion;

    // 商户信息
    private MerCoreDTO mer;

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

    public String getMerName() {
        return merName;
    }

    public void setMerName( String merName ) {
        this.merName = merName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price ) {
        this.price = price;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity( String purity ) {
        this.purity = purity;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec( String spec ) {
        this.spec = spec;
    }

    public Short getPrepareTerm() {
        return prepareTerm;
    }

    public void setPrepareTerm( Short prepareTerm ) {
        this.prepareTerm = prepareTerm;
    }

    public String getNote() {
        return note;
    }

    public void setNote( String note ) {
        this.note = note;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus( Short fstatus ) {
        this.fstatus = fstatus;
    }

    public List<EqryChooseOfferDTO> getChooseOffers() {
        return chooseOffers;
    }

    public void setChooseOffers( List<EqryChooseOfferDTO> chooseOffers ) {
        this.chooseOffers = chooseOffers;
    }

    public String getApvOpinion() {
        return apvOpinion;
    }

    public void setApvOpinion( String apvOpinion ) {
        this.apvOpinion = apvOpinion;
    }

    public MerCoreDTO getMer() {
        return mer;
    }

    public void setMer( MerCoreDTO mer ) {
        this.mer = mer;
    }
}