package yxinfo.shop.inf.dto.party;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

public class PartyCoreDTO extends BaseDTO {

    private static final long serialVersionUID = 4527233106190505869L;

    private Integer id;

    //使用方名称
    private String fname;

    //使用方关联组织id
    private Integer orgId;

    //使用方默认收货地址
    private List<PartyCneeDTO> cnee;

    //使用方默认发票信息
    private PartyInvDTO inv;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public List<PartyCneeDTO> getCnee() {
        return cnee;
    }

    public void setCnee( List<PartyCneeDTO> cnee ) {
        this.cnee = cnee;
    }

    public PartyInvDTO getInv() {
        return inv;
    }

    public void setInv( PartyInvDTO inv ) {
        this.inv = inv;
    }
}