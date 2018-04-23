package yxinfo.shop.inf.context.tran;

/**
 * 序列生成业务代码
 * <p>不同业务代码序列单独自增; 业务代码也作为序列的前缀<p/>
 * Created by dy on 2016/8/16.
 */
public interface SeqBizCode {

    // 购买订单
    String ORDER_NO = "F";

    // 商户下单号
    String MER_PLACE_NO = "P";

    // 下单号
    String PLACE_NO = "P";

    // 准购批号
    String AC_BATCH_NO = "A";

    // 支付交易订单号
    String TRAN_ORDER_NO = "T";

    // 询价单订单号
    String EQRY_ORDER_NO = "E";
}
