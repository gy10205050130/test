package yxinfo.lis.inf.dto.platform;


import yxinfo.lis.inf.dto.BaseDTO;

/**
 * Created by cy on 2016/10/20.
 */
public class LisPlatScienceFieldDTO extends BaseDTO {

    //平台id
    private Integer platId;

    //科学领域id
    private Integer scienceFieldId;

    //科学领域名称
    private ScienceFieldDTO scienceFieldDTO;

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public Integer getScienceFieldId() {
        return scienceFieldId;
    }

    public void setScienceFieldId(Integer scienceFieldId) {
        this.scienceFieldId = scienceFieldId;
    }

    public ScienceFieldDTO getScienceFieldDTO() {
        return scienceFieldDTO;
    }

    public void setScienceFieldDTO(ScienceFieldDTO scienceFieldDTO) {
        this.scienceFieldDTO = scienceFieldDTO;
    }
}
