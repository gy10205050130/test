package yxinfo.lis.inf.dto.mbr;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.dto.base.GroupDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.validation.groups.base.Register;
import yxinfo.lis.inf.context.CommonContext;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.party.MemberPartyDTO;
import yxinfo.lis.inf.dto.party.PartyCoreDTO;
import yxinfo.lis.inf.validation.RegexpStr;
import yxinfo.lis.inf.validation.groups.Add;
import yxinfo.lis.inf.validation.groups.Select;
import yxinfo.lis.inf.validation.groups.Update;
import yxinfo.lis.inf.validation.groups.mbr.Login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

/**
 * @author tj
 * @date 2016/9/1 17:14
 *
 */
public class MemberCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -3162015395173224244L;

    //用户id
    @NotNull( groups = { Update.class }, message = ErrorCode.NOT_NULL )
    private Integer id;

    //用户平台id，<FK>sys_member.id
    private Integer baseMemberId;

    //单位id
    private Integer partyId;
    private String partyName;
    private List<PartyCoreDTO> partyCoreDTOList;
    private MemberDTO memberDTO;
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

    //真实姓名
    @Length( groups = { Add.class, Update.class }, max = 30, message = ErrorCode.LENGTH )
    private String realName;

    //昵称
    @Length( groups = { Add.class, Update.class }, max = 30, message = ErrorCode.LENGTH )
    private String nickName;

    //手机号码
    @NotEmpty( groups = { Add.class }, message = ErrorCode.NOT_EMPTY )
    @Pattern( groups = { Add.class, Update.class }, regexp = RegexpStr.MOBILE, message = ErrorCode.Memeber.MOBILE_ERROR )
    private String mobile;

    //头像id
    private Integer head;

    //创建者
    private Integer creator;

    //身份证号码
    private String cardNo;

    //邮箱
    private String email;

    //出生时间
    private Date birthtime;

    //学历
    private Integer education;

    //创建时间
    private Date createAt;

    //更新时间
    private Date updateAt;

    //排序
    private Integer sort;

    //是否被删除（1是, 0否）
    private Boolean isDel;

    //性别（1男2女）
    private Boolean gender;

    //研究方向
    private String researchArea;

    //资质证书
    private String certification;

    //职称id
    private Integer academicTitleId;

    // 是否认证
    private boolean isAuth;

    // 终端设备类型
    @NotNull( groups = { Register.class, Login.class }, message = ErrorCode.NOT_NULL )
    private String terminalType;

    // 用户组
    private List<GroupDTO> groups;

    //人员地址
    private String addr;

    //组id
    private Integer groupId;

    //角色集合
    private List<MemberRoleDTO> memberRoleDTOList;

    //代金券总额（分）
    private Integer voucherAmount;

    //信用积分
    private Integer creditScore;

    //邮政编码
    private String postcode;

    //个人账户余额(预存款)
    private Integer accBalanceImprest;

    public MemberCoreDTO() {
    }

    public MemberCoreDTO(Integer id, Integer baseMemberId, Integer partyId, String partyName, List<PartyCoreDTO> partyCoreDTOList, MemberDTO memberDTO, String loginName, String pwd, String realName, String nickName, String mobile, Integer head, Integer creator, String cardNo, String email, Date birthtime, Integer education, Date createAt, Date updateAt, Integer sort, Boolean isDel, Boolean gender, String researchArea, String certification, Integer academicTitleId, boolean isAuth, String terminalType, List<GroupDTO> groups, String addr, Integer groupId, List<MemberRoleDTO> memberRoleDTOList, Integer voucherAmount, Integer orgId) {
        this.id = id;
        this.baseMemberId = baseMemberId;
        this.partyId = partyId;
        this.partyName = partyName;
        this.partyCoreDTOList = partyCoreDTOList;
        this.memberDTO = memberDTO;
        this.loginName = loginName;
        this.pwd = pwd;
        this.realName = realName;
        this.nickName = nickName;
        this.mobile = mobile;
        this.head = head;
        this.creator = creator;
        this.cardNo = cardNo;
        this.email = email;
        this.birthtime = birthtime;
        this.education = education;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.sort = sort;
        this.isDel = isDel;
        this.gender = gender;
        this.researchArea = researchArea;
        this.certification = certification;
        this.academicTitleId = academicTitleId;
        this.isAuth = isAuth;
        this.terminalType = terminalType;
        this.groups = groups;
        this.addr = addr;
        this.groupId = groupId;
        this.memberRoleDTOList = memberRoleDTOList;
        this.voucherAmount = voucherAmount;
        this.orgId = orgId;
    }

    /**
     * 组织id
     */
    private Integer orgId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBaseMemberId() {
        return baseMemberId;
    }

    public void setBaseMemberId(Integer baseMemberId) {
        this.baseMemberId = baseMemberId;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(Date birthtime) {
        this.birthtime = birthtime;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Integer getAcademicTitleId() {
        return academicTitleId;
    }

    public void setAcademicTitleId(Integer academicTitleId) {
        this.academicTitleId = academicTitleId;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public void setAuth(boolean auth) {
        isAuth = auth;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public List<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDTO> groups) {
        this.groups = groups;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public MemberDTO getMemberDTO() {
        return memberDTO;
    }

    public void setMemberDTO(MemberDTO memberDTO) {
        this.memberDTO = memberDTO;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public List<MemberRoleDTO> getMemberRoleDTOList() {
        return memberRoleDTOList;
    }

    public void setMemberRoleDTOList(List<MemberRoleDTO> memberRoleDTOList) {
        this.memberRoleDTOList = memberRoleDTOList;
    }

    public List<PartyCoreDTO> getPartyCoreDTOList() {
        return partyCoreDTOList;
    }

    public void setPartyCoreDTOList(List<PartyCoreDTO> partyCoreDTOList) {
        this.partyCoreDTOList = partyCoreDTOList;
    }

    public Integer getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(Integer voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getAccBalanceImprest() {
        return accBalanceImprest;
    }

    public void setAccBalanceImprest(Integer accBalanceImprest) {
        this.accBalanceImprest = accBalanceImprest;
    }

    @Override
    public String toString() {
        return "MemberCoreDTO{" +
                "id=" + id +
                ", baseMemberId=" + baseMemberId +
                ", partyId=" + partyId +
                ", partyName='" + partyName + '\'' +
                ", memberDTO=" + memberDTO +
                ", loginName='" + loginName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", head=" + head +
                ", creator=" + creator +
                ", cardNo='" + cardNo + '\'' +
                ", email='" + email + '\'' +
                ", birthtime=" + birthtime +
                ", education=" + education +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", sort=" + sort +
                ", isDel=" + isDel +
                ", gender=" + gender +
                ", researchArea='" + researchArea + '\'' +
                ", certification='" + certification + '\'' +
                ", academicTitleId=" + academicTitleId +
                ", isAuth=" + isAuth +
                ", terminalType='" + terminalType + '\'' +
                ", groups=" + groups +
                ", orgId=" + orgId +
                '}';
    }
}
