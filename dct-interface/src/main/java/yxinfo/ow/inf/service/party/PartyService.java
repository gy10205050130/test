package yxinfo.ow.inf.service.party;

import yxinfo.ow.inf.dto.PageDTO;
import yxinfo.ow.inf.dto.mbr.MemberCoreDTO;
import yxinfo.ow.inf.dto.party.MemberPartyDTO;
import yxinfo.ow.inf.dto.party.PartyCoreDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/14.
 */
public interface PartyService {

    /**
     * 根据id获取单位
     * @param partyId 单位id
     * @return
     */
    PartyCoreDTO getPartyByKey(Integer partyId);

    /**
     * 根据成员id获取单位详细信息
     * @param memberCoreDTO
     * @return
     */
    PartyCoreDTO getPartyByMemberCore(MemberCoreDTO memberCoreDTO);

    /**
     * 根据名称查找单位
     * @code
     * @param partyCoreDTO
     * @return
     */
    List<PartyCoreDTO> getPartyList(PartyCoreDTO partyCoreDTO);

    /**
     * 添加单位
     * @code
     * @param partyCoreDTO
     * @return
     */
    Integer addParty(PartyCoreDTO partyCoreDTO);

    /**
     * 保存单位信息
     * @code
     * @param partyCoreDTO
     * @return
     */
    Integer saveParty(PartyCoreDTO partyCoreDTO);

    /**
     * 删除单位
     * @code
     * @param partyId
     * @return
     */
    Integer deleteParty(Integer partyId);

    /**
     * 添加人员对应的单位信息
     *
     * @return
     */
    Integer addMemberParty(MemberPartyDTO memberPartyDTO);

    /**
     * 获取partylist
     *
     * @param memberPartyDTO
     * @return
     */
    List<MemberPartyDTO> getMemberPartyList(MemberPartyDTO memberPartyDTO);

    /**
     * 条件查询单位
     */
    PageDTO<List<PartyCoreDTO>> getPartyList(PageDTO<PartyCoreDTO> queryPage);

    /**
     * 更新人员对应的party信息
     *
     * @param memberPartyDTO
     * @return
     */
    Integer updateMemberPartyDto(MemberPartyDTO memberPartyDTO);

    /**
     * 预付款分配时更新单位的预付款余额，更新个人的预付款余额
     *
     * @param partyCoreDTO
     * @param memberPartyDTO
     * @return
     */
    Integer updatePartyImprest(PartyCoreDTO partyCoreDTO, MemberPartyDTO memberPartyDTO);
}
