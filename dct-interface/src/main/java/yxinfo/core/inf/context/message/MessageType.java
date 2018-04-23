package yxinfo.core.inf.context.message;

/**
 * 通知类型
 * Created by dy on 2017/2/10.
 */
public interface MessageType {

    // 仅记录
    String RECORD_ONLY = "0";

    // App推送 - 通知
    String APP_NOTIF = "1";

    // App推送 - 消息
    String APP_MSG = "2";

    // 短信
    String SMS = "4";

    // 邮件
    String EMAIL = "5";
}
