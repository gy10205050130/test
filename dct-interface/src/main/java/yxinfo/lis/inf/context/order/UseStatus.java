package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/9/7.
 */
public interface UseStatus {

    // 未使用
    Integer NO_USE = 1;

    // 待使用
    Integer WAIT_USE = 2;

    // 使用中
    Integer USEING = 3;

    // 使用完成
    Integer FINISH_USE = 4;

}
