package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerGoodsCatListDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public interface MerGoodsCatListService {

    /**
     * 合作商家列表
     * @param partyId
     * @param numPerPage 显示几家商户
     * @return
     */
    List <MerGoodsCatListDTO> getMerGoodsCatListDTO ( Integer partyId , Integer numPerPage );
}
