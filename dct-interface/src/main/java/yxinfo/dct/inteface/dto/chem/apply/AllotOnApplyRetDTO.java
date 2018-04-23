package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2017/1/7.
 */
public class AllotOnApplyRetDTO extends BaseDTO {

    private static final long serialVersionUID = 494012422465727224L;

    // 归属人姓名
    private String belongToName;

    // 归属人工号
    private String belongToCode;

    // 数量
    private Integer count;

    public String getBelongToName() {
        return belongToName;
    }

    public void setBelongToName( String belongToName ) {
        this.belongToName = belongToName;
    }

    public String getBelongToCode() {
        return belongToCode;
    }

    public void setBelongToCode( String belongToCode ) {
        this.belongToCode = belongToCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount( Integer count ) {
        this.count = count;
    }
}
