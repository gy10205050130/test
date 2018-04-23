package yxinfo.core.inf.service.message;

import yxinfo.dct.inteface.dto.base.AccessTokenDTO;
import yxinfo.core.inf.dto.message.MessageDTO;

import java.util.List;

/**
 * 通知渠道接口
 * Created by dy on 2017/2/11.
 */
public interface NotifyChannelService {

    /**
     * 通知
     * @param message    消息, 参数说明详见{@link MessageNotifyService}的messageNotify方法注释
     * @param ntfMembers 通知用户集合, 由message的通知目标域获取
     * @return
     */
    boolean notify( MessageDTO message, List<AccessTokenDTO> ntfMembers );
}
