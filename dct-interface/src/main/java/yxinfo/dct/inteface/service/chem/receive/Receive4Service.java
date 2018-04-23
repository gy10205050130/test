package yxinfo.dct.inteface.service.chem.receive;

import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveBatchDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveReagentDTO;

/**
 * Created by dy on 2017/2/8.
 */
public interface Receive4Service {

    /**
     * 领用
     * @code 108109
     * @param receiveReagentDTO
     * @param terminalCode
     * @return
     */
    ApplyReceiveBatchDTO addReceive( ApplyReceiveReagentDTO receiveReagentDTO, String terminalCode );

    /**
     * 领用时获取试剂信息
     * @code 108110
     * @param receiveReagentDTO
     * @return
     */
    ChemReagentDTO getInfoBeforeReceive( ApplyReceiveReagentDTO receiveReagentDTO );
}
