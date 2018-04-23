package yxinfo.dct.inteface.dto.supplies;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/12/30.
 */
public class SupReceiveDTO extends BaseDTO {

    private Integer id;

    private Integer orgId;

    //领取成员id
    private Integer memberId;

    //领取库存id
    private Integer stockId;

    //数量
    private Integer num;

    //创建时间
    private Date createAt;

    /**-----------以下为扩展属性--------------**/
    //库存DTO
    private SupStockDTO supStockDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public SupStockDTO getSupStockDTO() {
        return supStockDTO;
    }

    public void setSupStockDTO(SupStockDTO supStockDTO) {
        this.supStockDTO = supStockDTO;
    }
}
