package yxinfo.lis.inf.service.topic;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.topic.LisCashCouponDTO;

import java.util.List;

/**
 * Created by cy on 2016/10/21.
 */
public interface LisCashCouponService {

    /**
     * 分页获取代金券申领信息
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<LisCashCouponDTO>> getLisCashCouponList(PageDTO<LisCashCouponDTO> queryPage);

    /**
     * 新增申领代金券记录
     *
     * @param lisCashCouponDTO
     * @return
     */
    Integer addLisCashCoupon(LisCashCouponDTO lisCashCouponDTO);

    /**
     * 更新代金券申领信息
     *
     * @param lisCashCouponDTO
     * @return
     */
    Integer updateLisCashCoupon(LisCashCouponDTO lisCashCouponDTO);

    /**
     * 根据id获取代金券信息
     *
     * @param id
     * @return
     */
    LisCashCouponDTO getLisCashCouponByKey(Integer id);
}
