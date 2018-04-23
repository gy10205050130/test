package yxinfo.lis.inf.service.mq;

/**
 * Created by tj on 2016/9/9.
 */
public interface LisMqProducerService {

    /**
     * 发布消息
     * @param producerId 消息发布者id
     * @param topic 消息主题
     * @param tag 消息标签
     * @param msg 消息
     * @return
     */
    Boolean produce( String producerId, String topic, String tag, String msg );

    /**
     * 发布消息
     * @param topic 消息接收者
     * @param msg 消息
     * @return
     */
    Boolean produceMsg(String topic, String msg );
}
