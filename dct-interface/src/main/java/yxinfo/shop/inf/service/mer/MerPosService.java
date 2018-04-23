package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerPosDTO;

/**
 * Created by ZH on 2016/8/1.
 */
public interface MerPosService {

    /**
     * 根据商户id获取商户地址
     * @param merId
     * @return
     */
    MerPosDTO getMerPosDTOByKey( Integer merId );

    /**
     * 修改商户地址
     * @param merPosDTO
     * @return
     */
    Integer updateMerPosDTO( MerPosDTO merPosDTO );

    /**
     * 添加商户地址
     * @param merPosDTO
     * @return
     */
    Integer addMerPosDTO( MerPosDTO merPosDTO );

    /**
     * 删除商户地址
     * @param id
     * @return
     */
    Integer deleteMerPosDTO ( Integer id );
}
