package yxinfo.dct.inteface.service.chem.hw;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.hw.HwRecycWaitDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/3.
 */
public interface HwRecycWaitService {

    /**
     * 提醒回收危废
     * @code 108054
     * @param bucketId
     * @param memberId
     */
    void remindRecycByBucket( Integer bucketId, Integer memberId );

    /**
     * 分页查询待回收危废
     * @code 108056
     * @param schPage
     * @return
     */
    PageDTO<List<HwRecycWaitDTO>> getHwRecycWaitPage( PageDTO<HwRecycWaitDTO> schPage );
}
