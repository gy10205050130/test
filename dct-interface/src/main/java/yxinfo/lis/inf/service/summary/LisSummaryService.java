package yxinfo.lis.inf.service.summary;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.summary.InstSummaryInfoDTO;
import yxinfo.lis.inf.dto.summary.InstUseSummaryDTO;

import java.util.List;

/**
 * 大仪订单汇总服务
 *
 * Created by cy on 2016/10/28.
 */
public interface LisSummaryService {

    /**
     * 获取仪器使用信息汇总
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<InstUseSummaryDTO>> getPageInstUseSummaryList(PageDTO<InstUseSummaryDTO> queryPage);

    /**
     * 获取首页中仪器使用信息汇总记录
     *
     * @param instUseSummaryDTO
     * @return
     */
    List<InstSummaryInfoDTO> getHomePageInstUseSummaryList(InstUseSummaryDTO instUseSummaryDTO);

    /**
     * 条件获取仪器使用的汇总信息（根据年份或是月份得到仪器的使用情况排行）
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<InstUseSummaryDTO>> getPageSummarySortList(PageDTO<InstUseSummaryDTO> queryPage);
}
