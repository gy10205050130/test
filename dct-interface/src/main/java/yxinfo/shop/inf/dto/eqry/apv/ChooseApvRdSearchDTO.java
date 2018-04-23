package yxinfo.shop.inf.dto.eqry.apv;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/8/22.
 */
public class ChooseApvRdSearchDTO extends BaseDTO {

    private static final long serialVersionUID = 5373058778420799466L;

    // 使用方id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 用户id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 搜索词
    private String schText;

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

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}
