package yxinfo.shop.inf.dto.goods;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by ZH on 2016/10/12.
 */
public class GoodsCountDTO extends BaseDTO {

    //平台id
    private Integer partyId;

    //商品名称
    private String fname;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "GoodsCountDTO{" +
                "partyId=" + partyId +
                ", fname='" + fname + '\'' +
                '}';
    }
}
