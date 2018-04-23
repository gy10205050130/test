package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.dto.BaseDTO;

import java.util.List;


/**
 * Created by xww on 2016/10/10.
 */
public class InstBindleDTO extends BaseDTO {

    //仪器id
    private Integer instId;
    //设备类型（1电源2控制器3ipad）
    private Short type;
    //Mac地址
    private String mac;
    //IP地址
    private String ip;
    //设备仪器列表
    private List<InstBindleDTO> instBindleDTOList;

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<InstBindleDTO> getInstBindleDTOList() {
        return instBindleDTOList;
    }

    public void setInstBindleDTOList(List<InstBindleDTO> instBindleDTOList) {
        this.instBindleDTOList = instBindleDTOList;
    }
}
