package yxinfo.shop.inf.dto.order.stats;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/31.
 */
public class OrderStatsGetDTO extends BaseDTO {

    private static final long serialVersionUID = -8354263632790050196L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Short type;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer relId;

    private Short item;

    private List<Short> itemIn;

    private Date dateFrom;

    private Date dateTo;

    public Short getType() {
        return type;
    }

    public void setType( Short type ) {
        this.type = type;
    }

    public Integer getRelId() {
        return relId;
    }

    public void setRelId( Integer relId ) {
        this.relId = relId;
    }

    public Short getItem() {
        return item;
    }

    public void setItem( Short item ) {
        this.item = item;
    }

    public List<Short> getItemIn() {
        return itemIn;
    }

    public void setItemIn( List<Short> itemIn ) {
        this.itemIn = itemIn;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom( Date dateFrom ) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo( Date dateTo ) {
        this.dateTo = dateTo;
    }
}
