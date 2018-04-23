package yxinfo.ow.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.ow.inf.context.ErrorCode;
import yxinfo.ow.inf.dto.BaseDTO;

/**
 * @author lovetcat
 * @date 2016/8/30 15:58
 */
public class UpdatePwdDTO extends BaseDTO {

    private static final long serialVersionUID = -7430981364558432496L;

    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String mobile;

    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String ticket;

    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String pwd;

    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket( String ticket ) {
        this.ticket = ticket;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd( String pwd ) {
        this.pwd = pwd;
    }
}
