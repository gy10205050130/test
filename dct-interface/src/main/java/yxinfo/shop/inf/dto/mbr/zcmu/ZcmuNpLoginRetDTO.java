package yxinfo.shop.inf.dto.mbr.zcmu;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.mbr.MemberLoginInfoDTO;

/**
 * Created by dy on 2016/9/14.
 */
public class ZcmuNpLoginRetDTO extends BaseDTO {

    private static final long serialVersionUID = 5575679237962521386L;

    // 免密登录标志, 0免密登录成功, 1需要绑定手机, -1拒绝登录
    private String lgFlag;

    private MemberLoginInfoDTO lgInfo;

    public String getLgFlag() {
        return lgFlag;
    }

    public void setLgFlag( String lgFlag ) {
        this.lgFlag = lgFlag;
    }

    public MemberLoginInfoDTO getLgInfo() {
        return lgInfo;
    }

    public void setLgInfo( MemberLoginInfoDTO lgInfo ) {
        this.lgInfo = lgInfo;
    }
}
