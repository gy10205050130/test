package yxinfo.dct.inteface.dto.instrument;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2017/1/3.
 */
public class InstReserDetailDTO extends BaseDTO {

    private Integer id;

    //组织id
    private Integer orgId;

    //仪器id
    private Integer instId;

    //仪器名称
    private String instName;

    //仪器型号
    private String instNumber;

    //仪器预约id
    private Integer instReserId;

    //预约成员id
    private Integer memberId;

    //姓名
    private String memberName;

    //预约使用起始时间
    private Date startTime;

    //预约使用结束时间
    private Date endTime;

    //仪器使用开始时间
    private Date useStartTime;

    //仪器使用结束时间
    private Date useEndTime;

    //状态（1审核中，2待使用，3已驳回，4已使用）
    private String status;

    /**以下为扩展字段**/
    private Integer apvMemberId;

    //插座mac
    private String mac;

    private String ip;

    private Integer picId;

    //控制器mac
    private String conMac;

    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public Integer getInstReserId() {
        return instReserId;
    }

    public void setInstReserId(Integer instReserId) {
        this.instReserId = instReserId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public Date getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(Date useStartTime) {
        this.useStartTime = useStartTime;
    }

    public Date getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Date useEndTime) {
        this.useEndTime = useEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInstNumber() {
        return instNumber;
    }

    public void setInstNumber(String instNumber) {
        this.instNumber = instNumber;
    }

    public Integer getApvMemberId() {
        return apvMemberId;
    }

    public void setApvMemberId(Integer apvMemberId) {
        this.apvMemberId = apvMemberId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getConMac() {
        return conMac;
    }

    public void setConMac(String conMac) {
        this.conMac = conMac;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    @Override
    public String toString() {
        return "InstReserDetailDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", instId=" + instId +
                ", instName='" + instName + '\'' +
                ", instNumber='" + instNumber + '\'' +
                ", instReserId=" + instReserId +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", useStartTime=" + useStartTime +
                ", useEndTime=" + useEndTime +
                ", status='" + status + '\'' +
                ", apvMemberId=" + apvMemberId +
                ", mac='" + mac + '\'' +
                ", ip='" + ip + '\'' +
                ", picId=" + picId +
                ", conMac='" + conMac + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
