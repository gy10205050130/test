package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.Add;
import yxinfo.lis.inf.validation.groups.Update;

import javax.validation.constraints.NotNull;

/**
 * Created by xww on 2016/9/8.
 */
public class InstServicenumDTO extends BaseDTO {

    //仪器编号
    @NotNull(groups = {Add.class, Update.class}, message = ErrorCode.NOT_NULL)
    private String instNo;

    //服务次数
    private Integer serviceNum;

    //排序
    private Integer sort;

    //仪器得分
    private Integer score;

    //评价次数
    private Integer judgeNum;

    //平均分
    private Double avgScore;

    //版本
    private Integer version;

    //综合评分
    private Double combinedScore;

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo;
    }

    public Integer getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public Integer getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(Integer judgeNum) {
        this.judgeNum = judgeNum;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Double getCombinedScore() {
        return combinedScore;
    }

    public void setCombinedScore(Double combinedScore) {
        this.combinedScore = combinedScore;
    }
}
