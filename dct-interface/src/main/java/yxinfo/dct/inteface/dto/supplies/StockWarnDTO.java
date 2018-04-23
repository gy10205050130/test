package yxinfo.dct.inteface.dto.supplies;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2017/1/19.
 */
public class StockWarnDTO extends BaseDTO {

    private Integer id;

    private Integer orgId;

    //类型
    private String ftype;

    //来源id
    private Integer sourceId;

    //名称
    private String fname;

    //cas
    private String cas;

    //规格
    private String spec;

    //日期
    private Date fdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    @Override
    public String toString() {
        return "StockWarnDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", ftype='" + ftype + '\'' +
                ", sourceId=" + sourceId +
                ", fname='" + fname + '\'' +
                ", cas='" + cas + '\'' +
                ", spec='" + spec + '\'' +
                ", fdate=" + fdate +
                '}';
    }
}
