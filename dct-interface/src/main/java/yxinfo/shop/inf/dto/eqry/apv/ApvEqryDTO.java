package yxinfo.shop.inf.dto.eqry.apv;

import org.hibernate.validator.constraints.Length;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * 审核询价单提交参数DTO
 * Created by dy on 2016/8/20.
 */
public class ApvEqryDTO extends BaseDTO {

    private static final long serialVersionUID = 3318508668016893649L;

    private Integer id;

    // 使用方id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 审核人id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 状态（s审核通过, f审核不通过）
    @Length( max = 1, message = ErrorCode.LENGTH )
    @NotNull( message = ErrorCode.NOT_NULL )
    private String status;

    // 审核意见
    @Length( max = 255, message = ErrorCode.LENGTH )
    private String opinion;

    // 审核流程记录id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer approveRecodeId;

    // 下一节点用户id
    private Integer onMemberId;

    // 是否结束(自由模式专用, 1时结束流程)
    @Length( max = 1, message = ErrorCode.LENGTH )
    private String isEnd;

    // 额外信息
    private Object extraMsg;

    // 私有域
    private String privateField;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion( String opinion ) {
        this.opinion = opinion;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public Integer getOnMemberId() {
        return onMemberId;
    }

    public void setOnMemberId( Integer onMemberId ) {
        this.onMemberId = onMemberId;
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd( String isEnd ) {
        this.isEnd = isEnd;
    }

    public Object getExtraMsg() {
        return extraMsg;
    }

    public void setExtraMsg( Object extraMsg ) {
        this.extraMsg = extraMsg;
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField( String privateField ) {
        this.privateField = privateField;
    }
}
