package yxinfo.dct.inteface.service.chem.intowh;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.intowh.ChemIntowhBatchDTO;
import yxinfo.dct.inteface.dto.chem.intowh.ChemIntowhConfirmDTO;

import java.util.List;

/**
 * 试剂入库查询服务
 * Created by dy on 2016/12/21.
 */
public interface ChemIntoWhGetService {

    /**
     * 分页查询入库批次记录
     * @code 108044
     * @param chemReagentSchDTOPageDTO
     * @return
     */
    PageDTO<List<ChemIntowhBatchDTO>> getIntowhBatchPage( PageDTO<ChemIntowhBatchDTO> chemReagentSchDTOPageDTO );

    /**
     * 获取入库确认
     * @code 108100
     * @param icId
     * @param memberId
     * @return
     */
    ChemIntowhConfirmDTO getIntowhConfirm( Integer icId, Integer memberId );
}
