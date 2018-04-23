package yxinfo.dct.inteface.service.chem.hw;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.hw.HwRecycRecordDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/4.
 */
public interface HwRecycRecordService {

    /**
     * 回收记录查询
     * @code 108060/108061
     * @param schPage
     * @return
     */
    PageDTO<List<HwRecycRecordDTO>> getRecycRecordPage( PageDTO<HwRecycRecordDTO> schPage );

    /**
     * 回收记录导出
     * @code 108077/108078
     * @param schData
     * @param token
     * @return
     */
    String getRecycRecordExport( HwRecycRecordDTO schData, String token );
}
