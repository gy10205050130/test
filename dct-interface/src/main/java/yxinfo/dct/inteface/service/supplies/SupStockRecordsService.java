package yxinfo.dct.inteface.service.supplies;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.supplies.SupStockRecordsDTO;

import java.util.List;

/**
 * Created by ZH on 2016/12/28.
 */
public interface SupStockRecordsService {

    /**
     * 添加耗材入库记录
     * @param supStockRecordsDTO
     * @return
     */
    Integer addSupStockRecordsDTO (SupStockRecordsDTO supStockRecordsDTO);

    /**
     * 入库记录（分页）
     * @param queryPage
     * @return
     */
    PageDTO<List<SupStockRecordsDTO>> getSupStockRecordsDTOPageList (PageDTO<SupStockRecordsDTO> queryPage);

    /**
     * 删除入库记录
     * @param id
     * @return
     */
    Integer deleteSupStockRecordsDTO(Integer id);
}
