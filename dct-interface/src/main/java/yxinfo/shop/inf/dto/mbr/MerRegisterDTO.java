package yxinfo.shop.inf.dto.mbr;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.validation.groups.base.Register;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.RegexpStr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by ZH on 2016/8/23.
 */
public class MerRegisterDTO extends BaseDTO {

    private static final long serialVersionUID = -2520805302278410130L;

    // 登录名
    @Pattern( groups = { Register.class }, regexp = RegexpStr.MOBILE, message = ErrorCode.Memeber.MOBILE_ERROR )
    @NotEmpty( groups = { Register.class }, message = ErrorCode.NOT_EMPTY )
    private String mobile;

    // 密码
    @Length( groups = { Register.class }, min = 6, max = 18, message = ErrorCode.LENGTH )
    @NotEmpty( groups = { Register.class }, message = ErrorCode.NOT_EMPTY )
    private String passWord;

    // 公司名称
    @Length( max = 100, groups = { Register.class }, message = ErrorCode.LENGTH )
    @NotEmpty( groups = { Register.class }, message = ErrorCode.NOT_EMPTY )
    private String fname;

    // 使用方id
    @NotNull( groups = { Register.class }, message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 注册票据
    @NotEmpty( groups = { Register.class }, message = ErrorCode.NOT_EMPTY )
    private String ticket;

    // 终端设备类型
    @NotNull( groups = { Register.class }, message = ErrorCode.NOT_NULL )
    private String terminalType;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord( String passWord ) {
        this.passWord = passWord;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket( String ticket ) {
        this.ticket = ticket;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType( String terminalType ) {
        this.terminalType = terminalType;
    }
}
