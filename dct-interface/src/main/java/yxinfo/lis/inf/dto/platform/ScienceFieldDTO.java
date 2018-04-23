package yxinfo.lis.inf.dto.platform;

import yxinfo.lis.inf.dto.BaseDTO;

/**
 * 科学领域dto
 *
 * Created by cy on 2016/10/21.
 */
public class ScienceFieldDTO extends BaseDTO {

    private Integer id;

    /**
     * 编码
     */
    private Integer code;

    /**
     * 科学领域
     */
    private String scienceField;

    public ScienceFieldDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScienceField() {
        return scienceField;
    }

    public void setScienceField(String scienceField) {
        this.scienceField = scienceField;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ScienceFieldDTO{" +
                "id=" + id +
                ", code=" + code +
                ", scienceField='" + scienceField + '\'' +
                '}';
    }
}
