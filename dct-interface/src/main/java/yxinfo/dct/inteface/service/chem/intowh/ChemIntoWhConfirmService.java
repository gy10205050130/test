package yxinfo.dct.inteface.service.chem.intowh;

import java.util.List;

/**
 * 试剂入库确认服务
 * Created by dy on 2016/12/22.
 */
public interface ChemIntoWhConfirmService {

    /**
     * 试剂入库确认
     * @code 108101
     * @param batchId
     * @param memberId
     * @param flag 确认意见, s同意 / f驳回
     * @param terminalCode
     */
    void confirm( Integer batchId, Integer memberId, String flag, String terminalCode );

    /**
     * 试剂入库确认
     * @code 108124
     * @param qrs
     * @param icId
     * @param memberId
     * @param flag
     * @param terminalCode
     */
    void confirmByQr( List<String> qrs, Integer icId, Integer memberId, String flag, String terminalCode );
}
