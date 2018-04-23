package yxinfo.dct.inteface.dto.chem.msds;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class MsdsSafetyDTO extends BaseDTO {
    
    private Integer msdsId;

    // 危险性概述_危险性类别
    private String riskCate;

    // 危险性概述_侵入途径
    private String invasionPath;

    // 急救措施_皮肤接触
    private String firstAidSkin;

    // 急救措施_眼睛接触
    private String firstAidEye;

    // 急救措施_吸入
    private String firstAidInhaled;

    // 急救措施_食入
    private String firstAidEat;

    // 接触控制/个体防护_中国MAC(mg/m3)
    private String cnMac;

    // 接触控制/个体防护_前苏联MAC(mg/m3)
    private String ussrMac;

    // 接触控制/个体防护_TLVTN
    private String tlvtn;

    // 接触控制/个体防护_TLVWN
    private String tlvwn;

    // 接触控制/个体防护_监测方法
    private String monitorMethod;

    // 接触控制/个体防护_工程控制
    private String engineeringCtrl;

    private Date updateAt;

    // 危险性概述_健康危害
    private String healthHazard;

    // 危险性概述_环境危害
    private String enviHazard;

    // 危险性概述_燃爆危险
    private String exploHazard;

    // 消防措施_危险特性
    private String fireCtrlDanger;

    // 消防措施_有害燃烧产物
    private String harmCombusPdus;

    // 消防措施_灭火方法
    private String extinguishingMethod;

    // 泄露应急处理_应急处理
    private String leakTreatment;

    // 操作处置与储存_操作注意事项
    private String opCautions;

    // 操作处置与储存_储存注意事项
    private String storageCautions;

    // 接触控制/个体防护_呼吸系统防护
    private String rSystemProtect;

    // 接触控制/个体防护_眼睛防护
    private String eyeProtect;

    // 接触控制/个体防护_身体防护
    private String bodyProtect;

    // 接触控制/个体防护_手防护
    private String handProtect;

    // 接触控制/个体防护_其他防护
    private String otherProtect;

    public Integer getMsdsId() {
        return msdsId;
    }

    public void setMsdsId( Integer msdsId ) {
        this.msdsId = msdsId;
    }

    public String getRiskCate() {
        return riskCate;
    }

    public void setRiskCate( String riskCate ) {
        this.riskCate = riskCate;
    }

    public String getInvasionPath() {
        return invasionPath;
    }

    public void setInvasionPath( String invasionPath ) {
        this.invasionPath = invasionPath;
    }

    public String getFirstAidSkin() {
        return firstAidSkin;
    }

    public void setFirstAidSkin( String firstAidSkin ) {
        this.firstAidSkin = firstAidSkin;
    }

    public String getFirstAidEye() {
        return firstAidEye;
    }

    public void setFirstAidEye( String firstAidEye ) {
        this.firstAidEye = firstAidEye;
    }

    public String getFirstAidInhaled() {
        return firstAidInhaled;
    }

    public void setFirstAidInhaled( String firstAidInhaled ) {
        this.firstAidInhaled = firstAidInhaled;
    }

    public String getFirstAidEat() {
        return firstAidEat;
    }

    public void setFirstAidEat( String firstAidEat ) {
        this.firstAidEat = firstAidEat;
    }

    public String getCnMac() {
        return cnMac;
    }

    public void setCnMac( String cnMac ) {
        this.cnMac = cnMac;
    }

    public String getUssrMac() {
        return ussrMac;
    }

    public void setUssrMac( String ussrMac ) {
        this.ussrMac = ussrMac;
    }

    public String getTlvtn() {
        return tlvtn;
    }

    public void setTlvtn( String tlvtn ) {
        this.tlvtn = tlvtn;
    }

    public String getTlvwn() {
        return tlvwn;
    }

    public void setTlvwn( String tlvwn ) {
        this.tlvwn = tlvwn;
    }

    public String getMonitorMethod() {
        return monitorMethod;
    }

    public void setMonitorMethod( String monitorMethod ) {
        this.monitorMethod = monitorMethod;
    }

    public String getEngineeringCtrl() {
        return engineeringCtrl;
    }

    public void setEngineeringCtrl( String engineeringCtrl ) {
        this.engineeringCtrl = engineeringCtrl;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public String getHealthHazard() {
        return healthHazard;
    }

    public void setHealthHazard( String healthHazard ) {
        this.healthHazard = healthHazard;
    }

    public String getEnviHazard() {
        return enviHazard;
    }

    public void setEnviHazard( String enviHazard ) {
        this.enviHazard = enviHazard;
    }

    public String getExploHazard() {
        return exploHazard;
    }

    public void setExploHazard( String exploHazard ) {
        this.exploHazard = exploHazard;
    }

    public String getFireCtrlDanger() {
        return fireCtrlDanger;
    }

    public void setFireCtrlDanger( String fireCtrlDanger ) {
        this.fireCtrlDanger = fireCtrlDanger;
    }

    public String getHarmCombusPdus() {
        return harmCombusPdus;
    }

    public void setHarmCombusPdus( String harmCombusPdus ) {
        this.harmCombusPdus = harmCombusPdus;
    }

    public String getExtinguishingMethod() {
        return extinguishingMethod;
    }

    public void setExtinguishingMethod( String extinguishingMethod ) {
        this.extinguishingMethod = extinguishingMethod;
    }

    public String getLeakTreatment() {
        return leakTreatment;
    }

    public void setLeakTreatment( String leakTreatment ) {
        this.leakTreatment = leakTreatment;
    }

    public String getOpCautions() {
        return opCautions;
    }

    public void setOpCautions( String opCautions ) {
        this.opCautions = opCautions;
    }

    public String getStorageCautions() {
        return storageCautions;
    }

    public void setStorageCautions( String storageCautions ) {
        this.storageCautions = storageCautions;
    }

    public String getrSystemProtect() {
        return rSystemProtect;
    }

    public void setrSystemProtect( String rSystemProtect ) {
        this.rSystemProtect = rSystemProtect;
    }

    public String getEyeProtect() {
        return eyeProtect;
    }

    public void setEyeProtect( String eyeProtect ) {
        this.eyeProtect = eyeProtect;
    }

    public String getBodyProtect() {
        return bodyProtect;
    }

    public void setBodyProtect( String bodyProtect ) {
        this.bodyProtect = bodyProtect;
    }

    public String getHandProtect() {
        return handProtect;
    }

    public void setHandProtect( String handProtect ) {
        this.handProtect = handProtect;
    }

    public String getOtherProtect() {
        return otherProtect;
    }

    public void setOtherProtect( String otherProtect ) {
        this.otherProtect = otherProtect;
    }
}