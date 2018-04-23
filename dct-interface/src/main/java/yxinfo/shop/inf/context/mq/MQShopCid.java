package yxinfo.shop.inf.context.mq;

/**
 * Created by dy on 2016/8/12.
 */
public interface MQShopCid {

    // 电商订单统计
    String CID_DCT_SHOP_ORDER_STATS = "CID_DCT_SHOP_ORDER_STATS";

    // 电商购买审核消息推送
    String CID_DCT_SHOP_APV_MSG_PUSH = "CID_DCT_SHOP_APV_MSG_PUSH";

    // 置审核失败
    String CID_DCT_SHOP_SET_APV_FAIL = "CID_DCT_SHOP_SET_APV_FAIL";

    // 撤销审核单提交
    String CID_DCT_SHOP_BAK_SUBMIT_APV = "CID_DCT_SHOP_BAK_SUBMIT_APV";

    // 撤销审核操作
    String CID_DCT_SHOP_REVOKE_APV = "CID_DCT_SHOP_REVOKE_APV";

    // 商品库存补偿
    String CID_DCT_SHOP_GOODS_STOCK_BAK = "CID_DCT_SHOP_GOODS_STOCK_BAK";

    // 经费支付购买商品月总额统计
    String CID_DCT_SHOP_ZCMU_FUNDS_PAY_AMT = "CID_DCT_SHOP_ZCMU_FUNDS_PAY_AMT";
}
