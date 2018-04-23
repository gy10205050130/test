package yxinfo.shop.inf.dto.order.get;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/10/9.
 */
public class SumPriceDTO extends BaseDTO {

    private static final long serialVersionUID = 7742166824614957686L;

    // 订单总金额（分）, 含运费
    private Long price;

    // 运费（分）
    private Long epsPrice;

    // 实付金额（分）
    private Long actualPay;

    public Long getPrice() {
        return price;
    }

    public void setPrice( Long price ) {
        this.price = price;
    }

    public Long getEpsPrice() {
        return epsPrice;
    }

    public void setEpsPrice( Long epsPrice ) {
        this.epsPrice = epsPrice;
    }

    public Long getActualPay() {
        return actualPay;
    }

    public void setActualPay( Long actualPay ) {
        this.actualPay = actualPay;
    }
}
