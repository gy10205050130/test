package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.mer.MerMemberDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/1.
 */
public interface MerMemberService {

    /**
     * 根据成员查询所属商户
     * @param memberId
     * @return
     */
    MerMemberDTO getMerMemberDTO( Integer memberId );

    /**
     * 根据商户id获取所有关联成员
     * @param merId
     * @return
     */
    List < MerMemberDTO > getMerMemberDTOList ( Integer merId );

    /**
     * 添加商户关联成员
     * @param merMemberDTO
     * @return
     */
    Integer addMerMemberDTO ( MerMemberDTO merMemberDTO );

    /**
     * 删除商户关联成员
     * @param merMemberDTO
     * @return
     */
    Integer deleteMemberDTO ( MerMemberDTO merMemberDTO );

    /**
     * 根据商户id获取商户负责人
     * @param merId
     * @return
     */
    MerMemberDTO getMerMemberDTOByIsSuper( Integer merId );
}
