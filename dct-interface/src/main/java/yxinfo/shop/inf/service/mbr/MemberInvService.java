package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberInvDTO;

public interface MemberInvService {

    /**
     * 插入用户发票信息
     * @code 300014
     * @param memberInvDTO
     * @param partyId
     * @return
     */
    int add( MemberInvDTO memberInvDTO, Integer partyId );

    /**
     * 根据id查询
     * @param id
     * @return
     */
    MemberInvDTO getById( Integer id );

    /**
     * 根据条件查询用户发票
     * @code 103016
     * @param memberId
     * @param partyId
     * @return
     */
    MemberInvDTO getByMemberId( Integer memberId, Integer partyId );

}
