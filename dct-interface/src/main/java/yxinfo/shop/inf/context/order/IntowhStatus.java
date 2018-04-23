package yxinfo.shop.inf.context.order;

/**
 * Created by dy on 2016/10/20.
 */
public interface IntowhStatus {

    // 0未入库
    Short NOT_INTO = 0;

    // 1已入库
    Short HAS_INTO = 1;

    // 2出库中
    Short OUT_ING = 2;

    // 3已出库
    Short HAS_OUT = 3;
}
