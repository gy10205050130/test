package yxinfo.lis.inf.service.platform;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.platform.ScienceFieldDTO;

import java.util.List;

/**
 * Created by cy on 2016/10/21.
 */
public interface ScienceFieldService {

    /**
     * 主键获取学科领域信息
     *
     * @param scienceFieldId
     * @return
     */
    ScienceFieldDTO getScienceFieldByKey(Integer scienceFieldId);

    /**
     * 分页获取学科领域信息
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<ScienceFieldDTO>> getPageScienceFieldList(PageDTO<ScienceFieldDTO> queryPage);


}
