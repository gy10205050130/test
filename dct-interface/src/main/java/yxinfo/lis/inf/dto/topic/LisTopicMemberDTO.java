package yxinfo.lis.inf.dto.topic;


import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by cy on 2016/10/11.
 */
public class LisTopicMemberDTO extends BaseDTO {

    /**
     * 课题id
     */
    private Integer topicId;

    private String topicName;
    /**
     * 人员id
     */
    private Integer memberId;

    private String memberName;

    private String memberMobile;

    public LisTopicMemberDTO() {
    }

    public LisTopicMemberDTO(Integer topicId, String topicName, Integer memberId, String memberName, String memberMobile) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
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

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "LisTopicMemberDTO{" +
                "topicId=" + topicId +
                ", memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}
