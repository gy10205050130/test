package yxinfo.dct.inteface.dto.chem.recyc;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

import java.util.Date;

public class ChemRecycleDTO extends BaseDTO {

    private static final long serialVersionUID = 1859764065707641456L;

    private Integer id;

    // 组织id
    private Integer orgId;

    // 回收人成员id
    private Integer memberId;

    // 回收试剂id
    private Integer reagentId;

    // 领取申请id
    private Integer applyId;

    // 类型（1回收，2回库）
    private String ftype;

    // 用量
    private Integer used;

    // 回收后余量
    private Integer surplus;

    // 用量检查状态（1正常，2用量超限，3异常关闭）
    private String checkUsed;

    // 创建时间
    private Date createAt;

    // 领用人成员id
    private Integer rcvMemberId;

    // 第二领用人成员id
    private Integer rcvMemberIdSec;

    // 回库管理员成员id
    private Integer inCharge;

    // 第二回库管理员成员id
    private Integer inChargeSec;

    // 空瓶回收时间
    private Date recycleAt;

    // 化学品名称
    private String chemName;

    // 化学品CAS号
    private String chemCas;

    // 规格
    private String specName;

    // 容量/数量
    private Integer capacity;

    // 容量/数量计量单位
    private String unit;

    // 试剂二维码
    private String qr;

    // 领取申请课题名称
    private String issuesName;

    // 领取申请编号
    private String applyCode;

    // 回收人
    private MemberDTO member;

    // 回收的试剂
    private ChemReagentDTO reagent;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getReagentId() {
        return reagentId;
    }

    public void setReagentId( Integer reagentId ) {
        this.reagentId = reagentId;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId( Integer applyId ) {
        this.applyId = applyId;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype( String ftype ) {
        this.ftype = ftype;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed( Integer used ) {
        this.used = used;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus( Integer surplus ) {
        this.surplus = surplus;
    }

    public String getCheckUsed() {
        return checkUsed;
    }

    public void setCheckUsed( String checkUsed ) {
        this.checkUsed = checkUsed;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getRcvMemberId() {
        return rcvMemberId;
    }

    public void setRcvMemberId( Integer rcvMemberId ) {
        this.rcvMemberId = rcvMemberId;
    }

    public Integer getRcvMemberIdSec() {
        return rcvMemberIdSec;
    }

    public void setRcvMemberIdSec( Integer rcvMemberIdSec ) {
        this.rcvMemberIdSec = rcvMemberIdSec;
    }

    public Integer getInCharge() {
        return inCharge;
    }

    public void setInCharge( Integer inCharge ) {
        this.inCharge = inCharge;
    }

    public Integer getInChargeSec() {
        return inChargeSec;
    }

    public void setInChargeSec( Integer inChargeSec ) {
        this.inChargeSec = inChargeSec;
    }

    public Date getRecycleAt() {
        return recycleAt;
    }

    public void setRecycleAt( Date recycleAt ) {
        this.recycleAt = recycleAt;
    }

    public String getChemName() {
        return chemName;
    }

    public void setChemName( String chemName ) {
        this.chemName = chemName;
    }

    public String getChemCas() {
        return chemCas;
    }

    public void setChemCas( String chemCas ) {
        this.chemCas = chemCas;
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

    public String getQr() {
        return qr;
    }

    public void setQr( String qr ) {
        this.qr = qr;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName( String issuesName ) {
        this.issuesName = issuesName;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode( String applyCode ) {
        this.applyCode = applyCode;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public ChemReagentDTO getReagent() {
        return reagent;
    }

    public void setReagent( ChemReagentDTO reagent ) {
        this.reagent = reagent;
    }
}