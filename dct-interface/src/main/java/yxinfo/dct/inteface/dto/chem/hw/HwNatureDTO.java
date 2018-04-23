package yxinfo.dct.inteface.dto.chem.hw;

import yxinfo.dct.inteface.dto.BaseDTO;

public class HwNatureDTO extends BaseDTO {

    private static final long serialVersionUID = -7385342058024115729L;

    private Integer id;

    // 组织id
    private Integer orgId;

    // 类别名称
    private String fname;

    // 是否被删除
    private Boolean isDel;

    public Integer getId () {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public Integer getOrgId () {
        return orgId;
    }

    public void setOrgId ( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getFname () {
        return fname;
    }

    public void setFname ( String fname ) {
        this.fname = fname;
    }

    public Boolean getDel () {
        return isDel;
    }

    public void setDel ( Boolean del ) {
        isDel = del;
    }
}