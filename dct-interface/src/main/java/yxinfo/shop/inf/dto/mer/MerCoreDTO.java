package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.goods.GoodsIdxDTO;
import yxinfo.shop.inf.dto.goods.GoodsSpecExDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by ZH on 2016/8/1.
 */
public class MerCoreDTO extends BaseDTO {

    private static final long serialVersionUID = 4202427050760134623L;

    private Integer id;

    // 名称
    private String fname;

    // logo静态资源id
    private Integer logo;

    // 商户类型（1入驻，2合作）
    private Short ftype;

    // 状态（1未启用，2启用，3禁用）
    private Short fstatus;

    // 认证状态（1待认证，2认证中，3已认证）
    private Short authStatus;

    // 商品数量
    private Integer goodsNum;

    // 主营
    private String majorBiz;

    // 联系人
    private String contactPerson;

    // 联系人电话
    private String contactPhone;

    // 发票类型（1普通，2增值，3全部）
    private Short invType;

    // 热门度，desc
    private Integer hot;

    // 创建时间
    private Date createAt;

    /**--------------------以下为扩展字段----------------------**/
    //使用方id
    private Integer partyId;

    //商品list (仅电商APP合作商家页使用)
    private List <GoodsIdxDTO> goodsIdxDTOs;

    // 仓库List
    private List < MerWarehouseDTO > merWarehouseDTOList;

    // 商家地址
    private MerPosDTO merPosDTO;

    // 商户关联成员
    private List < MerMemberDTO > merMemberDTOList;

    // 商户设置
    private List < MerSettingDTO > merSettingDTOList;

    private List< MerQualDTO > merQualDTOList;

    // 商户认证记录
    private MerAuthDTO merAuthDTO;

    private List<MerTranChannelDTO> merTranChannelDTOList;

    private List<MerBizScopeDTO> merBizScopeDTOList;

    private List<MerPartyDTO> merPartyDTOList;

    private List<MerGoodsCatDTO> merGoodsCatDTOList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getLogo() {
        return logo;
    }

    public void setLogo(Integer logo) {
        this.logo = logo;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus(Short fstatus) {
        this.fstatus = fstatus;
    }

    public Short getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Short authStatus) {
        this.authStatus = authStatus;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getMajorBiz() {
        return majorBiz;
    }

    public void setMajorBiz(String majorBiz) {
        this.majorBiz = majorBiz;
    }

    public Short getInvType() {
        return invType;
    }

    public void setInvType(Short invType) {
        this.invType = invType;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<MerWarehouseDTO> getMerWarehouseDTOList() {
        return merWarehouseDTOList;
    }

    public void setMerWarehouseDTOList(List<MerWarehouseDTO> merWarehouseDTOList) {
        this.merWarehouseDTOList = merWarehouseDTOList;
    }

    public MerPosDTO getMerPosDTO() {
        return merPosDTO;
    }

    public void setMerPosDTO(MerPosDTO merPosDTO) {
        this.merPosDTO = merPosDTO;
    }

    public List<MerMemberDTO> getMerMemberDTOList() {
        return merMemberDTOList;
    }

    public void setMerMemberDTOList(List<MerMemberDTO> merMemberDTOList) {
        this.merMemberDTOList = merMemberDTOList;
    }

    public List<MerSettingDTO> getMerSettingDTOList() {
        return merSettingDTOList;
    }

    public void setMerSettingDTOList(List<MerSettingDTO> merSettingDTOList) {
        this.merSettingDTOList = merSettingDTOList;
    }

    public List<MerQualDTO> getMerQualDTOList() {
        return merQualDTOList;
    }

    public void setMerQualDTOList(List<MerQualDTO> merQualDTOList) {
        this.merQualDTOList = merQualDTOList;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype(Short ftype) {
        this.ftype = ftype;
    }

    public MerAuthDTO getMerAuthDTO() {
        return merAuthDTO;
    }

    public void setMerAuthDTO(MerAuthDTO merAuthDTO) {
        this.merAuthDTO = merAuthDTO;
    }

    public List<MerTranChannelDTO> getMerTranChannelDTOList() {
        return merTranChannelDTOList;
    }

    public void setMerTranChannelDTOList(List<MerTranChannelDTO> merTranChannelDTOList) {
        this.merTranChannelDTOList = merTranChannelDTOList;
    }

    public List<MerBizScopeDTO> getMerBizScopeDTOList() {
        return merBizScopeDTOList;
    }

    public void setMerBizScopeDTOList(List<MerBizScopeDTO> merBizScopeDTOList) {
        this.merBizScopeDTOList = merBizScopeDTOList;
    }

    public List<MerPartyDTO> getMerPartyDTOList() {
        return merPartyDTOList;
    }

    public void setMerPartyDTOList(List<MerPartyDTO> merPartyDTOList) {
        this.merPartyDTOList = merPartyDTOList;
    }

    public List<MerGoodsCatDTO> getMerGoodsCatDTOList() {
        return merGoodsCatDTOList;
    }

    public void setMerGoodsCatDTOList(List<MerGoodsCatDTO> merGoodsCatDTOList) {
        this.merGoodsCatDTOList = merGoodsCatDTOList;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public List<GoodsIdxDTO> getGoodsIdxDTOs() {
        return goodsIdxDTOs;
    }

    public void setGoodsIdxDTOs(List<GoodsIdxDTO> goodsIdxDTOs) {
        this.goodsIdxDTOs = goodsIdxDTOs;
    }

    @Override
    public String toString() {
        return "MerCoreDTO{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", logo=" + logo +
                ", ftype=" + ftype +
                ", fstatus=" + fstatus +
                ", authStatus=" + authStatus +
                ", goodsNum=" + goodsNum +
                ", majorBiz='" + majorBiz + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", invType=" + invType +
                ", hot=" + hot +
                ", createAt=" + createAt +
                ", partyId=" + partyId +
                ", goodsIdxDTOs=" + goodsIdxDTOs +
                ", merWarehouseDTOList=" + merWarehouseDTOList +
                ", merPosDTO=" + merPosDTO +
                ", merMemberDTOList=" + merMemberDTOList +
                ", merSettingDTOList=" + merSettingDTOList +
                ", merQualDTOList=" + merQualDTOList +
                ", merAuthDTO=" + merAuthDTO +
                ", merTranChannelDTOList=" + merTranChannelDTOList +
                ", merBizScopeDTOList=" + merBizScopeDTOList +
                ", merPartyDTOList=" + merPartyDTOList +
                ", merGoodsCatDTOList=" + merGoodsCatDTOList +
                '}';
    }
}
