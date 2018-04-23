package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by dy on 2017/1/14.
 */
public class MyReagentSchRetDTO extends BaseDTO {

    private static final long serialVersionUID = -2512867264736768286L;

    private List<MyReagentDTO> my;

    private List<MyReagentDTO> allocatable;

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
}
