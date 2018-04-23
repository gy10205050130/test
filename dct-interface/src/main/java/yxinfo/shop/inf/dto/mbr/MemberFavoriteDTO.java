package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.validation.groups.Add;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class MemberFavoriteDTO extends BaseDTO {

    private static final long serialVersionUID = -5220762335225172833L;

    private Integer id;

    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer memberId;

    // 类型（1商品收藏，2供应商收藏）
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Short ftype;

    // 收藏id
    @NotNull( groups = Add.class, message = ErrorCode.NOT_NULL )
    private Integer favoriteId;

    // 创建时间
    private Date createAt;

    // 搜索词
    private String schText;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public Short getFtype() {
        return ftype;
    }

    public void setFtype( Short ftype ) {
        this.ftype = ftype;
    }

    public Integer getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId( Integer favoriteId ) {
        this.favoriteId = favoriteId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public String getSchText() {
        return schText;
    }

    public void setSchText( String schText ) {
        this.schText = schText;
    }
}
