package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberFundsCardDTO;

public interface MemberFundsCardService {

    int insert( MemberFundsCardDTO memberFundsCardDTO );

    int delete( Integer memberId );
}
