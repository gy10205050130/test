package yxinfo.dct.inteface.dto.set;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class SetCoreDTO extends BaseDTO {

    private static final long serialVersionUID = 3481796681328753659L;

    // 设置key
    private String fkey;

    // 组织id
    private Integer orgId;

    private String val;

    private Date createAt;

    private Date updateAt;

    // 设置人成员id
    private Integer setMemberId;

    public String getFkey() {
        return fkey;
    }

    public void setFkey( String fkey ) {
        this.fkey = fkey;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getVal() {
        return val;
    }

    public void setVal( String val ) {
        this.val = val;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public Integer getSetMemberId() {
        return setMemberId;
    }

    public void setSetMemberId( Integer setMemberId ) {
        this.setMemberId = setMemberId;
    }
}