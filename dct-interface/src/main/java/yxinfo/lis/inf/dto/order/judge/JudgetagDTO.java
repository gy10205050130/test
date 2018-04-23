package yxinfo.lis.inf.dto.order.judge;

import yxinfo.lis.inf.dto.BaseDTO;

public class JudgetagDTO extends BaseDTO {

    //标签id
    private Integer id;

    //标签内容
    private String tagContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent == null ? null : tagContent.trim();
    }
}