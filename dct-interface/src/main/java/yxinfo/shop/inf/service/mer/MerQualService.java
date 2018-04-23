package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerQualDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/1.
 */
public interface MerQualService {

    /**
     * 根据商户id获取商户资质
     * @param merId
     * @return
     */
    List<MerQualDTO> getMerQualDTOList ( Integer merId );

    /**
     * 添加商户资质
     * @param merQualDTO
     * @return
     */
    Integer addMerQualDTO ( MerQualDTO merQualDTO );

    /**
     * 更新商户资质
     * @param merQualDTO
     * @return
     */
    Integer updateMerQualDTO ( MerQualDTO merQualDTO );

    /**
     * 删除商户资质
     * @param id
     * @return
     */
    Integer deleteMerQualDTO ( Integer id );

    /**
     * 根据资质id获取资质信息
     * @param id
     * @return
     */
    MerQualDTO getMerQualDTOByKey ( Integer id );
}
