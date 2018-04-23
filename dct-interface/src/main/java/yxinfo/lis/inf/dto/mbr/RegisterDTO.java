package yxinfo.lis.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.validation.groups.base.Register;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.Add;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author lovetcat
 * @date 2016/8/31 14:59
 */
public class RegisterDTO extends BaseDTO {

    private static final long serialVersionUID = 2348938551700803751L;

    @Valid
    @NotNull( groups = Register.class, message = ErrorCode.NOT_NULL )
    private MemberCoreDTO member;

    @NotEmpty( groups = Register.class, message = ErrorCode.Memeber.USER_REGISTER_MUST_VCODE )
    private String ticket;

    public MemberCoreDTO getMember() {
        return member;
    }

    public void setMember( MemberCoreDTO member ) {
        this.member = member;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket( String ticket ) {
        this.ticket = ticket;
    }
}
