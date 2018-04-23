package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/11.
 */
public class MerQualAuthDTO extends BaseDTO {

    private Integer qualId;

    private Integer authId;

    private MerQualDTO merQualDTO;

    public Integer getQualId() {
        return qualId;
    }

    public void setQualId(Integer qualId) {
        this.qualId = qualId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public MerQualDTO getMerQualDTO() {
        return merQualDTO;
    }

    public void setMerQualDTO(MerQualDTO merQualDTO) {
        this.merQualDTO = merQualDTO;
    }

    @Override
    public String toString() {
        return "MerQualAuthDTO{" +
                "qualId=" + qualId +
                ", authId=" + authId +
                ", merQualDTO=" + merQualDTO +
                '}';
    }
}
