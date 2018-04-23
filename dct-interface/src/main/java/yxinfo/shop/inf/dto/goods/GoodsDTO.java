package yxinfo.shop.inf.dto.goods;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.dto.chem.chemical.ChemChemicalDTO;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mer.MerCoreDTO;
import yxinfo.shop.inf.dto.mer.MerWarehouseDTO;
import yxinfo.shop.inf.validation.groups.Add;
import yxinfo.shop.inf.validation.groups.Delete;
import yxinfo.shop.inf.validation.groups.Update;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 商品的dto
 * <p>
 * Created by cy on 2016/8/1.
 */
public class GoodsDTO extends BaseDTO {

    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Update.class, Delete.class}, message = ErrorCode.NOT_NULL)
    private Integer id;

    /**
     * 商户id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private Integer merId;
    private MerCoreDTO merCoreDTO;

    /**
     * 商品分类
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private Integer catId;
    /**
     * 分类对应的扩展属性信息
     */
    private List<GoodsCatPropDTO> catPropDtoList;

    /**
     * 接入方id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private Integer partyId;

    /**
     * 名称
     */
    @Length(max = 255, message = ErrorCode.LENGTH)
    @NotEmpty(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private String fname;

    /**
     * 编号
     */
    @Length(max = 50, message = ErrorCode.LENGTH)
    private String fnumber;

    /**
     * 始发地，<FK>area_core.id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private Integer distArea;
    private String distAreaName;

    /**
     * 父商品id
     */
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer pid;

    /**
     * 商户内部排序，desc
     */
    private Integer sort = 0;

    private String shelveReason;

    /**
     * 是否上架(true:上架 false:下架)
     */
    @NotNull(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private Boolean isShelve;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    private Integer flag;
    /**
     * 商品详情
     */
    @Length(max = 2000, message = ErrorCode.LENGTH)
    @NotEmpty(groups = {Update.class, Add.class}, message = ErrorCode.NOT_NULL)
    private String detail;

    private GoodsSpecDTO goodsSpecDTO;

    /**
     * 商品对应图片list
     */
    @Valid
    private List<GoodsPicDTO> goodsPicDtoList;
    private Integer coverStaticId;
    @Valid
    private List<GoodsSpecDTO> goodsSpecDTOList;

    private List<Map<String, Object>> goodsSpecMaps;

    private Short version;

    /**
     * 页面上使用（库存）
     */
    private Integer stock;
    /**
     * 页面上使用（采购商品的数量）
     */
    private Integer quantity = 1;

    /**
     * 化学品详细信息
     */
    private ChemChemicalDTO chemChemicalDTO;

    /**
     * 仓库信息
     */
    private MerWarehouseDTO merWarehouseDTO;
    public GoodsDTO() {
    }

    public GoodsDTO(Integer id, Integer merId, MerCoreDTO merCoreDTO, Integer catId, List<GoodsCatPropDTO> catPropDtoList, Integer partyId, String fname, String fnumber, Integer distArea, String distAreaName, Integer pid, Integer sort, Boolean isShelve, Date createAt, Date updateAt, String detail, GoodsSpecDTO goodsSpecDTO, List<GoodsPicDTO> goodsPicDtoList, Integer coverStaticId, List<GoodsSpecDTO> goodsSpecDTOList, List<Map<String, Object>> goodsSpecMaps, Short version, Integer stock, Integer quantity, ChemChemicalDTO chemChemicalDTO, MerWarehouseDTO merWarehouseDTO) {
        this.id = id;
        this.merId = merId;
        this.merCoreDTO = merCoreDTO;
        this.catId = catId;
        this.catPropDtoList = catPropDtoList;
        this.partyId = partyId;
        this.fname = fname;
        this.fnumber = fnumber;
        this.distArea = distArea;
        this.distAreaName = distAreaName;
        this.pid = pid;
        this.sort = sort;
        this.isShelve = isShelve;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.detail = detail;
        this.goodsSpecDTO = goodsSpecDTO;
        this.goodsPicDtoList = goodsPicDtoList;
        this.coverStaticId = coverStaticId;
        this.goodsSpecDTOList = goodsSpecDTOList;
        this.goodsSpecMaps = goodsSpecMaps;
        this.version = version;
        this.stock = stock;
        this.quantity = quantity;
        this.chemChemicalDTO = chemChemicalDTO;
        this.merWarehouseDTO = merWarehouseDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO(MerCoreDTO merCoreDTO) {
        this.merCoreDTO = merCoreDTO;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getFname() {
        if (fname != null) {
            return fname.trim();
        }
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFnumber() {
        if (fnumber != null) {
            return fnumber.trim();
        }
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getIsShelve() {
        return isShelve;
    }

    public void setIsShelve(Boolean shelve) {
        isShelve = shelve;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public GoodsSpecDTO getGoodsSpecDTO() {
        return goodsSpecDTO;
    }

    public void setGoodsSpecDTO(GoodsSpecDTO goodsSpecDTO) {
        this.goodsSpecDTO = goodsSpecDTO;
    }

    public List<GoodsPicDTO> getGoodsPicDtoList() {
        return goodsPicDtoList;
    }

    public void setGoodsPicDtoList(List<GoodsPicDTO> goodsPicDtoList) {
        this.goodsPicDtoList = goodsPicDtoList;
    }

    public List<GoodsSpecDTO> getGoodsSpecDTOList() {
        return goodsSpecDTOList;
    }

    public void setGoodsSpecDTOList(List<GoodsSpecDTO> goodsSpecDTOList) {
        this.goodsSpecDTOList = goodsSpecDTOList;
    }

    public List<Map<String, Object>> getGoodsSpecMaps() {
        return goodsSpecMaps;
    }

    public void setGoodsSpecMaps(List<Map<String, Object>> goodsSpecMaps) {
        this.goodsSpecMaps = goodsSpecMaps;
    }

    public Integer getCoverStaticId() {
        return coverStaticId;
    }

    public void setCoverStaticId(Integer coverStaticId) {
        this.coverStaticId = coverStaticId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<GoodsCatPropDTO> getCatPropDtoList() {
        return catPropDtoList;
    }

    public void setCatPropDtoList(List<GoodsCatPropDTO> catPropDtoList) {
        this.catPropDtoList = catPropDtoList;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public ChemChemicalDTO getChemChemicalDTO() {
        return chemChemicalDTO;
    }

    public void setChemChemicalDTO(ChemChemicalDTO chemChemicalDTO) {
        this.chemChemicalDTO = chemChemicalDTO;
    }

    public MerWarehouseDTO getMerWarehouseDTO() {
        return merWarehouseDTO;
    }

    public void setMerWarehouseDTO(MerWarehouseDTO merWarehouseDTO) {
        this.merWarehouseDTO = merWarehouseDTO;
    }

    public String getShelveReason() {
        return shelveReason;
    }

    public void setShelveReason(String shelveReason) {
        this.shelveReason = shelveReason;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "GoodsDTO{" +
                "id=" + id +
                ", merId=" + merId +
                ", merCoreDTO=" + merCoreDTO +
                ", catId=" + catId +
                ", catPropDtoList=" + catPropDtoList +
                ", partyId=" + partyId +
                ", fname='" + fname + '\'' +
                ", fnumber='" + fnumber + '\'' +
                ", distArea=" + distArea +
                ", distAreaName='" + distAreaName + '\'' +
                ", pid=" + pid +
                ", sort=" + sort +
                ", shelveReason='" + shelveReason + '\'' +
                ", isShelve=" + isShelve +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", detail='" + detail + '\'' +
                ", goodsSpecDTO=" + goodsSpecDTO +
                ", goodsPicDtoList=" + goodsPicDtoList +
                ", coverStaticId=" + coverStaticId +
                ", goodsSpecDTOList=" + goodsSpecDTOList +
                ", goodsSpecMaps=" + goodsSpecMaps +
                ", version=" + version +
                ", stock=" + stock +
                ", quantity=" + quantity +
                ", chemChemicalDTO=" + chemChemicalDTO +
                ", merWarehouseDTO=" + merWarehouseDTO +
                '}';
    }
}
