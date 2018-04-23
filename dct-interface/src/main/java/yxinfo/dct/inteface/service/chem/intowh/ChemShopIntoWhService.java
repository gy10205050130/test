package yxinfo.dct.inteface.service.chem.intowh;

import yxinfo.dct.inteface.dto.chem.intowh.ChemAddReagentRetDTO;
import yxinfo.dct.inteface.dto.chem.intowh.ChemShopIntowhDTO;

/**
 * 商城入库服务
 * Created by dy on 2017/1/17.
 */
public interface ChemShopIntoWhService {

    /**
     * 商城入库
     * @code 108127
     * @param shopIntowh
     * @param rf
     * @param terminalCode
     * @return
     */
    ChemAddReagentRetDTO intoWarehouse( ChemShopIntowhDTO shopIntowh, boolean rf, String terminalCode );
}
