package yxinfo.lis.inf.dto.order.judge;

import yxinfo.lis.inf.dto.BaseDTO;

public class JudgeJudgetagDTO extends BaseDTO {

    //评价id
    private Integer judgeId;

    //评价标签id
    private Integer judgetagId;

    //仪器id
    private Integer instId;

    public Integer getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public Integer getJudgetagId() {
        return judgetagId;
    }

    public void setJudgetagId(Integer judgetagId) {
        this.judgetagId = judgetagId;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

}