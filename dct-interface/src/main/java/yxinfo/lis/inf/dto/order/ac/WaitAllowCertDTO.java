package yxinfo.lis.inf.dto.order.ac;

import yxinfo.lis.inf.dto.BaseDTO;

import java.math.BigDecimal;

/**
 * Created by dy on 2016/8/27.
 */
public class WaitAllowCertDTO extends BaseDTO {

    private static final long serialVersionUID = -7936121156555828353L;

    private String fname;

    private String cas;

    private BigDecimal count;

    private String unit;

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getCas() {
        return cas;
    }

    public void setCas( String cas ) {
        this.cas = cas;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount( BigDecimal count ) {
        this.count = count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit( String unit ) {
        this.unit = unit;
    }
}
