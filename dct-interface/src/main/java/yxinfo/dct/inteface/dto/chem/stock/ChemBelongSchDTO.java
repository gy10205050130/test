package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;

import javax.validation.constraints.NotNull;

public class ChemBelongSchDTO extends BaseDTO {

    private static final long serialVersionUID = 3333389064868220644L;

    // 组织id
    @NotNull( message = ErrorCode.CHEM_REAGENT_ORG_ID_NOT_EMPTY )
    private Integer orgId;

    // 对应化学品名称
    @NotNull( message = ErrorCode.CHEM_CHEM_ID_NOT_EMPTY )
    private String chemName;

    // 规格id
    @NotNull( message = ErrorCode.CHEM_SPEC_NOT_EMPTY )
    private String specName;

    // 容量
    @NotNull( message = ErrorCode.CHEM_CAPACITY_NOT_EMPTY )
    private Integer capacity;

    // 容量计量单位id
    @NotNull( message = ErrorCode.CHEM_UNIT_NOT_EMPTY )
    private String unit;

    // 搜索词
    private String schText;

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

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}
