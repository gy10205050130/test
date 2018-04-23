package yxinfo.core.inf.context.set;

/**
 * Created by dy on 2016/12/5.
 */
public interface CoreSetKey {

    interface Message {

        // ios是否是测试环境
        String IS_IOS_DEBUG = "core_message_is_ios_debug";

        // 极光推送key, 后加终端类型编号
        String JPUSH_KEY = "core_message_jpush_key_";

        // 华为推送key, 后加终端类型编号
        String HUAWEI_PUSH_KEY = "core_message_huawei_key_";
    }
}
