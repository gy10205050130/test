package yxinfo.lis.inf.dto.platform;

import org.hibernate.validator.constraints.Length;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.mbr.MemberCoreDTO;
import yxinfo.lis.inf.dto.party.PartyCoreDTO;
import yxinfo.lis.inf.validation.groups.Add;
import yxinfo.lis.inf.validation.groups.Update;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by cy on 2016/10/20.
 */
public class LisPlatformDTO extends BaseDTO {

    private Integer id;

    //仪器中心名称
    @Length(max = 50, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private String fname;

    //统一编号（系统生成）
    private String fcode;

    //所属单位
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer partyId;
    private PartyCoreDTO partyCoreDTO;

    //1国家级、2省部级、3地市级或4单位级等
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull( message = ErrorCode.NOT_NULL)
    private Integer flevel;

    //平台网址
    @Length(max = 200, message = ErrorCode.LENGTH)
    private String platformUrl;

    //成立日期
    private Date establishDate;

    //科学仪器中心类别(1通用2专用)
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer platCate;

    @Length(max = 500, message = ErrorCode.LENGTH)
    private String platServiceContent;

    //服务的典型成果
    @Length(max = 500, message = ErrorCode.LENGTH)
    private String platTypicalResult;

    //对外开放共享规定
    @Length(max = 500, message = ErrorCode.LENGTH)
    private String openProvision;

    //联系人id
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(message = ErrorCode.NOT_NULL)
    private Integer memberId;
    private MemberCoreDTO memberCoreDTO;

    //静态资源id
    private Integer staticId;

    private Date createAt;

    private Date updateAt;

    private List<LisPlatScienceFieldDTO> lisPlatScienceFieldList;

    //仪器数量
    private Integer instCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getFlevel() {
        return flevel;
    }

    public void setFlevel(Integer flevel) {
        this.flevel = flevel;
    }

    public String getPlatformUrl() {
        return platformUrl;
    }

    public void setPlatformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Integer getPlatCate() {
        return platCate;
    }

    public void setPlatCate(Integer platCate) {
        this.platCate = platCate;
    }

    public String getPlatServiceContent() {
        return platServiceContent;
    }

    public void setPlatServiceContent(String platServiceContent) {
        this.platServiceContent = platServiceContent;
    }

    public String getPlatTypicalResult() {
        return platTypicalResult;
    }

    public void setPlatTypicalResult(String platTypicalResult) {
        this.platTypicalResult = platTypicalResult;
    }

    public String getOpenProvision() {
        return openProvision;
    }

    public void setOpenProvision(String openProvision) {
        this.openProvision = openProvision;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO(MemberCoreDTO memberCoreDTO) {
        this.memberCoreDTO = memberCoreDTO;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
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

    public List<LisPlatScienceFieldDTO> getLisPlatScienceFieldList() {
        return lisPlatScienceFieldList;
    }

    public void setLisPlatScienceFieldList(List<LisPlatScienceFieldDTO> lisPlatScienceFieldList) {
        this.lisPlatScienceFieldList = lisPlatScienceFieldList;
    }

    public PartyCoreDTO getPartyCoreDTO() {
        return partyCoreDTO;
    }

    public void setPartyCoreDTO(PartyCoreDTO partyCoreDTO) {
        this.partyCoreDTO = partyCoreDTO;
    }

    public Integer getInstCount() {
        return instCount;
    }

    public void setInstCount(Integer instCount) {
        this.instCount = instCount;
    }
}
