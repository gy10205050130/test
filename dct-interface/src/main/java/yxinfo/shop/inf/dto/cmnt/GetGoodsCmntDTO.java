package yxinfo.shop.inf.dto.cmnt;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/9/21.
 */
public class GetGoodsCmntDTO extends BaseDTO {

    private static final long serialVersionUID = -1384751104325411698L;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer goodsId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId( Integer goodsId ) {
        this.goodsId = goodsId;
    }
}
