package yxinfo.dct.inteface.dto.chem.intowh;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class ChemIntowhBatchDTO extends BaseDTO {

    private static final long serialVersionUID = -5038365393175746647L;

    private Integer id;

    // 组织id
    private Integer orgId;

    // 仓库id
    private Integer whId;

    // 化学品名称
    private String chemName;

    // 化学品名称拼音
    private String chemPyin;

    // 化学品CAS号
    private String chemCas;

    // 规格id
    private String specName;

    // 容量/数量
    private Integer capacity;

    // 容量/数量计量单位id
    private String unit;

    // 标志（1教学/2科研）
    private String flag;

    // 归属人成员工号
    private String belongToCode;

    // 归属人姓名
    private String belongToName;

    // 归属人姓名拼音
    private String belongToPyin;

    // 归属人手机号码
    private String belongToMobile;

    // 入库数量
    private Integer num;

    // 创建时间
    private Date createAt;

    // 入库时间
    private Date intowhAt;

    // 采购类型（0普通入库，1采购入库）
    private String purchaseType;

    // 入库人成员id
    private Integer memberId;

    // 第二入库人成员id
    private Integer memberIdSec;

    // 双人管理类型，取值与chem_reagent.double_mgt一致
    private String doubleMgt;

    // 编辑状态（1可修改，2修改中，3不可修改）
    private String editStatus;

    // 类型（1试剂，2非试剂）
    private String thingType;

    // 采购订单明细id
    private Integer orderDetailId;

    // `````````````````````````````````````````````````````````````````````
    private String schText;

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

    public Integer getWhId() {
        return whId;
    }

    public void setWhId( Integer whId ) {
        this.whId = whId;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
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

    public String getBelongToMobile() {
        return belongToMobile;
    }

    public void setBelongToMobile( String belongToMobile ) {
        this.belongToMobile = belongToMobile;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getIntowhAt() {
        return intowhAt;
    }

    public void setIntowhAt( Date intowhAt ) {
        this.intowhAt = intowhAt;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType( String purchaseType ) {
        this.purchaseType = purchaseType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getMemberIdSec() {
        return memberIdSec;
    }

    public void setMemberIdSec( Integer memberIdSec ) {
        this.memberIdSec = memberIdSec;
    }

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }

    public String getEditStatus() {
        return editStatus;
    }

    public void setEditStatus( String editStatus ) {
        this.editStatus = editStatus;
    }

    public String getThingType() {
        return thingType;
    }

    public void setThingType( String thingType ) {
        this.thingType = thingType;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}