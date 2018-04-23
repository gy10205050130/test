package yxinfo.shop.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Update;

import javax.validation.constraints.NotNull;

public class MemberFundsPersonDTO extends BaseDTO {

    private static final long serialVersionUID = 2251393692593439771L;

    @NotNull( groups = Update.class, message = ErrorCode.NOT_NULL )
    private Integer id;

    //姓名
    @NotEmpty( groups = Add.class, message = ErrorCode.NOT_EMPTY )
    private String fname;

    //经费卡号
    @NotEmpty( groups = Add.class, message = ErrorCode.NOT_EMPTY )
    private String cardNo;

    //使用方id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer partyId;

    //用户id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    //用户平台id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer baseMemberId;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo( String cardNo ) {
        this.cardNo = cardNo;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getBaseMemberId() {
        return baseMemberId;
    }

    public void setBaseMemberId( Integer baseMemberId ) {
        this.baseMemberId = baseMemberId;
    }
}
