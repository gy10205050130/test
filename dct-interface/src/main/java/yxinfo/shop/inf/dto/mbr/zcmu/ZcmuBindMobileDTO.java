package yxinfo.shop.inf.dto.mbr.zcmu;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/9/18.
 */
public class ZcmuBindMobileDTO extends BaseDTO {

    private static final long serialVersionUID = 3446408534588508012L;

    // 手机号
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String mobile;

    // 验证码
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String vcode;

    // 密码
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String pwd;

    // 登录信息
    @Valid
    @NotNull( message = ErrorCode.NOT_NULL )
    private ZcmuNpLoginDTO lgMsg;

    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode( String vcode ) {
        this.vcode = vcode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd( String pwd ) {
        this.pwd = pwd;
    }

    public ZcmuNpLoginDTO getLgMsg() {
        return lgMsg;
    }

    public void setLgMsg( ZcmuNpLoginDTO lgMsg ) {
        this.lgMsg = lgMsg;
    }
}
