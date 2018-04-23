package yxinfo.shop.inf.dto.goods;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Update;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 商品详情dto
 * <p>
 * Created by cy on 2016/8/1.
 */
public class GoodsSpecDTO extends BaseDTO {

    /**
     * 商品id（后添加的，方便取值，和前面的保持一致，goodsId的set方法有改动，此参数慎用）
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 父节点id
     */
    private Integer pid;

    /**
     * 货号
     */
    @Length(max = 50, message = ErrorCode.LENGTH)
    private String goodsNo;

    /**
     * 品牌
     */
    @Length(max = 20, message = ErrorCode.LENGTH)
    private String brand;

    /**
     * 备货期（天）
     */
    @Digits(integer = 3, fraction = 0, message = ErrorCode.LENGTH)
    private Short prepareTerm;

    /**
     * 价格（分）
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer price;

    /**
     * 库存
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer stock;

    /**
     * 量词（瓶、袋等）
     */
    @Length(max = 20, message = ErrorCode.LENGTH)
    private String measure;

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
     * 页面上使用（采购商品的数量）
     */
    private Integer quantity = 1;

    /**
     * 商品对应图片list
     */
    @Valid
    private List<GoodsPicDTO> goodsPicDtoList;
    private Integer coverStaticId;

    public GoodsSpecDTO() {
    }

    public GoodsSpecDTO(Integer id, Integer goodsId, Integer pid, String goodsNo, String brand, Short prepareTerm, Integer price, Integer stock, String measure, Map<String, Object> goodsPropVal, Short version, Integer quantity, List<GoodsPicDTO> goodsPicDtoList, Integer coverStaticId) {
        this.id = id;
        this.goodsId = goodsId;
        this.pid = pid;
        this.goodsNo = goodsNo;
        this.brand = brand;
        this.prepareTerm = prepareTerm;
        this.price = price;
        this.stock = stock;
        this.measure = measure;
        this.goodsPropVal = goodsPropVal;
        this.version = version;
        this.quantity = quantity;
        this.goodsPicDtoList = goodsPicDtoList;
        this.coverStaticId = coverStaticId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
        this.id = goodsId;//给id赋值
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getGoodsNo() {
        if (goodsNo != null) {
            return goodsNo.trim();
        }
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getBrand() {
        if (brand != null) {
            return brand.trim();
        }
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

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public List<GoodsPicDTO> getGoodsPicDtoList() {
        return goodsPicDtoList;
    }

    public void setGoodsPicDtoList(List<GoodsPicDTO> goodsPicDtoList) {
        this.goodsPicDtoList = goodsPicDtoList;
    }

    public Integer getCoverStaticId() {
        return coverStaticId;
    }

    public void setCoverStaticId(Integer coverStaticId) {
        this.coverStaticId = coverStaticId;
    }

    @Override
    public String toString() {
        return "GoodsSpecDTO{" +
                "goodsId=" + goodsId +
                ", pid=" + pid +
                ", goodsNo='" + goodsNo + '\'' +
                ", brand='" + brand + '\'' +
                ", prepareTerm=" + prepareTerm +
                ", price=" + price +
                ", stock=" + stock +
                ", measure=" + measure +
                ", goodsPropVal=" + goodsPropVal +
                ", version=" + version +
                '}';
    }
}
