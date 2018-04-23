package yxinfo.shop.inf.service.party;

import yxinfo.shop.inf.dto.party.PartyCoreDTO;
import yxinfo.shop.inf.dto.party.PartyInvDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/14.
 */
public interface PartyService {

    /**
     * 根据id获取使用方
     * @param partyId 使用方id
     * @return
     */
    PartyCoreDTO getPartyByKey( Integer partyId );

    /**
     * 根据id获取使用方详细信息
     * <p>详细信息包括默认收货地址及默认发票地址<p/>
     * @param partyId 使用方id
     * @return
     */
    PartyCoreDTO getPartyByKeyDetail( Integer partyId );

    /**
     * 根据名称查找使用方
     * @code 106001
     * @param name
     * @return
     */
    List<PartyCoreDTO> getPartyListByName( String name );

    /**
     * 获取使用方发票信息
     * @param partyId
     * @return
     */
    PartyInvDTO getPartyInvByParty( Integer partyId );

    /**
     * 根据orgId获取使用方
     * @param orgId
     * @return
     */
    PartyCoreDTO getPartyByOrgId( Integer orgId );
}
