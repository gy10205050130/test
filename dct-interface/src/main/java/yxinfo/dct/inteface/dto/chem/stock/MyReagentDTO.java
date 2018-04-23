package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2016/6/23.
 */
public class MyReagentDTO extends BaseDTO {

    private static final long serialVersionUID = 3705754913135091431L;

    // 组织id
    private Integer orgId;

    // 化学品名称
    private String chemName;

    // 化学品CAS号
    private String chemCas;

    // 规格
    private String specName;

    // 容量
    private Integer capacity;

    // 单位
    private String unit;

    // 用途（1教学，2科研）
    private String flag;

    // 数量
    private Integer count;

    // 已领用数量
    private Integer receiveCount;

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

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount( Integer receiveCount ) {
        this.receiveCount = receiveCount;
    }
}
