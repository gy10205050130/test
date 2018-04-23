package yxinfo.shop.inf.service.funds;

import yxinfo.shop.inf.dto.funds.CwPrjsumDTO;
import yxinfo.shop.inf.dto.funds.CwProjDTO;
import yxinfo.shop.inf.dto.funds.FundsDTO;

import java.util.List;

/**
 * Created by ZH on 2016/9/28.
 */
public interface FundsService {

    /**
     * 根据经费卡号查询余额
     * @param card
     * @return
     */
    Double getFundsByCard(String card);

    /**
     * 根据经费卡号，经费负责人查询项目列表
     * @param cwProjDTO
     * @return
     */
    List<FundsDTO> getFundsListByMemberAndCard (CwProjDTO cwProjDTO );

    /**
     * 根据经费卡号集合，经费负责人查询项目列表
     * @param cwProjDTO
     * @return
     */
    List<FundsDTO> getFundsListByMemberAndCardList (CwProjDTO cwProjDTO );

    /**
     * 根据经费卡号，经费负责人查询项目名称
     * @param cwProjDTO
     * @return
     */
    FundsDTO getFundsDTOByMemberAndCard ( CwProjDTO cwProjDTO );

    /**
     * 根据经费负责人、项目名称查询卡号
     * @param cwProjDTO
     * @return
     */
    List<FundsDTO> getFundsListByMemberAndName ( CwProjDTO cwProjDTO );

    /**
     * 根据经费卡号，经费负责人、项目名称查询是否存在
     * @param cwProjDTO
     * @return
     */
    boolean checkChargeName ( CwProjDTO cwProjDTO );
}
