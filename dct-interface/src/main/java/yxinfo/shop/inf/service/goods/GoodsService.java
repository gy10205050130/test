package yxinfo.shop.inf.service.goods;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.goods.*;

import java.util.List;

/**
 * 商品模块service
 *
 * Created by cy on 2016/8/1.
 */
public interface GoodsService {

    /**
     * 添加商品信息
     *
     * @param goodsDto
     * @return
     */
    Integer addGoods(GoodsDTO goodsDto);

    /**
     * 获取商品一览信息（商家一览商品信息, 商家浏览自己的商品，平铺数据）
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<GoodsSpecExDTO>> getGoodsSpecExDtoList(PageDTO<GoodsSpecExDTO> queryPage);

    /**
     * 根据goodsid获取商品信息
     *
     * @param goodsDTO
     * @return
     */
    GoodsDTO getGoodsDtoByGoodsId(GoodsDTO goodsDTO);

    /**
     * 分页获取商品列表（根据分类查询，页面展示不是平铺，查询索引表，必传catId）
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<GoodsDTO>> getGoodsDtoIdxList(PageDTO<GoodsDTO> pageQuery);

    /**
     * 条件查询商品信息（页面展示为平铺，查询索引表）
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<GoodsSpecExDTO>> getGoodsSpecDtoIdxList(PageDTO<GoodsSpecExDTO> pageQuery);

    /**
     * 分页获取商品列表（根据分类查询，页面展示不是平铺，查询商品基础表）
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<GoodsDTO>> getGoodsCoreDtoList(PageDTO<GoodsDTO> pageQuery);

    /**
     * 根据商品id获取单条商品
     *
     * @param goodsId
     * @return
     */
    GoodsSpecExDTO getGoodsSpecExDtoByGoodId(Integer goodsId);

    /**
     * 删除商品
     *
     * @param
     * @return
     */
    Integer deleteGoodsById(Integer id);

    /**
     * 更新商品信息
     *
     * @param goodsDto
     * @return
     */
    Integer updateGoods(GoodsDTO goodsDto);

    /**
     * 下架商品（必传id）
     *
     * @param goodsDTO
     * @return
     */
    Integer shelveGoods(GoodsDTO goodsDTO);

    /**
     * 更新商品的库存
     *
     * @param goodsStockDTOList
     * @return
     */
    Integer updateGoodsStock(List<GoodsStockDTO> goodsStockDTOList);

    /**
     * 置顶商品(商户)
     *
     * @param goodsDTO
     * @return
     */
    Integer updateGoodsSortMer(GoodsDTO goodsDTO);

    /**
     * 将商品插入到其他接入方（在元欣平台上添加商品会触发改方法）
     *
     * @param goodsId
     * @return
     */
    Integer addGoodsToAllParty(Integer goodsId);

    /**
     * 根据使用方Id,商品名称查询商品数量
     * @param countDTO
     * @return
     */
    Integer countGoodsIdxDTO (GoodsCountDTO countDTO);

    /**
     * 根据条件查询商品信息集合(查询商品基本表信息)
     *
     * @param goodsSpecExDTO
     * @return
     */
    List<GoodsSpecExDTO> getGoodsListByTerms(GoodsSpecExDTO goodsSpecExDTO);

    /**
     * 根据指定条件删除索引
     * @param goodsDTO
     * @return
     */
    Integer deleteGoodsIdxDTO ( GoodsDTO goodsDTO );

    /**
     * 根据goodsSpecExDTO往索引表插数据
     * @param goodsSpecExDTO
     * @return
     */
    Integer addGoodsIdxByGoodsSpecExDTO(GoodsSpecExDTO goodsSpecExDTO);

    /**
     * 添加商品审核记录
     * @param goodsId
     * @param type
     * @return
     */
    Integer addGoodsApvDTO( Integer goodsId , Integer type );

    /**
     * 分页查询商品审核记录
     * @param pageQuery
     * @return
     */
    PageDTO<List<GoodsApvDTO>> getGoodsApvDTOList(PageDTO<GoodsApvDTO> pageQuery);

    /**
     * 修改审核记录
     * @param goodsId
     * @return
     */
    Integer updateGoodsApvDTOForMer ( Integer goodsId );

    /**
     * 审核
     * @param goodsApvDTO
     * @param type 1审核同意  2审核不同意
     * @return
     */
    Integer updateGoodsApvDTO ( GoodsApvDTO goodsApvDTO , Integer type );

    /**
     * 根据商户Id统计商品数量
     * @param merId
     * @return
     */
    Integer countGoodsNumByMerId ( Integer merId );

    /**
     * 根据审核记录id获取审核记录
     * @param apvId
     * @return
     */
    GoodsApvDTO getGoodsApvDTOById (Integer apvId);

    /**
     * 热门商品基础分页接口
     * @param pageQuery
     * @return
     */
    PageDTO<List<HotGoodsDTO>> getHotGoodsDTOList(PageDTO<HotGoodsDTO> pageQuery);

    /**
     * 首页热门商品分页接口
     * @param pageQuery
     * @return
     */
    PageDTO<List<HotGoodsDTO>> getHotGoodsDTOListForGoods(PageDTO<HotGoodsDTO> pageQuery);

    /**
     * 添加热门商品
     * @param hotGoodsDTO
     * @return
     */
    Integer addHotGoodsDTO ( HotGoodsDTO hotGoodsDTO );

    /**
     * 删除热门商品
     * @param id
     * @return
     */
    Integer deleteHotGoodsDTO ( Integer id );

    /**
     * 根据商户名称查询三个商品
     * @param merName
     * @return
     */
    List<GoodsIdxDTO> getMerGoods ( String merName );
}
