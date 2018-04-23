package yxinfo.lis.inf.dto.inst;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * 电源控制器dto
 *
 * Created by cy on 2016/12/29.
 */
public class LisPowerControllerDTO extends BaseDTO {

    //电源控制器的mac地址
    private String mac;

    private String pdid;

    private String did;

    private String pid;

    private String fname;

    private Integer type;

    private Boolean flock;

    private Boolean newConfig;

    private Long fpwd;

    private Integer id;

    private String fkey;

    private Integer fstate;

    private String extend;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getPdid() {
        return pdid;
    }

    public void setPdid(String pdid) {
        this.pdid = pdid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getFlock() {
        return flock;
    }

    public void setFlock(Boolean flock) {
        this.flock = flock;
    }

    public Boolean getNewConfig() {
        return newConfig;
    }

    public void setNewConfig(Boolean newConfig) {
        this.newConfig = newConfig;
    }

    public Long getFpwd() {
        return fpwd;
    }

    public void setFpwd(Long fpwd) {
        this.fpwd = fpwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFkey() {
        return fkey;
    }

    public void setFkey(String fkey) {
        this.fkey = fkey;
    }

    public Integer getFstate() {
        return fstate;
    }

    public void setFstate(Integer fstate) {
        this.fstate = fstate;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}
