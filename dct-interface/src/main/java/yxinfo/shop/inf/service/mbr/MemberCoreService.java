package yxinfo.shop.inf.service.mbr;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.shop.inf.dto.mbr.*;
import yxinfo.shop.inf.dto.mer.MerMemberDTO;

import java.util.List;

public interface MemberCoreService {

    /**
     * 校验用户名是否已存在
     * @code 103001
     * @param verifyMemberInfo
     * @return
     */
    boolean memberInfoIsRepeated( VerifyMemberInfoDTO verifyMemberInfo );

    /**
     * 用户注册
     * @code 103002
     * @param registerDTO
     * @param terminal
     * @return
     */
    MemberLoginInfoDTO register( RegisterDTO registerDTO, String terminal );

    /**
     * 自动注册
     * @code
     * @param baseMemberId
     * @param orgId
     * @return 1用户已注册 / 2成功注册 {@link yxinfo.shop.inf.context.mbr.RegFromUCentreRet}
     */
    String registerFromUCentre( Integer baseMemberId, Integer orgId );

    /**
     * 根据id获取用户信息
     * @code 103004
     * @param id
     * @return
     */
    MemberCoreDTO get( Integer id );

    /**
     * 登录
     * @code 103005
     * @param memberCore
     * @param terminal
     * @return
     */
    MemberLoginInfoDTO login( MemberCoreDTO memberCore, String terminal );

    /**
     * 修改用户密码
     * @code 103006
     * @param updatePwdDTO
     * @return
     */
    int updatePwd( UpdatePwdDTO updatePwdDTO );

    /**
     * 获取用户订单显示信息
     * @code 103026
     * @param memberId
     * @param partyId
     * @return
     */
    MemberOrderInfoDTO getMemberOrderInfo( Integer memberId, Integer partyId );

    /**
     * 根据用户名字获取用户列表（模糊查询）
     * @code 103028
     * @param realName
     * @param partyId
     * @return
     */
    List<MemberCoreDTO> getListByRealName( String realName, Integer partyId );

    /**
     * 商户注册
     * @code 103032
     * @param merRegisterDTO
     * @param terminal
     * @return
     */
    MemberLoginInfoDTO merRegister( MerRegisterDTO merRegisterDTO, String terminal );

    /**
     * 用户认证, 并分配事先录入的角色
     * @code 103030
     * @param memberAuthDTO
     * @return
     */
    MemberLoginInfoDTO authMember( MemberAuthDTO memberAuthDTO );

    /**
     * 分配事先录入的角色
     * @param memberId
     * @param orgId
     * @param fcode
     * @param realName
     */
    void addMemberRoleHasInput( Integer memberId, Integer orgId, String fcode, String realName );

    /**
     * 获取用户认证信息
     * @code 103031
     * @param memberId
     * @return
     */
    MemberAuthDTO getMemberAuth( Integer memberId );

    /**
     * 根据baseMemberId获取用户id/商户id/用户角色id
     * @param baseMemberId
     * @return
     */
    AccessTokDTO getMemberAuthMessage( Integer baseMemberId );

    /**
     * 获取用户登录信息
     * @param member
     * @param merMember
     * @param memberBase
     * @return
     */
    MemberLoginInfoDTO getMemberLoginInfo( MemberCoreDTO member, MerMemberDTO merMember, MemberDTO memberBase );
}
