package yxinfo.lis.inf.dto.payment;

import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.order.InstOrderDTO;
import yxinfo.lis.inf.dto.topic.LisTopicDTO;

import java.util.Date;

/**
 * 订单消费dto
 * <p>
 * Created by cy on 2016/10/18.
 */
public class OrderConsumeDTO extends BaseDTO {

    //订单消费明细id
    private Integer id;

    //人员id
    private Integer memberId;

    //人员名称
    private String memberName;

    //人员联系电话
    private String memberMobile;

    //订单id
    private Integer orderId;
    private InstOrderDTO orderDTO;


    //仪器id
    private Integer instId;

    //仪器名称
    private String instName;

    //仪器所属party
    private Integer instPartyId;

    //仪器所属的平台id
    private Integer platId;

    //支付方式(1支付宝，2经费卡，3代金券,4预付款)
    private Integer payType;
    private Integer payTypeList;

    //支付金额
    private Long payPrice;

    //是否退款(1是，0否)
    private Boolean refund;

    //退款时间
    private Date refundTime;

    //退款金额
    private Long refundPrice;

    //创建时间
    private Date createAt;

    //课题id
    private Integer topicId;

    //课题名称
    private String topicName;

    //课题
    private LisTopicDTO lisTopicDTO;

    //课题负责人id（经费卡或代金券所有人）
    private Integer topicMemberId;

    private String fundsCardNo;

    //课题负责人名称
    private String topicMemberName;

    //课题负责人联系电话
    private String topicMemberMobile;

    private Date statrTime;

    private Date endTime;

    private Integer partyId;

    private String token;

    //查询是否是同一个party（1：是同一个party 2：不是同一个party）
    private String sameParty;

    public OrderConsumeDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public Integer getInstPartyId() {
        return instPartyId;
    }

    public void setInstPartyId(Integer instPartyId) {
        this.instPartyId = instPartyId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public InstOrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(InstOrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPayTypeList() {
        return payTypeList;
    }

    public void setPayTypeList(Integer payTypeList) {
        this.payTypeList = payTypeList;
    }

    public Long getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Long payPrice) {
        this.payPrice = payPrice;
    }

    public Long getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(Long refundPrice) {
        this.refundPrice = refundPrice;
    }

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }


    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public LisTopicDTO getLisTopicDTO() {
        return lisTopicDTO;
    }

    public void setLisTopicDTO(LisTopicDTO lisTopicDTO) {
        this.lisTopicDTO = lisTopicDTO;
    }

    public Integer getTopicMemberId() {
        return topicMemberId;
    }

    public void setTopicMemberId(Integer topicMemberId) {
        this.topicMemberId = topicMemberId;
    }

    public String getFundsCardNo() {
        return fundsCardNo;
    }

    public void setFundsCardNo(String fundsCardNo) {
        this.fundsCardNo = fundsCardNo;
    }

    public String getTopicMemberName() {
        return topicMemberName;
    }

    public void setTopicMemberName(String topicMemberName) {
        this.topicMemberName = topicMemberName;
    }

    public String getTopicMemberMobile() {
        return topicMemberMobile;
    }

    public void setTopicMemberMobile(String topicMemberMobile) {
        this.topicMemberMobile = topicMemberMobile;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public Date getStatrTime() {
        return statrTime;
    }

    public void setStatrTime(Date statrTime) {
        this.statrTime = statrTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSameParty() {
        return sameParty;
    }

    public void setSameParty(String sameParty) {
        this.sameParty = sameParty;
    }

    @Override
    public String toString() {
        return "OrderConsumeDTO{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", orderId=" + orderId +
                ", orderDTO=" + orderDTO +
                ", payType=" + payType +
                ", payPrice=" + payPrice +
                ", refund=" + refund +
                ", refundTime=" + refundTime +
                ", refundPrice=" + refundPrice +
                ", createAt=" + createAt +
                ", topicMemberId=" + topicMemberId +
                ", fundsCardNo='" + fundsCardNo + '\'' +
                ", topicMemberName='" + topicMemberName + '\'' +
                ", topicMemberMobile='" + topicMemberMobile + '\'' +
                '}';
    }
}
