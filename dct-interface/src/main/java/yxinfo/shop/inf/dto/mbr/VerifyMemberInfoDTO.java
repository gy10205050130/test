package yxinfo.shop.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

public class VerifyMemberInfoDTO extends BaseDTO {

    private static final long serialVersionUID = -3562255376351155862L;

    //校验类型（1用户名/2手机号）
    @NotNull( message = ErrorCode.NOT_EMPTY )
    private int type;

    //校验值
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String value;

    public int getType() {
        return type;
    }

    public void setType( int type ) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue( String value ) {
        this.value = value;
    }
}
