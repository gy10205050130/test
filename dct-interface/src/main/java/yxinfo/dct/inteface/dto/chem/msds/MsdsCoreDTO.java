package yxinfo.dct.inteface.dto.chem.msds;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.Add;
import yxinfo.dct.inteface.validation.groups.Update;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class MsdsCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -1190590181229537227L;

    @NotNull( groups = { Update.class }, message = ErrorCode.MSDS_ID_NOT_NULL )
    private Integer id;

    // 化学品名称_化学品中文名称
    @NotNull( groups = { Add.class, Update.class }, message = ErrorCode.MSDS_CN_NAME_NOT_NULL )
    private String cnName;

    // 化学品名称_中文名称拼音
    private String pyinName;

    // 中文名称长度
    private Short cnNameLen;

    // 化学品名称_俗名
    private String trivialName;

    // 化学品名称_英文名称
    private String enName;

    // 化学品名称_CAS
    private String cas;

    // 化学品名称_生产企业名称
    private String pEnterprise;

    // 化学品名称_生产企业地址
    private String pAddress;

    // 化学品名称_生效日期
    private String effectiveDate;

    // 成分/组成信息_有害物成分
    private String harm;

    // 成分/组成信息_含量
    private String harmContent;

    // 成分/组成信息_CAS
    private String harmCas;

    // 危险性概述_危险性类别，与msds_safety_measures.risk_cate一致
    private String riskCate;

    // 性质
    private String nature;

    // 创建时间
    private Date createAt;

    // 更新时间
    private Date updateAt;

    // 危险化学品学术资料
    private MsdsAcademicDTO academicInfo;

    // 危险化学品危害与安全措施
    private MsdsSafetyDTO safetyMeasures;

    // 危险化学品法规信息
    private MsdsStatuteDTO statute;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName( String cnName ) {
        this.cnName = cnName;
    }

    public String getPyinName() {
        return pyinName;
    }

    public void setPyinName( String pyinName ) {
        this.pyinName = pyinName;
    }

    public Short getCnNameLen() {
        return cnNameLen;
    }

    public void setCnNameLen( Short cnNameLen ) {
        this.cnNameLen = cnNameLen;
    }

    public String getTrivialName() {
        return trivialName;
    }

    public void setTrivialName( String trivialName ) {
        this.trivialName = trivialName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName( String enName ) {
        this.enName = enName;
    }

    public String getCas() {
        return cas;
    }

    public void setCas( String cas ) {
        this.cas = cas;
    }

    public String getpEnterprise() {
        return pEnterprise;
    }

    public void setpEnterprise( String pEnterprise ) {
        this.pEnterprise = pEnterprise;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress( String pAddress ) {
        this.pAddress = pAddress;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate( String effectiveDate ) {
        this.effectiveDate = effectiveDate;
    }

    public String getHarm() {
        return harm;
    }

    public void setHarm( String harm ) {
        this.harm = harm;
    }

    public String getHarmContent() {
        return harmContent;
    }

    public void setHarmContent( String harmContent ) {
        this.harmContent = harmContent;
    }

    public String getHarmCas() {
        return harmCas;
    }

    public String getRiskCate() {
        return riskCate;
    }

    public void setRiskCate( String riskCate ) {
        this.riskCate = riskCate;
    }

    public void setHarmCas( String harmCas ) {
        this.harmCas = harmCas;
    }

    public String getNature() {
        return nature;
    }

    public void setNature( String nature ) {
        this.nature = nature;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public MsdsAcademicDTO getAcademicInfo() {
        return academicInfo;
    }

    public void setAcademicInfo( MsdsAcademicDTO academicInfo ) {
        this.academicInfo = academicInfo;
    }

    public MsdsSafetyDTO getSafetyMeasures() {
        return safetyMeasures;
    }

    public void setSafetyMeasures( MsdsSafetyDTO safetyMeasures ) {
        this.safetyMeasures = safetyMeasures;
    }

    public MsdsStatuteDTO getStatute() {
        return statute;
    }

    public void setStatute( MsdsStatuteDTO statute ) {
        this.statute = statute;
    }
}