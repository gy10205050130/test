package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.eqry.*;
import yxinfo.shop.inf.dto.eqry.get.EqryDetailsDTO;
import yxinfo.shop.inf.dto.eqry.get.EqryMerSchDTO;

import java.util.List;

/**
 * Created by dy on 2016/9/27.
 */
public interface EqryGetService {

    /**
     * 分页查询用户的询价单
     * @code 108001
     * @param pageDTO
     * @return
     */
    PageDTO<List<EqryCoreDTO>> getEqryPageByMemberId( PageDTO<EqryCoreDTO> pageDTO );

    /**
     * 分页查询使用方的询价单
     * @code 108018/108019
     * @param pageDTO
     * @param flag 1线下处理（失败108018）/2被关闭（108019）
     * @return
     */
    PageDTO<List<EqryCoreDTO>> getEqryPageByPartyFailOrClose( PageDTO<EqryCoreDTO> pageDTO, int flag );

    /**
     * 分页查询商户的询价单
     * @code 108005/108006
     * @param pageDTO
     * @param merId
     * @return
     */
    PageDTO<List<EqryCoreDTO>> getEqryPageByMerId( PageDTO<EqryMerSchDTO> pageDTO, Integer merId );

    /**
     * 分页查询商户参与的询价单
     * @code 108017
     * @param pageDTO
     * @param merId
     * @return
     */
    PageDTO<List<EqryCoreDTO>> getEqryPageByMerIdInvolved( PageDTO<EqryMerSchDTO> pageDTO, Integer merId );

    /**
     * 分页查询询价单对应商户报价
     * @code 108009/108010
     * @param pageDTO
     * @return
     */
    PageDTO<List<EqryOfferDTO>> getEqryOfferPage( PageDTO<EqryOfferDTO> pageDTO, Integer memberId, Integer partyId );

    /**
     * 获取询价单详情
     * @code 108004/108007/108008
     * @param memberId
     * @param merId
     * @param partyId
     * @param eqryId
     * @param approveRecodeId
     * @return
     */
    EqryDetailsDTO getEqryDetails( Integer memberId, Integer merId, Integer partyId,
                                   Integer eqryId, Integer approveRecodeId );

    /**
     * 获取询价单基本信息及需求描述
     * @code 108020
     * @param eqryId
     * @return
     */
    EqryCoreDTO getEqryWithDesc( Integer eqryId );

    /**
     * 获取询价单
     * @param eqryId
     * @return
     */
    EqryCoreDTO getEqry( Integer eqryId );

    /**
     * 获取商户报价列表
     * @param eqryId
     * @return
     */
    List<EqryOfferDTO> getEqryOffersByEqryId( Integer eqryId );

    /**
     * 获取询价审核信息
     * @param eqryId
     * @return
     */
    EqryApvDTO getEqryApv( Integer eqryId );

    /**
     * 获取询价收货信息
     * @param eqryId
     * @return
     */
    EqryCneeDTO getEqryCnee( Integer eqryId );

    /**
     * 获取询价发票信息
     * @param eqryId
     * @return
     */
    EqryInvDTO getEqryInv( Integer eqryId );

    /**
     * 获取询价交易信息
     * @param eqryId
     * @return
     */
    EqryTranDTO getEqryTran( Integer eqryId );
}
