package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.party.PartyCoreDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/12/8.
 */
public class HotGoodsDTO extends BaseDTO {

    private Integer id;

    //商品id
    private Integer goodsId;

    private String goodsUrl;

    //使用方id
    private Integer partyId;

    //商户id
    private Integer merId;

    //商户名称
    private String merName;

    //排序
    private Integer sort;

    //创建时间
    private Date createAt;

    /**-----------------------------**/

    private Integer staticId;

    private String fname;

    private Integer price;

    private String measure;

    private PartyCoreDTO partyCoreDTO;

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

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public PartyCoreDTO getPartyCoreDTO() {
        return partyCoreDTO;
    }

    public void setPartyCoreDTO(PartyCoreDTO partyCoreDTO) {
        this.partyCoreDTO = partyCoreDTO;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "HotGoodsDTO{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", goodsUrl='" + goodsUrl + '\'' +
                ", partyId=" + partyId +
                ", merId=" + merId +
                ", merName='" + merName + '\'' +
                ", sort=" + sort +
                ", createAt=" + createAt +
                ", staticId=" + staticId +
                ", fname='" + fname + '\'' +
                ", price=" + price +
                ", measure='" + measure + '\'' +
                ", partyCoreDTO=" + partyCoreDTO +
                '}';
    }
}
