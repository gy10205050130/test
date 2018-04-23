package yxinfo.shop.inf.service.order;

import java.util.List;

/**
 * Created by dy on 2016/11/9.
 */
public interface FundsPayAmtService {

    /**
     * 获取同商品名称经费支付总金额
     * @param fname
     * @param start
     * @param end
     * @param memberId
     * @return
     */
    long getSumAmt( String fname, int start, int end, int memberId );

    /**
     * 增加同商品名称经费支付总金额
     * @param orderIds
     */
    void addSumAmt( List<Integer> orderIds );

    /**
     * 减去同商品名称经费支付总金额
     * @param orderIds
     */
    void subtractSumAmt( List<Integer> orderIds );
}
