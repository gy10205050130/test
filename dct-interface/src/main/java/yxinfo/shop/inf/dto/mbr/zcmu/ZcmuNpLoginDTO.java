package yxinfo.shop.inf.dto.mbr.zcmu;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/9/14.
 */
public class ZcmuNpLoginDTO extends BaseDTO {

    private static final long serialVersionUID = 7557464252454467842L;

    // 用户名
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String userName;

    // 时间戳
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String strSysDatetime;

    // 角色
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String jsName;

    // 加密信息
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String verify;

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getStrSysDatetime() {
        return strSysDatetime;
    }

    public void setStrSysDatetime( String strSysDatetime ) {
        this.strSysDatetime = strSysDatetime;
    }

    public String getJsName() {
        return jsName;
    }

    public void setJsName( String jsName ) {
        this.jsName = jsName;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify( String verify ) {
        this.verify = verify;
    }
}
