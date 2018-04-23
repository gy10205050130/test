package yxinfo.dct.inteface.context.evt;

/**
 * Created by dy on 2016/6/30.
 */
public interface NotifyType {

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
