package yxinfo.dct.inteface.dto.supplies;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2016/12/27.
 */
public class SupShelvesDTO extends BaseDTO {

    private Integer id;

    private Integer orgId;

    //库位名称
    private String sheFname;

    //二维码
    private String rfidCode;

    /**-------------以下为扩展字段-----------------**/
    //耗材库存信息
    private List<SupStockDTO> supStockDTOs;

    private String supFname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSheFname() {
        return sheFname;
    }

    public void setSheFname(String sheFname) {
        this.sheFname = sheFname;
    }

    public String getRfidCode() {
        return rfidCode;
    }

    public void setRfidCode(String rfidCode) {
        this.rfidCode = rfidCode;
    }

    public List<SupStockDTO> getSupStockDTOs() {
        return supStockDTOs;
    }

    public void setSupStockDTOs(List<SupStockDTO> supStockDTOs) {
        this.supStockDTOs = supStockDTOs;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getSupFname() {
        return supFname;
    }

    public void setSupFname(String supFname) {
        this.supFname = supFname;
    }

    @Override
    public String toString() {
        return "SupShelvesDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", sheFname='" + sheFname + '\'' +
                ", rfidCode='" + rfidCode + '\'' +
                ", supStockDTOs=" + supStockDTOs +
                ", supFname='" + supFname + '\'' +
                '}';
    }
}
