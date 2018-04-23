package yxinfo.dct.inteface.dto.tlog;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by ZH on 2017/1/13.
 */
public class TopicLogChemDTO extends BaseDTO {

    private Integer id;

    private Integer rlogId;

    //试剂id
    private Integer chemId;

    //二维码
    private String rfFcode;

    //试剂名称
    private String chemName;

    //试剂纯度
    private String chemSpec;

    //试剂用量
    private Integer chemUsed;

    private String unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRlogId() {
        return rlogId;
    }

    public void setRlogId(Integer rlogId) {
        this.rlogId = rlogId;
    }

    public Integer getChemId() {
        return chemId;
    }

    public void setChemId(Integer chemId) {
        this.chemId = chemId;
    }

    public String getChemSpec() {
        return chemSpec;
    }

    public void setChemSpec(String chemSpec) {
        this.chemSpec = chemSpec;
    }

    public Integer getChemUsed() {
        return chemUsed;
    }

    public void setChemUsed(Integer chemUsed) {
        this.chemUsed = chemUsed;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRfFcode() {
        return rfFcode;
    }

    public void setRfFcode(String rfFcode) {
        this.rfFcode = rfFcode;
    }

    public String getChemName() {
        return chemName;
    }

    public void setChemName(String chemName) {
        this.chemName = chemName;
    }

    @Override
    public String toString() {
        return "TopicLogChemDTO{" +
                "id=" + id +
                ", rlogId=" + rlogId +
                ", chemId=" + chemId +
                ", rfFcode='" + rfFcode + '\'' +
                ", chemName='" + chemName + '\'' +
                ", chemSpec='" + chemSpec + '\'' +
                ", chemUsed='" + chemUsed + '\'' +
                '}';
    }
}
