package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerCoreDTO;
import yxinfo.shop.inf.dto.mer.MerMaterialDTO;

/**
 * Created by ZH on 2016/8/11.
 */
public interface MerMaterialService {

    /**
     * 保存商户认证资料
     * @param merMaterialDTO
     * @return
     */
    MerCoreDTO addMerMaterialDTO (MerMaterialDTO merMaterialDTO );

    /**
     * 修改商户认证资料
     * @param merMaterialDTO
     * @return
     */
    Integer updateMerMaterialDTO ( MerMaterialDTO merMaterialDTO );

    /**
     * 获取商户认证资料
     * @param merId
     * @return
     */
    MerMaterialDTO getMerMaterialDTO ( Integer merId );

    /**
     * 保存或修改商户仓库
     * @param merMaterialDTO
     * @return
     */
    Integer saveOrUpdateMerWarehouseDTO ( MerMaterialDTO merMaterialDTO );
}
