package yxinfo.dct.inteface.dto.tlog;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by ZH on 2017/1/13.
 */
public class TopicLogPicDTO extends BaseDTO {

    private Integer id;

    private Integer rlogId;

    //静态资源id, <FK>res_static.id
    private Integer staticId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRlogId() {
        return rlogId;
    }

    public void setRlogId(Integer rlogId) {
        this.rlogId = rlogId;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    @Override
    public String toString() {
        return "TopicLogPicDTO{" +
                "id=" + id +
                ", rlogId=" + rlogId +
                ", staticId=" + staticId +
                '}';
    }
}
