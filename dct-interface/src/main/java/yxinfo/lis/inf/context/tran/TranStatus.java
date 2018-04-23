package yxinfo.lis.inf.context.tran;

/**
 * 交易状态
 * Created by dy on 2016/8/17.
 */
public interface TranStatus {

    // 未交易
    Short WAIT = 1;

    // 交易处理中
    Short IN = 2;

    // 交易成功
    Short SUCCESS = 3;

    // 交易失败
    Short FAIL = 4;
}
