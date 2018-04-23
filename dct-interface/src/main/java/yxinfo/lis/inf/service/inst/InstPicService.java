package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.inst.InstPicDTO;
import java.util.List;

/**
 * Created by Administrator on 2016/9/5.
 */
public interface InstPicService {


    /**
     * 上传仪器图片
     *
     * @param instId
     * @return
     */
    Integer uploadInstPic(Integer instId, List<InstPicDTO> instPicDTOList);

    /**
     * 编辑仪器图片
     * code
     *
     * @param instPicDTO
     * @return
     */
    Integer updateInstPic(InstPicDTO instPicDTO);

    /**
     * 通过图片图片资源id、仪器id来删除仪器图片
     *
     * @param instId
     * @return
     */
    Integer deleteInstPicById(Integer instId);

    /**
     * 分页获取仪器图片
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstPicDTO>> getInstPicDtoIdxList(PageDTO<InstPicDTO> pageQuery);

    /**
     * 获取仪器的酥油图片
     *
     * @param instPicDTO
     * @return
     */
    List<InstPicDTO> getInstPicDtoList(InstPicDTO instPicDTO);


}
