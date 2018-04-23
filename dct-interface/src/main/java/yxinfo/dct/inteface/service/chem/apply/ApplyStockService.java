package yxinfo.dct.inteface.service.chem.apply;

/**
 * 申领数据获取服务
 * Created by dy on 2017/1/5.
 */
public interface ApplyStockService {

    /**
     * 获取未被申领的试剂余量
     * @param orgId
     * @param chemName
     * @param specName
     * @param unit
     * @param purchaseType
     * @param flag
     * @param belongToCode
     * @return
     */
    Long getStockNotBeApplied( Integer orgId, String chemName, String specName, String unit, String purchaseType,
                   String flag, String belongToCode );

    /**
     * 获取未被申领的试剂瓶数
     * @param orgId
     * @param chemName
     * @param specName
     * @param capacity
     * @param unit
     * @param purchaseType
     * @param flag
     * @param belongToCode
     * @return
     */
    Integer getCountNotBeApplied( Integer orgId, String chemName, String specName, Integer capacity, String unit, String purchaseType,
                                  String flag, String belongToCode );
}
