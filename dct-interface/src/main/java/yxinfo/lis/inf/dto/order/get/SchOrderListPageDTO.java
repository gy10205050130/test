package yxinfo.lis.inf.dto.order.get;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.order.get.SelectPageMbr;
import yxinfo.lis.inf.validation.groups.order.get.SelectPageMer;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/23.
 */
public class SchOrderListPageDTO extends BaseDTO {

    private static final long serialVersionUID = 457113152173113305L;

    // 用户id
    @NotNull( groups = SelectPageMbr.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    private String schText;

    // 下单时间From
    private Date createAtFrom;

    // 下单时间To
    private Date createAtTo;

    // 订单查询条件
    //private List<OrderCoreDTO> orderStatusIn;

    // 商户id
    @NotNull( groups = SelectPageMer.class, message = ErrorCode.NOT_NULL )
    private Integer merId;

    // ============================ 扩展信息 ============================
    // 商品信息
    private String goodsName;

    // 客户姓名
    private String memberName;

    // 订单号
    private String orderNo;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public Date getCreateAtFrom() {
        return createAtFrom;
    }

    public void setCreateAtFrom( Date createAtFrom ) {
        this.createAtFrom = createAtFrom;
    }

    public Date getCreateAtTo() {
        return createAtTo;
    }

    public void setCreateAtTo( Date createAtTo ) {
        this.createAtTo = createAtTo;
    }


    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    /*public List<OrderCoreDTO> getOrderStatusIn() {
        return orderStatusIn;
    }

    public void setOrderStatusIn( List<OrderCoreDTO> orderStatusIn ) {
        this.orderStatusIn = orderStatusIn;
    }*/

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName( String goodsName ) {
        this.goodsName = goodsName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName( String memberName ) {
        this.memberName = memberName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo( String orderNo ) {
        this.orderNo = orderNo;
    }
}
