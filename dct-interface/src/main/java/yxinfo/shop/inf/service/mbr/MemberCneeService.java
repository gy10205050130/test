package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberCneeDTO;

import java.util.List;

public interface MemberCneeService {

    /**
     * 添加收货地址
     * @code 300011
     * @param memberCnee
     * @return
     */
    int insert( MemberCneeDTO memberCnee );

    /**
     * 修改收货地址
     * @code 300012
     * @param memberCnee
     * @return
     */
    int update( MemberCneeDTO memberCnee );

    /**
     * 删除收货地址
     * @code 300013
     * @param id
     * @return
     *
     */
    int delete( Integer id );

    /**
     * 根据用户id获取用户收货地址列表
     * @code 103017
     * @param memberId
     * @return
     */
    List<MemberCneeDTO> getListByMemberId( Integer memberId, Integer partyId );

    /**
     * 设置默认收货地址
     * @param memberId
     * @param memberCneeId
     * @return
     */
    int setDefault( Integer memberId, Integer memberCneeId );

    /**
     * 按id获取收货地址
     * @param id
     * @return
     */
    MemberCneeDTO get( Integer id );
}
