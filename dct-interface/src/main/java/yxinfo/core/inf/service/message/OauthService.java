package yxinfo.core.inf.service.message;

import yxinfo.core.inf.dto.message.OauthCoreDTO;

/**
 * OAuth2.0持久化服务
 * Created by dy on 2017/2/14.
 */
public interface OauthService {

    /**
     * 根据Appid和key获取AccessToken
     * @param appid
     * @param appkey
     * @return
     */
    String getAccessTokenByAppIdAndKey( String appid, String appkey );

    /**
     * 获取
     * @param appid
     * @return
     */
    OauthCoreDTO getOauth( String appid );

    /**
     * 获取（行级锁）
     * @param appid
     * @return
     */
    OauthCoreDTO getOauthForUpdate( String appid );

    /**
     * 更新
     * @param oauthCore
     * @return
     */
    int updateOauthByAppid( OauthCoreDTO oauthCore );
}
