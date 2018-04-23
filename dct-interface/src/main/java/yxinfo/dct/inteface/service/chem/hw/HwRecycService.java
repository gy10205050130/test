package yxinfo.dct.inteface.service.chem.hw;

import yxinfo.dct.inteface.dto.chem.hw.HwRecycRecordDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/4.
 */
public interface HwRecycService {

    /**
     * 废液回收
     * @code 108058
     * @param hwRecycRecord
     */
    void recycLiquid( HwRecycRecordDTO hwRecycRecord );

    /**
     * 空瓶回收
     * @code 108059
     * @param hwRecycRecord
     * @return
     */
    List<String> recycBottle( HwRecycRecordDTO hwRecycRecord );
}
