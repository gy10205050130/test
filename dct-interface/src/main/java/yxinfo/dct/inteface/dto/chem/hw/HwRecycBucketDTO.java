package yxinfo.dct.inteface.dto.chem.hw;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.Add;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class HwRecycBucketDTO extends BaseDTO {

    private static final long serialVersionUID = -7879754433415078078L;

    private Integer id;

    // 组织id
    @NotNull( groups = Add.class, message = ErrorCode.ORG_ID_NOT_NULL )
    private Integer orgId;

    // 编号
    @NotNull( groups = Add.class, message = ErrorCode.HW_BUCKET_CODE_NOT_NULL )
    private String fcode;

    // 名称
    private String fname;

    // RFID码
    @NotNull( groups = Add.class, message = ErrorCode.HW_BUCKET_RF_CODE_NOT_NULL )
    private String rfCode;

    private Date createAt;

    // 放置地点id
    @NotNull( groups = Add.class, message = ErrorCode.HW_BUCKET_SITE_ID_NOT_NULL )
    private Integer siteId;

    // 放置地点名称
    private String siteName;

    // 危废类别
    @NotNull( groups = Add.class, message = ErrorCode.HW_BUCKET_CATEGORY_NOT_NULL )
    @Min( groups = Add.class, value = 1, message = ErrorCode.HW_BUCKET_CATEGORY_ILLEGAL )
    @Max( groups = Add.class, value = 2, message = ErrorCode.HW_BUCKET_CATEGORY_ILLEGAL )
    private Short hwCategory;

    // 危废性质id
    @NotNull( groups = Add.class, message = ErrorCode.HW_BUCKET_NATURE_ID_NOT_NULL )
    private Integer hwNatureId;

    // 主要成分
    private String hwMainCnstnt;

    // 是否被删除
    private Boolean isDel;

    // 危废性质
    private String hwNature;

    private BigDecimal levelTotal;

    private BigDecimal level;

    public Integer getId () {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public Integer getOrgId () {
        return orgId;
    }

    public void setOrgId ( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getFcode () {
        return fcode;
    }

    public void setFcode ( String fcode ) {
        this.fcode = fcode;
    }

    public String getFname () {
        return fname;
    }

    public void setFname ( String fname ) {
        this.fname = fname;
    }

    public String getRfCode () {
        return rfCode;
    }

    public void setRfCode ( String rfCode ) {
        this.rfCode = rfCode;
    }

    public Date getCreateAt () {
        return createAt;
    }

    public void setCreateAt ( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getSiteId () {
        return siteId;
    }

    public void setSiteId ( Integer siteId ) {
        this.siteId = siteId;
    }

    public String getSiteName () {
        return siteName;
    }

    public void setSiteName ( String siteName ) {
        this.siteName = siteName;
    }

    public Short getHwCategory () {
        return hwCategory;
    }

    public void setHwCategory ( Short hwCategory ) {
        this.hwCategory = hwCategory;
    }

    public Integer getHwNatureId () {
        return hwNatureId;
    }

    public void setHwNatureId ( Integer hwNatureId ) {
        this.hwNatureId = hwNatureId;
    }

    public String getHwMainCnstnt () {
        return hwMainCnstnt;
    }

    public void setHwMainCnstnt ( String hwMainCnstnt ) {
        this.hwMainCnstnt = hwMainCnstnt;
    }

    public Boolean getDel () {
        return isDel;
    }

    public void setDel ( Boolean del ) {
        isDel = del;
    }

    public String getHwNature () {
        return hwNature;
    }

    public void setHwNature ( String hwNature ) {
        this.hwNature = hwNature;
    }

    public BigDecimal getLevelTotal () {
        return levelTotal;
    }

    public void setLevelTotal ( BigDecimal levelTotal ) {
        this.levelTotal = levelTotal;
    }

    public BigDecimal getLevel () {
        return level;
    }

    public void setLevel ( BigDecimal level ) {
        this.level = level;
    }
}