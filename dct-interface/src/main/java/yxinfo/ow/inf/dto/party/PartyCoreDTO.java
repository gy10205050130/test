package yxinfo.ow.inf.dto.party;

import yxinfo.dct.inteface.dto.base.GroupDTO;
import yxinfo.ow.inf.dto.BaseDTO;
import yxinfo.ow.inf.dto.mbr.MemberRoleDTO;
import yxinfo.ow.inf.dto.mbr.RoleMenuDTO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PartyCoreDTO extends BaseDTO {

    private static final long serialVersionUID = 4527233106190505869L;
    
    private Integer id;

    //平台组织id
    private Integer orgId;

    //单位名称
    private String fname;

    //地址
    private String address;

    //是否专业测试服务中心(1是，0否)
    private Boolean isMajoredTest;

    //经度
    private BigDecimal lat;

    //纬度
    private BigDecimal lng;

    //单位介绍
    private String fdescribe;

    //创建时间
    private Date createAt;

    //更新时间
    private Date updateAt;

    //是否被删除（1是, 0否）
    private Boolean isDel;

    //排序
    private Integer sort;

    //组织余额（分）
    private Integer bal;

    //联系人
    private String contactName;

    //职称
    private Integer academicTitleId;

    //手机号码
    private String mobile;

    //固定电话
    private String fixedTel;

    //电子邮箱
    private String email;

    //状态（1正常，2禁用）
    private Short fstatus;

    //组织机构代码
    private String organizationCode;

    //上级行政主管部门
    private String superiorDepartment;

    //单位属性
    private Integer partyAttr;

    //在线服务平台网址
    private String onlineUrl;

    //传真
    private String fax;

    //邮政编码
    private String postcode;

    //单位的预存款
    private Integer imprestMoney;

    //用户组list
    private List<GroupDTO> groupDTOList;

    //单位定制信息
    private PartyCustomizedDTO partyCustomizedDTO;

    //人员在该单位中的角色（1有课题2附属单位3校外）
    private Integer memberType;

    //角色集合
    private List<MemberRoleDTO> memberRoleList;

    private List<RoleMenuDTO> roleMenuList;

    private MemberPartyDTO memberPartyDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getIsMajoredTest() {
        return isMajoredTest;
    }

    public void setIsMajoredTest(Boolean majoredTest) {
        isMajoredTest = majoredTest;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getFdescribe() {
        return fdescribe;
    }

    public void setFdescribe(String fdescribe) {
        this.fdescribe = fdescribe;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean del) {
        isDel = del;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getBal() {
        return bal;
    }

    public void setBal(Integer bal) {
        this.bal = bal;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getAcademicTitleId() {
        return academicTitleId;
    }

    public void setAcademicTitleId(Integer academicTitleId) {
        this.academicTitleId = academicTitleId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFixedTel() {
        return fixedTel;
    }

    public void setFixedTel(String fixedTel) {
        this.fixedTel = fixedTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus(Short fstatus) {
        this.fstatus = fstatus;
    }

    public List<GroupDTO> getGroupDTOList() {
        return groupDTOList;
    }

    public void setGroupDTOList(List<GroupDTO> groupDTOList) {
        this.groupDTOList = groupDTOList;
    }

    public PartyCustomizedDTO getPartyCustomizedDTO() {
        return partyCustomizedDTO;
    }

    public void setPartyCustomizedDTO(PartyCustomizedDTO partyCustomizedDTO) {
        this.partyCustomizedDTO = partyCustomizedDTO;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getSuperiorDepartment() {
        return superiorDepartment;
    }

    public void setSuperiorDepartment(String superiorDepartment) {
        this.superiorDepartment = superiorDepartment;
    }

    public Integer getPartyAttr() {
        return partyAttr;
    }

    public void setPartyAttr(Integer partyAttr) {
        this.partyAttr = partyAttr;
    }

    public String getOnlineUrl() {
        return onlineUrl;
    }

    public void setOnlineUrl(String onlineUrl) {
        this.onlineUrl = onlineUrl;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getImprestMoney() {
        return imprestMoney;
    }

    public void setImprestMoney(Integer imprestMoney) {
        this.imprestMoney = imprestMoney;
    }

    public List<MemberRoleDTO> getMemberRoleList() {
        return memberRoleList;
    }

    public void setMemberRoleList(List<MemberRoleDTO> memberRoleList) {
        this.memberRoleList = memberRoleList;
    }

    public List<RoleMenuDTO> getRoleMenuList() {
        return roleMenuList;
    }

    public void setRoleMenuList(List<RoleMenuDTO> roleMenuList) {
        this.roleMenuList = roleMenuList;
    }

    public MemberPartyDTO getMemberPartyDTO() {
        return memberPartyDTO;
    }

    public void setMemberPartyDTO(MemberPartyDTO memberPartyDTO) {
        this.memberPartyDTO = memberPartyDTO;
    }
}