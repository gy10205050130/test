package yxinfo.core.inf.service.message;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.core.inf.dto.message.MessageDTO;
import yxinfo.core.inf.dto.message.MsgCoreDTO;

import java.util.List;

/**
 * 消息基础服务
 * Created by dy on 2017/2/10.
 */
public interface MessageService {

    /**
     * 保存消息并通知
     * <p>参数说明详见{@link MessageNotifyService}的messageNotify方法注释<p/>
     * @param message
     * @return
     */
    boolean saveMessageAndNotify( MessageDTO message );

    /**
     * 获取通知用户id集合
     * <p>由message的通知目标域获取通知用户id集合<p/>
     * <p>参数说明详见{@link MessageNotifyService}的messageNotify方法注释<p/>
     * @param message
     * @return
     */
    List<Integer> getNtfMemberIds( MessageDTO message );

    /**
     * 获取用户消息列表
     * @code 123001
     * @param schPage
     * @return
     */
    PageDTO<List<MsgCoreDTO>> getMsgCorePageByMember( PageDTO<MsgCoreDTO> schPage );

    /**
     * 获取用户未读消息数量
     * @code 123002
     * @param data
     * @return
     */
    Integer getHasNotReadMsgCountByMember( MsgCoreDTO data );

    /**
     * 更新用户消息已读
     * @code 123003
     * @param orgId
     * @param memberId
     * @param msgId msgId 与 itemNo、extraMsgId 必传其一
     * @param itemNo
     * @param extraMsgId
     */
    void updateMsgHasRead( Integer orgId, Integer memberId, Integer msgId, String itemNo, String extraMsgId );
}
