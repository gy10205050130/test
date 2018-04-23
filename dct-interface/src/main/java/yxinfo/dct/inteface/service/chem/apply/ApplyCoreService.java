package yxinfo.dct.inteface.service.chem.apply;

import yxinfo.dct.inteface.dto.approve.ApproveNodeDTO;
import yxinfo.dct.inteface.dto.approve.biz.ApproveNodeRetDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyCoreDTO;

/**
 * Created by dy on 2017/1/9.
 */
public interface ApplyCoreService {

    /**
     * 更新 领取申请 & 领取申请的物品 的状态
     * @param applyId
     * @param receiveStatus
     * @param receiveStatusLock 状态乐观锁, 传递会作为更新的where条件 receiveStatus = {receiveStatusLock}
     * @return
     */
    int updateApplyReceiveStatus( Integer applyId, String receiveStatus, String receiveStatusLock );

    /**
     * 领取申请提交审核
     * @param applyCoreDTO
     * @param applyType
     * @param terminalCode
     * @return
     */
    Integer submitApplyApprove( ApplyCoreDTO applyCoreDTO, String applyType, String terminalCode );

    /**
     * 五双管理时同行人确认
     * @code 108111
     * @param applyId
     * @param opinion
     * @param memberId
     * @param terminalCode
     */
    void fiveDoubleConfirm( Integer applyId, String opinion, Integer memberId, String terminalCode );

    /**
     * 审核领取申请
     * @code 108108
     * @param approveNodeDTO
     * @param terminal
     * @return
     */
    ApproveNodeRetDTO approveApply( ApproveNodeDTO approveNodeDTO, String terminal );

    /**
     * 设置领用同行人
     * @code 108128
     * @param applyCore
     * @param terminalCode
     */
    void setMemberSec( ApplyCoreDTO applyCore, String terminalCode );

    /**
     * 同意设置领用同行人
     * @code 108129
     * @param applyCore
     */
    void agreeSetMemberSec( ApplyCoreDTO applyCore, String terminalCode );

    /**
     * 超时关闭领取申请
     * @param applyId
     * @param orgId
     */
    void closeApply( Integer applyId, Integer orgId );
}
