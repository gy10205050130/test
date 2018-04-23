package yxinfo.dct.inteface.dto.chem.reagent;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.dto.chem.traj.ChemTrajDTO;
import yxinfo.dct.inteface.dto.lab.LaboratoryDTO;
import yxinfo.dct.inteface.dto.wh.WhDTO;
import yxinfo.dct.inteface.validation.groups.Add;
import yxinfo.dct.inteface.validation.groups.chem.*;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 化学试剂DTO
 * Created by dy on 2016/6/21.
 */
public class ChemReagentDTO extends BaseDTO {

    private static final long serialVersionUID = 4280565476873747397L;

    // id
    private Integer id;

    // 组织id
    @NotNull( groups = { Add.class, ReintoWh.class, RecycleAdd.class }, message = ErrorCode.CHEM_REAGENT_ORG_ID_NOT_EMPTY )
    private Integer orgId;

    // 位置信息，{类型}_{位置id}；类型为 wh仓库/lab实验室
    private String siteMsg;

    // 化学品名称
    @NotNull( groups = { Add.class, ReintoWh.class }, message = ErrorCode.CHEM_CHEM_ID_NOT_EMPTY )
    private String chemName;

    // 化学品名称拼音
    private String chemPyin;

    // 化学品CAS号
    private String chemCas;

    // 化学品名称长度
    private Integer chemNameLen;

    // 规格
    @NotNull( groups = { Add.class, ReintoWh.class }, message = ErrorCode.CHEM_SPEC_NOT_EMPTY )
    private String specName;

    // 容量/数量
    @NotNull( groups = { Add.class, ReintoWh.class }, message = ErrorCode.CHEM_CAPACITY_NOT_EMPTY )
    private Integer capacity;

    // 容量/数量计量单位
    @NotNull( groups = { Add.class, ReintoWh.class }, message = ErrorCode.CHEM_UNIT_NOT_EMPTY )
    private String unit;

    // 用途（1教学，2科研）
    private String flag;

    // 状态（0未生效，1库存中，2使用中，3待回收，4正常回收，5回收但未扫码，6扫码但未回收，7回收异常关闭，8作废，9报损）
    private String status;

    // 已用容量
    private Integer used;

    // RFCODE明码
    @NotNull( groups = { RecycleAdd.class, GetChemInfo.class }, message = ErrorCode.CHEM_REAGENT_RF_CODE_NOT_EMPTY )
    private String rfFcode;

    // 创建时间
    private Date createAt;

    // 入库时间
    private Date intowhAt;

    //可调配时间
    private Date allocableAt;

    // 采购类型（0普通入库，1采购入库）
    private String purchaseType;

    // 最近一次领取申请id
    private Integer applyId;

    // 最近一次领用时间
    private Date receiveAt;

    // 最近一次回收时间
    private Date recycleAt;

    // 负责人成员id
    private Integer inCharge;

    // 第二负责人成员id
    private Integer inChargeSec;

    // 双人管理类型（0不需要双人管理，1五双管理）
    private String doubleMgt;

    // 归属人工号
    private String belongToCode;

    // 归属人姓名
    private String belongToName;

    // 归属人姓名拼音
    private String belongToPyin;

    // 最近一次待确认领用扫码时间，五双管理时使用
    private Date waitReceiveAt;

    // 最近一次待确认领用成员id，五双管理时使用
    private Integer waitReceiveMember;

    //回库确认状态（1待领用人确认，2待回库管理员确认，3已确认）
    private String recycCfmStatus;

    //回库确认领用人成员id（五双）
    private Integer recycRcvMember;

    //回库领用人确认扫码时间（五双）
    private Date recycRcvCfmAt;

    //回库确认管理员成员id（五双）
    private Integer recycInCharge;

    //回库管理员确认扫码时间（五双）
    private Date recycInChargeCfmAt;

    // ---------------------------------------------------------------------------------------

    // 位于仓库
    private WhDTO wh;

    // 位于实验室
    private LaboratoryDTO lab;

    // 负责人
    private MemberDTO inChargeMember;

    // 第二负责人
    private MemberDTO inChargeMemberSec;

    // 归属人
    private MemberDTO belongToMember;

    // ---------------------------------------------------------------------------------------

    // RFID码列表
    @NotEmpty( groups = Add.class, message = ErrorCode.CHEM_REAGENT_RF_CODE_NOT_EMPTY )
    private List<String> rfFcodes;

    // 用户id
    @NotNull( groups = { Add.class, RecycleAdd.class, ReintoWh.class }, message = ErrorCode.CHEM_MEMBER_ID_NOT_EMPTY )
    private Integer memberId;

    // 搜索词
    private String schText;

    // 时间范围左值
    private Date createAtFrom;

    // 时间范围右值
    private Date createAtTo;

    // 是否可领取
    private boolean canReceive;

    // 采购订单明细id
    private Integer orderDetailId;

    // 试剂轨迹
    private List<ChemTrajDTO> trajs;

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

    public String getSiteMsg() {
        return siteMsg;
    }

    public void setSiteMsg( String siteMsg ) {
        this.siteMsg = siteMsg;
    }

    public String getChemName() {
        return chemName;
    }

    public void setChemName( String chemName ) {
        this.chemName = chemName;
    }

    public String getChemPyin() {
        return chemPyin;
    }

    public void setChemPyin( String chemPyin ) {
        this.chemPyin = chemPyin;
    }

    public String getChemCas() {
        return chemCas;
    }

    public void setChemCas( String chemCas ) {
        this.chemCas = chemCas;
    }

    public Integer getChemNameLen() {
        return chemNameLen;
    }

    public void setChemNameLen( Integer chemNameLen ) {
        this.chemNameLen = chemNameLen;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName( String specName ) {
        this.specName = specName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity( Integer capacity ) {
        this.capacity = capacity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit( String unit ) {
        this.unit = unit;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed( Integer used ) {
        this.used = used;
    }

    public String getRfFcode() {
        return rfFcode;
    }

    public void setRfFcode( String rfFcode ) {
        this.rfFcode = rfFcode;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Date getIntowhAt() {
        return intowhAt;
    }

    public void setIntowhAt( Date intowhAt ) {
        this.intowhAt = intowhAt;
    }

    public Date getAllocableAt() {
        return allocableAt;
    }

    public void setAllocableAt( Date allocableAt ) {
        this.allocableAt = allocableAt;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType( String purchaseType ) {
        this.purchaseType = purchaseType;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId( Integer applyId ) {
        this.applyId = applyId;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt( Date receiveAt ) {
        this.receiveAt = receiveAt;
    }

    public Date getRecycleAt() {
        return recycleAt;
    }

    public void setRecycleAt( Date recycleAt ) {
        this.recycleAt = recycleAt;
    }

    public Integer getInCharge() {
        return inCharge;
    }

    public void setInCharge( Integer inCharge ) {
        this.inCharge = inCharge;
    }

    public Integer getInChargeSec() {
        return inChargeSec;
    }

    public void setInChargeSec( Integer inChargeSec ) {
        this.inChargeSec = inChargeSec;
    }

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }

    public String getBelongToCode() {
        return belongToCode;
    }

    public void setBelongToCode( String belongToCode ) {
        this.belongToCode = belongToCode;
    }

    public String getBelongToName() {
        return belongToName;
    }

    public void setBelongToName( String belongToName ) {
        this.belongToName = belongToName;
    }

    public String getBelongToPyin() {
        return belongToPyin;
    }

    public void setBelongToPyin( String belongToPyin ) {
        this.belongToPyin = belongToPyin;
    }

    public Date getWaitReceiveAt() {
        return waitReceiveAt;
    }

    public void setWaitReceiveAt( Date waitReceiveAt ) {
        this.waitReceiveAt = waitReceiveAt;
    }

    public Integer getWaitReceiveMember() {
        return waitReceiveMember;
    }

    public void setWaitReceiveMember( Integer waitReceiveMember ) {
        this.waitReceiveMember = waitReceiveMember;
    }

    public String getRecycCfmStatus() {
        return recycCfmStatus;
    }

    public void setRecycCfmStatus( String recycCfmStatus ) {
        this.recycCfmStatus = recycCfmStatus;
    }

    public Integer getRecycRcvMember() {
        return recycRcvMember;
    }

    public void setRecycRcvMember( Integer recycRcvMember ) {
        this.recycRcvMember = recycRcvMember;
    }

    public Date getRecycRcvCfmAt() {
        return recycRcvCfmAt;
    }

    public void setRecycRcvCfmAt( Date recycRcvCfmAt ) {
        this.recycRcvCfmAt = recycRcvCfmAt;
    }

    public Integer getRecycInCharge() {
        return recycInCharge;
    }

    public void setRecycInCharge( Integer recycInCharge ) {
        this.recycInCharge = recycInCharge;
    }

    public Date getRecycInChargeCfmAt() {
        return recycInChargeCfmAt;
    }

    public void setRecycInChargeCfmAt( Date recycInChargeCfmAt ) {
        this.recycInChargeCfmAt = recycInChargeCfmAt;
    }

    public WhDTO getWh() {
        return wh;
    }

    public void setWh( WhDTO wh ) {
        this.wh = wh;
    }

    public LaboratoryDTO getLab() {
        return lab;
    }

    public void setLab( LaboratoryDTO lab ) {
        this.lab = lab;
    }

    public MemberDTO getInChargeMember() {
        return inChargeMember;
    }

    public void setInChargeMember( MemberDTO inChargeMember ) {
        this.inChargeMember = inChargeMember;
    }

    public MemberDTO getInChargeMemberSec() {
        return inChargeMemberSec;
    }

    public void setInChargeMemberSec( MemberDTO inChargeMemberSec ) {
        this.inChargeMemberSec = inChargeMemberSec;
    }

    public MemberDTO getBelongToMember() {
        return belongToMember;
    }

    public void setBelongToMember( MemberDTO belongToMember ) {
        this.belongToMember = belongToMember;
    }

    public List<String> getRfFcodes() {
        return rfFcodes;
    }

    public void setRfFcodes( List<String> rfFcodes ) {
        this.rfFcodes = rfFcodes;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }

    public Date getCreateAtFrom() {
        return createAtFrom;
    }

    public void setCreateAtFrom( Date createAtFrom ) {
        this.createAtFrom = createAtFrom;
    }

    public Date getCreateAtTo() {
        return createAtTo;
    }

    public void setCreateAtTo( Date createAtTo ) {
        this.createAtTo = createAtTo;
    }

    public boolean getCanReceive() {
        return canReceive;
    }

    public void setCanReceive( boolean canReceive ) {
        this.canReceive = canReceive;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
    }

    public List<ChemTrajDTO> getTrajs() {
        return trajs;
    }

    public void setTrajs( List<ChemTrajDTO> trajs ) {
        this.trajs = trajs;
    }
}
