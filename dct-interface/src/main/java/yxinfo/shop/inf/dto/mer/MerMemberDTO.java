package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mbr.MemberCoreDTO;

/**
 * Created by ZH on 2016/8/1.
 */
public class MerMemberDTO extends BaseDTO{

    //商户id
    private Integer merId;

    //商户关联成员id
    private Integer memberId;

    //是否是超级管理员（商户创建者）
    private Boolean isSuper;

    private MemberCoreDTO memberCoreDTO;

    private MerCoreDTO merCoreDTO;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
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

    public Boolean getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Boolean aSuper) {
        isSuper = aSuper;
    }

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO(MerCoreDTO merCoreDTO) {
        this.merCoreDTO = merCoreDTO;
    }

    @Override
    public String toString() {
        return "MerMemberDTO{" +
                "merId=" + merId +
                ", memberId=" + memberId +
                ", isSuper=" + isSuper +
                ", memberCoreDTO=" + memberCoreDTO +
                ", merCoreDTO=" + merCoreDTO +
                '}';
    }
}
