package yxinfo.dct.inteface.dto.chem.intowh;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by dy on 2016/6/28.
 */
public class ChemAddReagentRetDTO extends BaseDTO {

    private static final long serialVersionUID = -2958014405168103232L;

    // 成功入库数量
    private Integer succAddCount;

    // 错误的二维码列表
    private List<String> errCodes;

    // 成功的二维码列表
    private List<String> succCodes;

    // 双人管理类型（0不需要双人管理，1五双管理）
    private String doubleMgt;

    public ChemAddReagentRetDTO() {}

    public ChemAddReagentRetDTO( Integer succAddCount, List<String> errCodes, List<String> succCodes, String doubleMgt ) {
        this.succAddCount = succAddCount;
        this.errCodes = errCodes;
        this.succCodes = succCodes;
        this.doubleMgt = doubleMgt;
    }

    public Integer getSuccAddCount() {
        return succAddCount;
    }

    public void setSuccAddCount( Integer succAddCount ) {
        this.succAddCount = succAddCount;
    }

    public List<String> getErrCodes() {
        return errCodes;
    }

    public void setErrCodes( List<String> errCodes ) {
        this.errCodes = errCodes;
    }

    public List<String> getSuccCodes() {
        return succCodes;
    }

    public void setSuccCodes( List<String> succCodes ) {
        this.succCodes = succCodes;
    }

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }
}
