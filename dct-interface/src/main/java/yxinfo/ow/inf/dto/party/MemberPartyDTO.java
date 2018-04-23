package yxinfo.ow.inf.dto.party;

import yxinfo.ow.inf.dto.BaseDTO;

/**
 * @author tj
 * @date 2016/9/14 17:15
 */
public class MemberPartyDTO extends BaseDTO {

    private Integer id;

    //成员id
    private Integer memberId;

    //单位id
    private Integer partyId;

    //单位代金券
    private Integer partyVoucher;

    //单位预付款
    private Integer partyImprest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getPartyVoucher() {
        return partyVoucher;
    }

    public void setPartyVoucher(Integer partyVoucher) {
        this.partyVoucher = partyVoucher;
    }

    public Integer getPartyImprest() {
        return partyImprest;
    }

    public void setPartyImprest(Integer partyImprest) {
        this.partyImprest = partyImprest;
    }
}
