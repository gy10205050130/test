package yxinfo.shop.inf.service.dct.tv;

import yxinfo.shop.inf.dto.dct.tv.TranTvSummaryDTO;

/**
 * 元欣追溯TV版服务
 * Created by dy on 2016/12/20.
 */
public interface TranTvService {

    /**
     * 获取TV总览
     * @code 100044
     * @param orgId
     * @return
     */
    TranTvSummaryDTO getSummary( Integer orgId );
}
