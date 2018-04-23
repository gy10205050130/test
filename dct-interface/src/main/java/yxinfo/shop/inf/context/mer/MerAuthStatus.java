package yxinfo.shop.inf.context.mer;

/**
 * Created by ZH on 2016/9/1.
 */
public interface MerAuthStatus {

    //认证状态（ 1待认证，2认证成功，3认证失败 ）
    Short AUTH_STATUS_WAIT = 1;
    Short AUTH_STATUS_SUCC = 2;
    Short AUTH_STATUS_FAIL = 3;
}
