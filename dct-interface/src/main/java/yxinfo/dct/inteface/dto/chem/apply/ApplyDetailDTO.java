package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.validation.groups.Add;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class ApplyDetailDTO extends BaseDTO {

    private static final long serialVersionUID = -1093176476808579440L;

    private Integer id;

    // 申请人组织id
    private Integer orgId;

    // 领取申请id
    private Integer applyId;

    // 申请人成员id
    private Integer memberId;

    // 申请人姓名
    private String memberName;

    // 申请人姓名拼音
    private String memberPyin;

    // 申请人工号
    private String memberCode;

    // 第二申请人成员id
    private Integer memberIdSec;

    // 第二申请人姓名
    private String memberNameSec;

    // 第二申请人姓名拼音
    private String memberPyinSec;

    // 第二申请人工号
    private String memberCodeSec;

    // 双人管理类型，取值与chem_reagent.double_mgt一致
    private String doubleMgt;

    // 领取状态（0未生效，1审核中，2待领用，3已领完，4已驳回，5已逾期）
    private String receiveSta;

    // 采购类型（0普通入库，1采购入库）
    private String purchaseType;

    // 采购订单详情id，purchase_type=1时有效
    private Integer orderDetailId;

    // 化学品名称
    @NotNull( groups = { Add.class }, message = ErrorCode.CHEM_CHEM_NAME_NOT_EMPTY )
    private String chemName;

    // 化学品名称拼音
    private String chemPyin;

    // 化学品CAS号
    private String chemCas;

    // 规格
    @NotNull( groups = { Add.class }, message = ErrorCode.CHEM_SPEC_NOT_EMPTY )
    private String specName;

    // 申请的容量
    @NotNull( groups = { Add.class }, message = ErrorCode.CHEM_CAPACITY_NOT_EMPTY )
    private Integer capacity;

    // 容量/数量单位
    @NotNull( groups = { Add.class }, message = ErrorCode.CHEM_UNIT_NOT_EMPTY )
    private String unit;

    // 用途（1教学，2科研），对应chem_reagent.flag
    private String purpose;

    // 归属人工号
    private String belongToCode;

    // 归属人姓名
    private String belongToName;

    // 归属人姓名拼音
    private String belongToPyin;

    // 领取记录id
    private Integer receiveId;

    // 父id，值为0时展示在列表
    private Integer pid;

    // 总数量，pid=0时有效
    private Integer num;

    // 已领取数量，pid=0时有效
    private Integer receiveNum;

    private Date createAt;

    // 课题名称 / 订单号
    private String issuesName;

    // 类型（1按瓶申领，2按量申领）
    private String ftype;

    // <FK>chem_intowh_batch.id
    private Integer stockId;

    // 物品类型（1试剂，2非试剂）
    private String thingType;

    // ```````````````````````````````````````````````````````````````````````````````````````````````````
    // 分配情况
    //@Valid
    //@NotEmpty( groups = { Add.class }, message = ErrorCode.CHEM_APLY_REAGENTS_ALLOT_NOT_EMPTY )
    private List<AllotOnApplyRetDTO> allot;

    // 领用同行人
    private MemberDTO memberSec;

    // 申领人
    private MemberDTO member;

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

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId( Integer applyId ) {
        this.applyId = applyId;
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

    public String getMemberPyin() {
        return memberPyin;
    }

    public void setMemberPyin( String memberPyin ) {
        this.memberPyin = memberPyin;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode( String memberCode ) {
        this.memberCode = memberCode;
    }

    public Integer getMemberIdSec() {
        return memberIdSec;
    }

    public void setMemberIdSec( Integer memberIdSec ) {
        this.memberIdSec = memberIdSec;
    }

    public String getMemberNameSec() {
        return memberNameSec;
    }

    public void setMemberNameSec( String memberNameSec ) {
        this.memberNameSec = memberNameSec;
    }

    public String getMemberPyinSec() {
        return memberPyinSec;
    }

    public void setMemberPyinSec( String memberPyinSec ) {
        this.memberPyinSec = memberPyinSec;
    }

    public String getMemberCodeSec() {
        return memberCodeSec;
    }

    public void setMemberCodeSec( String memberCodeSec ) {
        this.memberCodeSec = memberCodeSec;
    }

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }

    public String getReceiveSta() {
        return receiveSta;
    }

    public void setReceiveSta( String receiveSta ) {
        this.receiveSta = receiveSta;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType( String purchaseType ) {
        this.purchaseType = purchaseType;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose( String purpose ) {
        this.purpose = purpose;
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

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId( Integer receiveId ) {
        this.receiveId = receiveId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid( Integer pid ) {
        this.pid = pid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public Integer getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum( Integer receiveNum ) {
        this.receiveNum = receiveNum;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName( String issuesName ) {
        this.issuesName = issuesName;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype( String ftype ) {
        this.ftype = ftype;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId( Integer stockId ) {
        this.stockId = stockId;
    }

    public String getThingType() {
        return thingType;
    }

    public void setThingType( String thingType ) {
        this.thingType = thingType;
    }

    public List<AllotOnApplyRetDTO> getAllot() {
        return allot;
    }

    public void setAllot( List<AllotOnApplyRetDTO> allot ) {
        this.allot = allot;
    }

    public MemberDTO getMemberSec() {
        return memberSec;
    }

    public void setMemberSec( MemberDTO memberSec ) {
        this.memberSec = memberSec;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }
}