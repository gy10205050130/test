package yxinfo.shop.inf.context.mer;

/**
 * Created by ZH on 2016/8/3.
 */
public interface MerCoreAuthStatus {
    //认证状态（1待认证，2认证中，3已认证）
    Short AUTH_STATUS_BEGIN = 1;
    Short AUTH_STATUS_ING = 2;
    Short AUTH_STATUS_END = 3;
}
