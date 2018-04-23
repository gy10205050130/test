package yxinfo.shop.inf.dto.eqry.cancel;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/10/6.
 */
public class CancelEqryDTO extends BaseDTO {

    private static final long serialVersionUID = 890974047995641583L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer eqryId;

    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private String note;

    public Integer getEqryId() {
        return eqryId;
    }

    public void setEqryId( Integer eqryId ) {
        this.eqryId = eqryId;
    }

    public String getNote() {
        return note;
    }

    public void setNote( String note ) {
        this.note = note;
    }
}
