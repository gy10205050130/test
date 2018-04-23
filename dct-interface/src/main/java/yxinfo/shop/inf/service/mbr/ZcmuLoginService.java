package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberLoginInfoDTO;
import yxinfo.shop.inf.dto.mbr.zcmu.ZcmuBindMobileDTO;
import yxinfo.shop.inf.dto.mbr.zcmu.ZcmuNpLoginDTO;
import yxinfo.shop.inf.dto.mbr.zcmu.ZcmuNpLoginRetDTO;

/**
 * Created by dy on 2016/9/14.
 */
public interface ZcmuLoginService {

    /**
     * 免密登录
     * @code 103033
     * @param login
     * @return
     */
    ZcmuNpLoginRetDTO npLogin( ZcmuNpLoginDTO login );

    /**
     * 绑定手机
     * @code 103036
     * @param bind
     * @return
     */
    MemberLoginInfoDTO bindMobile( ZcmuBindMobileDTO bind );
}
