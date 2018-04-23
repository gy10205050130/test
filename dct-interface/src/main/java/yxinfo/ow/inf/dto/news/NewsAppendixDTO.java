package yxinfo.ow.inf.dto.news;

import yxinfo.ow.inf.dto.BaseDTO;

import java.util.Date;

/**
 * Created by cy on 2017/2/17.
 */
public class NewsAppendixDTO extends BaseDTO {

    private Integer id;

    //新闻id
    private Integer newsId;

    //静态资源id
    private Integer staticId;

    //文件后缀类型
    private Integer suffixType;

    //附件名称
    private String appendixName;

    //创建时间
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    public Integer getSuffixType() {
        return suffixType;
    }

    public void setSuffixType(Integer suffixType) {
        this.suffixType = suffixType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getAppendixName() {
        return appendixName;
    }

    public void setAppendixName(String appendixName) {
        this.appendixName = appendixName;
    }
}
