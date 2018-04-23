package yxinfo.lis.inf.dto.inst;

import org.hibernate.validator.constraints.Length;
import yxinfo.dct.inteface.dto.lab.LaboratoryDTO;
import yxinfo.dct.inteface.dto.vmon.VmonMonitorDTO;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.mbr.MemberCoreDTO;
import yxinfo.lis.inf.dto.party.PartyCoreDTO;
import yxinfo.lis.inf.dto.platform.CountryDTO;
import yxinfo.lis.inf.dto.platform.LisPlatformDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dy on 2016/8/15.
 */
public class InstInstrumentDTO extends BaseDTO {

    private static final long serialVersionUID = -3060876991924209511L;
    //仪器id
    private Integer id;

    //仪器编号
    private String instNo;

    //仪器所属组织id
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer partyId;

    //组织id
    private Integer orgId;

    //平台组织id
    private Integer loginPartyId;

    //仪器组织DTO
    private PartyCoreDTO partyCoreDTO;

    //人员组织id
    private Integer memberPartyId;

    //登录人id
    private Integer loginId;

    //负责人id
    private Integer mbrId;

    //实验室id
    private Integer labId;

    //实验室名字
    private String labName;

    //实验室
    private LaboratoryDTO laboratoryDTO;

    //监控信息
    private VmonMonitorDTO vmonMonitorDTO;

    //仪器名称
    @Length(max = 50, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private String fname;

    //仪器名称全拼和简拼
    private String pyinName;

    //名称长度
    private Integer nameLen;

    //仪器型号
    @NotNull(message = ErrorCode.NOT_NULL)
    private String modelNo;

    //厂商
    private String manufacturer;

    //原值
    @NotNull(message = ErrorCode.NOT_NULL)
    private Long originalPrice;

    //购买时间
    @NotNull(message = ErrorCode.NOT_NULL)
    private Date buyAt;

    //仪器地址
    @NotNull(message = ErrorCode.NOT_NULL)
    private String address;

    //更新时间
    private Date updateAt;

    //收费标准
    private String chargeStd;

    //服务领域名称
    private String serviceAreaName;

    //创建时间
    private Date createAt;

    //技术指标
    @NotNull(message = ErrorCode.NOT_NULL)
    private String techIndex;

    //仪器预约说明
    private String bespeakReq;

    //状态（1空闲, 2已被预约）
    private Integer status;

    //检测项目
    @NotNull(message = ErrorCode.NOT_NULL)
    private String testItem;

    //电子邮箱
    private String email;

    //英文名
    private String englishName;

    //开放时间(1周一到周五，2周六周日，3周一到周日, 4不开放)
    private Integer openTime;

    //共享模式(1对内，2对内和对外)
    private Integer shareMode;

    //主要功能
    @NotNull(message = ErrorCode.NOT_NULL)
    private String mainFunction;

    //备注
    @Length(max = 250, message = ErrorCode.LENGTH)
    private String remark;

    //纬度
    private Double lat;

    //经度
    private Double lng;

    //院校
    private Integer groupId;

    //获取图片
    private List<InstPicDTO> instPicDTOList;

    //院系名字
    private String departmentName;

    //部门名字
    private String sectorName;

    //服务次数
    private InstServicenumDTO instServicenumDTO;

    //仪器得分
    private Integer score;

    //评价次数
    private Integer judgeNum;

    //平均分
    private Double avgScore;

    //是否被删除（1是, 0否）
    private Boolean isDel;

    //平台id
    private Integer instGroupId;

    //所在单位仪器编号
    @Length(max = 30, message = ErrorCode.LENGTH)
    private String partyInstNo;

    //设备分类编码
    private String instClassifiedCode;

    //设备分类
    private String instClassifiedName;

    //仪器设备来源(1购置2研制3赠送4其他)
    private Integer instFrom;

    //是否海关监管(1是0否)
    private Boolean supervision;

    //产地国别
    private String countryCode;

    //启用日期
    private Date startUseDate;

    //仪器设备类别(1通用2专用)
    private Integer instCate;

    //服务的典型成果
    private String instOutcomes;

    //对外开放共享规定
    private String openProvide;

    //通过仪器id来获取每天的时间段的个数
    private List<Map<String, Object>> timesNums;

    //时间段
    private String orderTimes;

    //开放星期
    private String orderWeeks;

    //关键字
    private String keyWord;

    //排序类型(create_at 发布时间,service_num 服务次数,share 共享模式)
    private String sortType;

    //按发布时间(asc升序, desc降序)
    private String sort;

    //负责人详细信息
    private MemberCoreDTO memberCoreDTO;

    //获取服务领域
    private List<String> serviceAreaList;

    //服务领域内容
    private List<LisServiceAreaDTO> lisServiceAreaDTOs;

    //仪器服务领域对照表
    private List<InstServiceAreaDTO> instServiceAreaDTOs;

    //查询仪器列表状态(1组织下的仪器，2仪器库的仪器)
    private Integer searchInstStatus;

    private List<Map<String, String>> passList;

    //仪器收藏详情
    private InstCollectionDTO instCollectionDTO;

    //学科领域
    private List<InstScienceFieldDTO> instScienceFieldDTOList;

    //收费规则
    @NotNull(message = ErrorCode.NOT_NULL)
    private List<InstChargeRuleDTO> instChargeRuleDTOList;

    //独立资格上机人
    private Boolean instIndependentUserIsEmpty;

    //独立上机人集合
    private List<InstIndependentUserDTO> instIndependentUserDTOList;

    //独立上机人
    private InstIndependentUserDTO instIndependentUserDTO;

    //独立上机人个数
    private Integer instIndependentUserNum;

    //评价标签个数
    private List<Map<String, Object>> judgeTagNum;

    //平台
    private LisPlatformDTO lisPlatformDTO;

    //产地国别
    private CountryDTO countryDTO;

    //仪器价格
    private Integer instPrice;

    //获取仪器收藏次数
    private Integer instCollectionNum;

    //获取仪器设备分类名称
    private Map<String, Object> instClassifiedNameMap;

    //来源标记
    private String fromflag;

    //获取仪器绑定信息
    private List<InstBindleDTO> instBindleList;

    //IpadMac地址
    private String ipadMac;

    //收费规则
    private Short chargeType;

    //收费规则
    private InstChargeRuleDTO chargeRuleDTO;

    public VmonMonitorDTO getVmonMonitorDTO() {
        return vmonMonitorDTO;
    }

    public void setVmonMonitorDTO(VmonMonitorDTO vmonMonitorDTO) {
        this.vmonMonitorDTO = vmonMonitorDTO;
    }

    public LaboratoryDTO getLaboratoryDTO() {
        return laboratoryDTO;
    }

    public void setLaboratoryDTO(LaboratoryDTO laboratoryDTO) {
        this.laboratoryDTO = laboratoryDTO;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public InstChargeRuleDTO getChargeRuleDTO() {
        return chargeRuleDTO;
    }

    public void setChargeRuleDTO(InstChargeRuleDTO chargeRuleDTO) {
        this.chargeRuleDTO = chargeRuleDTO;
    }

    public Short getChargeType() {
        return chargeType;
    }

    public void setChargeType(Short chargeType) {
        this.chargeType = chargeType;
    }

    public String getIpadMac() {
        return ipadMac;
    }

    public void setIpadMac(String ipadMac) {
        this.ipadMac = ipadMac;
    }

    public List<InstBindleDTO> getInstBindleList() {
        return instBindleList;
    }

    public void setInstBindleList(List<InstBindleDTO> instBindleList) {
        this.instBindleList = instBindleList;
    }

    public Integer getInstIndependentUserNum() {
        return instIndependentUserNum;
    }

    public void setInstIndependentUserNum(Integer instIndependentUserNum) {
        this.instIndependentUserNum = instIndependentUserNum;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMbrId() {
        return mbrId;
    }

    public void setMbrId(Integer mbrId) {
        this.mbrId = mbrId;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPyinName() {
        return pyinName;
    }

    public void setPyinName(String pyinName) {
        this.pyinName = pyinName;
    }

    public Integer getNameLen() {
        return nameLen;
    }

    public void setNameLen(Integer nameLen) {
        this.nameLen = nameLen;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Date getBuyAt() {
        return buyAt;
    }

    public void setBuyAt(Date buyAt) {
        this.buyAt = buyAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getChargeStd() {
        return chargeStd;
    }

    public void setChargeStd(String chargeStd) {
        this.chargeStd = chargeStd;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getTechIndex() {
        return techIndex;
    }

    public void setTechIndex(String techIndex) {
        this.techIndex = techIndex;
    }

    public String getBespeakReq() {
        return bespeakReq;
    }

    public void setBespeakReq(String bespeakReq) {
        this.bespeakReq = bespeakReq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTestItem() {
        return testItem;
    }

    public void setTestItem(String testItem) {
        this.testItem = testItem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getMainFunction() {
        return mainFunction;
    }

    public void setMainFunction(String mainFunction) {
        this.mainFunction = mainFunction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public List<InstPicDTO> getInstPicDTOList() {
        return instPicDTOList;
    }

    public void setInstPicDTOList(List<InstPicDTO> instPicDTOList) {
        this.instPicDTOList = instPicDTOList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getShareMode() {
        return shareMode;
    }

    public void setShareMode(Integer shareMode) {
        this.shareMode = shareMode;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public PartyCoreDTO getPartyCoreDTO() {
        return partyCoreDTO;
    }

    public void setPartyCoreDTO(PartyCoreDTO partyCoreDTO) {
        this.partyCoreDTO = partyCoreDTO;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO(MemberCoreDTO memberCoreDTO) {
        this.memberCoreDTO = memberCoreDTO;
    }

    public String getServiceAreaName() {
        return serviceAreaName;
    }

    public void setServiceAreaName(String serviceAreaName) {
        this.serviceAreaName = serviceAreaName;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public List<String> getServiceAreaList() {
        return serviceAreaList;
    }

    public void setServiceAreaList(List<String> serviceAreaList) {
        this.serviceAreaList = serviceAreaList;
    }

    public List<InstServiceAreaDTO> getInstServiceAreaDTOs() {
        return instServiceAreaDTOs;
    }

    public void setInstServiceAreaDTOs(List<InstServiceAreaDTO> instServiceAreaDTOs) {
        this.instServiceAreaDTOs = instServiceAreaDTOs;
    }

    public List<LisServiceAreaDTO> getLisServiceAreaDTOs() {
        return lisServiceAreaDTOs;
    }

    public void setLisServiceAreaDTOs(List<LisServiceAreaDTO> lisServiceAreaDTOs) {
        this.lisServiceAreaDTOs = lisServiceAreaDTOs;
    }

    public Integer getLoginPartyId() {
        return loginPartyId;
    }

    public void setLoginPartyId(Integer loginPartyId) {
        this.loginPartyId = loginPartyId;
    }

    public Integer getSearchInstStatus() {
        return searchInstStatus;
    }

    public void setSearchInstStatus(Integer searchInstStatus) {
        this.searchInstStatus = searchInstStatus;
    }

    public List<Map<String, String>> getPassList() {
        return passList;
    }

    public void setPassList(List<Map<String, String>> passList) {
        this.passList = passList;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public InstCollectionDTO getInstCollectionDTO() {
        return instCollectionDTO;
    }

    public void setInstCollectionDTO(InstCollectionDTO instCollectionDTO) {
        this.instCollectionDTO = instCollectionDTO;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getInstCate() {
        return instCate;
    }

    public void setInstCate(Integer instCate) {
        this.instCate = instCate;
    }

    public String getInstClassifiedCode() {
        return instClassifiedCode;
    }

    public void setInstClassifiedCode(String instClassifiedCode) {
        this.instClassifiedCode = instClassifiedCode;
    }

    public Integer getInstFrom() {
        return instFrom;
    }

    public void setInstFrom(Integer instFrom) {
        this.instFrom = instFrom;
    }

    public Integer getInstGroupId() {
        return instGroupId;
    }

    public void setInstGroupId(Integer instGroupId) {
        this.instGroupId = instGroupId;
    }

    public String getInstOutcomes() {
        return instOutcomes;
    }

    public void setInstOutcomes(String instOutcomes) {
        this.instOutcomes = instOutcomes;
    }

    public String getOpenProvide() {
        return openProvide;
    }

    public void setOpenProvide(String openProvide) {
        this.openProvide = openProvide;
    }

    public String getOrderTimes() {
        return orderTimes;
    }

    public void setOrderTimes(String orderTimes) {
        this.orderTimes = orderTimes;
    }

    public String getOrderWeeks() {
        return orderWeeks;
    }

    public void setOrderWeeks(String orderWeeks) {
        this.orderWeeks = orderWeeks;
    }

    public String getPartyInstNo() {
        return partyInstNo;
    }

    public void setPartyInstNo(String partyInstNo) {
        this.partyInstNo = partyInstNo;
    }

    public Date getStartUseDate() {
        return startUseDate;
    }

    public void setStartUseDate(Date startUseDate) {
        this.startUseDate = startUseDate;
    }

    public Boolean getSupervision() {
        return supervision;
    }

    public void setSupervision(Boolean supervision) {
        this.supervision = supervision;
    }

    public List<InstScienceFieldDTO> getInstScienceFieldDTOList() {
        return instScienceFieldDTOList;
    }

    public void setInstScienceFieldDTOList(List<InstScienceFieldDTO> instScienceFieldDTOList) {
        this.instScienceFieldDTOList = instScienceFieldDTOList;
    }

    public List<Map<String, Object>> getTimesNums() {
        return timesNums;
    }

    public void setTimesNums(List<Map<String, Object>> timesNums) {
        this.timesNums = timesNums;
    }

    public List<InstChargeRuleDTO> getInstChargeRuleDTOList() {
        return instChargeRuleDTOList;
    }

    public void setInstChargeRuleDTOList(List<InstChargeRuleDTO> instChargeRuleDTOList) {
        this.instChargeRuleDTOList = instChargeRuleDTOList;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public Integer getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(Integer judgeNum) {
        this.judgeNum = judgeNum;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public InstServicenumDTO getInstServicenumDTO() {
        return instServicenumDTO;
    }

    public void setInstServicenumDTO(InstServicenumDTO instServicenumDTO) {
        this.instServicenumDTO = instServicenumDTO;
    }

    public String getInstClassifiedName() {
        return instClassifiedName;
    }

    public void setInstClassifiedName(String instClassifiedName) {
        this.instClassifiedName = instClassifiedName;
    }

    public Boolean getInstIndependentUserIsEmpty() {
        return instIndependentUserIsEmpty;
    }

    public void setInstIndependentUserIsEmpty(Boolean instIndependentUserIsEmpty) {
        this.instIndependentUserIsEmpty = instIndependentUserIsEmpty;
    }

    public List<InstIndependentUserDTO> getInstIndependentUserDTOList() {
        return instIndependentUserDTOList;
    }

    public void setInstIndependentUserDTOList(List<InstIndependentUserDTO> instIndependentUserDTOList) {
        this.instIndependentUserDTOList = instIndependentUserDTOList;
    }

    public List<Map<String, Object>> getJudgeTagNum() {
        return judgeTagNum;
    }

    public void setJudgeTagNum(List<Map<String, Object>> judgeTagNum) {
        this.judgeTagNum = judgeTagNum;
    }

    public LisPlatformDTO getLisPlatformDTO() {
        return lisPlatformDTO;
    }

    public void setLisPlatformDTO(LisPlatformDTO lisPlatformDTO) {
        this.lisPlatformDTO = lisPlatformDTO;
    }

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public void setCountryDTO(CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
    }

    public Integer getInstPrice() {
        return instPrice;
    }

    public void setInstPrice(Integer instPrice) {
        this.instPrice = instPrice;
    }

    public Integer getInstCollectionNum() {
        return instCollectionNum;
    }

    public void setInstCollectionNum(Integer instCollectionNum) {
        this.instCollectionNum = instCollectionNum;
    }

    public Map<String, Object> getInstClassifiedNameMap() {
        return instClassifiedNameMap;
    }

    public void setInstClassifiedNameMap(Map<String, Object> instClassifiedNameMap) {
        this.instClassifiedNameMap = instClassifiedNameMap;
    }

    public InstIndependentUserDTO getInstIndependentUserDTO() {
        return instIndependentUserDTO;
    }

    public void setInstIndependentUserDTO(InstIndependentUserDTO instIndependentUserDTO) {
        this.instIndependentUserDTO = instIndependentUserDTO;
    }

    public String getFromflag() {
        return fromflag;
    }

    public void setFromflag(String fromflag) {
        this.fromflag = fromflag;
    }

    public Integer getMemberPartyId() {
        return memberPartyId;
    }

    public void setMemberPartyId(Integer memberPartyId) {
        this.memberPartyId = memberPartyId;
    }

    @Override
    public String toString() {
        return "InstInstrumentDTO{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", instNo='" + instNo + '\'' +
                ", partyId=" + partyId +
                ", loginPartyId=" + loginPartyId +
                ", partyCoreDTO=" + partyCoreDTO +
                ", loginId=" + loginId +
                ", mbrId=" + mbrId +
                ", labId=" + labId +
                ", fname='" + fname + '\'' +
                ", pyinName='" + pyinName + '\'' +
                ", nameLen=" + nameLen +
                ", modelNo='" + modelNo + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", originalPrice=" + originalPrice +
                ", buyAt=" + buyAt +
                ", updateAt=" + updateAt +
                ", chargeStd='" + chargeStd + '\'' +
                ", serviceAreaName='" + serviceAreaName + '\'' +
                ", createAt=" + createAt +
                ", techIndex='" + techIndex + '\'' +
                ", bespeakReq='" + bespeakReq + '\'' +
                ", status=" + status +
                ", testItem='" + testItem + '\'' +
                ", email='" + email + '\'' +
                ", englishName='" + englishName + '\'' +
                ", openTime=" + openTime +
                ", shareMode=" + shareMode +
                ", mainFunction='" + mainFunction + '\'' +
                ", remark='" + remark + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", groupId=" + groupId +
                ", instPicDTOList=" + instPicDTOList +
                ", departmentName='" + departmentName + '\'' +
                ", sectorName='" + sectorName + '\'' +
                ", isDel=" + isDel +
                ", keyWord='" + keyWord + '\'' +
                ", sortType='" + sortType + '\'' +
                ", sort='" + sort + '\'' +
                ", memberCoreDTO=" + memberCoreDTO +
                ", serviceAreaList=" + serviceAreaList +
                ", lisServiceAreaDTOs=" + lisServiceAreaDTOs +
                ", instServiceAreaDTOs=" + instServiceAreaDTOs +
                ", searchInstStatus=" + searchInstStatus +
                ", passList=" + passList +
                '}';
    }


}
