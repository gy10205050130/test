package yxinfo.dct.inteface.service.chem.tv;

import yxinfo.dct.inteface.dto.chem.tv.TvSummaryDTO;

/**
 * Created by dy on 2016/12/16.
 */
public interface ChemTvService {

    /**
     * 获取TV展示总览
     * @code 108076
     * @param orgId
     * @return
     */
    TvSummaryDTO getSummary( Integer orgId );
}
