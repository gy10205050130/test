package yxinfo.shop.inf.dto.goods;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 商品分类
 *
 * Created by cy on 2016/8/1.
 */
public class GoodsCatDTO extends BaseDTO {

    private Integer id;

    @Length(max = 50, message = ErrorCode.LENGTH)
    @NotEmpty(message = ErrorCode.NOT_EMPTY)
    private String fname;

    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer partyId;

    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    private Integer pid;

    @Digits(integer = 3, fraction = 0, message = ErrorCode.LENGTH)
    private Short level;

    @Digits(integer = 3, fraction = 0, message = ErrorCode.LENGTH)
    private Integer catId;

    private List<GoodsCatDTO> goodsCatDtoList;

    /**
     * 商户id
     */
    private Integer merId;

    public GoodsCatDTO() {
    }

    public GoodsCatDTO(Integer pid) {
        this.pid = pid;
    }

    public GoodsCatDTO(Integer id, Integer partyId) {
        this.id = id;
        this.partyId = partyId;
    }

    public GoodsCatDTO(Integer id, String fname, Integer partyId, Integer pid, Short level, Integer catId, List<GoodsCatDTO> goodsCatDtoList, Integer merId) {
        this.id = id;
        this.fname = fname;
        this.partyId = partyId;
        this.pid = pid;
        this.level = level;
        this.catId = catId;
        this.goodsCatDtoList = goodsCatDtoList;
        this.merId = merId;
    }

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

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public List<GoodsCatDTO> getGoodsCatDtoList() {
        return goodsCatDtoList;
    }

    public void setGoodsCatDtoList(List<GoodsCatDTO> goodsCatDtoList) {
        this.goodsCatDtoList = goodsCatDtoList;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    @Override
    public String toString() {
        return "GoodsCatDTO{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", partyId=" + partyId +
                ", pid=" + pid +
                ", level=" + level +
                ", catId=" + catId +
                ", goodsCatDtoList=" + goodsCatDtoList +
                ", merId=" + merId +
                '}';
    }
}
