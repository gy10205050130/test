package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2017/1/14.
 */
public class ApplyReceiveRankDTO extends BaseDTO {

    private static final long serialVersionUID = 6786934429949395798L;

    private String name;

    private Integer num;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }
}
