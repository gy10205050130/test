package yxinfo.core.inf.dto.message;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.core.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.Add;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class MessageDTO extends BaseDTO {

    private static final long serialVersionUID = 8952486196237377054L;

    private Integer id;

    // 消息所属平台
    @NotEmpty( groups = Add.class, message = ErrorCode.NOT_NULL )
    private String plat;

    // 通知类型（0仅记录/1APP通知/2APP消息/4短信/5邮件）,多类型通知用","分隔
    @NotEmpty( groups = Add.class, message = ErrorCode.NOT_NULL )
    private String ftype;

    // 事件项目编号
    @NotEmpty( groups = Add.class, message = ErrorCode.NOT_NULL )
    private String itemNo;

    // 计划通知时间
    private Date planAt;

    // 级别（数字越大越优先, 默认为5）
    private Integer flevel;

    // 通知用户id
    private Integer memberId;

    // 通知用户的组织id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer memberOrgId;

    // 通知角色id
    private Integer roleId;

    // 通知成员组id
    private Integer groupId;

    // 通知标签id
    private Integer tagId;

    // 通知组织id
    private Integer orgId;

    // 额外信息id
    private String extraMsgId;

    // 标题
    private String title;

    // 摘要
    private String summary;

    // 创建时间
    private Date createAt;

    // 事件通知内容
    private String context;

    // 终端类型编号
    private String terminal;

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

    public String getFtype() {
        return ftype;
    }

    public void setFtype( String ftype ) {
        this.ftype = ftype;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }

    public Date getPlanAt() {
        return planAt;
    }

    public void setPlanAt( Date planAt ) {
        this.planAt = planAt;
    }

    public Integer getFlevel() {
        return flevel;
    }

    public void setFlevel( Integer flevel ) {
        this.flevel = flevel;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getMemberOrgId() {
        return memberOrgId;
    }

    public void setMemberOrgId( Integer memberOrgId ) {
        this.memberOrgId = memberOrgId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId( Integer roleId ) {
        this.roleId = roleId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId( Integer groupId ) {
        this.groupId = groupId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId( Integer tagId ) {
        this.tagId = tagId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
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

    public String getContext() {
        return context;
    }

    public void setContext( String context ) {
        this.context = context;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal( String terminal ) {
        this.terminal = terminal;
    }
}