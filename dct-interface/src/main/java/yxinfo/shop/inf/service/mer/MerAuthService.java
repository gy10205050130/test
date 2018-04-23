package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerAuthDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/11.
 */
public interface MerAuthService {

    /**
     * 添加商户认证记录
     * @param merAuthDTO
     * @return
     */
    Integer addMerAuthDTO ( MerAuthDTO merAuthDTO );

    /**
     * 根据商户id  获取最后一条商户认证记录
     * @param merId
     * @return
     */
    MerAuthDTO getLastMerAuthDTOByMerId ( Integer merId );

}
