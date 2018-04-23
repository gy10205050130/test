package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

public class MemberOrderInfoDTO extends BaseDTO {

    private static final long serialVersionUID = 4543534422573286210L;

    //用户收货地址
    private List<MemberCneeDTO> memberCneeDTOList;

    //普通发票
    private MemberInvDTO memberInvDTO;

    public List<MemberCneeDTO> getMemberCneeDTOList() {
        return memberCneeDTOList;
    }

    public void setMemberCneeDTOList( List<MemberCneeDTO> memberCneeDTOList ) {
        this.memberCneeDTOList = memberCneeDTOList;
    }

    public MemberInvDTO getMemberInvDTO() {
        return memberInvDTO;
    }

    public void setMemberInvDTO( MemberInvDTO memberInvDTO ) {
        this.memberInvDTO = memberInvDTO;
    }
}
