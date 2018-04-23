package yxinfo.dct.inteface.context.chem;

/**
 * 入库批次确认状态
 * Created by dy on 2016/12/21.
 */
public interface IntowhConfirmStatus {

    // 待确认
    String WAIT = "1";

    // 已确认
    String HAS = "2";

    // 驳回
    String REJECT = "3";

    // 失效
    String INVALID = "4";
}
