package yxinfo.lis.inf.service.order;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.order.InstOrderDTO;
import yxinfo.lis.inf.dto.order.judge.JudgeDTO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xww on 2016/9/6.
 */
public interface InstOrderService {

    /**
     * 创建预约订单
     *
     * @param instOrderDTO
     * @return
     */
    List<Integer> addInstOrder(InstOrderDTO instOrderDTO);

    /**
     * 分页获取预约订单列表
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstOrderDTO>> getInstOrderDtoIdxList(PageDTO<InstOrderDTO> pageQuery);

    /**
     * 更新预约订单详情
     *
     * @param instOrderDTO
     * @return
     */
    Integer updateInstOrder(InstOrderDTO instOrderDTO);

    /**
     * 删除预约订单详情
     *
     * @param instOrderDTO
     * @return
     */
    Integer deleteInstOrder(InstOrderDTO instOrderDTO);

    /**
     * 通过订单id查询订单的详情
     *
     * @param instOrderId
     * @return
     */
    InstOrderDTO getInstOrderDtoById(Integer instOrderId);

    /**
     * 取消预约
     *
     * @param instOrderDTO
     * @return
     */
    Integer cancelOrder(InstOrderDTO instOrderDTO);

    /**
     * 退款订单
     *
     * @param instOrderDTO
     * @return
     */
    Integer refundOrder(InstOrderDTO instOrderDTO);

    /**
     * 退款成功
     *
     * @param instOrderDTO
     * @return
     */
    Integer refundSuccess(InstOrderDTO instOrderDTO);

    /**
     * 完成订单
     *
     * @param instOrderDTO
     * @return
     */
    Integer finishOrder(InstOrderDTO instOrderDTO);

    /**
     * 完成支付
     *
     * @param instOrderDTO
     * @return
     */
    Integer finishPay(InstOrderDTO instOrderDTO);

    /**
     * 设置过期的订单
     *
     * @return
     */
    Integer outTimeOrder();

    /**
     * 设置完成订单
     *
     * @return
     */
    Integer finishOrders();

    /**
     * 获取指定时间的标签时间段
     *
     * @param instOrderDTO
     * @return
     */
    InstOrderDTO getReviewPassTime(InstOrderDTO instOrderDTO);

    /**
     * 获取amount天内的时间段(1.0版本的数据)
     *
     * @param instId
     * @param amount
     * @return
     */
    List<Map<String, Date>> getReviewPassTime(Integer instId, Integer amount);

    /**
     * 汇总每天的订单信息的定时任务中获取订单信息（InstUseSummaryTask）
     *
     * @param instOrderDTO
     * @return
     */
    List<InstOrderDTO> getInstOrderDtoList(InstOrderDTO instOrderDTO);

    /**
     * 最新预约订单
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<InstOrderDTO>> getNewInstOrder(PageDTO<InstOrderDTO> pageQuery);

    /**
     * 通过订单id获取评价信息
     *
     * @param instOrderDTO
     * @return
     */
    JudgeDTO getjudgeDtoByOrderId(InstOrderDTO instOrderDTO);

    /**
     * 通过订单编号查询订单的详情
     *
     * @param instOrderDTO
     * @return
     */
    InstOrderDTO getInstOrderDtoByOrderNo(InstOrderDTO instOrderDTO);

    /**
     * 扫描二维码是否合法，并获取订单详情
     *
     * @param instOrderDTO
     * @return
     */
    InstOrderDTO getInstOrderDtoByOrderNoCheckMac(InstOrderDTO instOrderDTO);

    /**
     * 检测Mac地址是否合法
     *
     * @param instOrderDTO
     * @return
     */
    boolean getOrderNoCheckMac(InstOrderDTO instOrderDTO);

    /**
     * 通过订单id来获取订单详情
     *
     * @param instOrderDTO
     * @return
     */
    InstOrderDTO getOrderDtoById(InstOrderDTO instOrderDTO);

    /**
     * 获取过期了的订单id
     *
     * @return
     */
    List<InstOrderDTO> getOutTimeInstOrder();


}
