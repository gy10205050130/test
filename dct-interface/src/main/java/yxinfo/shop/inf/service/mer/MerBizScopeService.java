package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerBizScopeDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/25.
 */
public interface MerBizScopeService {

    /**
     * 查询商户许可经营范围
     * @param merBizScopeDTO
     * @return
     */
    List<MerBizScopeDTO> getMerBizScopeDTOList(MerBizScopeDTO merBizScopeDTO );

    /**
     * 删除商户许可经营范围
     * @param merId
     * @return
     */
    Integer deleteMerBizScopeByMerId( Integer merId );

    /**
     * 添加商户许可经营范围
     * @param merBizScopeDTO
     * @return
     */
    Integer addMerBizScopeDTO(MerBizScopeDTO merBizScopeDTO);

}
