package yxinfo.dct.inteface.dto.supplies;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by ZH on 2017/2/8.
 */
public class WarnDTO extends BaseDTO {

    private Date date;

    private List<StockWarnDTO> stockWarnDTO;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<StockWarnDTO> getStockWarnDTO() {
        return stockWarnDTO;
    }

    public void setStockWarnDTO(List<StockWarnDTO> stockWarnDTO) {
        this.stockWarnDTO = stockWarnDTO;
    }

    @Override
    public String toString() {
        return "WarnDTO{" +
                "date=" + date +
                ", stockWarnDTO=" + stockWarnDTO +
                '}';
    }
}
