package yxinfo.dct.inteface.service.supplies;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.supplies.SupShelvesDTO;

import java.util.List;

/**
 * Created by ZH on 2016/12/27.
 */
public interface SupShelvesService {

    /**
     * 添加库位信息
     * @param supShelvesDTO
     * @return
     */
    Integer addSupShelvesDTO (SupShelvesDTO supShelvesDTO);

    /**
     * 根据库位id删除库位信息
     * @param id
     * @return
     */
    Integer deleteSupShelvesDTO(Integer id);

    /**
     * 库位绑定二维码
     * @param supShelvesDTO
     * @return
     */
    Integer updateSupShelvesDTO (SupShelvesDTO supShelvesDTO);

    /**
     * 分页显示库位信息
     * @param queryPage
     * @return
     */
    PageDTO<List<SupShelvesDTO>> getSupShelvesDTOPageList (PageDTO<SupShelvesDTO> queryPage);

    /**
     * 耗材库存
     * @param queryPage
     * @return
     */
    PageDTO<List<SupShelvesDTO>> getSupShelvesDTOPageListForStock (PageDTO<SupShelvesDTO> queryPage);

    /**
     * 根据库位id获取库位信息
     * @param id
     * @return
     */
    SupShelvesDTO getSupShelvesDTOByKey(Integer id);

    /**
     * 通用查询（根据库位唯一属性查询库位）
     * @param supShelvesDTO
     * @return
     */
    SupShelvesDTO getSupShelvesDTO (SupShelvesDTO supShelvesDTO);

}
