package yxinfo.dct.inteface.service.supplies;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.supplies.SupReceiveDTO;
import yxinfo.dct.inteface.dto.supplies.SupStockDTO;

import java.util.List;

/**
 * Created by ZH on 2016/12/30.
 */
public interface SupReceiveService {

    /**
     * 添加领用记录
     * @param supStockDTO
     * @return
     */
    Integer addSupReceive (SupStockDTO supStockDTO) ;

    /**
     * 分页查询领用记录
     * @param queryPage
     * @return
     */
    PageDTO<List< SupReceiveDTO >> getSupReceiveDTOPageList (PageDTO<SupReceiveDTO> queryPage);
}
