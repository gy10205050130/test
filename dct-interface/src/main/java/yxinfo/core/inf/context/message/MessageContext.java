package yxinfo.core.inf.context.message;

/**
 * 推送常量
 * Created by dy on 2016/6/30.
 */
public interface MessageContext {

    // 别名（旧）, A{memberId}_{memberOrgId}
    String ALIAS_FLAG_OLD = "A{0}_{1}";

    // 别名, {IMEI}_{memberId}_{orgId}
    String ALIAS_FLAG = "{0}_{1}_{2}";

    // 角色Tag, R{角色id}
    String TAG_ROLE_FLAG = "R";

    // 用户组Tag, G{用户组id}
    String TAG_GROUP_FLAG = "G";

    // 用户标签Tag, T{用户标签id}
    String TAG_TAG_FLAG = "T";

    // 组织Tag, O{组织id}
    String TAG_ORG_FLAG = "O";
}
