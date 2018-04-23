package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class ApplyApvDTO extends BaseDTO {

    private static final long serialVersionUID = 5527734388759175627L;

    // 状态（s审核通过, f审核不通过）
    private String status;

    // 审核人姓名
    private String approveMemberName;

    // 审核意见
    private String opinion;

    // 审核时间
    private Date createAt;

    // 审核人id
    private Integer approveMemberId;

    // 私有域
    private String privateField;

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
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

    public Integer getApproveMemberId() {
        return approveMemberId;
    }

    public void setApproveMemberId( Integer approveMemberId ) {
        this.approveMemberId = approveMemberId;
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField( String privateField ) {
        this.privateField = privateField;
    }
}
