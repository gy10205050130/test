package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.dto.BaseDTO;

public class ApplyReceiveBelongDTO extends BaseDTO {

    private static final long serialVersionUID = -8982164044994152509L;

    // 领取批次
    private Integer batchId;

    // 归属人工号
    private String belongToCode;

    // 归属人姓名
    private String belongToName;

    // 数量
    private Integer num;

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId( Integer batchId ) {
        this.batchId = batchId;
    }

    public String getBelongToCode() {
        return belongToCode;
    }

    public void setBelongToCode( String belongToCode ) {
        this.belongToCode = belongToCode;
    }

    public String getBelongToName() {
        return belongToName;
    }

    public void setBelongToName( String belongToName ) {
        this.belongToName = belongToName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }
}