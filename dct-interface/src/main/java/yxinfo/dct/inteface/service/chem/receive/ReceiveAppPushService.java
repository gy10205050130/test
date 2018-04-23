package yxinfo.dct.inteface.service.chem.receive;

/**
 * Created by dy on 2017/2/18.
 */
public interface ReceiveAppPushService {

    /**
     * 领用时推送审核人
     * @param applyId
     * @param terminalCode
     * @param chemName
     * @param specName
     * @param capacity
     * @param unit
     */
    void appPush4Receive( Integer applyId, String terminalCode, String chemName, String specName, Integer capacity, String unit );
}
