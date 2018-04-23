package yxinfo.shop.inf.service.order;

/**
 * Created by dy on 2016/8/29.
 */
public interface TranMQProducerService {

    /**
     * 发送消息
     * @param mqBody 消息体
     * @param tag 消息标签
     */
    String produceMQ( Object mqBody, String tag );
}
