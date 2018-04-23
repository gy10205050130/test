package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.mer.MerGoodsCatDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public interface MerGoodsCatService {

    /**
     * 根据使用方id,商品分类id 获取所有的商户
     * @param queryPage
     * @return
     */
    PageDTO<List<MerGoodsCatDTO>> getMerGoodsCatDTOList ( PageDTO<MerGoodsCatDTO> queryPage );

    /**
     * 根据商户Id,使用方id 获取所有的分类
     * @param merGoodsCatDTO
     * @return
     */
    List<MerGoodsCatDTO> getMerGoodsCatDTOList ( MerGoodsCatDTO merGoodsCatDTO );

    /**
     * 根据商户Id,使用方id 获取所有的分类(仅返回大类)
     * @param merGoodsCatDTO
     * @return
     */
    List<MerGoodsCatDTO> getMerGoodsCatDTOListForHome ( MerGoodsCatDTO merGoodsCatDTO );

    /**
     * 判断该商户的产品分类是否是使用方的合作分类
     * @param partyId
     * @param merId
     * @param catId
     * @return
     */
    Boolean checkMerGoodsCat(Integer partyId, Integer merId , Integer catId);

    /**
     * 商户适用方合作分类
     * @param merGoodsCatDTO
     * @return
     */
    Integer addMerGoodsCatDTO ( MerGoodsCatDTO merGoodsCatDTO );

    /**
     * 根据商户id,使用方id删除商户使用方合作分类
     * @param merId
     * @return
     */
    Integer deleteMerGoodsCatDTOByMerId ( Integer merId  );

    /**
     * 根据商户Id查询所有平台
     * @param merId
     * @return
     */
    List<MerGoodsCatDTO> getMerGoodsCatDTOListByMerId ( Integer merId );
}
