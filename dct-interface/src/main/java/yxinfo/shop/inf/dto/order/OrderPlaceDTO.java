package yxinfo.shop.inf.dto.order;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class OrderPlaceDTO extends BaseDTO {

    private static final long serialVersionUID = -4956085861796989250L;

    private Integer id;

    //商户id
    private Integer merId;

    //购买成员id
    private Integer memberId;

    //订单来源使用方id
    private Integer partyId;

    //商户下单号，一次下单中每个商户唯一
    private String merPlaceNo;

    //下单号，一次下单中唯一
    private String placeNo;

    //支付类型（1线下支付，2线上支付）
    private Short payType;

    //交易渠道id
    private Integer tranChannel;

    //创建时间
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public String getMerPlaceNo() {
        return merPlaceNo;
    }

    public void setMerPlaceNo( String merPlaceNo ) {
        this.merPlaceNo = merPlaceNo;
    }

    public String getPlaceNo() {
        return placeNo;
    }

    public void setPlaceNo( String placeNo ) {
        this.placeNo = placeNo;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType( Short payType ) {
        this.payType = payType;
    }

    public Integer getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel( Integer tranChannel ) {
        this.tranChannel = tranChannel;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }
}