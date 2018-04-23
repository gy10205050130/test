package yxinfo.lis.inf.service.party;

/**
 * Created by tj on 2016/10/26.
 */
public interface PartyDomainService {

    /**
     * 根据请求来源域名获取partyId
     * @param domain
     * @return
     */
    Integer getPartyIdByDomain(String domain);
}
