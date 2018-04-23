package yxinfo.dct.inteface.service.chem.recyc;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;
import yxinfo.dct.inteface.dto.chem.recyc.ChemRecycleDTO;

import java.util.List;

/**
 * 试剂回收数据获取服务
 * Created by dy on 2017/1/16.
 */
public interface ChemRecycGetService {

    /**
     * 分页查询试剂回收记录
     * @code 108120
     * @param chemReagentPage
     * @return
     */
    PageDTO<List<ChemRecycleDTO>> getRecyclePage( PageDTO<ChemReagentDTO> chemReagentPage );

    /**
     * 分页查询试剂回收记录
     * @code 108009
     * @param chemReagentPage
     * @return
     */
    PageDTO<List<ChemRecycleDTO>> getRecyclePageByReagent( PageDTO<ChemReagentDTO> chemReagentPage );

    /**
     * 根据id获取试剂回收记录
     * @param id
     * @return
     */
    ChemRecycleDTO getRecycleById( Integer id );

    /**
     * 根据id获取试剂回收记录、回收用户以及试剂
     * @code 108138
     * @param orgId
     * @param id
     * @return
     */
    ChemRecycleDTO getRecycleWithMemberAndReagentById( Integer orgId, Integer id );
}
