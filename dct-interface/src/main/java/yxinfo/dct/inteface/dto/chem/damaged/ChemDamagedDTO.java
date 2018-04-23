package yxinfo.dct.inteface.dto.chem.damaged;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;

import java.util.Date;

public class ChemDamagedDTO extends BaseDTO {

    private static final long serialVersionUID = 3885218172604909270L;

    private Integer id;

    // 组织id
    private Integer orgId;

    // 化学品名称
    private String chemName;

    // 化学品名称拼音
    private String chemPyin;

    // 化学品CAS号
    private String chemCas;

    // 化学品名称长度
    private Integer chemNameLen;

    // 规格
    private String specName;

    // 容量/数量
    private Integer capacity;

    // 容量/数量计量单位
    private String unit;

    // 创建时间
    private Date createAt;

    // 归属人工号
    private String belongToCode;

    // 归属人姓名
    private String belongToName;

    // 归属人姓名拼音
    private String belongToPyin;

    // 报损数量
    private Integer num;

    // 报损原因
    private String reason;

    // 报损人
    private Integer memberId;

    // ```````````````````````````````````````````````````````````````````````````````````
    // 归属人
    private MemberDTO belongToMember;

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

    public String getChemName() {
        return chemName;
    }

    public void setChemName( String chemName ) {
        this.chemName = chemName;
    }

    public String getChemPyin() {
        return chemPyin;
    }

    public void setChemPyin( String chemPyin ) {
        this.chemPyin = chemPyin;
    }

    public String getChemCas() {
        return chemCas;
    }

    public void setChemCas( String chemCas ) {
        this.chemCas = chemCas;
    }

    public Integer getChemNameLen() {
        return chemNameLen;
    }

    public void setChemNameLen( Integer chemNameLen ) {
        this.chemNameLen = chemNameLen;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName( String specName ) {
        this.specName = specName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity( Integer capacity ) {
        this.capacity = capacity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit( String unit ) {
        this.unit = unit;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getBelongToCode() {
        return belongToCode;
    }

    public void setBelongToCode( String belongToCode ) {
        this.belongToCode = belongToCode;
    }

    public String getBelongToName() {
        return belongToName;
    }

    public void setBelongToName( String belongToName ) {
        this.belongToName = belongToName;
    }

    public String getBelongToPyin() {
        return belongToPyin;
    }

    public void setBelongToPyin( String belongToPyin ) {
        this.belongToPyin = belongToPyin;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public String getReason() {
        return reason;
    }

    public void setReason( String reason ) {
        this.reason = reason;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public MemberDTO getBelongToMember() {
        return belongToMember;
    }

    public void setBelongToMember( MemberDTO belongToMember ) {
        this.belongToMember = belongToMember;
    }
}