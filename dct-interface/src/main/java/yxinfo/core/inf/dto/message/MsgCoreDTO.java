package yxinfo.core.inf.dto.message;

import yxinfo.dct.inteface.context.errcode.core.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.Select;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class MsgCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -7412745048917081713L;

    private Integer id;

    // 消息所属平台
    private String plat;

    // 通知项目编号
    private String itemNo;

    // 通知组织id
    @NotNull( groups = Select.class, message = ErrorCode.NOT_NULL )
    private Integer orgId;

    // 通知用户id
    @NotNull( groups = Select.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 额外信息id
    private String extraMsgId;

    // 标题
    private String title;

    // 摘要
    private String summary;

    // 创建时间
    private Date createAt;

    // 是否已读（0未读，1已读）
    private Boolean hasRead;

    // 内容
    private String context;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat( String plat ) {
        this.plat = plat;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getExtraMsgId() {
        return extraMsgId;
    }

    public void setExtraMsgId( String extraMsgId ) {
        this.extraMsgId = extraMsgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary( String summary ) {
        this.summary = summary;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Boolean getHasRead() {
        return hasRead;
    }

    public void setHasRead( Boolean hasRead ) {
        this.hasRead = hasRead;
    }

    public String getContext() {
        return context;
    }

    public void setContext( String context ) {
        this.context = context;
    }
}