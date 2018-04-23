package yxinfo.dct.inteface.service.chem.global;

import yxinfo.dct.inteface.dto.chem.global.ChemGlobalInfoDTO;
import yxinfo.dct.inteface.dto.chem.global.ChemSearchRetDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ReagentSchDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveReagentDTO;

import java.util.List;

/**
 * Created by dy on 2017/1/14.
 */
public interface ChemGlobalService {

    /**
     * 全局搜索
     * @code 108119
     * @param schData
     * @param memberId
     * @return
     */
    ChemSearchRetDTO search( ReagentSchDTO schData, Integer memberId );

    /**
     * 全局扫码获取信息
     * @code 108137
     * @param qr
     * @return
     */
    ChemGlobalInfoDTO getInfoByQr( ApplyReceiveReagentDTO applyReceiveReagent );

    /**
     * 获取热门搜索
     * @code 108130
     * @param orgId
     * @param pageLen
     * @param type
     * @return
     */
    List<String> getHot( Integer orgId, Integer pageLe, String type );

    /**
     * 增加热门搜索热度
     * @param schText
     * @param orgId
     * @param hot
     * @param type
     * @return
     */
    Integer plusHot( String schText, int orgId, int hot, String type );
}
