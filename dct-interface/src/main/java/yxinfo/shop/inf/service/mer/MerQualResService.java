package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerQualResDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/5.
 */
public interface MerQualResService {

    /**
     * 根据id获取商户资质资料
     * @param id
     * @return
     */
    MerQualResDTO getMerQualResDTOByKey ( Integer id );

    /**
     * 根据资质id获取商户资质资料
     * @param qualId
     * @return
     */
    List<MerQualResDTO> getMerQualResDTOList ( Integer qualId );

    /**
     * 更新商户资质资料
     * @param merQualResDTO
     * @return
     */
    Integer updateMerQualResDTOByKey ( MerQualResDTO merQualResDTO );

    /**
     * 添加商户资质资料
     * @param merQualResDTO
     * @return
     */
    Integer addMerQualResDTO ( MerQualResDTO merQualResDTO );

    /**
     * 删除商户资质资料
     * @param id
     * @return
     */
    Integer deleteMerQualResDTOByKey ( Integer id );
}
