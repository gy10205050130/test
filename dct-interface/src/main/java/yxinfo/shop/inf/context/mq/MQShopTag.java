package yxinfo.shop.inf.context.mq;

/**
 * 消息标签
 * Created by dy on 2016/8/4.
 */
public interface MQShopTag {

    // 订单
    interface Order {
        // 下单
        String TAG_DCT_SHOP_PLACE_ORDER = "TAG_DCT_SHOP_PLACE_ORDER";

        // 取消订单
        String TAG_DCT_SHOP_CANCEL_ORDER = "TAG_DCT_SHOP_CANCEL_ORDER";

        // 支付订单
        String TAG_DCT_SHOP_PAY_ORDER = "TAG_DCT_SHOP_PAY_ORDER";

        // 审核订单
        //String TAG_DCT_SHOP_APV_ORDER = "TAG_DCT_SHOP_APV_ORDER";

        // 线下支付确认收款
        String TAG_DCT_SHOP_OFFLINE_CONFIRM_RECEIPT_MONEY = "TAG_DCT_SHOP_OFFLINE_CONFIRM_R_M";

        // 商户发货
        String TAG_DCT_SHOP_DELIVER_GOODS = "TAG_DCT_SHOP_DELIVER_GOODS";

        // 用户确认收货
        String TAG_DCT_SHOP_CONFIRM_RECEIPT = "TAG_DCT_SHOP_CONFIRM_RECEIPT";
    }

    // 商品
    interface Goods {
        // 商品库存补偿
        String TAG_DCT_SHOP_GOODS_STOCK_BAK = "TAG_DCT_SHOP_GOODS_STOCK_BAK";
    }

    // 审核
    interface Apv {
        // 撤销审核单提交
        String TAG_DCT_SHOP_BAK_SUBMIT_APV = "TAG_DCT_SHOP_BAK_SUBMIT_APV";

        // 撤销审核操作
        String TAG_DCT_SHOP_REVOKE_APV = "TAG_DCT_SHOP_REVOKE_APV";

        // 置审核失败
        String TAG_DCT_SHOP_SET_APV_FAIL = "TAG_DCT_SHOP_SET_APV_FAIL";
    }

    // 询价
    interface Eqry {
        // 审核询价单
        //String TAG_DCT_SHOP_APV_EQRY = "TAG_DCT_SHOP_APV_EQRY";
    }
}
