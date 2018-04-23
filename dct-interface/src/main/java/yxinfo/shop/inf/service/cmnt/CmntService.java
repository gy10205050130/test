package yxinfo.shop.inf.service.cmnt;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.cmnt.*;

import java.util.List;

/**
 * Created by dy on 2016/9/20.
 */
public interface CmntService {

    /**
     * 订单评论
     * @code 107001
     * @param cmntOrder
     */
    void cmntOrder( CmntOrderDTO cmntOrder );

    /**
     * 获取商品评论
     * @code 107003
     * @param pageDTO
     * @return
     */
    GoodsCmntRetDTO getGoodsCmnt( PageDTO<GetGoodsCmntDTO> pageDTO );

    /**
     * 获取商户评分概况
     * @code 107004
     * @param merId
     * @return
     */
    List<CmntMerDTO> getMerCmntSummary( Integer merId );

    /**
     * 获取商户首页评分概况
     * @code 107009
     * @param merId
     * @return
     */
    List<CmntMerDTO> getMerIdxCmntSummary( Integer merId );

    /**
     * 商户评论列表
     * @code 107005
     * @param pageDTO
     * @param merId
     * @return
     */
    PageDTO<List<CmntOrderDetailCtxDTO>> getCmntCtxByMer( PageDTO pageDTO, Integer merId );

    /**
     * 用户评论列表
     * @code 107010
     * @param pageDTO
     * @param memberId
     * @return
     */
    PageDTO<List<CmntOrderDetailCtxDTO>> getCmntCtxByMember( PageDTO pageDTO, Integer memberId );

    /**
     * 使用方差评列表
     * @code 107006
     * @param pageDTO
     * @param partyId
     * @return
     */
    PageDTO<List<CmntOrderDetailCtxDTO>> getBadCmntCtxByParty( PageDTO<CmntOrderDetailCtxDTO> pageDTO, Integer partyId );

    /**
     * 获取评论详情
     * @code 107007
     * @param orderDetailId
     * @param partyId
     * @param merId
     * @param memberId
     * @return
     */
    CmntOrderDetailCtxDTO getCmntCtx( Integer orderDetailId, Integer partyId, Integer merId, Integer memberId );

    /**
     * 删除评论
     * @code 107008
     * @param orderDetailId
     * @param partyId
     */
    void deleteCmntCtx( Integer orderDetailId, Integer partyId );
}
