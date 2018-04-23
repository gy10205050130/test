package yxinfo.lis.inf.service.order;

import yxinfo.lis.inf.dto.order.InstOrderTimesDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by xww on 2016/10/17.
 */
public interface InstOrderTimesService {


    /**
     * 添加时间段
     *
     * @param instOrderTimesDTO
     * @return
     */
    Integer addInstOrderTimes(InstOrderTimesDTO instOrderTimesDTO);

    /**
     * 根据仪器id来获取当天时间段
     * code
     *
     * @param instOrderTimesDTO
     * @return
     */
    String getInstOrderTimesDTO(InstOrderTimesDTO instOrderTimesDTO);

    /**
     * 通过仪器id来获取7天内时间段
     *
     * @param instOrderTimesDTO
     * @return
     */
    String getSelectedTimesByKey(InstOrderTimesDTO instOrderTimesDTO);

    /**
     * 通过仪器id来获取每天的时间段的个数
     *
     * @param instOrderTimesDTO
     * @return
     */
    List<Map<String, Object>> getTimesNumsByKey(InstOrderTimesDTO instOrderTimesDTO);

    /**
     * 根據id删除时间段
     * code
     *
     * @param instOrderTimesDTO
     */
    Integer deleteInstOrderTimesById(InstOrderTimesDTO instOrderTimesDTO);

    /**
     * 根据id修改时间段
     * code
     *
     * @param instOrderTimesDTO
     * @return
     */
    Integer updateInstOrderTimes(InstOrderTimesDTO instOrderTimesDTO);

}
