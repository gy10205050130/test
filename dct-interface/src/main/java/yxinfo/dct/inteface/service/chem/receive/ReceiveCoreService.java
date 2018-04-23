package yxinfo.dct.inteface.service.chem.receive;

import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

/**
 * Created by dy on 2017/1/11.
 */
public interface ReceiveCoreService {

    /**
     * 添加领用记录与领用批次
     * @param reagent
     * @param capacity
     * @param applyId
     * @param memberId
     * @param memberIdSec
     * @param thingType
     * @return
     */
    Integer addReceiveAndBatch( ChemReagentDTO reagent, Integer capacity, Integer applyId, Integer memberId, Integer memberIdSec, String thingType );
}
