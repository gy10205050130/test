package yxinfo.dct.inteface.dto.chem.msds;

import yxinfo.dct.inteface.dto.BaseDTO;

public class MsdsGetDTO extends BaseDTO {

    private static final long serialVersionUID = -9124672925783424139L;

    private Integer id;

    private Integer orgId;

    private Integer pageLen;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Integer getPageLen() {
        return pageLen;
    }

    public void setPageLen( Integer pageLen ) {
        this.pageLen = pageLen;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }
}