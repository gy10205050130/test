package yxinfo.dct.inteface.dto.chem.tv;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.chem.chemical.ChemChemicalDTO;

/**
 * Created by dy on 2016/12/16.
 */
public class ChemRankDTO extends BaseDTO {

    private static final long serialVersionUID = 6846546012603923769L;

    private ChemChemicalDTO chem;

    private Integer rank;

    private Integer num;

    public ChemChemicalDTO getChem() {
        return chem;
    }

    public void setChem( ChemChemicalDTO chem ) {
        this.chem = chem;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank( Integer rank ) {
        this.rank = rank;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }
}
