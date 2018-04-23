package yxinfo.shop.inf.dto.funds;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2016/10/11.
 */
public class CwPrjsumDTO extends BaseDTO{

    //年份
    private String syear;

    //项目代码
    private String prjcode;

    //年初数
    private String lastyear;

    //借方发生数
    private String jtotal;

    //贷方发生数
    private String dtotal;

    //余额
    private String total;

    //最后更新时间
    private String lastupdDttm;

    public String getSyear() {
        return syear;
    }

    public void setSyear(String syear) {
        this.syear = syear;
    }

    public String getPrjcode() {
        return prjcode;
    }

    public void setPrjcode(String prjcode) {
        this.prjcode = prjcode;
    }

    public String getLastyear() {
        return lastyear;
    }

    public void setLastyear(String lastyear) {
        this.lastyear = lastyear;
    }

    public String getJtotal() {
        return jtotal;
    }

    public void setJtotal(String jtotal) {
        this.jtotal = jtotal;
    }

    public String getDtotal() {
        return dtotal;
    }

    public void setDtotal(String dtotal) {
        this.dtotal = dtotal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLastupdDttm() {
        return lastupdDttm;
    }

    public void setLastupdDttm(String lastupdDttm) {
        this.lastupdDttm = lastupdDttm;
    }

    @Override
    public String toString() {
        return "CwPrjsumDTO{" +
                "syear='" + syear + '\'' +
                ", prjcode='" + prjcode + '\'' +
                ", lastyear='" + lastyear + '\'' +
                ", jtotal='" + jtotal + '\'' +
                ", dtotal='" + dtotal + '\'' +
                ", total='" + total + '\'' +
                ", lastupdDttm='" + lastupdDttm + '\'' +
                '}';
    }
}
