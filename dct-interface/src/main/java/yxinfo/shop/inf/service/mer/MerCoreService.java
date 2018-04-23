package yxinfo.shop.inf.service.mer;

import yxinfo.shop.inf.dto.PageDTO;
import yxinfo.shop.inf.dto.mbr.MemberFavoriteDTO;
import yxinfo.shop.inf.dto.mer.MerCoreDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public interface MerCoreService {

    /**
     * 根据商户id获取商户基础信息
     * @param merId
     * @return
     */
    MerCoreDTO getMerCoreDTO ( Integer merId );

    /**
     * 根据商户id获取商户基础信息(状态为已启用)
     * @param merId
     * @return
     */
    MerCoreDTO getMerCoreDTOByFstatus ( Integer merId );

    /**
     * 根据商户id获取商户基础信息(含商户负责人信息)
     * @param merId
     * @return
     */
    MerCoreDTO getMerCoreDTOAndSupper ( Integer merId );

    /**
     * 修改商品数量
     * @param merId 商户id
     * @param num 数量
     * @param flag 加减 1 加 2减
     * @return
     */
    Integer updateMerCoreGoodsNum ( Integer merId , Integer num , Integer flag );

    /**
     * 验证商户名称是否存在
     * @param fname
     * @return
     */
    Boolean checkMerCoreFname ( String fname );

    /**
     * 添加商户基础信息
     * @param merCoreDTO
     * @return
     */
    Integer addMerCoreDTO ( MerCoreDTO merCoreDTO );

    /**
     * 更新商户基础信息
     * @param merCoreDTO
     * @return
     */
    Integer updateMerCoreDTO ( MerCoreDTO merCoreDTO );

    /**
     * 获取该使用方的入驻商户列表
     * @param queryPage
     * @param partyId
     * @return
     */
    PageDTO<List<MerCoreDTO>> getSetMerCoreDTOList ( PageDTO<MerCoreDTO> queryPage , Integer partyId );

    /**
     * 根据id获取供应商详情
     * @param merId
     * @return
     */
    MerCoreDTO getMerCoreDTODetByKey ( Integer merId , Integer partyId );

    /**
     * 根据id获取供应商部分详情
     * @param merId
     * @return
     */
    MerCoreDTO getMerCoreDTOForMerHomeByKey ( Integer merId );

    /**
     * 商家列表分页
     * @param queryPage
     * @return
     */
    PageDTO<List<MerCoreDTO>> getAllMerCoreDTOList ( PageDTO<MerCoreDTO> queryPage );

    /**
     * 获取使用方商户管理列表
     * @param queryPage
     * @param partyId 从handler获取
     * @return
     */
    PageDTO<List<MerCoreDTO>> getMerCoreDTOListForMerApv(PageDTO<MerCoreDTO> queryPage ,Integer partyId);

    /**
     * 商家列表分页(中医药大学专用)
     * @param queryPage
     * @return
     */
    PageDTO<List<MerCoreDTO>> getZcmuMerCoreDTOList ( PageDTO<MerCoreDTO> queryPage );

    /**
     * 商家列表分页
     * @param queryPage
     * @return
     */
    PageDTO<List<MerCoreDTO>> getMerCoreDTOListByFname ( PageDTO<MerCoreDTO> queryPage ,Integer partyId );
}
