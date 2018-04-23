package yxinfo.dct.inteface.service.chem.global;

import yxinfo.dct.inteface.dto.approve.ApproveRecodeDTO;

/**
 * Created by dy on 2016/8/3.
 */
public interface ChemAppPushService {

    /**
     * App通知
     * @param itemNo
     * @param title
     * @param approveRecodeDTO
     * @param extraMsg
     * @param terminal 终端类型编号, {@link yxinfo.dct.inteface.context.base.TerminalCode}
     */
    void doAppNotify4Approve( String itemNo, String title, ApproveRecodeDTO approveRecodeDTO, String extraMsg, String terminal );

    /**
     * App通知
     * @param itemNo
     * @param title
     * @param approveRecodeDTO
     * @param extraMsg
     * @param context
     * @param terminal 终端类型编号, {@link yxinfo.dct.inteface.context.base.TerminalCode}
     */
    void doAppNotifyWithContext4Approve( String itemNo, String title, ApproveRecodeDTO approveRecodeDTO, String extraMsg, String context, String terminal );

    /**
     * App通知
     * @param itemNo
     * @param title
     * @param memberId
     * @param orgId
     * @param extraMsg
     * @param terminal 终端类型编号, {@link yxinfo.dct.inteface.context.base.TerminalCode}
     */
    void doAppNotify4Member( String itemNo, String title, Integer memberId, Integer orgId, String extraMsg, String terminal );

    /**
     * App通知
     * @param itemNo
     * @param title
     * @param memberId
     * @param orgId
     * @param extraMsg
     * @param context
     * @param terminal
     */
    void doAppNotifyWithContext4Member( String itemNo, String title, Integer memberId, Integer orgId, String extraMsg, String context, String terminal );


    /**
     * App通知
     * <p>Jms不启用Jta管理</p>
     * @param itemNo
     * @param title
     * @param memberId
     * @param orgId
     * @param extraMsg
     * @param context
     * @param terminal
     */
    void doAppNotifyWithContextNoJta4Member( String itemNo, String title, Integer memberId, Integer orgId, String extraMsg, String context, String terminal );

    /**
     * App通知
     * @param itemNo
     * @param title
     * @param roleId
     * @param orgId
     * @param extraMsg
     * @param terminal 终端类型编号, {@link yxinfo.dct.inteface.context.base.TerminalCode}
     */
    void doAppNotify4Role( String itemNo, String title, Integer roleId, Integer orgId, String extraMsg, String terminal );
}
