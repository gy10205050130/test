package yxinfo.shop.inf.service.eqry;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.eqry.apv.ChooseApvRdDTO;
import yxinfo.shop.inf.dto.eqry.apv.ChooseApvRdSearchDTO;

import java.util.List;

/**
 * Created by dy on 2016/9/30.
 */
public interface EqryChooseApvService {

    /**
     *
     * @code 108015
     * @param apvRdSearchDTOPageDTO
     * @return
     */
    PageDTO<List<ChooseApvRdDTO>> getWaitApvChoosePage( PageDTO<ChooseApvRdSearchDTO> apvRdSearchDTOPageDTO );

    /**
     *
     * @code 108016
     * @param apvRdSearchDTOPageDTO
     * @return
     */
    PageDTO<List<ChooseApvRdDTO>> getHistoryApvChoosePage( PageDTO<ChooseApvRdSearchDTO> apvRdSearchDTOPageDTO );
}
