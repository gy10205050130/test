package yxinfo.dct.inteface.dto.chem.check;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * 试剂库存盘点DTO
 * Created by dy on 2016/7/20.
 */
public class ChemCheckDTO extends BaseDTO {

    private static final long serialVersionUID = -1322685917884357393L;

    // 化学品名称
    private String chemName;

    // 规格
    private String specName;

    // 容量
    private Integer capacity;

    // 单位id
    private String unit;

    // 盘点得出的数量
    private Integer ckNum;

    // 记录的库存数量
    private Integer recordNum;

    // 盘盈id列表
    private List<Integer> idsMore = new ArrayList<Integer>();

    // 盘亏id列表
    private List<Integer> idsLess = new ArrayList<Integer>();

    public String getChemName() {
        return chemName;
    }

    public void setChemName( String chemName ) {
        this.chemName = chemName;
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

    public Integer getCkNum() {
        return ckNum;
    }

    public void setCkNum( Integer ckNum ) {
        this.ckNum = ckNum;
    }

    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum( Integer recordNum ) {
        this.recordNum = recordNum;
    }

    public List<Integer> getIdsMore() {
        return idsMore;
    }

    public void setIdsMore( List<Integer> idsMore ) {
        this.idsMore = idsMore;
    }

    public List<Integer> getIdsLess() {
        return idsLess;
    }

    public void setIdsLess( List<Integer> idsLess ) {
        this.idsLess = idsLess;
    }
}
