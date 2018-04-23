package yxinfo.shop.inf.dto.eqry;

import yxinfo.shop.inf.dto.BaseDTO;

public class EqryApvExecDTO  extends BaseDTO {

    private static final long serialVersionUID = 3122464200431244111L;

    // 方案key
    private String fkey;

    // 使用方id
    private Integer partyId;

    // 审核项目编号
    private String apvItemNo;

    // 平台组织id
    private Integer orgId;

    // 审核分类id
    private Integer apvCatId;

    // 额外信息
    private Object extraMsg;

    // 是否需要审核, 默认需要审核
    private boolean isNeedApv = true;

    public String getFkey() {
        return fkey;
    }

    public void setFkey( String fkey ) {
        this.fkey = fkey;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }

    public String getApvItemNo() {
        return apvItemNo;
    }

    public void setApvItemNo( String apvItemNo ) {
        this.apvItemNo = apvItemNo;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId( Integer orgId ) {
        this.orgId = orgId;
    }

    public Integer getApvCatId() {
        return apvCatId;
    }

    public void setApvCatId( Integer apvCatId ) {
        this.apvCatId = apvCatId;
    }

    public Object getExtraMsg() {
        return extraMsg;
    }

    public void setExtraMsg( Object extraMsg ) {
        this.extraMsg = extraMsg;
    }

    public boolean isNeedApv() {
        return isNeedApv;
    }

    public void setNeedApv( boolean needApv ) {
        isNeedApv = needApv;
    }
}