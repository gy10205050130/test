package yxinfo.shop.inf.dto.funds;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2016/10/11.
 */
public class CwProjDTO extends BaseDTO{

    //项目代码
    private String code;

    //项目名称
    private String name;

    //项目大类代码
    private String pcode;

    //项目大类名称
    private String ptypename;

    //部门代码
    private String saDepart;

    //部门名称
    private String saDepartname;

    //属性1
    private String attr1;

    //属性2
    private String attr2;

    //属性3
    private String attr3;

    //属性4
    private String attr4;

    //条目1
    private String spec1;

    //条目2
    private String spec2;

    //条目3
    private String spec3;

    //条目4
    private String spec4;

    //条目5
    private String spec5;

    //条目6
    private String spec6;

    //项目负责人工号
    private String chargeSno;

    //项目负责人姓名
    private String chargeName;

    //开始年度
    private String startYear;

    //结束年度
    private String closeYear;

    //是否有效(Y/N)
    private String validity;

    //开设日期
    private String createDate;

    //结题日期
    private String finishDate;

    //预算模板代码
    private String tCode;

    //最后更新时间
    private String lastupdDttm;

    // ===============================================================
    private List<String> cardList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPtypename() {
        return ptypename;
    }

    public void setPtypename(String ptypename) {
        this.ptypename = ptypename;
    }

    public String getSaDepart() {
        return saDepart;
    }

    public void setSaDepart(String saDepart) {
        this.saDepart = saDepart;
    }

    public String getSaDepartname() {
        return saDepartname;
    }

    public void setSaDepartname(String saDepartname) {
        this.saDepartname = saDepartname;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    public String getSpec1() {
        return spec1;
    }

    public void setSpec1(String spec1) {
        this.spec1 = spec1;
    }

    public String getSpec2() {
        return spec2;
    }

    public void setSpec2(String spec2) {
        this.spec2 = spec2;
    }

    public String getSpec3() {
        return spec3;
    }

    public void setSpec3(String spec3) {
        this.spec3 = spec3;
    }

    public String getSpec4() {
        return spec4;
    }

    public void setSpec4(String spec4) {
        this.spec4 = spec4;
    }

    public String getSpec5() {
        return spec5;
    }

    public void setSpec5(String spec5) {
        this.spec5 = spec5;
    }

    public String getSpec6() {
        return spec6;
    }

    public void setSpec6(String spec6) {
        this.spec6 = spec6;
    }

    public String getChargeSno() {
        return chargeSno;
    }

    public void setChargeSno(String chargeSno) {
        this.chargeSno = chargeSno;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getCloseYear() {
        return closeYear;
    }

    public void setCloseYear(String closeYear) {
        this.closeYear = closeYear;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
    }

    public String getLastupdDttm() {
        return lastupdDttm;
    }

    public void setLastupdDttm(String lastupdDttm) {
        this.lastupdDttm = lastupdDttm;
    }

    public List<String> getCardList() {
        return cardList;
    }

    public void setCardList(List<String> cardList) {
        this.cardList = cardList;
    }

    @Override
    public String toString() {
        return "CwProjDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", pcode='" + pcode + '\'' +
                ", ptypename='" + ptypename + '\'' +
                ", saDepart='" + saDepart + '\'' +
                ", saDepartname='" + saDepartname + '\'' +
                ", attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3='" + attr3 + '\'' +
                ", attr4='" + attr4 + '\'' +
                ", spec1='" + spec1 + '\'' +
                ", spec2='" + spec2 + '\'' +
                ", spec3='" + spec3 + '\'' +
                ", spec4='" + spec4 + '\'' +
                ", spec5='" + spec5 + '\'' +
                ", spec6='" + spec6 + '\'' +
                ", chargeSno='" + chargeSno + '\'' +
                ", chargeName='" + chargeName + '\'' +
                ", startYear='" + startYear + '\'' +
                ", closeYear='" + closeYear + '\'' +
                ", validity='" + validity + '\'' +
                ", createDate='" + createDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                ", tCode='" + tCode + '\'' +
                ", lastupdDttm='" + lastupdDttm + '\'' +
                ", cardList=" + cardList +
                '}';
    }
}
