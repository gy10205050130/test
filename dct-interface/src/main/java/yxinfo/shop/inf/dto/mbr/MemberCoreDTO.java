package yxinfo.shop.inf.dto.mbr;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.validation.groups.base.Register;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.RegexpStr;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Select;
import yxinfo.shop.inf.validation.groups.Update;
import yxinfo.shop.inf.validation.groups.mbr.Login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class MemberCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -3162015395173224244L;

    @NotNull( groups = { Update.class }, message = ErrorCode.NOT_NULL )
    private Integer id;

    // 用户平台id
    private Integer baseMemberId;

    // 使用方id
    @NotNull( groups = { Register.class, Login.class, Add.class, Select.class }, message = ErrorCode.NOT_NULL )
    private Integer partyId;

    // 登录名
    @NotEmpty( groups = { Register.class, Login.class, Add.class, Update.class },
            message = ErrorCode.NOT_EMPTY )
    @Length( groups = { Register.class, Login.class, Add.class, Update.class }, min = 6, max = 30,
            message = ErrorCode.LENGTH )
    private String loginName;

    // 登录密码
    @NotEmpty( groups = { Register.class, Login.class, Add.class },
            message = ErrorCode.NOT_EMPTY )
    @Length( groups = { Register.class, Login.class, Add.class, Update.class }, min = 6, max = 18,
            message = ErrorCode.LENGTH )
    private String pwd;

    // 真实姓名
    @Length( groups = { Add.class, Update.class }, max = 30, message = ErrorCode.LENGTH )
    private String realName;

    // 昵称
    @Length( groups = { Add.class, Update.class }, max = 30, message = ErrorCode.LENGTH )
    private String nickName;

    // 手机号码
    @NotEmpty( groups = { Add.class }, message = ErrorCode.NOT_EMPTY )
    @Pattern( groups = { Add.class, Update.class }, regexp = RegexpStr.MOBILE, message = ErrorCode.Memeber.MOBILE_ERROR )
    private String mobile;

    // 邮箱
    private String email;

    // 头像id
    private Integer head;

    // 创建时间
    private Date createAt;

    // 更新时间
    private Date updateAt;

    // 排序
    private Integer sort;

    // 是否被删除
    private Boolean isDel;

    // 是否认证
    private boolean isAuth;

    // 终端设备类型
    @NotNull( groups = { Register.class, Login.class }, message = ErrorCode.NOT_NULL )
    private String terminalType;

    // 用户使用方对应组织id
    private Integer orgId;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getBaseMemberId() {
        return baseMemberId;
    }

    public void setBaseMemberId( Integer baseMemberId ) {
        this.baseMemberId = baseMemberId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName( String loginName ) {
        this.loginName = loginName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd( String pwd ) {
        this.pwd = pwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName( String realName ) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName( String nickName ) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead( Integer head ) {
        this.head = head;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort( Integer sort ) {
        this.sort = sort;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel( Boolean del ) {
        isDel = del;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public void setAuth( boolean auth ) {
        isAuth = auth;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType( String terminalType ) {
        this.terminalType = terminalType;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }
}
