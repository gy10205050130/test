package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by xww on 2016/11/8.
 */
public class InstMemberDTO extends BaseDTO {

    //仪器负责人id
    private Integer id;

    //仪器id
    private Integer instId;

    //责任人id
    private Integer memberId;

    //排序
    private Integer sort;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
