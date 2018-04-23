package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerWarehouseDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/1.
 */
public interface MerWarehouseService {

    /**
     * 根据商户id查询商户仓库
     * @param merId
     * @return
     */
    List< MerWarehouseDTO > getMerWarehouseDTOList ( Integer merId );

    /**
     * 修改商户仓库
     * @param merWarehouseDTO
     * @return
     */
    Integer updateMerWarehouseDTO ( MerWarehouseDTO merWarehouseDTO );

    /**
     * 新增商户仓库
     * @param merWarehouseDTO
     * @return
     */
    Integer addMerWarehouseDTO ( MerWarehouseDTO merWarehouseDTO );

    /**
     * 删除商户仓库
     * @param merId
     * @return
     */
    Integer deleteMerWarehouseDTOByMerId ( Integer merId );
}
