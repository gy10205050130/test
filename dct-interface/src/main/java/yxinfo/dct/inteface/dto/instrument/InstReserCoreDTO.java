package yxinfo.dct.inteface.dto.instrument;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyApvFlowDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by ZH on 2017/1/3.
 */
public class InstReserCoreDTO extends BaseDTO {

    private Integer id;

    //组织id
    private Integer orgId;

    //预约成员id
    private Integer memberId;

    //课题名称
    private String issuesName;

    //用途
    private String fuse;

    //预约编号
    private String fcode;

    //预约使用起始时间
    private Date startTime;

    //预约使用结束时间
    private Date endTime;

    //状态（1审核中，2待使用，3已驳回，4已使用）
    private String status;

    //生成时间
    private Date createAt;

    //静态资源id
    private Integer staticId;

    //备注
    private String remark;

    //预约人信息
    private String memberName;

    //审核人信息
    private String apvMemberName;

    /**以下为扩展字段**/
    //Pad Mac地址
    private String mac;

    private String fristName;

    private List<InstReserDetailDTO> instReserDetailDTOs;

    private List<ApplyApvFlowDTO> apvFlow;

    private boolean success;

    private String errorMsg;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName(String issuesName) {
        this.issuesName = issuesName;
    }

    public String getFuse() {
        return fuse;
    }

    public void setFuse(String fuse) {
        this.fuse = fuse;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<InstReserDetailDTO> getInstReserDetailDTOs() {
        return instReserDetailDTOs;
    }

    public void setInstReserDetailDTOs(List<InstReserDetailDTO> instReserDetailDTOs) {
        this.instReserDetailDTOs = instReserDetailDTOs;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    public List<ApplyApvFlowDTO> getApvFlow() {
        return apvFlow;
    }

    public void setApvFlow(List<ApplyApvFlowDTO> apvFlow) {
        this.apvFlow = apvFlow;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getApvMemberName() {
        return apvMemberName;
    }

    public void setApvMemberName(String apvMemberName) {
        this.apvMemberName = apvMemberName;
    }

    @Override
    public String toString() {
        return "InstReserCoreDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", memberId=" + memberId +
                ", issuesName='" + issuesName + '\'' +
                ", fuse='" + fuse + '\'' +
                ", fcode='" + fcode + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", createAt=" + createAt +
                ", staticId=" + staticId +
                ", remark='" + remark + '\'' +
                ", memberName='" + memberName + '\'' +
                ", apvMemberName='" + apvMemberName + '\'' +
                ", mac='" + mac + '\'' +
                ", fristName='" + fristName + '\'' +
                ", instReserDetailDTOs=" + instReserDetailDTOs +
                ", apvFlow=" + apvFlow +
                ", success=" + success +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
