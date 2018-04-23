package yxinfo.lis.inf.context.mq;

/**
 * Created by cy on 2016/12/24.
 */
public interface ActivtyMqContext {

    //测试环境
    String amq_url = "tcp://192.168.0.200:61616";
    //正式环境
   // String amq_url = "failover://(tcp://120.26.142.5:61616,tcp://120.26.142.5:61656)?initialReconnectDelay=100&timeout=10000&randomize=false";

    String amq_username = "admin";

    String amq_password = "admin";

    String amq_clientid = "192.168.0.102";



}
