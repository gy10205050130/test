package yxinfo.dct.inteface.dto.supplies;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

/**
 * Created by ZH on 2016/12/28.
 */
public class SupStockRecordsDTO extends BaseDTO {
    private Integer id;

    private Integer orgId;

    //耗材名称
    private String supFname;

    //库位id
    private Integer sheId;

    //库位名称
    private String sheFname;

    //规格
    private String spec;

    //数量
    private Integer num;

    //操作人
    private Integer memberId;

    //1入库/2领用/3删除
    private String ftype;

    //创建时间
    private Date createAt;

    //是否被删除
    private String isDelete;

    /**------------------以下为扩展字段---------------------**/
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

    public String getSheFname() {
        return sheFname;
    }

    public void setSheFname(String sheFname) {
        this.sheFname = sheFname;
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

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
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

    @Override
    public String toString() {
        return "SupStockRecordsDTO{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", supFname='" + supFname + '\'' +
                ", sheId=" + sheId +
                ", sheFname='" + sheFname + '\'' +
                ", spec='" + spec + '\'' +
                ", num=" + num +
                ", memberId=" + memberId +
                ", ftype='" + ftype + '\'' +
                ", createAt=" + createAt +
                ", isDelete='" + isDelete + '\'' +
                ", supShelvesDTO=" + supShelvesDTO +
                '}';
    }
}
