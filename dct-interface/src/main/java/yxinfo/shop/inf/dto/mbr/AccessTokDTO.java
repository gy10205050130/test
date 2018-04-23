package yxinfo.shop.inf.dto.mbr;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2016/8/15.
 */
public class AccessTokDTO extends BaseDTO {

    private static final long serialVersionUID = -3060876991924209511L;

    //AccessToken
    private String accessTok;

    //终端类型
    private String deviceType;

    //创建时间
    private Date createAt;

    //过期时间
    private int expireIn;

    //成员id
    private Integer memberId;

    //商家
    private Integer merId;

    //角色id
    private List<Integer> roles;

    //成员平台id
    private Integer baseMemberId;

    public String getAccessTok() {
        return accessTok;
    }

    public void setAccessTok( String accessTok ) {
        this.accessTok = accessTok;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType( String deviceType ) {
        this.deviceType = deviceType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt( Date createAt ) {
        this.createAt = createAt;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId( Integer memberId ) {
        this.memberId = memberId;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn( int expireIn ) {
        this.expireIn = expireIn;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId( Integer merId ) {
        this.merId = merId;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles( List<Integer> roles ) {
        this.roles = roles;
    }

    public Integer getBaseMemberId() {
        return baseMemberId;
    }

    public void setBaseMemberId( Integer baseMemberId ) {
        this.baseMemberId = baseMemberId;
    }
}
