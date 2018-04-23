package yxinfo.dct.inteface.context.errcode.core;

/**
 * Created by hanley on 2016/6/21.
 */
public interface ErrorCode {

    String SUCCESS = "0";

    /**
     * 公共异常
     */
    // 参数不能为null
    String NOT_NULL = "000001";
    // 参数不能为空
    String NOT_EMPTY = "000002";
    // 参数必须为整数
    String DIGITS = "000003";
    // 参数长度错误
    String LENGTH = "000004";
    // 参数必须为false
    String ASSERT_FALSE = "000005";
    // 参数必须为true
    String ASSERT_TRUE = "000006";
    // 参数最大值错误
    String MAX = "000007";
    // 参数最小值错误
    String MIN = "000008";
    // 参数必须是一个将来的日期
    String FUTURE = "000009";
    // 参数必须是一个过去的日期
    String PAST = "000010";
    // 分页获取page错误
    String GET_PAGE = "000011";
    // 不存在
    String NOT_EXIST = "000012";
    // 不合法
    String ILLEGAL = "000013";
    // 请求data不能为空
    String DATA_NOT_NULL = "000014";
    // 无权访问
    String DO_NOT_HAVE_ACCESS = "000015";
    // 拒绝访问
    String REFUSE_ACCESS = "000016";
    // 没有数据
    String NO_DATA = "000017";
    // 系统异常
    String SYS_ERROR = "0009999";

    /**
     * 用户异常
     */
    // 参数不能为空
    String PARAM_NOT_NULL = "001000";
    // 用户不存在
    String USER_NOT_FOUND = "001001";
    // 密码错误
    String PASSWORD_ERROR = "001002";
    // 组织名称不能为空
    String ORG_NAME_NOT_EMPTY = "001003";
    // 组织id不能为空
    String ORG_ID_NOT_NULL = "001004";
    // 用户存在
    String USER_EXIST = "001005";
    // 手机号码不能为空
    String MOBILE_NOT_EMPTY = "001006";
    // AccessToken不能为空
    String ACCESS_TOKEN_NOT_EMPTY = "001007";
    // AccessToken失效
    String ACCESS_TOKEN_INVALID = "001008";
    // 名称不能为空
    String NAME_NOT_EMPTY = "001009";
    // 用户id不能为空
    String MEMBER_ID_NOT_EMPTY = "001010";
    // 不允许注册的用户
    String CAN_NOT_REGISTER = "001011";
    // 用户资料不正确
    String USER_REGISTER_MSG_NOT_MEET = "001012";
    // 请先验证手机
    String USER_REGISTER_MUST_VCODE = "001013";
    // 密码不能为空
    String PWD_NOT_EMPTY = "001014";
    // 姓名不能为空
    String REAL_NAME_NOT_EMPTY = "001015";
    // 登录名不能为空
    String LOGIN_NAME_NOT_EMPTY = "001016";
    // 人员编号不能为空
    String USER_CODE_NOT_EMPTY = "001017";
    // 登录输入密码错误次数过多
    String USER_PWD_ERR_TOO_MUCH = "001018";
    // 成员编号已存在
    String MEMBER_FCODE_IS_REPEAT = "001019";
    // 成员登陆名已存在
    String MEMBER_LOGINNAME_IS_REPEAT = "001020";
    // 日期不能为空
    String DATE_NOT_EMPTY = "001021";
    // 用户已录入资料, 请使用认证注册
    String MEMBER_MSG_HAS_INPUT = "001023";
    // 组织不存在
    String ORG_NOT_EXIST = "001025";
    // AccessToken过期
    String ACCESS_TOKEN_EXPIRE = "001026";

    /**
     * 审核异常
     */
    // 审核方案id不能为空
    String APPROVE_EXEC_ID_NOT_EMPTY = "002002";
    // 额外信息错误
    String APPROVE_EXTMSG_ERROR = "002011";
    // 组织id不能为空
    String APPROVE_ORG_ID_NOT_EMPTY = "002003";
    // 审核项目编号不能为空
    String APPROVE_ITEM_NO_NOT_EMPTY = "002013";
    // 审核项目编号长度必须小于10
    String APPROVE_ITEM_NO_LENGTH = "002014";
    // 必须指定审核人
    String APPROVE_ON_MEMBER_ID_NOT_EMPTY = "002006";
    // 无权审核此单据
    String APPROVE_NO_RIGHT_TO_APPROVE = "002030";
    // 选择的下一位审核人无权审核此单据
    String APPROVE_NO_RIGHT_TO_APPROVE_NEXT = "002031";
    // 审核记录id不能为空
    String APPROVE_RECODE_ID_NOT_EMPTY = "002001";
    // 审核记录不存在
    String APPROVE_RECODE_NOT_EXIST = "002009";
    // 审核已结束
    String APPROVE_RECODE_HAS_FIN = "002010";
    // 审核额外信息id不能为空
    String APPROVE_RECODE_EXT_MSG_ID_NOT_EMPTY = "002029";
    // 审核方案不存在
    String APPROVE_EXEC_NOT_EXIST = "002007";
    // 审核方案过程未配置
    String APPROVE_EXEC_FLOW_NOT_EXIST = "002008";
    // 审核方案过程配置异常
    String APPROVE_EXEC_FLOW_ERROR = "002012";
    // 审核项目名称长度必须小于255
    String APPROVE_EXEC_NAME_LENGTH = "002015";
    // 审核项目名称不能为空
    String APPROVE_EXEC_NAME_NOT_EMPTY = "002016";
    // 审核项目备注长度必须小于255
    String APPROVE_EXEC_REMARK_LENGTH = "002017";
    // 审核项目过程类型不能为空
    String APPROVE_EXEC_TYPE_NOT_EMPTY = "002018";
    // 审核项目过程类型长度必须等于1
    String APPROVE_EXEC_TYPE_LENGTH = "002019";
    // 审核人id不能为空
    String APPROVE_NODE_MEMBERID_NOT_EMPTY = "002020";
    // 审核状态长度必须等于1
    String APPROVE_NODE_STATUS_LENGTH = "002021";
    // 审核状态不能为空
    String APPROVE_NODE_STATUS_NOT_EMPTY = "002022";
    // 审核意见长度必须小于255
    String APPROVE_NODE_OPINION_LENGTH = "002023";
    // 审核流程记录id不能为空
    String APPROVE_NODE_ARID_NOT_EMPTY = "002024";
    // 是否结束自由模式标志长度必须等于1
    String APPROVE_NODE_ISEND_LENGTH = "002025";
    // 审核提交人组织id不能为空
    String APPROVE_SUBMIT_ORG_ID_NOT_EMPTY = "002026";
    // 审核提交人id不能为空
    String APPROVE_SUBMIT_MEMBER_NOT_EMPTY = "002027";
    // 搜索审核人姓名不能为空
    String APPROVE_SCH_M_NAME_NOT_EMPTY = "002028";
    // 无权撤销
    String APPROVE_NO_RIGHT_TO_REVOKE = "002032";
    // 下一位审核人已审核, 无法撤销
    String APPROVE_REVOKE_NEXT_HAS_APV = "002033";
    // 撤销失败
    String APPROVE_FAIL_PREVIOUS_AT = "002034";

    /**
     * 事件通知异常
     */
    // 发送短信过于频繁
    String EVT_VCODE_TOO_OFTEN = "009001";
    // 短信请求超过限制，请24小时后重试
    String EVT_VCODE_TOO_OFTEN_DAY = "009002";
    // 用于的功能码不能为空
    String EVT_VCODE_USE_AT_NOT_EMPTY = "009003";
    // 手机号不能为空
    String EVT_VCODE_MOBILE_NOT_EMPTY = "009004";
    // 验证码不能为空
    String EVT_VCODE_CODE_NOT_EMPTY = "009005";
    // 短信验证码不存在
    String EVT_VCODE_NOT_SEND = "009006";
    // 短信验证码验证超限
    String EVT_VCODE_INVALID = "009007";
    // 短信验证码超时
    String EVT_VCODE_EXPIRE = "009008";
    // 短信验证码不正确
    String EVT_VCODE_NOT_MEET = "009009";
    // 事件项目编号不能为空
    String EVT_ITEM_NO_NOT_EMPTY = "009010";
    // 事件数量不能为空
    String EVT_NUM_NOT_EMPTY = "009011";
    // 事件通知类型不能为空
    String EVT_NOTIFY_TYPE_NOT_EMPTY = "009012";
    // 事件通知标题不能为空
    String EVT_TITLE_NOT_EMPTY = "009013";
    // 建议类型不能为空
    String EVT_SUGGEST_TYPE_NOT_EMPTY = "009014";
    // 建议内容不能为空
    String EVT_SUGGEST_CONTEXT_NOT_EMPTY = "009015";
    // 建议内容不能超过2000字
    String EVT_SUGGEST_CONTEXT_LENGTH = "009016";
    // 公告内容不能为空
    String EVT_NOTICE_CONTENT_NOT_EMPTY = "009017";
    // 公告添加异常
    String EVT_NOTICE_INSERT_ERROR = "009018";
    // 公告更新异常
    String EVT_NOTICE_UPDATE_ERROR = "009019";
    // 公告删除异常
    String EVT_NOTICE_DELETE_ERROR = "009020";
    // 公告展示异常
    String EVT_NOTICE_SHOW_ERROR = "009021";
    // 终端类型编号不能为空
    String EVT_TERMINAL_NOT_EMPTY = "009022";
    // 图形验证超时
    String EVT_PTVCODE_EXPIRE = "009023";
    // 图形验证码不存在
    String EVT_PTVCODE_NOEXIST = "009024";
    // 图形验证码不正确
    String EVT_PTVCODE_NOT_MEET = "009025";

    /**
     * 资源异常
     */
    // 静态资源业务代码错误
    String RES_UPLOAD_CODE_ERROR = "010001";
    // 不允许上传的文件类型
    String RES_UPLOAD_SUFFIX_ERROR = "010002";
    // 上传的文件太大
    String RES_UPLOAD_SIZE_LIMIT = "010003";
    // 地址不能为空
    String RES_URL_NOT_EMPTY = "010004";
    // 资源上传约束id不能为空
    String RES_UB_ID_NOT_EMPTY = "010005";
    // 文件上传失败
    String UPLOAD_ERROR = "010006";
}
