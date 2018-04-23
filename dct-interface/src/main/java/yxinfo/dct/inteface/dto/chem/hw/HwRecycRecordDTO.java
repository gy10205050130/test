package yxinfo.dct.inteface.dto.chem.hw;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.chem.RecycBottle;
import yxinfo.dct.inteface.validation.groups.chem.RecycLiquid;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class HwRecycRecordDTO extends BaseDTO {

    private static final long serialVersionUID = 8628753328017300774L;

    private Integer id;

    // 危废产生者组织id
    private Integer orgId;

    // 危废产生者组织名称
    private String orgName;

    // 危废回收者组织id
    @NotNull( groups = { RecycLiquid.class, RecycBottle.class }, message = ErrorCode.ORG_ID_NOT_NULL )
    private Integer recycOrgId;

    // 危废回收者组织名称
    private String recycOrgName;

    private Date createAt;

    // 回收人id
    @NotNull( groups = { RecycLiquid.class, RecycBottle.class }, message = ErrorCode.MEMBER_ID_NOT_EMPTY )
    private Integer memberId;

    // 回收人姓名
    private String memberName;

    // 回收人手机号
    private String memberMobile;

    // 类型（1废液或废水回收/2空瓶回收）
    private Short ftype;

    // 回收桶id
    @NotNull( groups = RecycLiquid.class, message = ErrorCode.HW_BUCKET_ID_NOT_NULL )
    private Integer recycBucketId;

    // 危废类别
    private Short hwCategory;

    // 危废性质id
    private Integer hwNatureId;

    //危废性质
    private String hwNature;

    // 危废重量（kg）
    @NotNull( groups = RecycLiquid.class, message = ErrorCode.HW_WEIGHT_NOT_NULL )
    @DecimalMin( groups = RecycLiquid.class, value = "0", message = ErrorCode.HW_WEIGHT_NOT_NULL )
    private BigDecimal hwWeight;

    // 回收桶放置地点id
    private Integer siteId;

    // 回收桶放置地点名称
    private String siteName;

    // 回收空瓶数
    private Short bottleNum;

    // 现场图片静态资源id
    private String picId;

    // 费用（分）
    private Integer cost;

    @NotEmpty( groups = { RecycLiquid.class, RecycBottle.class }, message = ErrorCode.HW_PIC_IDS_NOT_NULL )
    private List<Integer> picIds;

    @NotEmpty( groups = RecycBottle.class, message = ErrorCode.CHEM_REAGENT_RF_CODE_NOT_EMPTY )
    private List<String> rfCodes;

    @NotNull( groups = RecycBottle.class, message = ErrorCode.HW_RFID_FLAG_NOT_NULL )
    private String flag;

    // ------------------------------------------------------------------------------------
    private Date createAtFrom;

    private Date createAtTo;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName( String orgName ) {
        this.orgName = orgName;
    }

    public Integer getRecycOrgId() {
        return recycOrgId;
    }

    public void setRecycOrgId( Integer recycOrgId ) {
        this.recycOrgId = recycOrgId;
    }

    public String getRecycOrgName() {
        return recycOrgName;
    }

    public void setRecycOrgName( String recycOrgName ) {
        this.recycOrgName = recycOrgName;
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

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile( String memberMobile ) {
        this.memberMobile = memberMobile;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype( Short ftype ) {
        this.ftype = ftype;
    }

    public Integer getRecycBucketId() {
        return recycBucketId;
    }

    public void setRecycBucketId( Integer recycBucketId ) {
        this.recycBucketId = recycBucketId;
    }

    public Short getHwCategory() {
        return hwCategory;
    }

    public void setHwCategory( Short hwCategory ) {
        this.hwCategory = hwCategory;
    }

    public Integer getHwNatureId() {
        return hwNatureId;
    }

    public void setHwNatureId( Integer hwNatureId ) {
        this.hwNatureId = hwNatureId;
    }

    public String getHwNature() {
        return hwNature;
    }

    public void setHwNature( String hwNature ) {
        this.hwNature = hwNature;
    }

    public BigDecimal getHwWeight() {
        return hwWeight;
    }

    public void setHwWeight( BigDecimal hwWeight ) {
        this.hwWeight = hwWeight;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId( Integer siteId ) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName( String siteName ) {
        this.siteName = siteName;
    }

    public Short getBottleNum() {
        return bottleNum;
    }

    public void setBottleNum( Short bottleNum ) {
        this.bottleNum = bottleNum;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId( String picId ) {
        this.picId = picId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost( Integer cost ) {
        this.cost = cost;
    }

    public List<Integer> getPicIds() {
        return picIds;
    }

    public void setPicIds( List<Integer> picIds ) {
        this.picIds = picIds;
    }

    public List<String> getRfCodes() {
        return rfCodes;
    }

    public void setRfCodes( List<String> rfCodes ) {
        this.rfCodes = rfCodes;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
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
}