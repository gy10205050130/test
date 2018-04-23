package yxinfo.dct.inteface.service.chem.apply;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyCoreDTO;
import yxinfo.dct.inteface.dto.chem.apply.ApplyDetailDTO;

import java.util.List;

/**
 * Created by dy on 2017/1/6.
 */
public interface ApplyGetService {

    /**
     * 获取领取申请详情及其审核记录
     * @code 108106/108107
     * @param applyId
     * @param doubleMgt 传递则过滤applyDetail的doubleMgt
     * @param memberId
     * @param getApvMsg true 获取审核信息 / false 不获取审核信息
     * @return
     */
    ApplyCoreDTO getApplyCoreAndApproveById( Integer applyId, String doubleMgt, Integer memberId, boolean getApvMsg );

    /**
     * 领取申请列表
     * @code 108112/108113
     * @param schPage
     * @param memberId *memberId不作为查询条件, 仅用于获取查询人姓名
     * @return
     */
    PageDTO<List<ApplyDetailDTO>> getAplyDetailPage( PageDTO<ApplyDetailDTO> schPage, Integer memberId );
}
