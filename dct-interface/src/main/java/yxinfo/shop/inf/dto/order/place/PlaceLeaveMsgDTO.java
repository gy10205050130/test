package yxinfo.shop.inf.dto.order.place;

import yxinfo.shop.inf.dto.BaseDTO;

/**
 * Created by dy on 2016/8/30.
 */
public class PlaceLeaveMsgDTO extends BaseDTO {

    private static final long serialVersionUID = -2405422650650162758L;

    private Integer merId;

    private String leaveMsg;

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public String getLeaveMsg() {
        return leaveMsg;
    }

    public void setLeaveMsg( String leaveMsg ) {
        this.leaveMsg = leaveMsg;
    }
}
