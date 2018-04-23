package yxinfo.dct.inteface.service.supplies;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.supplies.SupShelvesDTO;
import yxinfo.dct.inteface.dto.supplies.SupStockDTO;

import java.util.List;

/**
 * Created by ZH on 2016/12/28.
 */
public interface SupStockService {

    /**
     * 添加耗材库存
     * @param supStockDTO
     * @return
     */
    Integer addSupStockDTO(SupStockDTO supStockDTO);

    /**
     * 根据二维码获取耗材库存
     * @param supStockDTO
     * @return
     */
    List<SupStockDTO> getSupStockDTOListByRfid (SupStockDTO supStockDTO);

    /**
     * 领用耗材
     * @return supStockDTO
     */
    Integer updateSupStockDTO (SupStockDTO supStockDTO) ;

    /**
     * 根据耗材名称获取耗材库存
     * @param queryPage
     * @return
     */
    PageDTO<List<SupStockDTO>> getSupStockDTOPageList (PageDTO<SupStockDTO> queryPage);

    /**
     * 根据库位id获取库存信息
     * @param supStockDTO
     * @return
     */
    List<SupStockDTO> getSupStockDTOList (SupStockDTO supStockDTO);

    /**
     * 根据唯一索引获取库存信息（加锁）
     * @param supStockDTO
     * @return
     */
    SupStockDTO getSupStockDTOForUpdate (SupStockDTO supStockDTO);

    /**
     * 操作库存
     * @param supStockDTO
     * @param flag 1加库存  2减库存 3删除库存
     * @return
     */
    Integer updateStockNum (SupStockDTO supStockDTO, Integer flag);

    /**
     * 通用查询
     * @param supStockDTO
     * @return
     */
    SupStockDTO getSupStockDTO (SupStockDTO supStockDTO);


    /**
     * 库存管理（分页）
     * @param queryPage
     * @return
     */
    PageDTO<List<SupShelvesDTO>> getSupShelvesDTOPageList (PageDTO<SupStockDTO> queryPage);
}
