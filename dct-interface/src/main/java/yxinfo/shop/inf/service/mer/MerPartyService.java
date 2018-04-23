package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.mer.MerPartyDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/10.
 */
public interface MerPartyService {

    /**
     * 根据使用方id获取合作商户
     * @param queryPage
     * @param partyId
     * @return
     */
    PageDTO<List<MerPartyDTO>> getMerPartyDTOList ( PageDTO<MerPartyDTO> queryPage , Integer partyId );

    /**
     * 根据使用方id获取所有合作商户
     * @param partyId
     * @return
     */
    List<MerPartyDTO> getMerPartyDTOListByPartyId ( Integer partyId );

    /**
     * 修改使用方合作商户
     * @param merPartyDTO
     * @return
     */
    Integer updateMerPartyDTO ( MerPartyDTO merPartyDTO );

    /**
     * 添加使用方合作商户
     * @param merPartyDTO
     * @return
     */
    Integer addMerPartyDTO ( MerPartyDTO merPartyDTO );

    /**
     * 判断商户是否属于这个平台
     * @param merId
     * @param partyId
     * @return
     */
    Boolean checkMerParty ( Integer merId , Integer partyId );

    /**
     * 根据商户ID获取所有的平台
     * @param merId
     * @return
     */
    List<MerPartyDTO> getMerPartyDTOListByMerId( Integer merId , Integer partyId );

    /**
     * 根据商户id删除所属平台
     * @param merId
     * @return
     */
    Integer deleteMerPartyDTOByMerId ( Integer merId );
}
