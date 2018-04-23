package yxinfo.dct.inteface.service.chem.hw;

import yxinfo.dct.inteface.dto.chem.hw.HwRecycRecordDTO;
import yxinfo.dct.inteface.dto.chem.hw.HwStatYearDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/4.
 */
public interface HwStatYearService {

    /**
     * 增加统计
     * @param record
     */
    void addStatYear( HwRecycRecordDTO record );

    /**
     * 获取统计
     * @code 108062/108063
     * @param schData
     * @return
     */
    List<HwStatYearDTO> getStatYearList( HwStatYearDTO schData );
}
