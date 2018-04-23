package yxinfo.dct.inteface.service.chem.stock;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;
import yxinfo.dct.inteface.dto.chem.stock.*;

import java.util.List;

/**
 * 库存管理
 * Created by dy on 2016/10/18.
 */
public interface ChemStockService {

    /**
     * 库存试剂列表
     * @code 108047
     * @param schPage
     * @return
     */
    PageDTO<List<ChemStockDTO>> getStockListPage( PageDTO<ChemStockSchDTO> schPage );

    /**
     * 库存试剂归属明细
     * @code 108049
     * @param schData
     * @return
     */
    List<ChemStockMbrDTO> getBelongMbrList( ChemBelongSchDTO schData );

    /**
     * 按试剂位置（siteMsg）、试剂名称（chemName）统计库存中与使用中的试剂数量
     * @param reagentDTO
     * @return
     */
    List<MyReagentDTO> getReagentStockByWhere( ChemReagentDTO reagentDTO );
}
