package yxinfo.shop.inf.dto.cmnt;

import yxinfo.shop.inf.dto.BaseDTO;

public class CmntMerDTO extends BaseDTO {

    private static final long serialVersionUID = -2904832666546312958L;

    // 商户id
    private Integer merId;

    // 评论项目
    private Short cmntItem;

    // 总分
    private Integer scoreTotal;

    // 评分次数
    private Integer num;

    private String upDown;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public Short getCmntItem() {
        return cmntItem;
    }

    public void setCmntItem( Short cmntItem ) {
        this.cmntItem = cmntItem;
    }

    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal( Integer scoreTotal ) {
        this.scoreTotal = scoreTotal;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum( Integer num ) {
        this.num = num;
    }

    public String getUpDown() {
        return upDown;
    }

    public void setUpDown( String upDown ) {
        this.upDown = upDown;
    }
}