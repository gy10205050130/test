package yxinfo.dct.inteface.dto.chem.intowh;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.chem.ShopIntowEqry;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2017/1/17.
 */
public class ChemShopIntowhDTO extends BaseDTO {

    private static final long serialVersionUID = -3530514675406547707L;

    // 组织id
    @NotNull( message = ErrorCode.CHEM_REAGENT_ORG_ID_NOT_EMPTY )
    private Integer orgId;

    // 订单明细id
    @NotNull( message = ErrorCode.CHEM_ORDER_DETAIL_ID_NOT_EMPTY )
    private Integer orderDetailId;

    // 规格
    @NotNull( groups = ShopIntowEqry.class, message = ErrorCode.CHEM_SPEC_NOT_EMPTY )
    private String specName;

    // 容量/数量
    @NotNull( groups = ShopIntowEqry.class, message = ErrorCode.CHEM_CAPACITY_NOT_EMPTY )
    private Integer capacity;

    // 容量/数量计量单位
    @NotNull( groups = ShopIntowEqry.class, message = ErrorCode.CHEM_UNIT_NOT_EMPTY )
    private String unit;

    // 二维码
    @NotEmpty( message = ErrorCode.CHEM_REAGENT_RF_CODE_NOT_EMPTY )
    private List<String> rfFcodes;

    // 名称
    private String chemName;

    // 用途
    private String flag;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
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

    public List<String> getRfFcodes() {
        return rfFcodes;
    }

    public void setRfFcodes( List<String> rfFcodes ) {
        this.rfFcodes = rfFcodes;
    }

    public String getChemName() {
        return chemName;
    }

    public void setChemName( String chemName ) {
        this.chemName = chemName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }
}
