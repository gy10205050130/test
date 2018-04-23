package yxinfo.shop.inf.dto.order.stats;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;
import java.util.Map;

/**
 * Created by dy on 2016/11/22.
 */
public class OrderStatsRetDTO extends BaseDTO {

    private static final long serialVersionUID = 2780643246914300881L;

    private Date date;

    private Map<String, Long> stats;

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public Map<String, Long> getStats() {
        return stats;
    }

    public void setStats( Map<String, Long> stats ) {
        this.stats = stats;
    }
}
