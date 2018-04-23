package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by xww on 2016/10/17.
 */
public class InstChargeRuleDTO extends BaseDTO {

    //仪器收费规则id
    private Integer id;

    //仪器id
    private Integer instId;

    //收费类型(1校内2附属单位3校外)
    private Short type;

    //单位id
    private Integer partyId;

    //单价（分）
    private Integer price;

    //1时间收费2样收费3针收费4次收费
    private Short chargeType;

    //预估每样所需时间
    private Integer perTimes;

    //超出时间所需要的钱
    private Integer overMoney;

    //检测费用规则(分)
    private Integer testPercent;

    public Integer getTestPercent() {
        return testPercent;
    }

    public void setTestPercent(Integer testPercent) {
        this.testPercent = testPercent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getChargeType() {
        return chargeType;
    }

    public void setChargeType(Short chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getOverMoney() {
        return overMoney;
    }

    public void setOverMoney(Integer overMoney) {
        this.overMoney = overMoney;
    }

    public Integer getPerTimes() {
        return perTimes;
    }

    public void setPerTimes(Integer perTimes) {
        this.perTimes = perTimes;
    }

    @Override
    public String toString() {
        return "InstChargeRuleDTO{" +
                "id=" + id +
                ", instId=" + instId +
                ", type=" + type +
                ", partyId=" + partyId +
                ", price=" + price +
                '}';
    }
}
