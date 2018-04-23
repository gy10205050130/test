package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/9/20.
 */
public interface OrderPushType {

    // 大仪订单中预约
    Integer FOR_BOOK = 1;

    // 大仪订单中审核
    Integer FOR_REVIEW = 2;

    // 开启仪器设备
    Integer FOR_START_INST = 3;

}
