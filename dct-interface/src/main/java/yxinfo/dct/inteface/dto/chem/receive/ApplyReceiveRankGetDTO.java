package yxinfo.dct.inteface.dto.chem.receive;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

/**
 * Created by dy on 2017/1/14.
 */
public class ApplyReceiveRankGetDTO extends BaseDTO {

    private static final long serialVersionUID = -2513915225537985004L;

    // 1试剂领取, 2调配试剂领取, 3领取人
    private String flag;

    // 去前几名
    private Integer topNum;

    private Integer orgId;

    private Date from;

    private Date to;

    public String getFlag() {
        return flag;
    }

    public void setFlag( String flag ) {
        this.flag = flag;
    }

    public Integer getTopNum() {
        return topNum;
    }

    public void setTopNum( Integer topNum ) {
        this.topNum = topNum;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom( Date from ) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo( Date to ) {
        this.to = to;
    }
}
