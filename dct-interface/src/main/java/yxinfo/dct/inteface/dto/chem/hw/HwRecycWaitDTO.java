package yxinfo.dct.inteface.dto.chem.hw;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.PageSelect;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class HwRecycWaitDTO extends BaseDTO {

    private static final long serialVersionUID = -7200029509970372578L;

    private Integer id;

    // 危废产生者组织id
    private Integer orgId;

    // 危废产生者组织名称
    private String orgName;

    // 危废回收者组织id
    @NotNull( groups = PageSelect.class, message = ErrorCode.ORG_ID_NOT_NULL )
    private Integer recycOrgId;

    // 来源类型（1人员上报/2监控器）
    private Short oriType;

    private Date createAt;

    // 回收桶id
    private Integer recycBucketId;

    private Short hwCategory;

    private Integer hwNatureId;

    // 危废性质
    private String hwNature;

    // 回收桶放置地点id
    private Integer siteId;

    // 回收桶放置地点名称
    private String siteName;

    // 上报人成员id
    private Integer memberId;

    // 上报人姓名
    private String memberName;

    // 上报人手机号
    private String memberMobile;

    // 状态（1待回收/2已回收）
    private Short fstatus;

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

    public String getOrgName () {
        return orgName;
    }

    public void setOrgName ( String orgName ) {
        this.orgName = orgName;
    }

    public Integer getRecycOrgId () {
        return recycOrgId;
    }

    public void setRecycOrgId ( Integer recycOrgId ) {
        this.recycOrgId = recycOrgId;
    }

    public Short getOriType () {
        return oriType;
    }

    public void setOriType ( Short oriType ) {
        this.oriType = oriType;
    }

    public Date getCreateAt () {
        return createAt;
    }

    public void setCreateAt ( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getRecycBucketId () {
        return recycBucketId;
    }

    public void setRecycBucketId ( Integer recycBucketId ) {
        this.recycBucketId = recycBucketId;
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

    public String getHwNature () {
        return hwNature;
    }

    public void setHwNature ( String hwNature ) {
        this.hwNature = hwNature;
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

    public Integer getMemberId () {
        return memberId;
    }

    public void setMemberId ( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getMemberName () {
        return memberName;
    }

    public void setMemberName ( String memberName ) {
        this.memberName = memberName;
    }

    public String getMemberMobile () {
        return memberMobile;
    }

    public void setMemberMobile ( String memberMobile ) {
        this.memberMobile = memberMobile;
    }

    public Short getFstatus () {
        return fstatus;
    }

    public void setFstatus ( Short fstatus ) {
        this.fstatus = fstatus;
    }
}