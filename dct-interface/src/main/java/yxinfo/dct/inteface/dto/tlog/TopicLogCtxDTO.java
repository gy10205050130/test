package yxinfo.dct.inteface.dto.tlog;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by ZH on 2017/1/13.
 */
public class TopicLogCtxDTO extends BaseDTO {

    private Integer rlogId;

    //内容
    private String context;

    public Integer getRlogId() {
        return rlogId;
    }

    public void setRlogId(Integer rlogId) {
        this.rlogId = rlogId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
