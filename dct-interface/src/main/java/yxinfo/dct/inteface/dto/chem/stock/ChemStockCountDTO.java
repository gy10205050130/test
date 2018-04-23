package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2016/10/18.
 */
public class ChemStockCountDTO extends BaseDTO {

    private static final long serialVersionUID = -627879406352776034L;

    private String specName;

    private Integer capacity;

    private String unit;

    private Integer count;

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
}
