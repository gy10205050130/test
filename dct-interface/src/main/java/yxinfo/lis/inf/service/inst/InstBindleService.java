package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.InstBindleDTO;

import java.util.List;

/**
 * Created by xww on 2016/10/10.
 */
public interface InstBindleService {

    /**
     * 通过订单编号来获取设备信息
     *
     * @return
     */
    List<InstBindleDTO> getInstBindleList(InstBindleDTO instBindleDTO);

    /**
     * 绑定设备
     *
     * @return
     */
    Integer bindleInst(InstBindleDTO instBindleDTO);

    /**
     * 删除设备
     *
     * @param instBindleDTO
     * @return
     */
    Integer deleteInst(InstBindleDTO instBindleDTO);

    /**
     * 更新绑定设备信息
     *
     * @param instBindleDTO
     * @return
     */
    Integer updateInstBindle(InstBindleDTO instBindleDTO);

    /**
     * 编辑设备
     *
     * @param instBindleDTO
     * @return
     */
    Integer updateInst(InstBindleDTO instBindleDTO);

    /**
     * 开启设备仪器
     *
     * @param orderNo
     * @return
     */
    Integer startInst(String orderNo);

    /**
     * 结束设备仪器
     *
     * @param orderNo
     * @return
     */
    Integer endInst(String orderNo);

}
