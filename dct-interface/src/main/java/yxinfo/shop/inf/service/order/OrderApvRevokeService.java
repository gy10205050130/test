package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.apv.ApvOrderRevokeDTO;

/**
 * Created by dy on 2016/10/15.
 */
public interface OrderApvRevokeService {

    /**
     * 订单审核撤销
     * @code 100033
     * @param apvOrderRevoke
     */
    void orderApvRevoke( ApvOrderRevokeDTO apvOrderRevoke );
}
