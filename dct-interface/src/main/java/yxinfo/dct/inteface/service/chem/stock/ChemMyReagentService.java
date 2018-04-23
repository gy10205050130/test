package yxinfo.dct.inteface.service.chem.stock;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.stock.ChemStockSchDTO;
import yxinfo.dct.inteface.dto.chem.stock.MyReagentCountDTO;
import yxinfo.dct.inteface.dto.chem.stock.MyReagentDTO;

import java.util.List;

/**
 * 我的试剂
 * Created by dy on 2016/12/28.
 */
public interface ChemMyReagentService {

    /**
     * 我的试剂
     * @code 108050
     * @param schPage
     * @param memberId
     * @return
     */
    PageDTO<List<MyReagentDTO>> getMyReagentListPage( PageDTO<ChemStockSchDTO> schPage, Integer memberId );

    /**
     * 可调配试剂
     * @code 108102
     * @param schPage
     * @param memberId
     * @return
     */
    PageDTO<List<MyReagentDTO>> getAllocatableReagentListPage( PageDTO<ChemStockSchDTO> schPage, Integer memberId );

    /**
     * 我的试剂数量
     * @code 108051
     * @param memberId
     * @param orgId
     * @return
     */
    MyReagentCountDTO myReagentCount( Integer memberId, Integer orgId );
}
