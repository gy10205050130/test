package yxinfo.lis.inf.service.inst;

import yxinfo.lis.inf.dto.inst.InstInstrumentDTO;
import yxinfo.lis.inf.dto.inst.InstServicenumDTO;

/**
 * Created by xww on 2016/9/8.
 */
public interface InstServicenumService {

    /**
     * 根据id获取仪器信息
     * code
     *
     * @return
     */
    InstServicenumDTO getInstServicenumInfo(String inst_no);

    /**
     * 新增服务次数
     *
     * @return
     */
    Integer updateInstServicenum(InstServicenumDTO instServicenumDTO);

    /**
     * 更新仪器分数
     *
     * @return
     */
    Integer updateInstScore(InstServicenumDTO instServicenumDTO);

    /**
     * 添加仪器服务次数
     *
     * @param instServicenumDTO
     * @return
     */
    Integer addInstServicenum(InstServicenumDTO instServicenumDTO);

}
