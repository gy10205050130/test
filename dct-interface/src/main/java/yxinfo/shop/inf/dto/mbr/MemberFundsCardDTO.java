package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Delete;

import javax.validation.constraints.NotNull;

public class MemberFundsCardDTO extends BaseDTO {

    private static final long serialVersionUID = 4034660826370614251L;

    //用户id
    @NotNull( groups = { Add.class, Delete.class }, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    //经费负责人id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer fundsPersonId;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getFundsPersonId() {
        return fundsPersonId;
    }

    public void setFundsPersonId( Integer fundsPersonId ) {
        this.fundsPersonId = fundsPersonId;
    }
}
