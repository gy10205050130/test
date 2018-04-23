package yxinfo.dct.inteface.dto.supplies;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/12/28.
 */
public class SupStockDTO extends BaseDTO {

    private Integer id;

    private Integer orgId;

    //耗材名称
    private String supFname;

    //库位id
    private Integer sheId;

    //规格
    private String spec;

    //数量
    private Integer num;

    //入库人
    private Integer memberId;

    //创建时间
    private Date createAt;

    /**------------------以下为扩展字段---------------------**/
    //二维码
    private String rfidCode;

    //规格（以逗号隔开）
    private String specs;

    //库位名称
    private String sheFname;

    //库位
    private SupShelvesDTO supShelvesDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupFname() {
        return supFname;
    }

    public void setSupFname(String supFname) {
        this.supFname = supFname;
    }

    public Integer getSheId() {
        return sheId;
    }

    public void setSheId(Integer sheId) {
        this.sheId = sheId;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getRfidCode() {
        return rfidCode;
    }

    public void setRfidCode(String rfidCode) {
        this.rfidCode = rfidCode;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public SupShelvesDTO getSupShelvesDTO() {
        return supShelvesDTO;
    }

    public void setSupShelvesDTO(SupShelvesDTO supShelvesDTO) {
        this.supShelvesDTO = supShelvesDTO;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getSheFname() {
        return sheFname;
    }

    public void setSheFname(String sheFname) {
        this.sheFname = sheFname;
    }

    @Override
    public String toString() {
        return "SupStockDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", supFname='" + supFname + '\'' +
                ", sheId=" + sheId +
                ", spec='" + spec + '\'' +
                ", num=" + num +
                ", memberId=" + memberId +
                ", createAt=" + createAt +
                ", rfidCode='" + rfidCode + '\'' +
                ", specs='" + specs + '\'' +
                ", sheFname='" + sheFname + '\'' +
                ", supShelvesDTO=" + supShelvesDTO +
                '}';
    }
}
