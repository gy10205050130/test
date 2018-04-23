package yxinfo.lis.inf.service.order;

import java.util.Date;

/**
 * Created by xww on 2016/9/20.
 */
public interface PushOrderNotifyService {

    /**
     * 订单推送大仪
     *
     * @param memberId  （预约人id， 审核人id）
     * @param partyId
     * @param orderId   （订单id）
     * @param title     （消息头）
     * @param orderFlag （订单类型：1预约 2审核）
     */
    void pushOrderNotify(Integer memberId, Integer partyId, Integer orderId, String title, Integer orderFlag);

    /**
     * 订单即将结束时推送预约人和负责人大仪
     *
     * @param memberId      （预约人id， 审核人id）
     * @param memberPartyId
     * @param orderId       （订单id）
     * @param title         （消息头）
     * @param orderFlag     （订单类型：1预约 2审核）
     */
    void pushOrderNotify(Integer bookerId, Integer bookPartyId, Integer memberId, Integer memberPartyId, Integer orderId, String title, Integer orderFlag, Date pushDate);

}
