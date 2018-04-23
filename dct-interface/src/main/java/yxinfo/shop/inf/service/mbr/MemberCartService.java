package yxinfo.shop.inf.service.mbr;

import yxinfo.shop.inf.dto.mbr.MemberCartDTO;
import yxinfo.shop.inf.dto.mbr.MemberCartShowDTO;

import java.util.List;

public interface MemberCartService {

    /**
     * 加入购物车
     * @code 103007
     * @param memberCartDTO
     * @return
     */
    int insert( MemberCartDTO memberCartDTO );

    /**
     * 更新数量
     * @param memberCartDTO
     * @return
     */
    int updateNum( MemberCartDTO memberCartDTO );

    /**
     * 查看用户购物车
     * @code 103008
     * @param memberId
     * @return
     */
    List<MemberCartShowDTO> getMemberCartList( Integer memberId );

    /**
     * 购物车中商品移到收藏
     * @code 103009
     * @param id 购物车id
     * @return
     */
    int moveToFavorite( Integer id );

    /**
     * 根据id删除购物车
     * @code 103010
     * @param id
     * @return
     */
    int delete( Integer id );

    /**
     * 获取购物车商品数量
     * @param memberId
     * @return
     */
    int getMemberCartCount( Integer memberId );

    /**
     * 根据id列表删除购物车
     * @code 103023
     * @param ids
     * @return
     */
    int deleteMemberCarts( List<Integer> ids );

    /**
     * 移动购物车商品到收藏
     * @code 103024
     * @param ids
     * @return
     */
    int moveMemberCartsToFavorite( List<Integer> ids );
}
