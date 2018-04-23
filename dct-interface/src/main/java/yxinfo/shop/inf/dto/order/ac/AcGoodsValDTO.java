package yxinfo.shop.inf.dto.order.ac;

import yxinfo.shop.inf.dto.BaseDTO;

import java.math.BigDecimal;

/**
 * Created by dy on 2016/8/27.
 */
public class AcGoodsValDTO extends BaseDTO {

    private static final long serialVersionUID = 4345321484146442989L;

    // 容量（规格）
    private BigDecimal capacity;

    // 规格单位（ml、g）
    private String unit;

    // 纯度
    private String purity;

    public BigDecimal getCapacity() {
        return capacity;
    }

    public void setCapacity( BigDecimal capacity ) {
        this.capacity = capacity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit( String unit ) {
        this.unit = unit;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity( String purity ) {
        this.purity = purity;
    }
}
