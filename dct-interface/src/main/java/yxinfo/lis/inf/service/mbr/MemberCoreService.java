package yxinfo.lis.inf.service.mbr;


import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.lis.inf.dto.mbr.*;
import yxinfo.lis.inf.dto.mbr.UpdatePwdDTO;

import java.util.List;

/**
 *
 * @author tj
 * @date 2016/9/1 16:47
 */
public interface MemberCoreService {

    /**
     * 校验用户名(login_name)或手机号(mobile)是否已存在
     * code 103001
     * @param verifyMemberInfo
     * @return
     */
    boolean memberInfoIsRepeated(VerifyMemberInfoDTO verifyMemberInfo);

    /**
     * 添加用户
     * code 103002
     * @param memberCoreDTO
     * @return
     */
    int insert(MemberCoreDTO memberCoreDTO);

    /**
     * 注册用户
     * code 103003
     * @param registerDTO
     * @return
     */
    MemberLoginInfoDTO register(RegisterDTO registerDTO);

    /**
     * 根据id获取用户信息
     * code 103004
     * @param id
     * @return
     */
    MemberCoreDTO get(Integer id);

    /**
     * 登陆
     * code 103005
     * @param memberCore
     * @return
     */
    MemberLoginInfoDTO login(MemberCoreDTO memberCore);

    /**
     * 修改用户密码
     * code 103006
     * @param updatePwdDTO
     * @return
     */
    int updatePwd(UpdatePwdDTO updatePwdDTO);

    /**
     * 删除用户
     * code 103007
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 修改用户信息
     * code 103008
     * @param memberCoreDTO
     * @return
     */
    Integer update(MemberCoreDTO memberCoreDTO);

    /**
     * 根据用户名字获取用户列表(模糊查询)
     * code 103009
     * @param memberCoreDTO
     * @return
     */
    List<MemberCoreDTO> getListByRealName(MemberCoreDTO memberCoreDTO);

    /**
     * 分页查询用户信息列表
     * code 103010
     * @param memberCoreDTOPage
     * @return
     */
    PageDTO<List<MemberCoreDTO>> getPageMemberCores(PageDTO<MemberCoreDTO> memberCoreDTOPage );

    /**
     * 根据baseMemberId获取用户id/用户角色id
     * @param baseMemberId
     * @return
     */
    AccessTokDTO getMemberAuthMessage( Integer baseMemberId );

    /**
     * 获取人员集合
     *
     * @param memberCoreDTO
     * @return
     */
    List<MemberCoreDTO> getMemberCoreList(MemberCoreDTO memberCoreDTO);

    /**
     * 导入人员信息
     *
     * @param importDTO
     * @return
     */
    Integer importMember(MemberImportDTO importDTO);

    /**
     * 导出人员excel
     *
     * @return 服务其中的文件地址
     */
    String exportMember(MemberImportDTO importDTO);

    /**
     * 根据组织id获取组
     *
     * @param orgId
     * @return
     */
    List<LisGroupDTO> getLisGroupDtoList(Integer orgId);

    /**
     * 根据人员id获取人员的类型（1：有课题的校内人员， 2： 无课题的校内人员 3：附属医院人员）
     *
     * @param memberCoreDTO
     * @return
     */
    Integer getMemberType(MemberCoreDTO memberCoreDTO);

    /**
     * 新增单位对应的附属机构信息
     *
     * @param memberCoreDTO
     * @return
     */
    Integer addPartySubAgency(MemberCoreDTO memberCoreDTO);

    /**
     * 更新单位对应的附属机构信息
     *
     * @param memberCoreDTO
     * @return
     */
    Integer updatePartySubAgency(MemberCoreDTO memberCoreDTO);
}
