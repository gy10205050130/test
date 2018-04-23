package yxinfo.shop.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.validation.groups.base.Register;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
