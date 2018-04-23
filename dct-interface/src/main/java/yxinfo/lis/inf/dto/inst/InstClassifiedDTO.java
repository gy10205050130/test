package yxinfo.lis.inf.dto.inst;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * 仪器分类
 *
 * Created by cy on 2016/10/24.
 */
public class InstClassifiedDTO extends BaseDTO {

    //仪器分类编号id
    private Integer id;

    //仪器分类代码
    private String code;

    //仪器分类名称
    private String classifiedName;

    //查询仪器类别的类型（1 大类 2中类 3小类）
    private Integer classifiedType;

    private List<InstClassifiedDTO> instClassifiedDTOList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassifiedName() {
        return classifiedName;
    }

    public void setClassifiedName(String classifiedName) {
        this.classifiedName = classifiedName;
    }

    public Integer getClassifiedType() {
        return classifiedType;
    }

    public void setClassifiedType(Integer classifiedType) {
        this.classifiedType = classifiedType;
    }

    public List<InstClassifiedDTO> getInstClassifiedDTOList() {
        return instClassifiedDTOList;
    }

    public void setInstClassifiedDTOList(List<InstClassifiedDTO> instClassifiedDTOList) {
        this.instClassifiedDTOList = instClassifiedDTOList;
    }

    @Override
    public String toString() {
        return "InstClassifiedDTO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", classifiedName='" + classifiedName + '\'' +
                ", classifiedType=" + classifiedType +
                ", instClassifiedDTOList=" + instClassifiedDTOList +
                '}';
    }
}
