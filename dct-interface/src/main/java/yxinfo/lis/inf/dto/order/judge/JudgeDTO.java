package yxinfo.lis.inf.dto.order.judge;

import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.inst.InstServicenumDTO;
import yxinfo.lis.inf.dto.order.InstOrderDTO;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class JudgeDTO extends BaseDTO {
    //评论id
    private Integer id;

    //星级
    private Short starLevel;

    //评价内容
    private String judgeContent;

    //分数
    private Integer score;

    //订单id
    private Integer orderId;

    //仪器id
    private Integer instId;

    //评价时间
    private Date createAt;

    //评价和标签对照标签
    private List<JudgeJudgetagDTO> judgeJudgetagDTOList;

    //标签内容
    private List<JudgetagDTO> judgetagDTOList;

    //获取订单信息
    private InstOrderDTO instOrderDTO;

    //获取服务次数信息
    private InstServicenumDTO instServicenumDTO;

    //评价标签个数
    private List<Map<String, Object>> judgeTagNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Short starLevel) {
        this.starLevel = starLevel;
    }

    public String getJudgeContent() {
        return judgeContent;
    }

    public void setJudgeContent(String judgeContent) {
        this.judgeContent = judgeContent == null ? null : judgeContent.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<JudgeJudgetagDTO> getJudgeJudgetagDTOList() {
        return judgeJudgetagDTOList;
    }

    public void setJudgeJudgetagDTOList(List<JudgeJudgetagDTO> judgeJudgetagDTOList) {
        this.judgeJudgetagDTOList = judgeJudgetagDTOList;
    }

    public List<JudgetagDTO> getJudgetagDTOList() {
        return judgetagDTOList;
    }

    public void setJudgetagDTOList(List<JudgetagDTO> judgetagDTOList) {
        this.judgetagDTOList = judgetagDTOList;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public InstOrderDTO getInstOrderDTO() {
        return instOrderDTO;
    }

    public void setInstOrderDTO(InstOrderDTO instOrderDTO) {
        this.instOrderDTO = instOrderDTO;
    }

    public InstServicenumDTO getInstServicenumDTO() {
        return instServicenumDTO;
    }

    public void setInstServicenumDTO(InstServicenumDTO instServicenumDTO) {
        this.instServicenumDTO = instServicenumDTO;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<Map<String, Object>> getJudgeTagNum() {
        return judgeTagNum;
    }

    public void setJudgeTagNum(List<Map<String, Object>> judgeTagNum) {
        this.judgeTagNum = judgeTagNum;
    }

    @Override
    public String toString() {
        return "JudgeDTO{" +
                "createAt=" + createAt +
                ", id=" + id +
                ", starLevel=" + starLevel +
                ", judgeContent='" + judgeContent + '\'' +
                ", score=" + score +
                ", orderId=" + orderId +
                ", instId=" + instId +
                ", judgeJudgetagDTOList=" + judgeJudgetagDTOList +
                ", judgetagDTOList=" + judgetagDTOList +
                ", instOrderDTO=" + instOrderDTO +
                ", instServicenumDTO=" + instServicenumDTO +
                '}';
    }
}