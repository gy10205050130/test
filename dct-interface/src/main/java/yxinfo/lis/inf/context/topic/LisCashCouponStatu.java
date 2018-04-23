package yxinfo.lis.inf.context.topic;

/**
 * Created by cy on 2016/11/1.
 */
public interface LisCashCouponStatu {

    //待审核
    Integer WAIT_FOR_REVIEW = 1;
    //未通过
    Integer REJECT_APPLY = 2;
    //通过
    Integer PASS_APPLY = 3;
    //受理
    Integer ACCEPT_APPLY = 4;
}
