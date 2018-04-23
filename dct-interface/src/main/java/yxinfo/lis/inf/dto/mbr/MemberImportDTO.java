package yxinfo.lis.inf.dto.mbr;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.*;
import yxinfo.dct.inteface.dto.base.RoleDTO;
import yxinfo.dct.inteface.validation.groups.base.Register;

import java.util.List;

/**
 * 导入人员dto
 * <p>
 * Created by cy on 2016/9/9.
 */
public class MemberImportDTO extends BaseDTO {

    /**
     * 静态资源id
     */
    private Integer staticId;

    /**
     * 文件存放地址
     */
    private String url;

    /**
     * token
     */
    private String token;

    /**
     * partyId
     */
    private Integer partyId;

    /**
     * 组织id
     */
    private Integer orgId;

    //分组id
    private Integer groupId;

    // 登录名
    private String loginName;

    // 真实姓名
    private String realName;

    // 手机号
    private String mobile;

    // 用户组织
    private List<OrgDTO> orgs;

    // 用户组
    private List<GroupDTO> groups;

    // 用户角色
    private List<RoleDTO> roles;

    private MemberCoreDTO memberCoreDTO;

    public MemberImportDTO() {
    }

    public MemberImportDTO(MemberCoreDTO memberCoreDTO, List<RoleDTO> roles, Integer staticId, String url, String token, Integer partyId, Integer orgId, Integer groupId, String loginName, String realName, String mobile, List<OrgDTO> orgs, List<GroupDTO> groups) {
        this.memberCoreDTO = memberCoreDTO;
        this.roles = roles;
        this.staticId = staticId;
        this.url = url;
        this.token = token;
        this.partyId = partyId;
        this.orgId = orgId;
        this.groupId = groupId;
        this.loginName = loginName;
        this.realName = realName;
        this.mobile = mobile;
        this.orgs = orgs;
        this.groups = groups;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<OrgDTO> getOrgs() {
        return orgs;
    }

    public void setOrgs(List<OrgDTO> orgs) {
        this.orgs = orgs;
    }

    public List<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDTO> groups) {
        this.groups = groups;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO(MemberCoreDTO memberCoreDTO) {
        this.memberCoreDTO = memberCoreDTO;
    }
}
