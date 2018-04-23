package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerMajorDTO;

/**
 * Created by ZH on 2016/8/1.
 */
public interface MerMajorService {

    /**
     * 根据商户id获取商户主营
     * @param merId
     * @return
     */
    MerMajorDTO getMerMajorDTOByKey ( Integer merId );

    /**
     *  添加商户主营
     * @param merMajorDTO
     * @return
     */
    Integer addMerMajorDTO ( MerMajorDTO merMajorDTO );

    /**
     * 更新商户主营
     * @param merMajorDTO
     * @return
     */
    Integer updateMerMajorDTO ( MerMajorDTO merMajorDTO );

    /**
     * 删除商户主营
     * @param merId
     * @return
     */
    Integer deleteMerMajorDTO ( Integer merId );
}
