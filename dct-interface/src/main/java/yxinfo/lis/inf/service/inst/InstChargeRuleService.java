package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.InstChargeRuleDTO;
import yxinfo.lis.inf.dto.inst.InstCollectionDTO;

import java.util.List;

/**
 * Created by xww on 2016/10/17.
 */
public interface InstChargeRuleService {

    /**
     * 添加仪器收费规则
     *
     * @return
     */
    Integer addInstChargeRule(InstChargeRuleDTO instChargeRuleDTO);

    /**
     * 更新仪器收费规则
     *
     * @param instChargeRuleDTO
     * @return
     */
    Integer updateInstChargeRule(InstChargeRuleDTO instChargeRuleDTO);

    /**
     * 通过id获取仪器收费规则详情
     *
     * @param instChargeRuleDTO
     * @return
     */
    List<InstChargeRuleDTO> getInstChargeRuleByKey(InstChargeRuleDTO instChargeRuleDTO);

    /**
     * 删除仪器收费规则
     *
     * @param instChargeRuleDTO
     * @return
     */
    Integer deleteInstChargeRule(InstChargeRuleDTO instChargeRuleDTO);

    /**
     * 获取收费规则详情
     *
     * @param instChargeRuleDTO
     * @return
     */
    InstChargeRuleDTO getInstChargeRuleDTO(InstChargeRuleDTO instChargeRuleDTO);


}
