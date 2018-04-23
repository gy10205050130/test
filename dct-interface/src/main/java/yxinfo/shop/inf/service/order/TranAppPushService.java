package yxinfo.shop.inf.service.order;

import yxinfo.core.inf.dto.message.MessageDTO;

/**
 * Created by dy on 2017/2/16.
 */
public interface TranAppPushService {

    /**
     * 发送App通知
     * <p>基于消息队列, 受JTA管理, 必须声明事务</p>
     * @param message
     */
    void sendAppNotify( MessageDTO message );

    /**
     * 发送App通知
     * <p>基于消息队列, 不受JTA管理, 可不声明事务</p>
     * @param message
     */
    void sendAppNotifyNoJta( MessageDTO message );
}
