package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.InstClassifiedDTO;

import java.util.List;

/**
 * 仪器分类service
 *
 * Created by cy on 2016/10/24.
 */
public interface InstClassifiedService {

    /**
     * 获取仪器分类list
     *
     * @param instClassifiedDTO
     * @return
     */
    List<InstClassifiedDTO> getInstClassifiedList(InstClassifiedDTO instClassifiedDTO);

    /**
     * 获取仪器分类list(包含下级分类)
     *
     * @param instClassifiedDTO
     * @return
     */
    List<InstClassifiedDTO> getInstClassifiedListWithChild(InstClassifiedDTO instClassifiedDTO);

    /**
     * 获取仪器分类信息
     *
     * @param instClassifiedDTO
     * @return
     */
    InstClassifiedDTO getInstClassifiedDto(InstClassifiedDTO instClassifiedDTO);
}
