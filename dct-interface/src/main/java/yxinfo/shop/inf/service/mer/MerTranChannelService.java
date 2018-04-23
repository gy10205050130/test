package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerTranChannelDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/15.
 */
public interface MerTranChannelService {

    /**
     * 根据商户id 使用方id获取支付渠道
     * @param merId
     * @param partyId
     * @return
     */
    public List<MerTranChannelDTO> getMerTranChannelDTOList( Integer merId , Integer partyId );

    /**
     * 添加商户支付渠道
     * @param record
     * @return
     */
    public Integer insert(MerTranChannelDTO record);

    /**
     * 根据商户id删除商户支付渠道
     * @param merId
     * @return
     */
    public Integer deleteMerTran(Integer merId);
}
