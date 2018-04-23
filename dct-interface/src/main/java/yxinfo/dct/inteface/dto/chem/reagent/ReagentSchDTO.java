package yxinfo.dct.inteface.dto.chem.reagent;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2017/1/14.
 */
public class ReagentSchDTO extends BaseDTO {

    private static final long serialVersionUID = -323650283582424492L;

    private Integer numPerPage;

    private String schText;

    private Integer orgId;

    // 是否获取总量, true获取总量
    private boolean getTotal;

    public Integer getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage( Integer numPerPage ) {
        this.numPerPage = numPerPage;
    }

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
