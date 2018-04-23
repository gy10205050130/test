package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerQualAuthDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/11.
 */
public interface MerQualAuthService {

    /**
     * 根据认证记录id获取所有的认证资质
     * @param authId
     * @return
     */
    List<MerQualAuthDTO> getMerQualAuthDTOList ( Integer authId );

    /**
     * 添加商户认证记录关系表
     * @param merQualAuthDTO
     * @return
     */
    Integer addMerQualAuthDTO ( MerQualAuthDTO merQualAuthDTO );
}
