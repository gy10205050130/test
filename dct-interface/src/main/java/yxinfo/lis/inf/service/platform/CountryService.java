package yxinfo.lis.inf.service.platform;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.platform.CountryDTO;

import java.util.List;

/**
 * 国别service
 *
 * Created by cy on 2016/10/30.
 */
public interface CountryService {

    /**
     * 根据code获取contry
     *
     * @param code
     * @return
     */
    CountryDTO getCountryByCode(Integer code);

    /**
     * 获取country列表
     *
     * @param dto
     * @return
     */
    List<CountryDTO> getCountryDtoList(CountryDTO dto);

}
