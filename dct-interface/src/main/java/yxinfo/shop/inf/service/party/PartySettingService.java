package yxinfo.shop.inf.service.party;

import java.util.List;

/**
 * Created by dy on 2016/9/21.
 */
public interface PartySettingService {

    /**
     * 获取使用方配置
     * @param partyId
     * @param item
     * @return
     */
    List<String> getPartySettingList( Integer partyId, Short item );

    /**
     * 获取使用方配置
     * @param partyId
     * @param item
     * @return
     */
    String getPartySetting( Integer partyId, Short item );
}
