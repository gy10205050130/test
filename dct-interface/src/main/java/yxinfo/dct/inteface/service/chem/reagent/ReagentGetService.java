package yxinfo.dct.inteface.service.chem.reagent;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyReceiveDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;
import yxinfo.dct.inteface.dto.chem.reagent.biz.ChemReagentSchDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveReagentDTO;

import java.util.List;

/**
 * 试剂查询服务
 * Created by dy on 2016/12/24.
 */
public interface ReagentGetService {

    /**
     * 校验二维码
     * @param rfCodeEncry
     * @return 校验成功返回明码, 检验不通过返回null
     */
    String checkRfCodeQr( String rfCodeEncry );

    /**
     * 校验标签码
     * @param rfCodeEncry
     * @return 校验成功返回明码, 检验不通过返回null
     */
    String checkRfCodeRf( String rfCodeEncry );

    /**
     * 根据明码获取试剂
     * @param rfCode 明码
     * @return 返回DTO中的rfFcode为二维码
     */
    ChemReagentDTO getReagentByRfCode( String rfCode );

    /**
     * 根据明码检查试剂是否存在
     * @param rfCode 明码
     * @return
     */
    boolean checkReagentExistByRfCode( String rfCode );

    /**
     * 根据明码获取试剂（行级锁）
     * @param rfCode 明码
     * @return 返回DTO中的rfFcode为二维码
     */
    ChemReagentDTO getReagentByRfCodeForUpdate( String rfCode );

    /**
     * 获取试剂信息
     * @code 108121
     * @param receiveReagentDTO
     * @return
     */
    ChemReagentDTO getReagentInfo( ApplyReceiveReagentDTO receiveReagentDTO );

    /**
     * 根据id获取试剂
     * @code 108034
     * @param chemReagentId
     * @return
     * @throws Exception
     */
    ChemReagentDTO getReagentById( Integer id );

    /**
     * 试剂列表
     * @code 108016
     * @param chemReagentPage
     * @return
     */
    PageDTO<List<ChemReagentDTO>> getReagentPage( PageDTO<ChemReagentSchDTO> chemReagentSchDTOPageDTO );

    /**
     * 混放预警试剂列表
     * @code 108041
     * @param chemReagentSchDTOPageDTO
     * @return
     */
    PageDTO<List<ChemReagentDTO>> getReagentForMixPage( PageDTO<ChemReagentSchDTO> chemReagentSchDTOPageDTO );

    /**
     * 试剂列表导出
     * @code 108032
     * @param chemAReceiveSchDTO
     * @param token
     * @return
     */
    String getReagentExport( ChemReagentSchDTO chemAReceiveSchDTO, String token );

    /**
     * 领用预警试剂列表
     * @code 108036
     * @param applyReceiveDTOs
     * @return
     */
    List<ApplyReceiveDTO> getReceiveInReagentIdsAndArIds( List<ApplyReceiveDTO> applyReceiveDTOs );
}
