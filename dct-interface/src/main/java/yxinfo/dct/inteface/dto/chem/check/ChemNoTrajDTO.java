package yxinfo.dct.inteface.dto.chem.check;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyReceiveDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

/**
 * Created by dy on 2016/7/21.
 */
public class ChemNoTrajDTO extends BaseDTO {

    private static final long serialVersionUID = 7031993177660692315L;

    // 领取的试剂
    private ChemReagentDTO reagent;

    // 领用记录
    private ApplyReceiveDTO receive;

    public ChemReagentDTO getReagent() {
        return reagent;
    }

    public void setReagent( ChemReagentDTO reagent ) {
        this.reagent = reagent;
    }

    public ApplyReceiveDTO getReceive() {
        return receive;
    }

    public void setReceive( ApplyReceiveDTO receive ) {
        this.receive = receive;
    }
}
