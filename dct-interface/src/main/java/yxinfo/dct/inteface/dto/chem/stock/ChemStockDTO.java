package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by dy on 2016/10/18.
 */
public class ChemStockDTO extends BaseDTO {

    private static final long serialVersionUID = -6603754360078025323L;

    private String chemName;

    private String chemCas;

    private List<ChemStockCountDTO> counts;

    private Long total;

    public String getChemName() {
        return chemName;
    }

    public void setChemName( String chemName ) {
        this.chemName = chemName;
    }

    public String getChemCas() {
        return chemCas;
    }

    public void setChemCas( String chemCas ) {
        this.chemCas = chemCas;
    }

    public List<ChemStockCountDTO> getCounts() {
        return counts;
    }

    public void setCounts( List<ChemStockCountDTO> counts ) {
        this.counts = counts;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal( Long total ) {
        this.total = total;
    }
}
