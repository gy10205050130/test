package yxinfo.lis.inf.dto.inst;

import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;
import yxinfo.lis.inf.validation.groups.Add;
import yxinfo.lis.inf.validation.groups.Update;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * Created by xww on 2016/9/5.
 */
public class InstPicDTO extends BaseDTO {

    //静态资源id
    @Digits(integer = 10, fraction = 0, message = ErrorCode.LENGTH)
    @NotNull(groups = {Add.class, Update.class}, message = ErrorCode.NOT_NULL)
    private Integer staticId;

    //商品id
    private Integer instId;

    //排序
    private Short sort;

    //是否是封面
    private Boolean isCover;

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public Boolean getIsCover() {
        return isCover;
    }

    public void setIsCover(Boolean cover) {
        isCover = cover;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Integer getStaticId() {
        return staticId;
    }

    public void setStaticId(Integer staticId) {
        this.staticId = staticId;
    }


}
