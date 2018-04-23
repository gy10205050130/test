package yxinfo.dct.inteface.dto.chem.msds;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class MsdsAcademicDTO extends BaseDTO {

    private static final long serialVersionUID = -28162654349856482L;

    private Integer msdsId;

    // 理化特性_外观与性状
    private String appear;

    // 理化特性_pH
    private String ph;

    // 理化特性_熔点(℃)
    private String meltingPoint;

    // 理化特性_沸点(℃)
    private String boilingPoint;

    // 理化特性_分子式
    private String molecularFormula;

    // 理化特性_分子量
    private String molecularWeight;

    // 理化特性_相对密度(水=1)
    private String relDensity;

    // 理化特性_相对蒸气密度(空气=1)
    private String relVaporDensity;

    // 理化特性_主要成分
    private String main;

    // 理化特性_饱和蒸气压(kPa)
    private String saturatedVaporPre;

    // 理化特性_燃烧热(kJ/mol)
    private String combusHeat;

    // 理化特性_临界温度(℃)
    private String criticalTemp;

    // 理化特性_临界压力(MPa)
    private String criticalPre;

    // 理化特性_辛醇/水分配系数的对数值
    private String kow;

    // 理化特性_闪点(℃)
    private String flashPoint;

    // 理化特性_爆炸上限%(V/V)
    private String upperExplosionLmt;

    // 理化特性_爆炸下限%(V/V)
    private String lowerExplosionLmt;

    // 理化特性_引燃温度(℃)
    private String ignitionTemp;

    // 理化特性_溶解性
    private String solubility;

    // 理化特性_主要用途
    private String mainUse;

    // 理化特性_其他理化性质
    private String otherNature;

    // 稳定性和反应活性_稳定性
    private String stability;

    // 稳定性和反应活性_禁配物
    private String forbiddenComplex;

    // 稳定性和反应活性_避免接触的条件
    private String avoidContact;

    // 稳定性和反应活性_聚合危害
    private String polyHazard;

    // 稳定性和反应活性_分解产物
    private String decompProduct;

    // 毒理学资料_急性毒性
    private String acuteToxicity;

    // 毒理学资料_亚急性和慢性毒性
    private String subacuteChronicToxicity;

    // 毒理学资料_刺激性
    private String thrill;

    // 毒理学资料_致敏性
    private String sensitization;

    // 毒理学资料_致突变性
    private String mutagenicity;

    // 毒理学资料_致畸性
    private String malformation;

    // 毒理学资料_致癌性
    private String carcinogenic;

    // 生态学资料_生态毒理毒性
    private String ecoToxicity;

    // 生态学资料_生物降解性
    private String bioDegradation;

    // 生态学资料_非生物降解性
    private String nonBioDegradation;

    // 生态学资料_生物富集或生物积累性
    private String bioAccumulation;

    // 生态学资料_其它有害作用
    private String otherHarm;

    // 废弃处置_废弃物性质
    private String wasteNature;

    // 废弃处置_废弃物类别
    private String wasteCate;

    private Date updateAt;

    // 废弃处置_废弃处置方法
    private String wasteDisposal;

    // 废弃处置_废弃注意事项
    private String wasteNote;

    public Integer getMsdsId() {
        return msdsId;
    }

    public void setMsdsId( Integer msdsId ) {
        this.msdsId = msdsId;
    }

    public String getAppear() {
        return appear;
    }

    public void setAppear( String appear ) {
        this.appear = appear;
    }

    public String getPh() {
        return ph;
    }

    public void setPh( String ph ) {
        this.ph = ph;
    }

    public String getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint( String meltingPoint ) {
        this.meltingPoint = meltingPoint;
    }

    public String getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint( String boilingPoint ) {
        this.boilingPoint = boilingPoint;
    }

    public String getMolecularFormula() {
        return molecularFormula;
    }

    public void setMolecularFormula( String molecularFormula ) {
        this.molecularFormula = molecularFormula;
    }

    public String getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight( String molecularWeight ) {
        this.molecularWeight = molecularWeight;
    }

    public String getRelDensity() {
        return relDensity;
    }

    public void setRelDensity( String relDensity ) {
        this.relDensity = relDensity;
    }

    public String getRelVaporDensity() {
        return relVaporDensity;
    }

    public void setRelVaporDensity( String relVaporDensity ) {
        this.relVaporDensity = relVaporDensity;
    }

    public String getMain() {
        return main;
    }

    public void setMain( String main ) {
        this.main = main;
    }

    public String getSaturatedVaporPre() {
        return saturatedVaporPre;
    }

    public void setSaturatedVaporPre( String saturatedVaporPre ) {
        this.saturatedVaporPre = saturatedVaporPre;
    }

    public String getCombusHeat() {
        return combusHeat;
    }

    public void setCombusHeat( String combusHeat ) {
        this.combusHeat = combusHeat;
    }

    public String getCriticalTemp() {
        return criticalTemp;
    }

    public void setCriticalTemp( String criticalTemp ) {
        this.criticalTemp = criticalTemp;
    }

    public String getCriticalPre() {
        return criticalPre;
    }

    public void setCriticalPre( String criticalPre ) {
        this.criticalPre = criticalPre;
    }

    public String getKow() {
        return kow;
    }

    public void setKow( String kow ) {
        this.kow = kow;
    }

    public String getFlashPoint() {
        return flashPoint;
    }

    public void setFlashPoint( String flashPoint ) {
        this.flashPoint = flashPoint;
    }

    public String getUpperExplosionLmt() {
        return upperExplosionLmt;
    }

    public void setUpperExplosionLmt( String upperExplosionLmt ) {
        this.upperExplosionLmt = upperExplosionLmt;
    }

    public String getLowerExplosionLmt() {
        return lowerExplosionLmt;
    }

    public void setLowerExplosionLmt( String lowerExplosionLmt ) {
        this.lowerExplosionLmt = lowerExplosionLmt;
    }

    public String getIgnitionTemp() {
        return ignitionTemp;
    }

    public void setIgnitionTemp( String ignitionTemp ) {
        this.ignitionTemp = ignitionTemp;
    }

    public String getSolubility() {
        return solubility;
    }

    public void setSolubility( String solubility ) {
        this.solubility = solubility;
    }

    public String getMainUse() {
        return mainUse;
    }

    public void setMainUse( String mainUse ) {
        this.mainUse = mainUse;
    }

    public String getOtherNature() {
        return otherNature;
    }

    public void setOtherNature( String otherNature ) {
        this.otherNature = otherNature;
    }

    public String getStability() {
        return stability;
    }

    public void setStability( String stability ) {
        this.stability = stability;
    }

    public String getForbiddenComplex() {
        return forbiddenComplex;
    }

    public void setForbiddenComplex( String forbiddenComplex ) {
        this.forbiddenComplex = forbiddenComplex;
    }

    public String getAvoidContact() {
        return avoidContact;
    }

    public void setAvoidContact( String avoidContact ) {
        this.avoidContact = avoidContact;
    }

    public String getPolyHazard() {
        return polyHazard;
    }

    public void setPolyHazard( String polyHazard ) {
        this.polyHazard = polyHazard;
    }

    public String getDecompProduct() {
        return decompProduct;
    }

    public void setDecompProduct( String decompProduct ) {
        this.decompProduct = decompProduct;
    }

    public String getAcuteToxicity() {
        return acuteToxicity;
    }

    public void setAcuteToxicity( String acuteToxicity ) {
        this.acuteToxicity = acuteToxicity;
    }

    public String getSubacuteChronicToxicity() {
        return subacuteChronicToxicity;
    }

    public void setSubacuteChronicToxicity( String subacuteChronicToxicity ) {
        this.subacuteChronicToxicity = subacuteChronicToxicity;
    }

    public String getThrill() {
        return thrill;
    }

    public void setThrill( String thrill ) {
        this.thrill = thrill;
    }

    public String getSensitization() {
        return sensitization;
    }

    public void setSensitization( String sensitization ) {
        this.sensitization = sensitization;
    }

    public String getMutagenicity() {
        return mutagenicity;
    }

    public void setMutagenicity( String mutagenicity ) {
        this.mutagenicity = mutagenicity;
    }

    public String getMalformation() {
        return malformation;
    }

    public void setMalformation( String malformation ) {
        this.malformation = malformation;
    }

    public String getCarcinogenic() {
        return carcinogenic;
    }

    public void setCarcinogenic( String carcinogenic ) {
        this.carcinogenic = carcinogenic;
    }

    public String getEcoToxicity() {
        return ecoToxicity;
    }

    public void setEcoToxicity( String ecoToxicity ) {
        this.ecoToxicity = ecoToxicity;
    }

    public String getBioDegradation() {
        return bioDegradation;
    }

    public void setBioDegradation( String bioDegradation ) {
        this.bioDegradation = bioDegradation;
    }

    public String getNonBioDegradation() {
        return nonBioDegradation;
    }

    public void setNonBioDegradation( String nonBioDegradation ) {
        this.nonBioDegradation = nonBioDegradation;
    }

    public String getBioAccumulation() {
        return bioAccumulation;
    }

    public void setBioAccumulation( String bioAccumulation ) {
        this.bioAccumulation = bioAccumulation;
    }

    public String getOtherHarm() {
        return otherHarm;
    }

    public void setOtherHarm( String otherHarm ) {
        this.otherHarm = otherHarm;
    }

    public String getWasteNature() {
        return wasteNature;
    }

    public void setWasteNature( String wasteNature ) {
        this.wasteNature = wasteNature;
    }

    public String getWasteCate() {
        return wasteCate;
    }

    public void setWasteCate( String wasteCate ) {
        this.wasteCate = wasteCate;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public String getWasteDisposal() {
        return wasteDisposal;
    }

    public void setWasteDisposal( String wasteDisposal ) {
        this.wasteDisposal = wasteDisposal;
    }

    public String getWasteNote() {
        return wasteNote;
    }

    public void setWasteNote( String wasteNote ) {
        this.wasteNote = wasteNote;
    }
}