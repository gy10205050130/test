package yxinfo.lis.inf.service.order;

import yxinfo.lis.inf.dto.order.judge.JudgeJudgetagDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by xww on 2016/9/9.
 */
public interface JudgeJudgeTagService {

    /**
     * 添加中间表
     *
     * @param judgeJudgetagDTO
     * @return
     */
    Integer addJudgeJudgeTag(JudgeJudgetagDTO judgeJudgetagDTO);

    /**
     * 通过标签id查询便签内容
     *
     * @param judgeId
     * @return
     */
    List<JudgeJudgetagDTO> getJudgeTagById(Integer judgeId);

    /**
     * 获取标签个数
     *
     * @param judgeJudgetagDTO
     * @return
     */
    List<Map<String,Object>> getJudgeTagNum(JudgeJudgetagDTO judgeJudgetagDTO);

}
