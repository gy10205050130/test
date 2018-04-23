package yxinfo.shop.inf.dto.goods;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2017/2/23.
 */
public class GoodsIdxDTO extends BaseDTO {

    //使用方id
    private Integer partyId;

    //商品id
    private Integer goodsId;

    //搜索权重
    private Short weight;

    private String merName;

    //分类id
    private Integer catId;

    private String goodsName;

    //编号
    private String fnumber;

    //品牌
    private String brand;

    //备货期
    private Short prepareTerm;

    //价格（分）
    private Integer price;

    //父产品id
    private Integer pid;

    //名称长度
    private Short nameLen;

    /**------------扩展属性---------------**/
    private List<GoodsPicDTO> goodsPicDTOs;


    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Short getPrepareTerm() {
        return prepareTerm;
    }

    public void setPrepareTerm(Short prepareTerm) {
        this.prepareTerm = prepareTerm;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Short getNameLen() {
        return nameLen;
    }

    public void setNameLen(Short nameLen) {
        this.nameLen = nameLen;
    }

    public List<GoodsPicDTO> getGoodsPicDTOs() {
        return goodsPicDTOs;
    }

    public void setGoodsPicDTOs(List<GoodsPicDTO> goodsPicDTOs) {
        this.goodsPicDTOs = goodsPicDTOs;
    }

    @Override
    public String toString() {
        return "GoodsIdxDTO{" +
                "partyId=" + partyId +
                ", goodsId=" + goodsId +
                ", weight=" + weight +
                ", merName='" + merName + '\'' +
                ", catId=" + catId +
                ", goodsName='" + goodsName + '\'' +
                ", fnumber='" + fnumber + '\'' +
                ", brand='" + brand + '\'' +
                ", prepareTerm=" + prepareTerm +
                ", price=" + price +
                ", pid=" + pid +
                ", nameLen=" + nameLen +
                ", goodsPicDTOs=" + goodsPicDTOs +
                '}';
    }
}
