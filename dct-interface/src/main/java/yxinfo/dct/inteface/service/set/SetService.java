package yxinfo.dct.inteface.service.set;

import yxinfo.dct.inteface.dto.set.SetCoreDTO;

import java.util.List;

/**
 * 设置服务
 * Created by dy on 2016/12/20.
 */
public interface SetService {

    /**
     * 获取设置
     * @param orgId 不存在时传0
     * @param fkey
     * @return
     */
    SetCoreDTO getSet( Integer orgId, String fkey );

    /**
     * 获取设置
     * @param orgId
     * @param fkey
     * @return
     */
    List<SetCoreDTO> getSets( Integer orgId, String fkey );

    /**
     * 获取设置
     * @param fkey
     * @return
     */
    List<SetCoreDTO> getSets( String fkey );
}
