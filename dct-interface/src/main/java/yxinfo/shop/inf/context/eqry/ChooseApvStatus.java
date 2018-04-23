package yxinfo.shop.inf.context.eqry;

/**
 * 选择报价审核状态
 * Created by dy on 2016/9/28.
 */
public interface ChooseApvStatus {

    // 未审核
    Short NOT_ON_APV = 1;

    // 审核中
    Short ON_APV = 2;

    // 成功
    Short SUCCESS = 3;

    // 失败
    Short FAIL = 4;
}
