package yxinfo.lis.inf.service.order;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.order.judge.JudgeDTO;

import java.util.List;

/**
 * Created by xww on 2016/9/9.
 */
public interface JudgeService {

    /**
     * 添加评论
     *
     * @param judgeDTO
     * @return
     */
    JudgeDTO addJudge(JudgeDTO judgeDTO);

    /**
     * 通过标签orderId查询便签内容
     *
     * @param orderId
     * @return
     */
    JudgeDTO getJudgeById(Integer orderId);

    /**
     * 通过标签instId查询便签内容
     *
     * @param instId
     * @return
     */
    List<JudgeDTO> getJudgeByInstId(Integer instId);

    /**
     * 获取仪器评价信息
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<JudgeDTO>> getJudgeList(PageDTO<JudgeDTO> pageQuery);

}
