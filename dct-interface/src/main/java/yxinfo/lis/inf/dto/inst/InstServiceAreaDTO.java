package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by xww on 2016/9/14.
 */
public class InstServiceAreaDTO extends BaseDTO {

    //仪器id
    private Integer instId;

    //服务领域id
    private Integer serviceAreaId;

    //排序
    private Integer sort;

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
