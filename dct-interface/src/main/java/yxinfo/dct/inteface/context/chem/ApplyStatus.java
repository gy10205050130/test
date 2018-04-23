package yxinfo.dct.inteface.context.chem;

/**
 * 领取申请状态
 * Created by dy on 2017/1/4.
 */
public interface ApplyStatus {

    // 未生效
    String WAIT_CONFIRM = "0";

    // 审核中
    String ON_APV = "1";

    // 待领用
    String WAIT = "2";

    // 已领完
    String FIN = "3";

    // 已驳回
    String REFUSE = "4";

    // 已逾期
    String TIMEOUT = "5";
}
