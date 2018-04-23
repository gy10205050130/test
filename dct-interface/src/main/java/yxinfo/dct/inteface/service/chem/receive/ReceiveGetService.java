package yxinfo.dct.inteface.service.chem.receive;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveBatchDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveBatchDayDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveRankDTO;
import yxinfo.dct.inteface.dto.chem.receive.ApplyReceiveRankGetDTO;

import java.util.List;

/**
 * Created by dy on 2017/1/13.
 */
public interface ReceiveGetService {

    /**
     * 已领用列表
     * @code 108114
     * @param schPage
     * @return
     */
    PageDTO<List<ApplyReceiveBatchDTO>> getApplyReceiveBatchPage( PageDTO<ApplyReceiveBatchDTO> schPage );

    /**
     * 已领用列表（按日归类）
     * @code 108115
     * @param schPage
     * @return
     */
    PageDTO<List<ApplyReceiveBatchDayDTO>> getApplyReceiveBatchPageByDay( PageDTO<ApplyReceiveBatchDTO> schPage );

    /**
     * 领用排行
     * @code 108117
     * @param get
     * @return
     */
    List<ApplyReceiveRankDTO> getRank( ApplyReceiveRankGetDTO get );
}
