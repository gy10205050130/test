package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by xww on 2016/10/21.
 */
public class InstScienceFieldDTO extends BaseDTO{

    private Integer id;

    //仪器id
    private Integer instId;

    //学科领域id
    private Integer scienceFieldId;

    //学科领域名称
    private String scienceField;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public Integer getScienceFieldId() {
        return scienceFieldId;
    }

    public void setScienceFieldId(Integer scienceFieldId) {
        this.scienceFieldId = scienceFieldId;
    }

    public String getScienceField() {
        return scienceField;
    }

    public void setScienceField(String scienceField) {
        this.scienceField = scienceField;
    }

}
