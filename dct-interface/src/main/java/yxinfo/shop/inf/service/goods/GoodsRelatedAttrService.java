package yxinfo.shop.inf.service.goods;

import yxinfo.shop.inf.dto.goods.*;

import java.util.List;

/**
 * 与商品相关联的属性service
 *
 * Created by cy on 2016/8/1.
 */
public interface GoodsRelatedAttrService {

    /**
     * 获取采购类目(首页展示，分yx和party)
     *
     * @param goodsCatDTO
     * @return
     */
    List<GoodsCatDTO> getGoodsCatDtoList(GoodsCatDTO goodsCatDTO);

    /**
     * 根据分类id获取属性列表
     *
     * @param goodsCatPropDTO
     * @return
     */
    List<GoodsCatPropDTO> getGoodsCatPropList(GoodsCatPropDTO goodsCatPropDTO);

    /**
     * 获取属性中的值
     *
     * @param dto
     * @return
     */
    List<GoodsPropValDTO> getGoodsPropValList(GoodsPropValDTO dto);

    /**
     * 获取所有的父分类（包含自身）
     *
     * @param catId
     * @return
     */
    List<GoodsCatDTO> getAllParentGoodsCat(Integer catId);

    /**
     * 获取所有的子分类（包含自身）
     *
     * @param goodsCatDTO
     * @return
     */
    List<GoodsCatDTO> getAllChildGoodsCat(GoodsCatDTO goodsCatDTO);

    /**
     * 获取采购目录集合（没有父子关系,根据id查询时获取该分类下的所有分类， 不包含自身）
     *
     * @param goodsCatDTO
     * @return
     */
    List<GoodsCatDTO> getGoodsCatDtoListNoRalation(GoodsCatDTO goodsCatDTO);

    /**
     * 根据主键查询类目（必传id和partyId）
     *
     * @return
     */
    GoodsCatDTO getGoodsCatDTOByKey(GoodsCatDTO goodsCatDTO);

    /**
     * 新增采购类目
     *
     * @param goodsCatDTO
     * @return
     */
    Integer addGoodsCatDto(GoodsCatDTO goodsCatDTO);

    /**
     * 新增采购类目(接入方)
     *
     * @param goodsCatDTO
     * @return
     */
    Integer addGoodsCatPartyDto(GoodsCatDTO goodsCatDTO);

    /**
     * 删除采购类目(基本类目表)
     *
     * @param id
     * @return
     */
    Integer deleteGoodsCatDtoByKey(Integer id);

    /**
     * 删除采购类目（接入方类目）
     *
     * @param goodsCatDTO
     * @return
     */
    Integer deleteGoodsCatPartyByCatId(GoodsCatDTO goodsCatDTO);

    /**
     * 获取商户采购分类集合（商户中的分类一览，已上传的且在接入方中的分类）
     *
     * @param goodsCatDTO
     * @return
     */
    List<GoodsCatDTO> getMerGoodsCatDtoList(GoodsCatDTO goodsCatDTO);

    /**
     * 获取分类品牌的集合
     *
     * @param goodsBrandDTO
     * @return
     */
    List<GoodsBrandDTO> getGoodsBrandDtoList(GoodsBrandDTO goodsBrandDTO);

    /**
     * 获取商户品牌的集合
     *
     * @param dto
     * @return
     */
    List<GoodsBrandDTO> getMerGoodsBrandDtoList(GoodsBrandDTO dto);

    /**
     * 新增商户的品牌
     *
     * @param goodsBrandDTO
     * @return
     */
    Integer addGoodsBrandDto(GoodsBrandDTO goodsBrandDTO);

    /**
     * 获取商品审核分类名称
     *
     * @param goodsCatDTO
     * @return
     */
    GoodsApvCatDTO getGoodsApvCatDto(GoodsCatDTO goodsCatDTO);

    /**
     * 根据分类id获取最大级的分类信息
     *
     * @param catId
     * @return
     */
    GoodsCatDTO getMaxParentGoodsCatById(Integer catId);

    /**
     * 根据审核分类id获取审核分类信息
     *
     * @param catId
     * @return
     */
    GoodsApvCatDTO getGoodsApvCatDtoByKey(Integer catId);

    /**
     * 获取最下级的采购分类
     *
     * @param goodsCatDTO
     * @return
     */
    List<GoodsCatDTO> getAllChildCatList(GoodsCatDTO goodsCatDTO);

    /**
     * 添加分类对应的品牌
     *
     * @param catId
     * @param brand
     * @return
     */
    Integer addCatBrand(Integer catId, String brand);

    /**
     * 获取分类与品牌对应中的集合
     *
     * @param brandDto
     * @return
     */
    List<GoodsBrandDTO> getGoodsBrand(GoodsBrandDTO brandDto);

    /**
     * 获取商户添加商品时的分类
     *
     * @param merId
     * @return
     */
    List<GoodsCatDTO>  getMerGoodsCatList(Integer merId, Integer partyId);

}
