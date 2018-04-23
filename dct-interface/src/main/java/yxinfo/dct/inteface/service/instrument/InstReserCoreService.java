package yxinfo.dct.inteface.service.instrument;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.approve.ApproveNodeDTO;
import yxinfo.dct.inteface.dto.approve.biz.ApproveNodeRetDTO;
import yxinfo.dct.inteface.dto.instrument.InstReserCoreDTO;

import java.util.List;

/**
 * Created by ZH on 2017/1/3.
 */
public interface InstReserCoreService {

    /**
     * 发布仪器预约
     * @param instReserCoreDTO
     * @return
     */
    InstReserCoreDTO insert(InstReserCoreDTO instReserCoreDTO, String terminal);

    /**
     * 仪器预约列表
     * @param queryPage
     * @return
     */
    PageDTO<List<InstReserCoreDTO>> getInstReserCoreDTOPageList(PageDTO<InstReserCoreDTO> queryPage);

    /**
     * 根据订单id获取订单详情
     * @param id
     * @return
     */
    InstReserCoreDTO getInstReserCoreDTOByKey(Integer id);

    /**
     * 根据审核记录ID获取订单详情
     * @param id
     * @return
     */
    InstReserCoreDTO getInstReserCoreDTOByApvId(Integer id);

    /**
     * 根据订单编号,MAC地址获取订单详情
     * @return
     */
    InstReserCoreDTO getInstReserCoreDTOByMac (InstReserCoreDTO instReserCoreDTO);

    /**
     * 绑定静态资源
     * @param instReserCoreDTO
     * @return
     */
    Integer updateInstReserCoreDTO (InstReserCoreDTO instReserCoreDTO);

    /**
     * 修改仪器预约状态
     * @param id
     * @param type 1开始使用,2结束使用
     * @return
     */
    Integer updateInstReserCoreDTOByKey(Integer id, Integer type);

    /**
     * 仪器预约审核
     * @param approveNodeDTO
     * @param terminal
     * @return
     */
    ApproveNodeRetDTO apvInstReserCoreDTO(ApproveNodeDTO approveNodeDTO, String terminal);

}
