package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class ApplyApvFlowDTO extends BaseDTO {

    private static final long serialVersionUID = 6425073433402875633L;

    // 审核方案过程名称
    private String fname;

    // 状态（s审核通过, f审核不通过）
    private String status;

    // 审核人id
    private Integer approveMemberId;

    // 审核人姓名
    private String approveMemberName;

    // 审核意见
    private String opinion;

    // 审核时间
    private Date createAt;

    // 私有域
    private String privateField;

    // 流程是否达到
    private Boolean isReach;

    // 图标
    private String icon;

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public Integer getApproveMemberId() {
        return approveMemberId;
    }

    public void setApproveMemberId( Integer approveMemberId ) {
        this.approveMemberId = approveMemberId;
    }

    public String getApproveMemberName() {
        return approveMemberName;
    }

    public void setApproveMemberName( String approveMemberName ) {
        this.approveMemberName = approveMemberName;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion( String opinion ) {
        this.opinion = opinion;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField( String privateField ) {
        this.privateField = privateField;
    }

    public Boolean getIsReach() {
        return isReach;
    }

    public void setIsReach( Boolean reach ) {
        isReach = reach;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon( String icon ) {
        this.icon = icon;
    }
}