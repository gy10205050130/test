package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.dto.BaseDTO;

import java.util.Date;

/**
 * Created by xww on 2016/10/12.
 */
public class InstCollectionDTO extends BaseDTO {

    //收藏id
    private Integer id;

    //人员id
    private Integer mbrId;

    //仪器id
    private Integer instId;

    //是否取消(0未取消收藏,1已取消收藏)
    private Boolean isCancel;

    //收藏时间
    private Date collectionTime;

    //仪器信息
    private InstInstrumentDTO instInstrumentDTO;

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

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

    public Boolean getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Boolean cancel) {
        isCancel = cancel;
    }

    public Integer getMbrId() {
        return mbrId;
    }

    public void setMbrId(Integer mbrId) {
        this.mbrId = mbrId;
    }

    public InstInstrumentDTO getInstInstrumentDTO() {
        return instInstrumentDTO;
    }

    public void setInstInstrumentDTO(InstInstrumentDTO instInstrumentDTO) {
        this.instInstrumentDTO = instInstrumentDTO;
    }
}
