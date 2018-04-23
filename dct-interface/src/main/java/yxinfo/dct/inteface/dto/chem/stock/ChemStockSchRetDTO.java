package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.supplies.SupStockDTO;

import java.util.List;

/**
 * Created by dy on 2017/1/19.
 */
public class ChemStockSchRetDTO extends BaseDTO {

    private static final long serialVersionUID = 4521793226168289633L;

    private List<ChemStockDTO> stock;

    private List<SupStockDTO> supStock;

    public List<ChemStockDTO> getStock() {
        return stock;
    }

    public void setStock( List<ChemStockDTO> stock ) {
        this.stock = stock;
    }

    public List<SupStockDTO> getSupStock() {
        return supStock;
    }

    public void setSupStock( List<SupStockDTO> supStock ) {
        this.supStock = supStock;
    }
}
