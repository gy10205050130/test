package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 分类对应的属性
 *
 * Created by cy on 2016/8/9.
 */
public class GoodsCatPropDTO extends BaseDTO {

    private Integer catId;

    private Integer propId;

    private Short sort;

    //是否用作搜索条件
    private Boolean isSch;

    //是否用作排序条件
    private Boolean isSort;
    //名称
    private String fname;

    //字段名称
    private String filedName;

    //输入模式（1手动输入，2单选，3复选）
    private Short inputMode;

    //备注
    private String remark;

    public GoodsCatPropDTO() {
    }

    public GoodsCatPropDTO(Integer catId, Integer propId, Short sort, Boolean isSch, Boolean isSort, String fname, String filedName, Short inputMode, String remark) {
        this.catId = catId;
        this.propId = propId;
        this.sort = sort;
        this.isSch = isSch;
        this.isSort = isSort;
        this.fname = fname;
        this.filedName = filedName;
        this.inputMode = inputMode;
        this.remark = remark;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Boolean getIsSch() {
        return isSch;
    }

    public void setIsSch(Boolean sch) {
        isSch = sch;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFiledName() {
        return filedName;
    }

    public void setFiledName(String filedName) {
        this.filedName = filedName;
    }

    public Short getInputMode() {
        return inputMode;
    }

    public void setInputMode(Short inputMode) {
        this.inputMode = inputMode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setIsSort(Boolean sort) {
        isSort = sort;
    }

    public Boolean getIsSort() {
        return isSort;
    }

    @Override
    public String toString() {
        return "GoodsCatPropDTO{" +
                "catId=" + catId +
                ", propId=" + propId +
                ", sort=" + sort +
                ", isSch=" + isSch +
                ", isSort=" + isSort +
                ", fname='" + fname + '\'' +
                ", filedName='" + filedName + '\'' +
                ", inputMode=" + inputMode +
                ", remark='" + remark + '\'' +
                '}';
    }
}
