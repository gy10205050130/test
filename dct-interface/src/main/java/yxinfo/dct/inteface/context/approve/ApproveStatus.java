package yxinfo.dct.inteface.context.approve;

/**
 * 审核状态
 * Created by dy on 2016/6/21.
 */
public interface ApproveStatus {

    // 未提交
    String UNSUBMIT = "u";

    // 审核中
    String PROCESS = "o";

    // 审核通过
    String SUCCESS = "s";

    // 审核不通过
    String FAIL = "f";

    // 已作废
    String INVALID = "i";
}
