package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2017/1/6.
 */
public class GetTotalOnApplyDTO extends BaseDTO {

    private static final long serialVersionUID = -5903128436403487764L;

    @NotNull( message = ErrorCode.ORG_ID_NOT_NULL )
    private Integer orgId;

    @NotNull( message = ErrorCode.CHEM_CHEM_NAME_NOT_EMPTY )
    private String chemName;

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
