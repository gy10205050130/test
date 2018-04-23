package yxinfo.lis.inf.dto.tran;

import yxinfo.lis.inf.dto.BaseDTO;

public class TranChannelDTO extends BaseDTO {

    private static final long serialVersionUID = -1169212334854183779L;

    private Integer id;

    //渠道名称
    private String fname;

    //类型（1线下，2线上）
    private Short ftype;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype( Short ftype ) {
        this.ftype = ftype;
    }
}