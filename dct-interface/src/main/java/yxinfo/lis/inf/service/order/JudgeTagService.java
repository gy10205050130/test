package yxinfo.lis.inf.service.order;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.order.InstOrderDTO;
import yxinfo.lis.inf.dto.order.judge.JudgeDTO;
import yxinfo.lis.inf.dto.order.judge.JudgetagDTO;

import java.util.List;

/**
 * Created by xww on 2016/9/9.
 */
public interface JudgeTagService {


    /**
     * 查询标签
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<JudgetagDTO>> searchJudgeTag(PageDTO<JudgetagDTO> pageQuery);

    /**
     * 通过标签id查询便签内容
     *
     * @param judgeTagId
     * @return
     */
    JudgetagDTO getJudgeTagById(Integer judgeTagId);

}
