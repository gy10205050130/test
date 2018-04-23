package yxinfo.dct.inteface.service.base;

import yxinfo.dct.inteface.dto.base.AccessTokenDTO;

/**
 * Created by hanley on 2016/6/23.
 */
public interface AccessTokenService {

    int EXPIRE_IN = 7200 * 1000;

    /**
     * 添加AccessToken
     * @param derviceType 终端类型编号（terminalCode）
     * @param memberId 用户id
     * @return
     */
    AccessTokenDTO createAccessToken( String derviceType, Integer memberId );

    /**
     * 添加AccessToken
     * @param derviceType 终端类型编号（terminalCode）
     * @param memberId 用户id
     * @param deviceBrand 终端设备品牌
     * @param deviceModel 终端设备型号
     * @param imei 设备唯一标识
     * @return
     */
    AccessTokenDTO createAccessToken( String derviceType, Integer memberId, String deviceBrand, String deviceModel, String imei );

    /**
     * 更新AccessToken
     * @api 100012 更新AccessToken
     * @param oldAccessToken
     * @return
     */
    AccessTokenDTO updateAccessToken( String oldAccessToken );

    /**
     * 续期AccessToken
     * @param oldAccessToken
     * @return
     */
    AccessTokenDTO extendAccessToken( String oldAccessToken );

    /**
     * 查找AccessToken
     * @param accessToken
     * @return
     */
    AccessTokenDTO getAccessToken( String accessToken );

    /**
     * 查找AccessToken
     * @param memberId 用户id
     * @param derviceType 终端类型编号
     * @return
     */
    AccessTokenDTO getAccessToken( Integer memberId, String derviceType );
}
