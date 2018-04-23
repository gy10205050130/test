package yxinfo.dct.inteface.context.chem;

/**
 * 试剂状态
 * Created by dy on 2016/12/20.
 */
public interface ReagentStatus {

    // 未生效
    String WAIT_INTO_WH = "0";

    // 库存中
    String IN_WH = "1";

    // 使用中
    String IN_USE = "2";

    // 待回收
    String RECYCLE_WAIT = "3";

    // 正常回收
    String RECYCLE_SUCC = "4";

    // 回收但未扫码
    String RECYCLE_NO_SCAN = "5";

    // 扫码但未回收
    String SCAN_NO_RECYCLE = "6";

    // 回收异常关闭
    String RECYCLE_ABNOR_CLOSE = "7";

    // 作废
    String INVALID  = "8";

    // 报损
    String DAMAGED = "9";
}
