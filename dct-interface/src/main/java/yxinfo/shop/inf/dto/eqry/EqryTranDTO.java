package yxinfo.shop.inf.dto.eqry;

import yxinfo.shop.inf.dto.BaseDTO;

public class EqryTranDTO extends BaseDTO {

    private static final long serialVersionUID = 2964714835512990204L;

    private Integer eqryId;

    // 支付卡号
    private String cardNo;

    // 支付人姓名
    private String fname;

    // 支付人用户id
    private Integer memberId;

    // 支付渠道id
    private Integer tranChannel;

    // 交易摘要
    private String summary;

    public Integer getEqryId() {
        return eqryId;
    }

    public void setEqryId( Integer eqryId ) {
        this.eqryId = eqryId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo( String cardNo ) {
        this.cardNo = cardNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel( Integer tranChannel ) {
        this.tranChannel = tranChannel;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary( String summary ) {
        this.summary = summary;
    }
}