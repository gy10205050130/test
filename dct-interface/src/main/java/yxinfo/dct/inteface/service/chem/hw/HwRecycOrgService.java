package yxinfo.dct.inteface.service.chem.hw;


import yxinfo.dct.inteface.dto.base.OrgDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/4.
 */
public interface HwRecycOrgService {

    /**
     * 获取危废回收者对应的产生者组织
     * @code 108055
     * @param recycOrgId
     * @return
     */
    List<OrgDTO> getRecycOrgList( Integer recycOrgId );
}
