package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/8/5.
 */
public class MerQualResDTO extends BaseDTO {

    private Integer id;

    //资质id
    private Integer qualId;

    //资料key
    private Short fkey;

    //静态资源id
    private Integer staticId;

    //内容
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQualId() {
        return qualId;
    }

    public void setQualId(Integer qualId) {
        this.qualId = qualId;
    }

    public Short getFkey() {
        return fkey;
    }

    public void setFkey(Short fkey) {
        this.fkey = fkey;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MerQualResDTO{" +
                "id=" + id +
                ", qualId=" + qualId +
                ", fkey=" + fkey +
                ", staticId=" + staticId +
                ", content='" + content + '\'' +
                '}';
    }
}
