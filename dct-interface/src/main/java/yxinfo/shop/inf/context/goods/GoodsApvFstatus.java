package yxinfo.shop.inf.context.goods;

/**
 * Created by ZH on 2016/11/21.
 */
public interface GoodsApvFstatus {

    //1未审核,2已审核,3已作废
    Short GOODSAPV_PENDING = 1;
    Short GOODSAPV_ALREADY = 2;
    Short GOODSAPV_CANCELLED_BYAMDIN = 3;
    Short GOODSAPV_CANCELLED = 4;


}
