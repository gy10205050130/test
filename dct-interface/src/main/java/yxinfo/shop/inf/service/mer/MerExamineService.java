package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerExamineDTO;

/**
 * Created by ZH on 2016/9/1.
 */
public interface MerExamineService {

    /**
     * 商户审核 同意
     * @param merExamineDTO
     * @return
     */
    Integer checkMerDetail ( MerExamineDTO merExamineDTO );

    /**
     * 商户审核 不同意
     * @param merExamineDTO
     * @return
     */
    Integer disagreeMerDetail ( MerExamineDTO merExamineDTO );
}
