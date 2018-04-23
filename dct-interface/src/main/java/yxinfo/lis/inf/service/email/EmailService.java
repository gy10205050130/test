package yxinfo.lis.inf.service.email;

import yxinfo.lis.inf.dto.email.EmailMsgDTO;

/**
 * 邮件服务
 * <p>
 * Created by cy on 2016/12/14.
 */
public interface EmailService {

    /**
     * 发送邮件
     *
     * @param emailMsgDTO
     * @return
     */
    String sendMail(EmailMsgDTO emailMsgDTO);

}
