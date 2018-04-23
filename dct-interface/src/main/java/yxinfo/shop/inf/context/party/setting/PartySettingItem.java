package yxinfo.shop.inf.context.party.setting;

/**
 * Created by dy on 2016/9/21.
 */
public interface PartySettingItem {

    // 是否开启差评审核
    Short IS_OPEN_BAD_CMNT_APV = 1;

    // 是否开启商户报价选择审核
    Short IS_OPEN_EQRY_CHOOSE_APV = 2;

    // 商户报价选择审核最大允许不通过次数，超过再审核不通过则关闭询价单
    Short EQRY_CHOOSE_APV_FAIL_LIMIT = 3;

    // 商户报价选择审核itemNo
    Short EQRY_CHOOSE_APV_ITEM_NO = 4;

    // 使用方下单单笔限制金额
    Short PARTY_PLACE_ORDER_SINGLE_AMT_LIMIT = 5;

    // 经费支付同商品下单金额限制模式（1半年/2一年）
    Short FUNDS_PAY_SAME_GOODS_LIMIT_MOD = 6;

    // 经费支付同商品下单限制金额
    Short FUNDS_PAY_SAME_GOODS_LIMIT_AMT = 7;
}
