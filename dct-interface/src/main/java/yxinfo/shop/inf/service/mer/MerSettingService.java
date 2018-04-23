package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerSettingDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public interface MerSettingService {

    /**
     * 根据商户id获取商户设置
     * @param merId
     * @return
     */
    List< MerSettingDTO > getMerSettingDTOList( Integer merId);

    /**
     * 更新商户设置
     * @param merSettingDTO
     * @return
     */
    Integer updateMerSettingDTO ( MerSettingDTO merSettingDTO );

    /**
     * 添加商户设置
     * @param merSettingDTO
     * @return
     */
    Integer addMerSettingDTO ( MerSettingDTO merSettingDTO );

    /**
     * 删除商户设置
     * @param id
     * @return
     */
    Integer deleteMerSettingDTO ( Integer id );
}
