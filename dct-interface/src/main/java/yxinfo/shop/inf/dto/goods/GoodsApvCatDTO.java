package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * 商品审核分类dto
 *
 * Created by cy on 2016/8/15.
 */
public class GoodsApvCatDTO extends BaseDTO {

    private Integer id;

    private String fname;

    public GoodsApvCatDTO() {
    }

    public GoodsApvCatDTO(Integer id, String fname) {
        this.id = id;
        this.fname = fname;
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

    @Override
    public String toString() {
        return "GoodsApvCatDTO{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                '}';
    }
}
