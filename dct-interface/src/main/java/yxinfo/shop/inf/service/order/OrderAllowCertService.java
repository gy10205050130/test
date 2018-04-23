package yxinfo.shop.inf.service.order;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.shop.inf.dto.order.OrderAllowCertDTO;
import yxinfo.shop.inf.dto.order.OrderDetailDTO;
import yxinfo.shop.inf.dto.order.ac.UploadAllowCertDTO;
import yxinfo.shop.inf.dto.order.ac.WaitAllowCertGetDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/27.
 */
public interface OrderAllowCertService {

    /**
     * 获取待上传准购证明细
     * @code 100015
     * @param allowCertGet
     * @return
     */
    PageDTO<List<OrderDetailDTO>> waitAllowCert( PageDTO<WaitAllowCertGetDTO> allowCertGet );

    /**
     * 分配准购批号
     * @code 100016
     * @param allowCertGet
     * @return
     */
    String handleWaitAllowCert( WaitAllowCertGetDTO allowCertGet );

    /**
     * 分页查询准购批次
     * @code 100017
     * @param orderAllowCertDTOPage
     * @return
     */
    PageDTO<List<OrderAllowCertDTO>> getOrderAllowCertPage( PageDTO<OrderAllowCertDTO> orderAllowCertDTOPage );

    /**
     * 上传准购证
     * @code 100018
     * @param uploadAllowCert
     */
    void uploadOrderAllowCert( UploadAllowCertDTO uploadAllowCert );
}
