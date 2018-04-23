package yxinfo.shop.inf.context.eqry;

/**
 * Created by dy on 2016/9/28.
 */
public interface OfferStatus {

    // 等待询价人选择
    Short WAIT_CHOOSE = 1;

    // 报价成功
    Short SUCCESS = 2;

    // 报价失败
    Short FAIL = 3;
}
