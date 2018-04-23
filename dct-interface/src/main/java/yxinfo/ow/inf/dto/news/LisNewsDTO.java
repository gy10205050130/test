package yxinfo.ow.inf.dto.news;

import yxinfo.ow.inf.context.ErrorCode;
import yxinfo.ow.inf.dto.BaseDTO;
import yxinfo.ow.inf.validation.groups.Update;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by xww on 2016/9/10.
 */
public class LisNewsDTO extends BaseDTO {

    //新闻id
    @NotNull(groups = {Update.class}, message = ErrorCode.NOT_NULL)
    private Integer id;

    //新闻标题
    @NotNull(message = ErrorCode.NOT_NULL)
    private String newsTitile;

    //新闻内容
    @NotNull(message = ErrorCode.NOT_NULL)
    private String newsContent;

    //发布时间
    private Date createAt;

    //是否显示在主页
    private Boolean homepage;

    //新闻的静态图片id
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer newsStaticId;

    //一级类别(1新闻2资料3其他)
    private Integer type;

    //点击量
    private Integer hits;

    //新闻副标题
    private String newsSubtitle;

    //二级类别(1新闻2培训3收费资料4规章资料5使用手册6其他)
    private Integer secondType;

    //组织id
    private Integer partyId;

    //下载文件名
    private String downloadName;

    //更新时间
    private Date updateAt;

    //设备管理处类型（中医药使用）
    private Integer thirdType;

    //附件集合
    private List<NewsAppendixDTO> newsAppendixDTOList;

    //根据类型查询
    private String thirdTypeQuery;

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsTitile() {
        return newsTitile;
    }

    public void setNewsTitile(String newsTitile) {
        this.newsTitile = newsTitile;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Boolean getHomepage() {
        return homepage;
    }

    public void setHomepage(Boolean homepage) {
        this.homepage = homepage;
    }

    public Integer getNewsStaticId() {
        return newsStaticId;
    }

    public void setNewsStaticId(Integer newsStaticId) {
        this.newsStaticId = newsStaticId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNewsSubtitle() {
        return newsSubtitle;
    }

    public void setNewsSubtitle(String newsSubtitle) {
        this.newsSubtitle = newsSubtitle;
    }

    public Integer getSecondType() {
        return secondType;
    }

    public void setSecondType(Integer secondType) {
        this.secondType = secondType;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getDownloadName() {
        return downloadName;
    }

    public void setDownloadName(String downloadName) {
        this.downloadName = downloadName;
    }

    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public List<NewsAppendixDTO> getNewsAppendixDTOList() {
        return newsAppendixDTOList;
    }

    public void setNewsAppendixDTOList(List<NewsAppendixDTO> newsAppendixDTOList) {
        this.newsAppendixDTOList = newsAppendixDTOList;
    }

    public String getThirdTypeQuery() {
        return thirdTypeQuery;
    }

    public void setThirdTypeQuery(String thirdTypeQuery) {
        this.thirdTypeQuery = thirdTypeQuery;
    }

    @Override
    public String toString() {
        return "LisNewsDTO{" +
                "createAt=" + createAt +
                ", id=" + id +
                ", newsTitile='" + newsTitile + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", homepage=" + homepage +
                ", newsStaticId=" + newsStaticId +
                ", type=" + type +
                ", hits=" + hits +
                ", newsSubtitle='" + newsSubtitle + '\'' +
                '}';
    }
}
