package yxinfo.shop.inf.service.order;

import yxinfo.shop.inf.dto.order.eps.ConfirmReceiptDTO;
import yxinfo.shop.inf.dto.order.eps.DeliverGoodsDTO;

import java.util.Date;

/**
 * Created by dy on 2016/8/26.
 */
public interface OrderEpsService {

    /**
     * 发货
     * @code 100013
     * @param deliverGoods
     */
    void deliverGoods( DeliverGoodsDTO deliverGoods );

    /**
     * 确认收货
     * @code 100014
     * @param confirmReceipt
     */
    void confirmReceipt( ConfirmReceiptDTO confirmReceipt );

    /**
     * 更新出入库相关信息, 并在全部入库后确认收货
     * @param intowhStatus 出入库状态 0未入库/1已入库
     * @param intoAt 入库时间
     * @param orderDetailId
     */
    void updateOrderDetailWHAndConfirmReceipt( Short intowhStatus, Date intoAt, Integer orderDetailId );
}
