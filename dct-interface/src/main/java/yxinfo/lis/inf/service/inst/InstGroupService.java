package yxinfo.lis.inf.service.inst;

import yxinfo.dct.inteface.dto.base.GroupDTO;

import java.util.List;

/**
 * Created by Administrator on 2016/9/5.
 */
public interface InstGroupService {

    /**
     * 获取院校的数据字典
     *
     * @return
     */
    List<GroupDTO> getDepartMentList(Integer orgId);


    /**
     * 通过groupId了来获取部门的数据字典
     *
     * @return
     */
    List<GroupDTO> getSectorList(Integer orgId, Integer groupId);


}
