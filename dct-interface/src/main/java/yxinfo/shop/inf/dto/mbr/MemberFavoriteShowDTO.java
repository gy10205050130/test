package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.goods.GoodsSpecExDTO;
import yxinfo.shop.inf.dto.mer.MerCoreDTO;

public class MemberFavoriteShowDTO extends BaseDTO {

    private static final long serialVersionUID = 1095379139063680145L;

    private Integer id;

    private Short ftype;

    private MerCoreDTO merCoreDTO;

    private GoodsSpecExDTO goodsSpecExDTO;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype( Short ftype ) {
        this.ftype = ftype;
    }

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO( MerCoreDTO merCoreDTO ) {
        this.merCoreDTO = merCoreDTO;
    }

    public GoodsSpecExDTO getGoodsSpecExDTO() {
        return goodsSpecExDTO;
    }

    public void setGoodsSpecExDTO( GoodsSpecExDTO goodsSpecExDTO ) {
        this.goodsSpecExDTO = goodsSpecExDTO;
    }
}
