package yxinfo.lis.inf.context.payment;

/**
 * 支付方式
 *
 * Created by cy on 2016/10/18.
 */
public interface PaymentType {

    //支付宝支付
    int PAY_BY_ALIPAY = 1;

    //经费卡支付
    int PAY_BY_FUNDS_CARD = 2;

    //代金券支付
    int PAY_BY_VOUCHER = 3;

    //预存款支付
    int PAY_BY_IMPREST_MONEY = 4;
}
