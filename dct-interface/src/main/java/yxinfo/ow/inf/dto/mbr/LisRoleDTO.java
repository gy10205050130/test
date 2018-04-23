package yxinfo.ow.inf.dto.mbr;


import yxinfo.ow.inf.dto.BaseDTO;

import java.util.Date;

/**
 * 角色dto
 *
 * Created by cy on 2016/9/8.
 */
public class LisRoleDTO extends BaseDTO {

    private Integer id;

    //名称
    private String fname;

    //备注
    private String remark;

    //所属单位id
    private Integer partyId;

    //创建时间
    private Date createAt;

    //更新时间
    private Date updateAt;

    //是否被删除（1是, 0否）
    private Boolean isDel;

    private Integer sort;

    //人员id
    private Integer memberId;

    //角色id串用逗号分开
    private String lisRoleIds;

    //修改人的id
    private Integer currentMemberId;
    public LisRoleDTO() {
    }

    public LisRoleDTO(Integer id, String fname, String remark, Integer partyId, Date createAt, Date updateAt, Boolean isDel, Integer sort, Integer memberId, String lisRoleIds) {
        this.id = id;
        this.fname = fname;
        this.remark = remark;
        this.partyId = partyId;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.isDel = isDel;
        this.sort = sort;
        this.memberId = memberId;
        this.lisRoleIds = lisRoleIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getLisRoleIds() {
        return lisRoleIds;
    }

    public void setLisRoleIds(String lisRoleIds) {
        this.lisRoleIds = lisRoleIds;
    }

    public Integer getCurrentMemberId() {
        return currentMemberId;
    }

    public void setCurrentMemberId(Integer currentMemberId) {
        this.currentMemberId = currentMemberId;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", remark='" + remark + '\'' +
                ", orgId=" + partyId +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", isDel=" + isDel +
                ", sort=" + sort +
                '}';
    }
}
