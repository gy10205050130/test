package yxinfo.shop.inf.dto.expe;

import yxinfo.shop.inf.dto.BaseDTO;

public class OrderZcmuEDetailDTO extends BaseDTO {

    private static final long serialVersionUID = -3446804791255127935L;

    private Integer id;

    private Integer zcmuExpenseId;

    // 经费卡号
    private String cardNo;

    // 项目名称（经费卡名称）
    private String projectName;

    // 经费负责人id
    private Integer memberId;

    // 经费负责人姓名
    private String mbrRealName;

    // 经费负责人工号
    private String mbrCode;

    // 总金额
    private Long amt;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getZcmuExpenseId() {
        return zcmuExpenseId;
    }

    public void setZcmuExpenseId( Integer zcmuExpenseId ) {
        this.zcmuExpenseId = zcmuExpenseId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo( String cardNo ) {
        this.cardNo = cardNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName( String projectName ) {
        this.projectName = projectName;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getMbrRealName() {
        return mbrRealName;
    }

    public void setMbrRealName( String mbrRealName ) {
        this.mbrRealName = mbrRealName;
    }

    public String getMbrCode() {
        return mbrCode;
    }

    public void setMbrCode( String mbrCode ) {
        this.mbrCode = mbrCode;
    }

    public Long getAmt() {
        return amt;
    }

    public void setAmt( Long amt ) {
        this.amt = amt;
    }
}