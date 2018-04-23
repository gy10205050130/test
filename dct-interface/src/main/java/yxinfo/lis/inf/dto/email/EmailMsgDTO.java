package yxinfo.lis.inf.dto.email;


import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by CY on 2016/12/15.
 */
public class EmailMsgDTO extends BaseDTO {

    /**
     * 发送人姓名
     */
    private String sendName;

    /**
     * 发件人邮箱
     */
    private String sendEmail;

    /**
     * 发件人电话
     */
    private String sendTel;

    /**
     * 发件人留言
     */
    private String sendContext;

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendContext() {
        return sendContext;
    }

    public void setSendContext(String sendContext) {
        this.sendContext = sendContext;
    }

    public String getSendTel() {
        return sendTel;
    }

    public void setSendTel(String sendTel) {
        this.sendTel = sendTel;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }
}
