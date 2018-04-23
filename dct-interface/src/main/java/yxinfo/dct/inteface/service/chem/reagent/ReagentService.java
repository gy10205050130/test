package yxinfo.dct.inteface.service.chem.reagent;

import yxinfo.dct.inteface.dto.chem.reagent.ChemReagentDTO;

/**
 * Created by dy on 2016/6/23.
 */
public interface ReagentService {

    /**
     * 作废试剂
     * @param qr 二维码
     * @return
     * @throws RFCODE不合法时抛出DctException, code为008001; 修改非库存中的试剂抛出DctException, code为008036
     * @return 0作废失败 / 1作废成功
     */
    int invalidReagent( String qr );

    /**
     * 更新试剂
     * @param reagent 更新数据
     * <p>
     *  仅更新以下属性
     *  siteMsg     位置信息
     *  status      状态（{@link yxinfo.dct.inteface.context.chem.ReagentStatus}）
     *  used        已用容量
     *  applyId     最近一次领取申请id
     *  receiveAt   最近一次领用时间
     *  recycleAt   最近一次回收时间
     *  inCharge    负责人成员id
     *  inChargeSec 第二负责人成员id
     * </p>
     * @param id 试剂id
     * @param statusOptimLock 状态乐观锁, 传递则在更新条件中加入status={statusOptimLock}
     * @return 更新记录数
     */
    int updateReagent( ChemReagentDTO reagent, Integer id, String statusOptimLock );

    /**
     * 保存试剂
     * @param reagent
     * @return 试剂id
     */
    int insertReagent( ChemReagentDTO reagent );
}
