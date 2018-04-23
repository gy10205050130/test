package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;

public class MemberCartDTO extends BaseDTO {

    private static final long serialVersionUID = 141592351950708099L;

    private Integer id;

    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 商品id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer goodsId;

    // 购买数量
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer num;

    // 商品规格版本
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer version;

    // 创建时间
    private Date createAt;

    // 名称
    private String fname;

    // 品牌
    private String brand;

    // 备货期（天）
    private Short prepareTerm;

    // 价格（分）
    private Integer price;

    // 库存
    private Integer stock;

    // 量词（瓶、袋等）
    private String measure;

    // 商品的扩展属性信息
    private Map<String, Object> goodsPropVal;

    // 封面图片id
    private Integer coverStaticId;

    // 0无修改, 1有更新, 2已删除
    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId( Integer goodsId ) {
        this.goodsId = goodsId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion( Integer version ) {
        this.version = version;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }

    public Short getPrepareTerm() {
        return prepareTerm;
    }

    public void setPrepareTerm( Short prepareTerm ) {
        this.prepareTerm = prepareTerm;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price ) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock( Integer stock ) {
        this.stock = stock;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure( String measure ) {
        this.measure = measure;
    }

    public Map<String, Object> getGoodsPropVal() {
        return goodsPropVal;
    }

    public void setGoodsPropVal( Map<String, Object> goodsPropVal ) {
        this.goodsPropVal = goodsPropVal;
    }

    public Integer getCoverStaticId() {
        return coverStaticId;
    }

    public void setCoverStaticId( Integer coverStaticId ) {
        this.coverStaticId = coverStaticId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }
}
