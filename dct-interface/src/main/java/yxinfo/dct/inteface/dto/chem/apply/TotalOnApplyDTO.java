package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/6/23.
 */
public class TotalOnApplyDTO extends BaseDTO {

    private static final long serialVersionUID = -6633559554759279885L;

    // 化学品名称
    @NotNull( message = ErrorCode.CHEM_CHEM_NAME_NOT_EMPTY )
    private String chemName;

    // 化学品CAS号
    private String chemCas;

    // 规格
    @NotNull(  message = ErrorCode.CHEM_SPEC_NOT_EMPTY )
    private String specName;

    // 容量
    private Integer capacity;

    // 单位
    @NotNull( message = ErrorCode.CHEM_UNIT_NOT_EMPTY )
    private String unit;

    // 用途（1教学，2科研）
    private String flag;

    // 数量
    private Integer count;

    // 归属人工号
    private String belongToCode;

    // 归属人姓名
    private String belongToName;

    // 双人管理类型（0不需要双人管理，1五双管理）
    private String doubleMgt;

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

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount( Integer count ) {
        this.count = count;
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

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }
}
