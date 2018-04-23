package yxinfo.dct.inteface.dto.tlog;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.dto.lab.LaboratoryDTO;
import yxinfo.dct.inteface.validation.groups.Update;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 课题日志bean
 * <p>
 * Created by cy on 2016/6/22.
 */
public class TopicLogDTO extends BaseDTO {

    private Integer id;

    //使用者组织id
    private Integer orgId;

    //使用成员id
    private Integer memberId;

    //使用人姓名
    private String memberName;

    //创建时间
    private Date createAt;

    //是否是老师（1是, 0否）
    private Boolean isTeacher;

    //课题名称
    private String issuesName;

    //课题类型（1教学, 2科研）
    private String purpose;

    //实验时间
    private Date exptAt;

    //实验时长, 秒
    private Integer exptLength;

    //实验室id
    private Integer labId;

    //实验室id
    private String labName;

    //教师id
    private Integer teacherId;

    //教师名称
    private String teacherName;

    //审阅意见
    private String opinion;

    //状态（1.草稿,2.已提交,3.已审阅）
    private String status;

    /***********以下为扩展字段************/
    private TopicLogCtxDTO topicLogCtxDTO;

    private List<TopicLogPicDTO> topicLogPicDTOs;

    private List<TopicLogChemDTO> topicLogChemDTOs;

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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Boolean getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(Boolean teacher) {
        isTeacher = teacher;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName(String issuesName) {
        this.issuesName = issuesName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getExptAt() {
        return exptAt;
    }

    public void setExptAt(Date exptAt) {
        this.exptAt = exptAt;
    }

    public Integer getExptLength() {
        return exptLength;
    }

    public void setExptLength(Integer exptLength) {
        this.exptLength = exptLength;
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TopicLogCtxDTO getTopicLogCtxDTO() {
        return topicLogCtxDTO;
    }

    public void setTopicLogCtxDTO(TopicLogCtxDTO topicLogCtxDTO) {
        this.topicLogCtxDTO = topicLogCtxDTO;
    }

    public List<TopicLogPicDTO> getTopicLogPicDTOs() {
        return topicLogPicDTOs;
    }

    public void setTopicLogPicDTOs(List<TopicLogPicDTO> topicLogPicDTOs) {
        this.topicLogPicDTOs = topicLogPicDTOs;
    }

    public List<TopicLogChemDTO> getTopicLogChemDTOs() {
        return topicLogChemDTOs;
    }

    public void setTopicLogChemDTOs(List<TopicLogChemDTO> topicLogChemDTOs) {
        this.topicLogChemDTOs = topicLogChemDTOs;
    }

    @Override
    public String toString() {
        return "TopicLogDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", createAt=" + createAt +
                ", isTeacher=" + isTeacher +
                ", issuesName='" + issuesName + '\'' +
                ", purpose='" + purpose + '\'' +
                ", exptAt=" + exptAt +
                ", exptLength=" + exptLength +
                ", labId=" + labId +
                ", labName='" + labName + '\'' +
                ", teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", opinion='" + opinion + '\'' +
                ", status='" + status + '\'' +
                ", topicLogCtxDTO=" + topicLogCtxDTO +
                ", topicLogPicDTOs=" + topicLogPicDTOs +
                ", topicLogChemDTOs=" + topicLogChemDTOs +
                '}';
    }
}
