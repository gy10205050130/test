package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/1/11.
 */
public class ApplyReceiveBatchDTO extends BaseDTO {

    private static final long serialVersionUID = 8530981574857961543L;

    private Integer id;

    // 申请人组织id
    private Integer orgId;

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

    // 采购类型（0普通入库，1采购入库）
    private String purchaseType;

    // 采购订单id，purchase_type=2时有效
    private Integer orderId;

    // 日期
    private Date fdate;

    // 化学品名称
    private String chemName;

    // 化学品名称拼音
    private String chemPyin;

    // 化学品CAS号
    private String chemCas;

    // 规格
    private String specName;

    // 申请的容量
    private Integer capacity;

    // 容量计量单位单位id
    private String unit;

    // 用途（0无用途，1教学，2科研），对应chem_reagent.flag
    private String purpose;

    // 领用数量
    private Integer num;

    //物品类型（1试剂，2非试剂）
    private String thingType;

    // ````````````````````````````````````````````````````````````````````````````````````````
    // 申请人
    private MemberDTO member;

    // 第二申请人
    private MemberDTO memberSec;

    // 归属信息
    private List<ApplyReceiveBelongDTO> belong;

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

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType( String purchaseType ) {
        this.purchaseType = purchaseType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate( Date fdate ) {
        this.fdate = fdate;
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

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public String getThingType() {
        return thingType;
    }

    public void setThingType( String thingType ) {
        this.thingType = thingType;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public MemberDTO getMemberSec() {
        return memberSec;
    }

    public void setMemberSec( MemberDTO memberSec ) {
        this.memberSec = memberSec;
    }

    public List<ApplyReceiveBelongDTO> getBelong() {
        return belong;
    }

    public void setBelong( List<ApplyReceiveBelongDTO> belong ) {
        this.belong = belong;
    }
}
