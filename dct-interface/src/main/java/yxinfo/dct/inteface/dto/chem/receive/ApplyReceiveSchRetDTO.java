package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyDetailDTO;

import java.util.List;

public class ApplyReceiveSchRetDTO extends BaseDTO {

    private static final long serialVersionUID = 752308823949253255L;

    private List<ApplyDetailDTO> wait;

    private List<ApplyReceiveBatchDTO> has;

    public List<ApplyDetailDTO> getWait() {
        return wait;
    }

    public void setWait( List<ApplyDetailDTO> wait ) {
        this.wait = wait;
    }

    public List<ApplyReceiveBatchDTO> getHas() {
        return has;
    }

    public void setHas( List<ApplyReceiveBatchDTO> has ) {
        this.has = has;
    }
}
