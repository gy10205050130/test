package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/11/18.
 */
public class GoodsApvDTO extends BaseDTO{

    private Integer id;

    //商品id
    private Integer goodsId;

    //商品分类
    private Integer catId;

    //名称
    private String fname;

    //商户id
    private Integer merId;

    //商户名称
    private String merName;

    //下架原因
    private String reason;

    //1新增,2修改
    private Short ftype;

    //1未审核,2已审核,3已作废
    private Short fstatus;

    //创建时间
    private Date createAt;

    //审核时间
    private Date apvAt;

    //更新时间
    private Date updateAt;

    /*----------------扩展属性--------------------*/

    private Integer partyId;

    private GoodsSpecExDTO goodsSpecExDTO;

    private GoodsDTO goodsDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype(Short ftype) {
        this.ftype = ftype;
    }

    public Short getFstatus() {
        return fstatus;
    }

    public void setFstatus(Short fstatus) {
        this.fstatus = fstatus;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public GoodsSpecExDTO getGoodsSpecExDTO() {
        return goodsSpecExDTO;
    }

    public void setGoodsSpecExDTO(GoodsSpecExDTO goodsSpecExDTO) {
        this.goodsSpecExDTO = goodsSpecExDTO;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getApvAt() {
        return apvAt;
    }

    public void setApvAt(Date apvAt) {
        this.apvAt = apvAt;
    }

    public GoodsDTO getGoodsDTO() {
        return goodsDTO;
    }

    public void setGoodsDTO(GoodsDTO goodsDTO) {
        this.goodsDTO = goodsDTO;
    }

    @Override
    public String toString() {
        return "GoodsApvDTO{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", catId=" + catId +
                ", fname='" + fname + '\'' +
                ", merId=" + merId +
                ", merName='" + merName + '\'' +
                ", reason='" + reason + '\'' +
                ", ftype=" + ftype +
                ", fstatus=" + fstatus +
                ", createAt=" + createAt +
                ", apvAt=" + apvAt +
                ", updateAt=" + updateAt +
                ", partyId=" + partyId +
                ", goodsSpecExDTO=" + goodsSpecExDTO +
                ", goodsDTO=" + goodsDTO +
                '}';
    }
}
