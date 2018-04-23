package yxinfo.shop.inf.context.eqry;

/**
 * Created by dy on 2016/9/27.
 */
public interface EqryStatus {

    // 审核中
    Short ON_APV = 1;

    // 报价中
    Short ON_MER_OFFER = 2;

    // 选择报价中
    Short ON_CHOOSE_MER_OFFER = 3;

    // 成功
    Short SUCCESS = 4;

    // 审核失败
    Short APV_FAIL = 92;

    // 失败
    Short FAIL = 93;

    // 关闭
    Short CLOSE = 94;
}
