package yxinfo.dct.inteface.service.chem.recyc;

import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

/**
 * 试剂回收服务
 * Created by dy on 2016/12/30.
 */
public interface ChemRecycService {

    /**
     * 试剂回收
     * @code 108122
     * @param chemReagentDTO
     * @return
     */
    Integer recycle( ChemReagentDTO chemReagentDTO );

    /**
     * 试剂回库
     * @code 108123
     * @param chemReagentDTO
     * @return
     */
    Integer backWarehouse( ChemReagentDTO chemReagentDTO );
}
