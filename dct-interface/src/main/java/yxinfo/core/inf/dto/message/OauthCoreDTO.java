package yxinfo.core.inf.dto.message;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class OauthCoreDTO extends BaseDTO {

    private static final long serialVersionUID = -4293266908651284052L;

    private String appId;

    private String accessToken;

    private Date expiresAt;

    public String getAppId() {
        return appId;
    }

    public void setAppId( String appId ) {
        this.appId = appId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken( String accessToken ) {
        this.accessToken = accessToken;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt( Date expiresAt ) {
        this.expiresAt = expiresAt;
    }
}