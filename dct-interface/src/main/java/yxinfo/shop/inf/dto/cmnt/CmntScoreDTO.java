package yxinfo.shop.inf.dto.cmnt;

import org.hibernate.validator.constraints.Range;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;

/**
 * Created by dy on 2016/9/20.
 */
public class CmntScoreDTO extends BaseDTO {

    private static final long serialVersionUID = 5317020328881862332L;

    // 评论项目
    @NotNull( message = ErrorCode.NOT_NULL )
    @Range( min = 0, max = 4, message = ErrorCode.ILLEGAL )
    private Short cmntItem;

    // 分数
    @NotNull( message = ErrorCode.NOT_NULL )
    @Range( min = 0, max = 10, message = ErrorCode.ILLEGAL )
    private Short score;

    public CmntScoreDTO() {}

    public CmntScoreDTO( Short cmntItem, Short score ) {
        this.cmntItem = cmntItem;
        this.score = score;
    }

    public Short getCmntItem() {
        return cmntItem;
    }

    public void setCmntItem( Short cmntItem ) {
        this.cmntItem = cmntItem;
    }

    public Short getScore() {
        return score;
    }

    public void setScore( Short score ) {
        this.score = score;
    }
}
