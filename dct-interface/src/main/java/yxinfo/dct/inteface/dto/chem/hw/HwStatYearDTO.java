package yxinfo.dct.inteface.dto.chem.hw;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

public class HwStatYearDTO extends BaseDTO {

    private static final long serialVersionUID = -4174381497126741944L;

    private Integer id;

    // 危废产生者组织id
    private Integer orgId;

    // 危废产生者组织名称
    private String orgName;

    // 危废回收者组织id
    private Integer recycOrgId;

    // 危废回收者组织名称
    private String recycOrgName;

    private String statYear;

    // 回收空瓶数
    private Integer bottleNum;

    // 回收空瓶费用（分）
    private Long bottleCost;

    private List<HwStatYearNatureDTO> natures;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName( String orgName ) {
        this.orgName = orgName;
    }

    public Integer getRecycOrgId() {
        return recycOrgId;
    }

    public void setRecycOrgId( Integer recycOrgId ) {
        this.recycOrgId = recycOrgId;
    }

    public String getRecycOrgName() {
        return recycOrgName;
    }

    public void setRecycOrgName( String recycOrgName ) {
        this.recycOrgName = recycOrgName;
    }

    public String getStatYear() {
        return statYear;
    }

    public void setStatYear( String statYear ) {
        this.statYear = statYear;
    }

    public Integer getBottleNum() {
        return bottleNum;
    }

    public void setBottleNum( Integer bottleNum ) {
        this.bottleNum = bottleNum;
    }

    public Long getBottleCost() {
        return bottleCost;
    }

    public void setBottleCost( Long bottleCost ) {
        this.bottleCost = bottleCost;
    }

    public List<HwStatYearNatureDTO> getNatures() {
        return natures;
    }

    public void setNatures( List<HwStatYearNatureDTO> natures ) {
        this.natures = natures;
    }
}