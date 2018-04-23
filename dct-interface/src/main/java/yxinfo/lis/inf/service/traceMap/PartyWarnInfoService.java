package yxinfo.lis.inf.service.traceMap;

import yxinfo.lis.inf.dto.traceMap.PartyWarnInfoDTO;

import java.util.List;

/**
 * 获取单位的预警信息
 *
 * Created by cy on 2017/1/6.
 */
public interface PartyWarnInfoService {

    /**
     * 获取单位的化学品及预警信息
     *
     * @param partyWarnInfoDTO
     * @return
     */
    List<PartyWarnInfoDTO> getPartyWarnInfoList(PartyWarnInfoDTO partyWarnInfoDTO);

}
