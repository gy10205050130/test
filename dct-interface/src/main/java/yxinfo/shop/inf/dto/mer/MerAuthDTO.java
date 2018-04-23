package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/8/11.
 */
public class MerAuthDTO extends BaseDTO {

    private Integer id;

    //商户id
    private Integer merId;

    //认证状态（1待认证，2认证成功，3认证失败）
    private Short authStatus;

    //审核人成员id
    private Integer authMbrId;

    //审核人姓名
    private String authMbr;

    //审核意见
    private String opinion;

    //创建时间
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Short getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Short authStatus) {
        this.authStatus = authStatus;
    }

    public Integer getAuthMbrId() {
        return authMbrId;
    }

    public void setAuthMbrId(Integer authMbrId) {
        this.authMbrId = authMbrId;
    }

    public String getAuthMbr() {
        return authMbr;
    }

    public void setAuthMbr(String authMbr) {
        this.authMbr = authMbr;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "MerAuthDTO{" +
                "id=" + id +
                ", merId=" + merId +
                ", authStatus=" + authStatus +
                ", authMbrId=" + authMbrId +
                ", authMbr='" + authMbr + '\'' +
                ", opinion='" + opinion + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
