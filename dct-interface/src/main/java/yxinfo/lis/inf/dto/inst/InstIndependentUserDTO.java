package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.dto.mbr.MemberCoreDTO;

import javax.validation.constraints.Digits;
import java.util.List;

/**
 * Created by xww on 2016/10/23.
 */
public class InstIndependentUserDTO extends BaseDTO {

    //静态资源id
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer id;

    //仪器id
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer instId;

    //独立上机资格人id
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer memberId;

    //排序
    private Short sort;

    //独立资格上机人员
    private List<InstIndependentUserDTO> instIndependentUserList;

    //获取人员信息
    private MemberCoreDTO memberCoreDTO;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public List<InstIndependentUserDTO> getInstIndependentUserList() {
        return instIndependentUserList;
    }

    public void setInstIndependentUserList(List<InstIndependentUserDTO> instIndependentUserList) {
        this.instIndependentUserList = instIndependentUserList;
    }

    public MemberCoreDTO getMemberCoreDTO() {
        return memberCoreDTO;
    }

    public void setMemberCoreDTO(MemberCoreDTO memberCoreDTO) {
        this.memberCoreDTO = memberCoreDTO;
    }

    @Override
    public String toString() {
        return "InstIndependentUserDTO{" +
                "id=" + id +
                ", instId=" + instId +
                ", memberId=" + memberId +
                ", sort=" + sort +
                ", instIndependentUserList=" + instIndependentUserList +
                '}';
    }
}
