package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by ZH on 2016/8/10.
 */
public class MerMaterialDTO extends BaseDTO{

    private Integer merId;

    private Integer memberId;

    private Short authStatus;

    private String merName;

    private String opinion;

    //联系人
    private String contactPerson;

    //联系人电话
    private String contactPhone;

    //商户类型（1入驻，2合作）
    private Short ftype;

    //所属平台
    private Integer partyId;

    private MerPosDTO merPosDTO;

    private MerAuthDTO merAuthDTO;

    //主营
    private List<MerBizScopeDTO> merBizScopeDTOList;

    //组织机构代码证
    private Integer orgCodeCertId;

    private Integer orgCodeCertQualId;

    private Integer orgCodeCertResId;

    private Date orgCodeCertDate;

    //法定代表人
    private String person;

    private Integer  personQualId;

    private Integer personResId;

    //法定代表人身份证
    private String idCard;

    private Integer idCardResId;

    //法定代表人联系方式
    private String information;

    private Integer informationResId;

    //logo
    private Integer logoId;

    //税务登记证
    private Integer taxRegistrationId;

    private Integer taxRegistrationResId;

    private Integer taxRegistrationQualId;

    private Date taxRegistrationDate;

    //营业执照
    private Integer busLicenseId;

    private Integer busLicenseQualId;

    private Integer busLicenseResId;

    private Date busLicenseDate;

    //经营许可证
    private Integer busCertificateId;

    private Integer busCertificateQualId;

    private Integer busCertificateResId;

    private Date busCertificateDate;

    //危化品执照
    private Integer chemLicenseId;

    private Integer chemLicenseQualId;

    private Integer chemLicenseResId;

    private Date chemLicenseDate;

    //物流运输资质
    private Integer tranLicenseId;

    private Integer tranLicenseQualId;

    private Integer tranLicenseResId;

    private Date tranLicenseDate;

    //仓库地址
    private List<MerWarehouseDTO> merWarehouseDTOList;

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public MerPosDTO getMerPosDTO() {
        return merPosDTO;
    }

    public void setMerPosDTO(MerPosDTO merPosDTO) {
        this.merPosDTO = merPosDTO;
    }

    public MerAuthDTO getMerAuthDTO() {
        return merAuthDTO;
    }

    public void setMerAuthDTO(MerAuthDTO merAuthDTO) {
        this.merAuthDTO = merAuthDTO;
    }

    public List<MerBizScopeDTO> getMerBizScopeDTOList() {
        return merBizScopeDTOList;
    }

    public void setMerBizScopeDTOList(List<MerBizScopeDTO> merBizScopeDTOList) {
        this.merBizScopeDTOList = merBizScopeDTOList;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Integer getPersonQualId() {
        return personQualId;
    }

    public void setPersonQualId(Integer personQualId) {
        this.personQualId = personQualId;
    }

    public Integer getPersonResId() {
        return personResId;
    }

    public void setPersonResId(Integer personResId) {
        this.personResId = personResId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getIdCardResId() {
        return idCardResId;
    }

    public void setIdCardResId(Integer idCardResId) {
        this.idCardResId = idCardResId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Integer getInformationResId() {
        return informationResId;
    }

    public void setInformationResId(Integer informationResId) {
        this.informationResId = informationResId;
    }

    public Integer getLogoId() {
        return logoId;
    }

    public void setLogoId(Integer logoId) {
        this.logoId = logoId;
    }

    public Integer getTaxRegistrationId() {
        return taxRegistrationId;
    }

    public void setTaxRegistrationId(Integer taxRegistrationId) {
        this.taxRegistrationId = taxRegistrationId;
    }

    public Integer getTaxRegistrationResId() {
        return taxRegistrationResId;
    }

    public void setTaxRegistrationResId(Integer taxRegistrationResId) {
        this.taxRegistrationResId = taxRegistrationResId;
    }

    public Integer getTaxRegistrationQualId() {
        return taxRegistrationQualId;
    }

    public void setTaxRegistrationQualId(Integer taxRegistrationQualId) {
        this.taxRegistrationQualId = taxRegistrationQualId;
    }

    public Date getTaxRegistrationDate() {
        return taxRegistrationDate;
    }

    public void setTaxRegistrationDate(Date taxRegistrationDate) {
        this.taxRegistrationDate = taxRegistrationDate;
    }

    public Integer getBusLicenseId() {
        return busLicenseId;
    }

    public void setBusLicenseId(Integer busLicenseId) {
        this.busLicenseId = busLicenseId;
    }

    public Integer getBusLicenseQualId() {
        return busLicenseQualId;
    }

    public void setBusLicenseQualId(Integer busLicenseQualId) {
        this.busLicenseQualId = busLicenseQualId;
    }

    public Integer getBusLicenseResId() {
        return busLicenseResId;
    }

    public void setBusLicenseResId(Integer busLicenseResId) {
        this.busLicenseResId = busLicenseResId;
    }

    public Date getBusLicenseDate() {
        return busLicenseDate;
    }

    public void setBusLicenseDate(Date busLicenseDate) {
        this.busLicenseDate = busLicenseDate;
    }

    public Integer getOrgCodeCertId() {
        return orgCodeCertId;
    }

    public void setOrgCodeCertId(Integer orgCodeCertId) {
        this.orgCodeCertId = orgCodeCertId;
    }

    public Integer getOrgCodeCertQualId() {
        return orgCodeCertQualId;
    }

    public void setOrgCodeCertQualId(Integer orgCodeCertQualId) {
        this.orgCodeCertQualId = orgCodeCertQualId;
    }

    public Integer getOrgCodeCertResId() {
        return orgCodeCertResId;
    }

    public void setOrgCodeCertResId(Integer orgCodeCertResId) {
        this.orgCodeCertResId = orgCodeCertResId;
    }

    public Integer getBusCertificateId() {
        return busCertificateId;
    }

    public void setBusCertificateId(Integer busCertificateId) {
        this.busCertificateId = busCertificateId;
    }

    public Integer getBusCertificateQualId() {
        return busCertificateQualId;
    }

    public void setBusCertificateQualId(Integer busCertificateQualId) {
        this.busCertificateQualId = busCertificateQualId;
    }

    public Integer getBusCertificateResId() {
        return busCertificateResId;
    }

    public void setBusCertificateResId(Integer busCertificateResId) {
        this.busCertificateResId = busCertificateResId;
    }

    public Integer getChemLicenseId() {
        return chemLicenseId;
    }

    public void setChemLicenseId(Integer chemLicenseId) {
        this.chemLicenseId = chemLicenseId;
    }

    public Integer getChemLicenseQualId() {
        return chemLicenseQualId;
    }

    public void setChemLicenseQualId(Integer chemLicenseQualId) {
        this.chemLicenseQualId = chemLicenseQualId;
    }

    public Integer getChemLicenseResId() {
        return chemLicenseResId;
    }

    public void setChemLicenseResId(Integer chemLicenseResId) {
        this.chemLicenseResId = chemLicenseResId;
    }

    public Date getChemLicenseDate() {
        return chemLicenseDate;
    }

    public void setChemLicenseDate(Date chemLicenseDate) {
        this.chemLicenseDate = chemLicenseDate;
    }

    public Integer getTranLicenseId() {
        return tranLicenseId;
    }

    public void setTranLicenseId(Integer tranLicenseId) {
        this.tranLicenseId = tranLicenseId;
    }

    public Integer getTranLicenseQualId() {
        return tranLicenseQualId;
    }

    public void setTranLicenseQualId(Integer tranLicenseQualId) {
        this.tranLicenseQualId = tranLicenseQualId;
    }

    public Integer getTranLicenseResId() {
        return tranLicenseResId;
    }

    public void setTranLicenseResId(Integer tranLicenseResId) {
        this.tranLicenseResId = tranLicenseResId;
    }

    public Date getTranLicenseDate() {
        return tranLicenseDate;
    }

    public void setTranLicenseDate(Date tranLicenseDate) {
        this.tranLicenseDate = tranLicenseDate;
    }

    public List<MerWarehouseDTO> getMerWarehouseDTOList() {
        return merWarehouseDTOList;
    }

    public void setMerWarehouseDTOList(List<MerWarehouseDTO> merWarehouseDTOList) {
        this.merWarehouseDTOList = merWarehouseDTOList;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype(Short ftype) {
        this.ftype = ftype;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Date getOrgCodeCertDate() {
        return orgCodeCertDate;
    }

    public void setOrgCodeCertDate(Date orgCodeCertDate) {
        this.orgCodeCertDate = orgCodeCertDate;
    }

    public Date getBusCertificateDate() {
        return busCertificateDate;
    }

    public void setBusCertificateDate(Date busCertificateDate) {
        this.busCertificateDate = busCertificateDate;
    }

    public Short getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Short authStatus) {
        this.authStatus = authStatus;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "MerMaterialDTO{" +
                "merId=" + merId +
                ", memberId=" + memberId +
                ", authStatus=" + authStatus +
                ", merName='" + merName + '\'' +
                ", opinion='" + opinion + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", ftype=" + ftype +
                ", partyId=" + partyId +
                ", merPosDTO=" + merPosDTO +
                ", merAuthDTO=" + merAuthDTO +
                ", merBizScopeDTOList=" + merBizScopeDTOList +
                ", orgCodeCertId=" + orgCodeCertId +
                ", orgCodeCertQualId=" + orgCodeCertQualId +
                ", orgCodeCertResId=" + orgCodeCertResId +
                ", orgCodeCertDate=" + orgCodeCertDate +
                ", person='" + person + '\'' +
                ", personQualId=" + personQualId +
                ", personResId=" + personResId +
                ", idCard='" + idCard + '\'' +
                ", idCardResId=" + idCardResId +
                ", information='" + information + '\'' +
                ", informationResId=" + informationResId +
                ", logoId=" + logoId +
                ", taxRegistrationId=" + taxRegistrationId +
                ", taxRegistrationResId=" + taxRegistrationResId +
                ", taxRegistrationQualId=" + taxRegistrationQualId +
                ", taxRegistrationDate=" + taxRegistrationDate +
                ", busLicenseId=" + busLicenseId +
                ", busLicenseQualId=" + busLicenseQualId +
                ", busLicenseResId=" + busLicenseResId +
                ", busLicenseDate=" + busLicenseDate +
                ", busCertificateId=" + busCertificateId +
                ", busCertificateQualId=" + busCertificateQualId +
                ", busCertificateResId=" + busCertificateResId +
                ", busCertificateDate=" + busCertificateDate +
                ", chemLicenseId=" + chemLicenseId +
                ", chemLicenseQualId=" + chemLicenseQualId +
                ", chemLicenseResId=" + chemLicenseResId +
                ", chemLicenseDate=" + chemLicenseDate +
                ", tranLicenseId=" + tranLicenseId +
                ", tranLicenseQualId=" + tranLicenseQualId +
                ", tranLicenseResId=" + tranLicenseResId +
                ", tranLicenseDate=" + tranLicenseDate +
                ", merWarehouseDTOList=" + merWarehouseDTOList +
                '}';
    }
}
