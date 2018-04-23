package yxinfo.dct.inteface.service.instrument;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.instrument.InstReserDTO;
import yxinfo.dct.inteface.dto.instrument.InstReserDetailDTO;

import java.util.List;

/**
 * Created by ZH on 2017/1/4.
 */
public interface InstReserDetailService {

    /**
     * 获取仪器预约记录
     * @param queryPage
     * @return
     */
    PageDTO<List<InstReserDTO>> getInstReserDetailDTOPageList(PageDTO<InstReserDetailDTO> queryPage);

    /**
     * 通用查询
     * @param instReserDetailDTO
     * @return
     */
    List<InstReserDetailDTO> getInstReserDetailDTOList (InstReserDetailDTO instReserDetailDTO, Integer type);

    /**
     * 根据订单id修改订单状态使用时间
     * @param instReserDetailDTO
     * @return
     */
    Integer updateInstReserDetailDTO (InstReserDetailDTO instReserDetailDTO);

    /**
     * 获取仪器列表
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstReserDetailDTO>> getInstPageList (PageDTO<InstReserDetailDTO> pageQuery);
}
