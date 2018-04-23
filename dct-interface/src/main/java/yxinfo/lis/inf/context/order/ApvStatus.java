package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/9/7.
 */
public interface ApvStatus {

    // 待审核
    Integer WAIT_REVIEW = 1;

    // 审核中
    Integer REVIEWING = 2;

    // 审核通过
    Integer FINISH_REVIEW = 3;

    // 未通过
    Integer FAIL_REVIEW = 4;


}
