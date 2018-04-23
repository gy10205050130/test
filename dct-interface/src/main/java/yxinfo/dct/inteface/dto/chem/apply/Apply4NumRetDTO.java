package yxinfo.dct.inteface.dto.chem.apply;

import yxinfo.dct.inteface.dto.BaseDTO;

/**
 * Created by dy on 2017/1/9.
 */
public class Apply4NumRetDTO extends BaseDTO {

    private static final long serialVersionUID = -8199641728415774556L;

    // 双人管理类型（0不需要双人管理，1五双管理）
    private String doubleMgt;

    // 审核记录id
    private Integer approveRecodeId;

    // 领取申请id
    private Integer applyId;

    public String getDoubleMgt() {
        return doubleMgt;
    }

    public void setDoubleMgt( String doubleMgt ) {
        this.doubleMgt = doubleMgt;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId( Integer applyId ) {
        this.applyId = applyId;
    }
}
