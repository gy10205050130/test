package yxinfo.dct.inteface.dto.chem.global;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyDetailDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveBatchDTO;
import yxinfo.dct.inteface.dto.chem.stock.MyReagentDTO;
import yxinfo.shop.inf.dto.goods.GoodsSpecExDTO;

import java.util.List;

/**
 * Created by dy on 2017/1/14.
 */
public class ChemSearchRetDTO extends BaseDTO {

    private static final long serialVersionUID = 5621837057135080225L;

    private List<ApplyDetailDTO> wait;

    private List<ApplyReceiveBatchDTO> has;

    private List<MyReagentDTO> my;

    private List<MyReagentDTO> allocatable;

    private List<GoodsSpecExDTO> goods;

    private List<ApproveRecodeDTO> apv;

    public List<ApplyDetailDTO> getWait() {
        return wait;
    }

    public void setWait( List<ApplyDetailDTO> wait ) {
        this.wait = wait;
    }

    public List<ApplyReceiveBatchDTO> getHas() {
        return has;
    }

    public void setHas( List<ApplyReceiveBatchDTO> has ) {
        this.has = has;
    }

    public List<MyReagentDTO> getMy() {
        return my;
    }

    public void setMy( List<MyReagentDTO> my ) {
        this.my = my;
    }

    public List<MyReagentDTO> getAllocatable() {
        return allocatable;
    }

    public void setAllocatable( List<MyReagentDTO> allocatable ) {
        this.allocatable = allocatable;
    }

    public List<GoodsSpecExDTO> getGoods() {
        return goods;
    }

    public void setGoods( List<GoodsSpecExDTO> goods ) {
        this.goods = goods;
    }

    public List<ApproveRecodeDTO> getApv() {
        return apv;
    }

    public void setApv( List<ApproveRecodeDTO> apv ) {
        this.apv = apv;
    }
}
