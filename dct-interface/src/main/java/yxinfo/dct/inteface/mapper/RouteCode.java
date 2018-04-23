package yxinfo.dct.inteface.mapper;

/**
 * Created by hanley on 2016/6/16.
 */
public interface RouteCode {

    /**
     * 用户
     */
    // 成员登录
    String USER_LOGIN = "100001";
    // 添加成员
    String ADD_MEMBER = "100002";
    // 验证是否是组织成员
    String CHECK_MEMBER_IN_ORG = "100003";
    // 用户注册(已录入信息)
    String REGISTER_HAS_INPUT = "100004";
    // 修改成员信息
    String MODIFY_MEMBER = "100005";
    // 查找成员信息
    String GET_MEMBER = "100006";
    // 获取用户组织
    String GET_ORG_LIST = "100007";
    // 获取用户角色
    String GET_ROLE_LIST = "100008";
    // 注册流程验证手机号码并发送验证码
    String VERIFY_MOBILE_REGISTER_SEND_CODE = "100009";
    // 重置密码流程验证手机号码并发送验证码
    String VERIFY_MOBILE_RESET_PWD_SEND_CODE = "100010";
    // 重置密码
    String UPDATE_PASSWORD = "100011";
    // 更新AccessToken
    String UPDATE_ACCESS_TOKEN = "100012";
    // APP首页菜单
    String APP_INDEX_MENU = "100013";
    // 后台菜单
    String MANAGE_MENU = "100014";
    // 获取全部成员
    String GET_MEMBER_ALL = "100015";
    // 分页搜索全部组织
    String GET_ORG_PAGE_ALL = "100016";
    // 获取ORG全部成员组
    String GET_GROUP_BY_ORG = "100017";
    // 主键查询成员组
    String GET_GROUP_BY_KEY = "100018";
    // 获取成员
    String GET_MEMBER_BY_KEY = "100019";
    // 添加成员组
    String ADD_GROUP = "100020";
    // 修改成员组
    String UPDATE_GROUP = "100021";
    // 删除成员组
    String DELETE_GROUP = "100022";
    // 删除成员
    String DELETE_MEMBER = "100023";
    // 修改用户密码（根据原密码）
    String UPDATE_PASSWORD_BY_OLD = "100024";
    // 后台添加成员
    String ADD_MEMBER_SYS = "100025";
    // 后台修改成员
    String UPDATE_MEMBER_SYS = "100026";
    // 获取录入成员
    String GET_MBR_INPUT_PAGE = "100027";
    // 用户注册
    String REGISTER = "100028";
    // 用户认证
    String AUTH_HAS_INPUT = "100029";
    // 图形验证
    String PT_CHECK_PTCODE = "100030";

    /**
     * 审核
     */
    // 待审核记录列表
    String APPROVE_WAIT_LIST = "109001";
    // 历史审核记录列表
    String APPROVE_HISTORY_LIST = "109002";
    // 获取待审核记录数量
    String APPROVE_GET_WAIT_NUM = "109003";
    // 获取下一步审核用户
    String APPROVE_GET_NEXT_FLOW_MEMBER = "109004";

    /**
     * 事件
     */
    // 是否有事件状态更新（红点提示）
    String EVT_RED_POINT = "110001";
    // 验证短信验证码
    String EVT_CK_VCODE = "110002";
    // 建议
    String EVT_SUGGEST = "110003";
    // 发送验证码
    String EVT_SEND_VCODE = "110004";
    // 添加公告
    String EVT_NOTICE_INSERT = "110005";
    // 更新公告
    String EVT_NOTICE_UPDATE = "110006";
    // 删除公告
    String EVT_NOTICE_DELETE = "110007";
    // 展示公告
    String EVT_NOTICE_SHOW = "110008";
    // 公告列表
    String EVT_NOTICE_PAGE = "110009";
    //验证图形验证码
    String EVT_CHECK_PTVCODE = "110010";

    /**
     * 资源
     */
    // 获取第一级地区
    String GET_AREA_LEVEL1 = "119001";
    // 获取地区信息
    String GET_AREA_TREE = "119002";
    // 直接提交静态资源地址
    String SUBMIT_STATIC_URL = "119003";
    // BASE64上传文件
    String UPLOAD_B64 = "119004";

    /**
     * 消息
     */
    // 用户消息列表
    String MEMBER_MSG_LIST = "123001";
    // 用户未读消息数量
    String MEMBER_HAS_NOT_READ_MSG_COUNT = "123002";
    // 更新用户消息已读
    String UPDATE_MEMBER_MSG_HAS_READ = "123003";
}

