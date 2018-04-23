package yxinfo.dct.inteface.service.chem.intowh;

import yxinfo.dct.inteface.dto.chem.intowh.ChemAddReagentRetDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;
import yxinfo.dct.inteface.dto.wh.WhDTO;

import java.util.List;

/**
 * 试剂入库服务
 * Created by dy on 2016/12/20.
 */
public interface ChemIntoWhService {

    /**
     * 试剂入库
     * @code 108014
     * @param reagentDTO
     * @param rf true标签码 / false二维码
     * @param closeDoubleMgt true不使用五双管理
     * @param terminalCode
     * @return
     */
    ChemAddReagentRetDTO addReagent( ChemReagentDTO reagentDTO, boolean rf, boolean closeDoubleMgt, String terminalCode );

    /**
     * 按入库批次修改试剂
     * @code 108045
     * @param batchId
     * @param reagentDTO
     * @param terminalCode
     */
    ChemAddReagentRetDTO editReagentByBatch( Integer batchId, ChemReagentDTO reagentDTO, String terminalCode );

    /**
     * 按入库批次重新入库试剂
     * <p>不判断是否需要双人管理</p>
     * @param batchId
     * @param reagentDTO
     * @param terminalCode
     * @return
     */
    ChemAddReagentRetDTO reintoWhByBatch( Integer batchId, ChemReagentDTO reagentDTO, String terminalCode );

    /**
     * 更新RFCODE为已使用
     * @param rfcodes 明码
     */
    void setRfcodeUsed( List<String> rfcodes );

    /**
     * 检查并获取仓库
     * @param whId
     * @param orgId
     * @return
     */
    WhDTO checkWarehouse( String whId, Integer orgId );

    /**
     * 检查试剂是否为剧毒品
     * @param name
     * @return
     */
    boolean checkHighlyToxic( String name );
}
