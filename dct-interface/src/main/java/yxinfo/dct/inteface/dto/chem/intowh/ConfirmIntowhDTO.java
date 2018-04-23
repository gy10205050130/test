package yxinfo.dct.inteface.dto.chem.intowh;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by dy on 2016/12/22.
 */
public class ConfirmIntowhDTO extends BaseDTO {

    private static final long serialVersionUID = -7479016645699616810L;

    private Integer id;

    private String flag;

    private List<String> qrs;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    public List<String> getQrs() {
        return qrs;
    }

    public void setQrs( List<String> qrs ) {
        this.qrs = qrs;
    }
}
