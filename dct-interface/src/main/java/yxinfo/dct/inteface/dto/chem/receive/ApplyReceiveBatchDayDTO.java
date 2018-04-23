package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/1/13.
 */
public class ApplyReceiveBatchDayDTO extends BaseDTO {

    private static final long serialVersionUID = -1639411392138394093L;

    // 日期
    private Date date;

    // 批次
    private List<ApplyReceiveBatchDTO> batches;

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public List<ApplyReceiveBatchDTO> getBatches() {
        return batches;
    }

    public void setBatches( List<ApplyReceiveBatchDTO> batches ) {
        this.batches = batches;
    }
}
