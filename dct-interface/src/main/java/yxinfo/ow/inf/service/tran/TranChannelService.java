package yxinfo.ow.inf.service.tran;

import yxinfo.lis.inf.dto.tran.TranChannelDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/15.
 */
public interface TranChannelService {

    /**
     * 根据id获取支付通道
     * @param id
     * @return
     */
    TranChannelDTO getTranChannelByKey(Integer id);

    /**
     * 根据partyId获取支付通道
     * @code
     * @param partyId
     * @return
     */
    List<TranChannelDTO> getTranChannelByPartyId(Integer partyId);
}
