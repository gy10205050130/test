package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberFundsPersonDTO;

public interface MemberFundsPersonService {

    /**
     * 按id获取经费负责人
     * @param id
     * @return
     */
    MemberFundsPersonDTO get( Integer id );

    /**
     * 添加经费负责人
     * @param memberFundsPersonDTO
     * @return 经费负责人id
     */
    int insert( MemberFundsPersonDTO memberFundsPersonDTO );

    /**
     * 更新经费负责人
     * @param memberFundsPersonDTO
     * @return
     */
    int update( MemberFundsPersonDTO memberFundsPersonDTO );

    /**
     * 按卡号获取经费负责人
     * @param cardNo
     * @param partyId
     * @return
     */
    MemberFundsPersonDTO get( String cardNo, Integer partyId );
}
