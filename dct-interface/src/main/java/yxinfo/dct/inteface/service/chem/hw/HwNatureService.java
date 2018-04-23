package yxinfo.dct.inteface.service.chem.hw;

import yxinfo.dct.inteface.dto.chem.hw.HwNatureDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/3.
 */
public interface HwNatureService {

    /**
     * 获取危废性质
     * @param id
     * @return
     */
    String getHwNature( Integer id );

    /**
     * 获取危废性质
     * @code 108064
     * @param schData
     * @return
     */
    List<HwNatureDTO> getHwNatures( HwNatureDTO schData );
}
