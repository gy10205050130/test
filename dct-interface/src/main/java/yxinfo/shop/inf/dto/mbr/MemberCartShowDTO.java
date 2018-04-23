package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

public class MemberCartShowDTO extends BaseDTO {

    private static final long serialVersionUID = -6705198895195563585L;

    private String merName;

    private Integer merId;

    private List<MemberCartDTO> memberCartDTOList;

    public String getMerName() {
        return merName;
    }

    public void setMerName( String merName ) {
        this.merName = merName;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public List<MemberCartDTO> getMemberCartDTOList() {
        return memberCartDTOList;
    }

    public void setMemberCartDTOList( List<MemberCartDTO> memberCartDTOList ) {
        this.memberCartDTOList = memberCartDTOList;
    }
}
