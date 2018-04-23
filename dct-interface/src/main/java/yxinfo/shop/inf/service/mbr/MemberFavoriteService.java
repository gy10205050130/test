package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.mbr.MemberFavoriteDTO;
import yxinfo.shop.inf.dto.mbr.MemberFavoriteShowDTO;

import java.util.List;

public interface MemberFavoriteService {

    int insert( MemberFavoriteDTO memberFavoriteDTO );

    int delete( Integer id );

    PageDTO<List<MemberFavoriteShowDTO>> getPageList( PageDTO<MemberFavoriteDTO> pageDTO );
}
