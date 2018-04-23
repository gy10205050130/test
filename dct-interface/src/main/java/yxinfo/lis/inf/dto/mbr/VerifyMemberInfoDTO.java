package yxinfo.lis.inf.dto.mbr;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * @author lovetcat
 * @date 2016/8/1 17:06
 */
public class VerifyMemberInfoDTO extends BaseDTO {

    //校验类型 1用户名，2手机号
    @NotNull(message = ErrorCode.NOT_EMPTY)
    private int type;
    //校验值
    private String value;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
