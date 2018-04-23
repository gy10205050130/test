package yxinfo.shop.inf.service.cmnt;

import yxinfo.shop.inf.dto.cmnt.CmntScoreDTO;

import java.util.List;

/**
 * Created by dy on 2016/9/21.
 */
public interface CmntScoreService {

    /**
     * 提交评分
     * @param scores
     * @param goodsId
     * @param merId
     */
    void submitCmntScore( List<CmntScoreDTO> scores, Integer goodsId, Integer merId );

    /**
     * 撤销评分
     * <p>scores的score依然送正数<p/>
     * @param scores
     * @param goodsId
     * @param merId
     */
    void revokeCmntScore( List<CmntScoreDTO> scores, Integer goodsId, Integer merId );

    /**
     * 增加总评分
     * @param score
     * @param num
     * @param item
     * @return
     */
    int plusCmntAllCount( long score, int num, Short item );

    /**
     * 增加产品评分
     * @param score
     * @param num
     * @param item
     * @param goodsId
     * @param merId
     * @return
     */
    int plusCmntGoodsCount( int score, int num, Short item, int goodsId, int merId );

    /**
     * 增加商户评分
     * @param score
     * @param num
     * @param item
     * @param merId
     * @return
     */
    int plusCmntMerCount( int score, int num, Short item, int merId );
}
