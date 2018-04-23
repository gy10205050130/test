package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.inst.InstCollectionDTO;

import java.util.List;

/**
 * Created by xww on 2016/10/12.
 */
public interface InstCollectionService {


    /**
     * 收藏仪器
     *
     * @return
     */
    Integer collectionInst(InstCollectionDTO instCollectionDTO);

    /**
     * 分页获取仪器收藏
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstCollectionDTO>> getInstCollectionDtoList(PageDTO<InstCollectionDTO> pageQuery);


    /**
     * 获取仪器收藏详情
     *
     * @param instCollectionDTO
     * @return
     */
    InstCollectionDTO getInstCollectionDto(InstCollectionDTO instCollectionDTO);

    /**
     * 获取仪器收藏次数
     *
     * @param instCollectionDTO
     * @return
     */
    Integer getInstCollectionNum(InstCollectionDTO instCollectionDTO);


}
