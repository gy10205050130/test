package yxinfo.dct.inteface.context.approve;

/**
 * 审核方案过程类型
 * Created by dy on 2016/06/19.
 */
public interface ApvExecFlowType {

    // 不指定范围
    String FREE = "1";

    // 指定用户
    String FOR_MEMBER = "2";

    // 指定角色
    String FOR_ROLE = "3";

    // 指定成员组
    String FOR_GROUP = "4";

    // 指定标签
    String FOR_TAG = "5";

    // 指定成员组&标签
    String FOR_GROUP_TAG = "6";
}
