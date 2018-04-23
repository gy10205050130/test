package yxinfo.core.inf.service.message;

import yxinfo.core.inf.dto.message.MessageDTO;

import java.util.List;

/**
 * 消息通知服务
 * Created by dy on 2017/2/11.
 */
public interface MessageNotifyService {

    /**
     * 消息通知
     * <p>按照ftype进行通知</p>
     * <p>
     * 参数说明
     *
     * ````` message 消息 `````
     * 公有域
     * plat        消息所属平台（M）{@link yxinfo.dct.inteface.context.base.Plat}
     * ftype       通知类型（M）, {@link yxinfo.core.inf.context.message.MessageType}
     * itemNo      事件项目编号（M）, {@link yxinfo.core.inf.context.message.MessageItemNo}
     * terminal    终端类型编号（M）, {@link yxinfo.dct.inteface.context.base.TerminalCode}
     * 通知目标域
     * memberId    通知用户id
     * memberOrgId 通知用户的组织id（M）
     * roleId      通知角色id
     * groupId     通知成员组id
     * tagId       通知标签id
     * orgId       通知组织id *传递将通知组织全部用户!*
     * 通知内容域
     * extraMsgId  额外信息id
     * title       消息标题（M）
     * summary     消息摘要
     * context     消息内容
     *
     * ````` ntfMemberIds 通知用户id集合 `````
     * 不传递会根据message中的通知目标域获取目标用户集合, 传递则以ntfMemberIds为目标用户集合
     * <p/>
     * @param message
     * @param ntfMemberIds
     * @return
     */
    boolean messageNotify( MessageDTO message, List<Integer> ntfMemberIds );
}
