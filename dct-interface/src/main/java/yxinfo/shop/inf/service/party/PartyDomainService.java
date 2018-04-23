package yxinfo.shop.inf.service.party;

/**
 * Created by dy on 2016/10/12.
 */
public interface PartyDomainService {

    /**
     * 根据请求来源域名获取partyId
     * @param domain
     * @return
     */
    Integer getPartyIdByDomain( String domain );
}
