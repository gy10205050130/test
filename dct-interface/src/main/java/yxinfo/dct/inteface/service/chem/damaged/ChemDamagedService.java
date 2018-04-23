package yxinfo.dct.inteface.service.chem.damaged;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.damaged.ChemDamagedDTO;
import yxinfo.dct.inteface.dto.chem.intowh.ChemShopIntowhDTO;

import java.util.List;

/**
 * 报损服务
 * Created by dy on 2017/2/9.
 */
public interface ChemDamagedService {

    /**
     * 扫码获取试剂汇总信息
     * @code 108134
     * @param shopIntowh
     * @param rf true标签码 / false二维码
     * @return
     */
    List<ChemDamagedDTO> getDamagedReagentInfo( ChemShopIntowhDTO shopIntowh, boolean rf );

    /**
     * 报损
     * @code 108135
     * @param shopIntowh
     * @param rf true标签码 / false二维码
     * @param memberId
     */
    void reportDamaged( ChemShopIntowhDTO shopIntowh, boolean rf, Integer memberId );

    /**
     * 报损记录列表
     * @code 108136
     * @param schPage
     * @return
     */
    PageDTO<List<ChemDamagedDTO>> damagedPage( PageDTO<ChemDamagedDTO> schPage );
}
