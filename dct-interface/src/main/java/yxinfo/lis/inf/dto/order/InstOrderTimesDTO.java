package yxinfo.lis.inf.dto.order;

import yxinfo.lis.inf.dto.BaseDTO;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by xww on 2016/10/17.
 */
public class InstOrderTimesDTO extends BaseDTO {

    //仪器预约时间段id
    private Integer id;

    //仪器id
    private Integer instId;

    //订单id
    private Integer orderId;

    //预约日期
    private Date orderDate;

    //时间段(服务器传返回)
    private String orderTimes;

    //时间段数组(客户端传过来)
    private String[] orderTime;

    //时间段个数
    private Integer timesNum;

    //订单创建时间
    private Date createAt;

    //想要获取时间段的天数
    private Integer days;

    //开放时间(1周一到周五，2周六周日，3周一到周日)
    private Integer openTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderTimes() {
        return orderTimes;
    }

    public void setOrderTimes(String orderTimes) {
        this.orderTimes = orderTimes;
    }

    public Integer getTimesNum() {
        return timesNum;
    }

    public void setTimesNum(Integer timesNum) {
        this.timesNum = timesNum;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String[] getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String[] orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    @Override
    public String toString() {
        return "InstOrderTimesDTO{" +
                "createAt=" + createAt +
                ", id=" + id +
                ", instId=" + instId +
                ", orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderTimes='" + orderTimes + '\'' +
                ", orderTime=" + Arrays.toString(orderTime) +
                ", timesNum=" + timesNum +
                ", days=" + days +
                '}';
    }
}
