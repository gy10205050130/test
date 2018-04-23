package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2016/10/18.
 */
public class ChemStockSchDTO extends BaseDTO {

    private static final long serialVersionUID = 3833502884088430005L;

    private String schText;

    private Integer orgId;

    // 是否获取总量, true获取总量
    private boolean getTotal;

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public boolean getGetTotal() {
        return getTotal;
    }

    public void setGetTotal( boolean getTotal ) {
        this.getTotal = getTotal;
    }
}
