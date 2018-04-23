package yxinfo.shop.inf.dto.tran;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * 支付请求DTO
 * Created by dy on 2016/8/17.
 */
public class TranRequestDTO extends BaseDTO {

    private static final long serialVersionUID = -6061697283651101893L;

    // 支付渠道
    private TranChannelDTO tranChannel;

    // 支付的订单
    private List<TranRequestOrderDTO> orders;

    public TranChannelDTO getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel( TranChannelDTO tranChannel ) {
        this.tranChannel = tranChannel;
    }

    public List<TranRequestOrderDTO> getOrders() {
        return orders;
    }

    public void setOrders( List<TranRequestOrderDTO> orders ) {
        this.orders = orders;
    }
}
