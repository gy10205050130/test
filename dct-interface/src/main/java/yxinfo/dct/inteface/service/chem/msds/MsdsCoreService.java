package yxinfo.dct.inteface.service.chem.msds;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.msds.MsdsCoreDTO;

import java.util.List;

/**
 * 危险化学品目录服务
 * Created by dy on 2016/12/8.
 */
public interface MsdsCoreService {

    /**
     * 添加MSDS
     * @code 108069
     * @param msdsCoreDTO
     */
    void addMsds( MsdsCoreDTO msdsCoreDTO );

    /**
     * 根据ID获取MSDS
     * @code 108070
     * @param id
     * @return
     */
    MsdsCoreDTO getMsdsById( Integer id, Integer orgId );

    /**
     * 编辑MSDS
     * @code 108071
     * @param msdsCoreDTO
     */
    void editMsds( MsdsCoreDTO msdsCoreDTO );

    /**
     * 分页查询MSDS
     * @code 108072
     * @param page
     * @return 不包含academicInfo/safetyMeasures/statute
     */
    PageDTO<List<MsdsCoreDTO>> msdsPage( PageDTO<MsdsCoreDTO> page );

    /**
     * 查询MSDS数量
     * <p>查询条件cnName/trivialName/cas/riskCate/nature</p>
     * @param msdsCoreDTO
     * @return
     */
    int countMsdsCore( MsdsCoreDTO msdsCoreDTO );
}
