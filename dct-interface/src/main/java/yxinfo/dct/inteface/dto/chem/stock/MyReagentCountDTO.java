package yxinfo.dct.inteface.dto.chem.stock;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2016/10/19.
 */
public class MyReagentCountDTO extends BaseDTO {

    private static final long serialVersionUID = 1089673091289903199L;

    // 我的试剂数量
    private Integer my;

    // 可分配试剂数量
    private Integer allocatable;

    public Integer getMy() {
        return my;
    }

    public void setMy( Integer my ) {
        this.my = my;
    }

    public Integer getAllocatable() {
        return allocatable;
    }

    public void setAllocatable( Integer allocatable ) {
        this.allocatable = allocatable;
    }
}
