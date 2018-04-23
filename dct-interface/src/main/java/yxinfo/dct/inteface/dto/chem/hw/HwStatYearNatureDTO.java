package yxinfo.dct.inteface.dto.chem.hw;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.math.BigDecimal;

public class HwStatYearNatureDTO extends BaseDTO {

    private static final long serialVersionUID = 119118349449099277L;

    private Integer id;

    // 危废产生者组织id
    private Integer statYearId;

    // 危废类别
    private Short hwCategory;

    // 危废性质id
    private Integer hwNatureId;

    // 危废性质
    private String hwNature;

    // 危废重量（kg）
    private BigDecimal hwWeight;

    // 费用（分）
    private Long cost;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getStatYearId() {
        return statYearId;
    }

    public void setStatYearId( Integer statYearId ) {
        this.statYearId = statYearId;
    }

    public Short getHwCategory() {
        return hwCategory;
    }

    public void setHwCategory( Short hwCategory ) {
        this.hwCategory = hwCategory;
    }

    public Integer getHwNatureId() {
        return hwNatureId;
    }

    public void setHwNatureId( Integer hwNatureId ) {
        this.hwNatureId = hwNatureId;
    }

    public String getHwNature() {
        return hwNature;
    }

    public void setHwNature( String hwNature ) {
        this.hwNature = hwNature;
    }

    public BigDecimal getHwWeight() {
        return hwWeight;
    }

    public void setHwWeight( BigDecimal hwWeight ) {
        this.hwWeight = hwWeight;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost( Long cost ) {
        this.cost = cost;
    }
}