package yxinfo.dct.inteface.dto.chem.reagent.biz;

import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.dto.chem.hw.HwRecycBucketDTO;
import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

/**
 * Created by dy on 2016/11/3.
 */
public class ReagentOrBucketDTO extends BaseDTO {

    private static final long serialVersionUID = 2404838320474431417L;

    // "reagent"试剂 / "bucket"废液桶
    private String flag;

    private ChemReagentDTO reagent;

    private HwRecycBucketDTO bucket;

    public String getFlag () {
        return flag;
    }

    public void setFlag ( String flag ) {
        this.flag = flag;
    }

    public ChemReagentDTO getReagent () {
        return reagent;
    }

    public void setReagent ( ChemReagentDTO reagent ) {
        this.reagent = reagent;
    }

    public HwRecycBucketDTO getBucket () {
        return bucket;
    }

    public void setBucket ( HwRecycBucketDTO bucket ) {
        this.bucket = bucket;
    }
}
