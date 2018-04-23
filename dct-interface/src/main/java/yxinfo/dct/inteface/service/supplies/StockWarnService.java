package yxinfo.dct.inteface.service.supplies;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.supplies.StockWarnDTO;
import yxinfo.dct.inteface.dto.supplies.WarnDTO;

import java.util.List;

/**
 * Created by ZH on 2017/1/19.
 */
public interface StockWarnService {

    /**
     * 添加库存提醒
     * @param stockWarnDTO
     * @return
     */
    Integer addStockWarnDTO( StockWarnDTO stockWarnDTO );

    /**
     * 查询库存用完提醒
     * @param stockWarnDTO
     * @return
     */
    List<StockWarnDTO> getStockWarnDTOList (StockWarnDTO stockWarnDTO);

    /**
     * 分页查询库存用完提醒
     * @param queryPage
     * @return
     */
    PageDTO<List<WarnDTO>> getStockWarnDTOPageList (PageDTO<StockWarnDTO> queryPage);
}
