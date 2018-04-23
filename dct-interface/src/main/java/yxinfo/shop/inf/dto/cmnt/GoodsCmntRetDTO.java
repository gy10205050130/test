package yxinfo.shop.inf.dto.cmnt;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.PageDTO;

import java.util.List;

/**
 * Created by dy on 2016/9/21.
 */
public class GoodsCmntRetDTO extends BaseDTO {

    private static final long serialVersionUID = -1384751104325411698L;

    private Double aver;

    private PageDTO<List<CmntOrderDetailCtxDTO>> cmnts;

    public Double getAver() {
        return aver;
    }

    public void setAver( Double aver ) {
        this.aver = aver;
    }

    public PageDTO<List<CmntOrderDetailCtxDTO>> getCmnts() {
        return cmnts;
    }

    public void setCmnts( PageDTO<List<CmntOrderDetailCtxDTO>> cmnts ) {
        this.cmnts = cmnts;
    }
}
