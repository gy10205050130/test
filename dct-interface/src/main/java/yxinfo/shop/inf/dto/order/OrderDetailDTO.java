package yxinfo.shop.inf.dto.order;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class OrderDetailDTO extends BaseDTO {

    private static final long serialVersionUID = -7361370272627836740L;

    private Integer id;

    // 订单id
    private Integer orderId;

    // 商品id
    private Integer goodsId;

    // 商品分类
    private Integer catId;

    // 名称
    private String fname;

    // 编号
    private String fnumber;

    // 货号
    private String goodsNo;

    // 品牌
    private String brand;

    // 备货期（天）
    private Short prepareTerm;

    // 量词（瓶、袋等）
    private String measure;

    // 价格（分）
    private Integer price;

    // 始发地
    private Integer distArea;

    private String goodsPropVal;

    // 购买数量
    private Integer num;

    // 封面静态资源id
    private Integer cover;

    // 准购批号，<FK>order_allow_cert.batch_no
    private String acBatchNo;

    // 审核状态（1待审核，2审核中，3审核成功，4审核失败）
    private Short apvStatus;

    // 准购证静态资源id
    private Integer allowCert;

    // 是否评论
    private Boolean isCmnt;

    // 出入库状态（0未入库，1已入库）
    private Short intowhStatus;

    // 入库时间
    private Date intowhAt;

    //  =====================================================================
    // 订单
    private OrderCoreDTO order;

    // 类别
    private String cat;

    // 是否是试剂, true是
    private Boolean isReagent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
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

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDistArea() {
        return distArea;
    }

    public void setDistArea(Integer distArea) {
        this.distArea = distArea;
    }

    public String getGoodsPropVal() {
        return goodsPropVal;
    }

    public void setGoodsPropVal(String goodsPropVal) {
        this.goodsPropVal = goodsPropVal;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCover() {
        return cover;
    }

    public void setCover( Integer cover ) {
        this.cover = cover;
    }

    public String getAcBatchNo() {
        return acBatchNo;
    }

    public void setAcBatchNo( String acBatchNo ) {
        this.acBatchNo = acBatchNo;
    }

    public Short getApvStatus() {
        return apvStatus;
    }

    public void setApvStatus( Short apvStatus ) {
        this.apvStatus = apvStatus;
    }

    public Integer getAllowCert() {
        return allowCert;
    }

    public void setAllowCert( Integer allowCert ) {
        this.allowCert = allowCert;
    }

    public Boolean getIsCmnt() {
        return isCmnt;
    }

    public void setIsCmnt( Boolean cmnt ) {
        isCmnt = cmnt;
    }

    public Short getIntowhStatus() {
        return intowhStatus;
    }

    public void setIntowhStatus( Short intowhStatus ) {
        this.intowhStatus = intowhStatus;
    }

    public Date getIntowhAt() {
        return intowhAt;
    }

    public void setIntowhAt( Date intowhAt ) {
        this.intowhAt = intowhAt;
    }

    public OrderCoreDTO getOrder() {
        return order;
    }

    public void setOrder( OrderCoreDTO order ) {
        this.order = order;
    }

    public String getCat() {
        return cat;
    }

    public void setCat( String cat ) {
        this.cat = cat;
    }

    public Boolean getIsReagent() {
        return isReagent;
    }

    public void setIsReagent( Boolean reagent ) {
        isReagent = reagent;
    }
}