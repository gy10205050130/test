package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mer.MerCoreDTO;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 商品规格扩展信息
 *
 * Created by cy on 2016/8/2.
 */
public class GoodsSpecExDTO extends BaseDTO {

    /**
     * 商品id
     */
    private Integer id;

    /**
     * 商户id
     */
    private Integer merId;
    private MerCoreDTO merCoreDTO;

    /**
     * 分类id
     */
    private Integer catId;

    /**
     * 分类对应的扩展属性
     */
    private List<GoodsCatPropDTO> catPropDtoList;

    /**
     * 名称
     */
    private String fname;

    /**
     * 编号
     */
    private String fnumber;

    /**
     * 是否上架(true:上架 false:下架)
     */
    private Boolean isShelve;

    /**
     * 货号
     */
    private String goodsNo;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 备货期（天）
     */
    private Short prepareTerm;

    /**
     * 价格（分）
     */
    private Integer price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 量词（瓶、袋等）
     */
    private String measure;

    //父商品id
    private Integer pid;

    /**
     * 商品的扩展属性信息
     */
    private Map<String, Object> goodsPropVal;

    /**
     * 版本
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Short version;

    /**
     * 排序参数
     */
    private String sortParam;

    private Integer partyId;

    /**
     * 始发地
     */
    private Integer distArea;
    private String distAreaName;

    /**
     * 1 后台查询 2 商城上的查询
     */
    private Integer fromFlag;

    /**
     * 查询参数
     */
    private String queryParam;

    /**
     * 封面图片id
     */
    private Integer coverStaticId;

    /**
     * 合并搜索（APP专用）
     */
    private String searchStr;

    /**
     * 页面上使用（采购商品的数量）
     */
    private Integer quantity = 1;
    public GoodsSpecExDTO() {
    }

    public GoodsSpecExDTO(Integer id, Integer merId, MerCoreDTO merCoreDTO, Integer catId, List<GoodsCatPropDTO> catPropDtoList, String fname, String fnumber, Boolean isShelve, String goodsNo, String brand, Short prepareTerm, Integer price, Integer stock, String measure, Map<String, Object> goodsPropVal, Short version, String sortParam, Integer partyId, Integer distArea, String distAreaName, Integer fromFlag, String queryParam, Integer coverStaticId, Integer quantity) {
        this.id = id;
        this.merId = merId;
        this.merCoreDTO = merCoreDTO;
        this.catId = catId;
        this.catPropDtoList = catPropDtoList;
        this.fname = fname;
        this.fnumber = fnumber;
        this.isShelve = isShelve;
        this.goodsNo = goodsNo;
        this.brand = brand;
        this.prepareTerm = prepareTerm;
        this.price = price;
        this.stock = stock;
        this.measure = measure;
        this.goodsPropVal = goodsPropVal;
        this.version = version;
        this.sortParam = sortParam;
        this.partyId = partyId;
        this.distArea = distArea;
        this.distAreaName = distAreaName;
        this.fromFlag = fromFlag;
        this.queryParam = queryParam;
        this.coverStaticId = coverStaticId;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO(MerCoreDTO merCoreDTO) {
        this.merCoreDTO = merCoreDTO;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }

    public Boolean getIsShelve() {
        return isShelve;
    }

    public void setIsShelve(Boolean shelve) {
        isShelve = shelve;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Map<String, Object> getGoodsPropVal() {
        return goodsPropVal;
    }

    public void setGoodsPropVal(Map<String, Object> goodsPropVal) {
        this.goodsPropVal = goodsPropVal;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public String getSortParam() {
        return sortParam;
    }

    public void setSortParam(String sortParam) {
        this.sortParam = sortParam;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Integer getDistArea() {
        return distArea;
    }

    public void setDistArea(Integer distArea) {
        this.distArea = distArea;
    }

    public String getDistAreaName() {
        return distAreaName;
    }

    public void setDistAreaName(String distAreaName) {
        this.distAreaName = distAreaName;
    }

    public Integer getFromFlag() {
        return fromFlag;
    }

    public void setFromFlag(Integer fromFlag) {
        this.fromFlag = fromFlag;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    public Integer getCoverStaticId() {
        return coverStaticId;
    }

    public void setCoverStaticId(Integer coverStaticId) {
        this.coverStaticId = coverStaticId;
    }

    public List<GoodsCatPropDTO> getCatPropDtoList() {
        return catPropDtoList;
    }

    public void setCatPropDtoList(List<GoodsCatPropDTO> catPropDtoList) {
        this.catPropDtoList = catPropDtoList;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getSearchStr() {
        return searchStr;
    }

    public void setSearchStr(String searchStr) {
        this.searchStr = searchStr;
    }

    @Override
    public String toString() {
        return "GoodsSpecExDTO{" +
                "id=" + id +
                ", merId=" + merId +
                ", merCoreDTO=" + merCoreDTO +
                ", catId=" + catId +
                ", catPropDtoList=" + catPropDtoList +
                ", fname='" + fname + '\'' +
                ", fnumber='" + fnumber + '\'' +
                ", isShelve=" + isShelve +
                ", goodsNo='" + goodsNo + '\'' +
                ", brand='" + brand + '\'' +
                ", prepareTerm=" + prepareTerm +
                ", price=" + price +
                ", stock=" + stock +
                ", measure='" + measure + '\'' +
                ", pid=" + pid +
                ", goodsPropVal=" + goodsPropVal +
                ", version=" + version +
                ", sortParam='" + sortParam + '\'' +
                ", partyId=" + partyId +
                ", distArea=" + distArea +
                ", distAreaName='" + distAreaName + '\'' +
                ", fromFlag=" + fromFlag +
                ", queryParam='" + queryParam + '\'' +
                ", coverStaticId=" + coverStaticId +
                ", searchStr='" + searchStr + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
