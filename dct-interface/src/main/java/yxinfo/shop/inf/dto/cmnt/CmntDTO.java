package yxinfo.shop.inf.dto.cmnt;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.shop.inf.context.ErrorCode;
import yxinfo.shop.inf.dto.BaseDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2016/9/20.
 */
public class CmntDTO extends BaseDTO {

    private static final long serialVersionUID = -5585224514507332993L;

    // 订单明细id
    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer orderDetailId;

    // 评论内容
    private String cmntCtx;

    // 打分
    @Valid
    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private List<CmntScoreDTO> score;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId( Integer orderDetailId ) {
        this.orderDetailId = orderDetailId;
    }

    public String getCmntCtx() {
        return cmntCtx;
    }

    public void setCmntCtx( String cmntCtx ) {
        this.cmntCtx = cmntCtx;
    }

    public List<CmntScoreDTO> getScore() {
        return score;
    }

    public void setScore( List<CmntScoreDTO> score ) {
        this.score = score;
    }
}
