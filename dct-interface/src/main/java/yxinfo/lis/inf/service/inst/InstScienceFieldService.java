package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.inst.InstScienceFieldDTO;

import java.util.List;

/**
 * Created by xww on 2016/10/21.
 */
public interface InstScienceFieldService {

    /**
     * 上传仪器学科领域
     *
     * @param instScienceFieldDTOList
     * @return
     */
    Integer addInstScienceField(List<InstScienceFieldDTO> instScienceFieldDTOList);

    /**
     * 编辑仪器学科领域
     * code
     *
     * @param instScienceFieldDTO
     * @return
     */
    Integer updateInstScienceField(InstScienceFieldDTO instScienceFieldDTO);

    /**
     * 删除学科领域
     *
     * @param instScienceFieldDTO
     * @return
     */
    Integer deleteInstScienceFieldById(InstScienceFieldDTO instScienceFieldDTO);

    /**
     * 分页获取仪器学科领域
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstScienceFieldDTO>> getInstScienceFieldDtoIdxList(PageDTO<InstScienceFieldDTO> pageQuery);

    /**
     * 获取仪器学科领域
     *
     * @param instScienceFieldDTO
     * @return
     */
    List<InstScienceFieldDTO> getInstScienceFieldDtoIdxList(InstScienceFieldDTO instScienceFieldDTO);

}
