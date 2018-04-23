package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by ZH on 2016/8/1.
 */
public class MerQualDTO extends BaseDTO {

    private Integer id;

    //商户id
    private Integer merId;

    //资质项目
    private Short item;

    //认证状态（1待认证，2认证成功，3认证失败）
    private Short authStatus;

    //创建时间
    private Date createAt;

    //更新时间
    private Date updateAt;

    //到期时间
    private Date expireAt;

    private List<MerQualResDTO> merQualResDTOList;

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

    public Short getItem() {
        return item;
    }

    public void setItem(Short item) {
        this.item = item;
    }

    public Short getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Short authStatus) {
        this.authStatus = authStatus;
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

    public Date getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    public List<MerQualResDTO> getMerQualResDTOList() {
        return merQualResDTOList;
    }

    public void setMerQualResDTOList(List<MerQualResDTO> merQualResDTOList) {
        this.merQualResDTOList = merQualResDTOList;
    }

    @Override
    public String toString() {
        return "MerQualDTO{" +
                "id=" + id +
                ", merId=" + merId +
                ", item=" + item +
                ", authStatus=" + authStatus +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", expireAt=" + expireAt +
                ", merQualResDTOList=" + merQualResDTOList +
                '}';
    }
}
