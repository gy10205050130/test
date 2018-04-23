package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2017/1/7.
 */
public class AllotOnApplyDTO extends BaseDTO {

    private static final long serialVersionUID = 1255729268431641664L;

    @NotNull( message = ErrorCode.ORG_ID_NOT_NULL )
    private Integer orgId;

    @NotNull( message = ErrorCode.CHEM_CHEM_NAME_NOT_EMPTY )
    private String chemName;

    // 规格
    @NotNull(  message = ErrorCode.CHEM_SPEC_NOT_EMPTY )
    private String specName;

    // 容量
    private Integer capacity;

    // 单位
    @NotNull( message = ErrorCode.CHEM_UNIT_NOT_EMPTY )
    private String unit;

    // 数量
    @NotNull( message = ErrorCode.CHEM_COUNT_NOT_EMPTY )
    private Integer count;

    // 用途（1教学, 2科研）
    private String purpose;

    // 申请的试剂所属归属人工号, 匹配chemReagent.belongToCodes
    private List<String> applyBelongToCodes;

    // 无归属人试剂是否区分用途, true区分
    private Boolean allocablePurpose;

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

    public Integer getCount() {
        return count;
    }

    public void setCount( Integer count ) {
        this.count = count;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose( String purpose ) {
        this.purpose = purpose;
    }

    public List<String> getApplyBelongToCodes() {
        return applyBelongToCodes;
    }

    public void setApplyBelongToCodes( List<String> applyBelongToCodes ) {
        this.applyBelongToCodes = applyBelongToCodes;
    }

    public Boolean getAllocablePurpose() {
        return allocablePurpose;
    }

    public void setAllocablePurpose( Boolean allocablePurpose ) {
        this.allocablePurpose = allocablePurpose;
    }
}
