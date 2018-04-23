package yxinfo.ow.inf.context;

/**
 * Created by hanley on 2016/6/21.
 */
public interface ErrorCode {

    String SUCCESS = "0";

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
    // U-centre调用异常
    String U_CENTRE_ERROR = "000900";
    //组织id不可为空
    String PARAM_ORGID_IS_NULL = "000016";
    //单位id不可为空
    String PARAM_PARTYID_IS_NULL = "000017";
    //id不可为空
    String PARAM_KEY_IS_NULL = "000018";

    // 订单模块（006）
    public interface Order {

        //预约时间冲突
        String TIME_IS_MISTAKE = "006001";
        //开放时间冲突
        String OPENTIME_IS_MISTAKE = "006002";
        //订单无法取消
        String DO_NOT_CANCEL = "006003";
        //状态不正确
        String STATUS_NOT_RIGHT = "006004";
        //订单不存在
        String ORDER_IS_NULL = "006005";
        //订单无法通过
        String DO_NOT_PASS = "006006";
        //订单无法完成
        String ORDER_NOT_FINISH = "006007";
        //信用积分为0，不能预约仪器
        String NOT_BOOK_ORDER = "006008";
        //在实验中进行实验
        String START_INST_INTIME = "006009";
        //已过当前时间不可预约
        String OVER_BOOK_TIME = "006010";
        //独立预约人不能预约仪器
        String INST_INDE_USER = "006011";
        //该仪器不在此实验室
        String NOT_AT_LIB = "006012";
        //非法设备
        String ILL_INST = "006013";
        //请连续选择时间
        String NOT_CONTINUE_SELECT = "006014";
        //仪器检测次数不能问0
        String NOT_EQUALS_ZERO = "006015";

    }

    // 仪器模块(002)
    public interface Instrument {

        //不是负责人，不能删除仪器
        String NOT_DELETE_ISNT = "007001";
        //请求参数有误
        String WRONG_PARAM = "007002";
        //该仪器有订单，不能删除
        String NOT_DELETE_ORDERINST = "007003";
        //仪器已经删除
        String INST_IS_DELETE = "007004";
        //该Mac地址不能绑定该设备
        String NOT_BINDLE_INST = "007005";
        //Mac不能为空
        String MAC_NOT_NULL = "007006";
        //Mac不能相同
        String MAC_NOT_EQUALS = "007007";
        //请填写电源和者控制器的Mac和ip
        String WRITE_MAC_AND_IP = "007008";
        //该Mac已经绑定了实验室
        String MAC_BINDLE_LAB = "007009";
        //仪器开始失败，请重新开启
        String OPEN_FAIL = "007010";
        //mac地址不可为空
        String MAC_IS_NULL = "007011";

    }

    // 用户模块（003）
    public interface Memeber {
        //AccessToken失效
        String ACCESS_TOKEN_INVALID = "001008";
        //注册失败
        String MEMBER_ADD_ERROR = "003001";
        //用户名已存在
        String LOGIN_NAME_IS_REPEATED = "003002";
        //手机号已存在
        String MOBILE_IS_REPEATED = "003003";
        //手机号填写有误
        String MOBILE_ERROR = "003004";
        //修改失败
        String MEMBER_UPDATE_ERROR = "003005";
        //添加收藏失败
        String MEMBER_FAVORITE_ADD_ERROR = "003006";
        //删除用户失败
        String MEMBER_DELETE_ERROR = "003007";
        //添加收货地址失败
        String MEMBER_CNEE_ADD_ERROR = "003008";
        //用户名或密码填写错误
        String LOGINNAME_OR_PWD_ERROR = "003009";

        //请先验证手机验证码
        String USER_REGISTER_MUST_VCODE = "003027";
        //禁止登录的用户
        String USER_IS_DEL = "003028";
    }

    //评价模块(004)
    public interface Judge {

        //状态未完成，无法评价
        String DO_NOT_JUDGE = "004001";
        //请不要重复提交
        String DO_NOT_REPEAT_SUBMIT = "004002";
        //评价失败，请重新评价
        String JUDGE_FAIL = "004003";

    }

    //人员管理模块(005)
    public interface Member {
        String IMPORT_MEMBER_URL_ERROR = "005001";//上传时url不可为空
        String IMPORT_MEMBER_ERROR = "005002";//上传人员失败
        String EXPORT_MEMBER_ERROR = "005003";//导出人员失败
        String LOGINNAME_IS_NULL = "005004";//登陆名不可为空
        String PWD_IS_NULL = "005005";//密码不可为空
        String CANNOT_CHANGE_ROLE_BIGTHEN = "005006";//只可修改权限小于自己的用户
        String PARAM_ID_PARTYID_NOT_NULL = "005007";//id获取partyid不可为空
        String NOT_EXSIST_MEMBER = "005008";//根据id未查到对应人员信息
        String ADVANCE_CHARGE_ROLE_ILLEGLE = "005009";//无分配权限
        String PARTY_IS_NOT_FIND = "005010";//未找到对应单位
        String PARTY_IMPRESTMONEY_NOT_ENOUGH = "005011";//单位预存款余额不足
        String MEMBER_NOT_EXSIST = "005012";//未找到对应人员
        String MEMBER_NOT_HAS_PARTY = "005013";//人员对找到对应的单位
        String MEMBER_PARTY_HAS_SAME = "005014";//人员对应同一个单位有多条记录
        String ADVANCE_CHARGE_IS_ILLEGLE = "005015";//金额输入不合法
        String MEMBER_ADVANCECHARGES_RECORD_ERROR = "005016";//人员预付款记录有误
        String ADVANCE_CHARGE_FTYPE_ILLEGLE = "005017";//预付款类型未传递
        String PARTY_CREATORPARTY_NOT_SAME = "005018";//被分配人员和分配人的单位不匹配
    }

    //课题管理模块
    public interface Topic {
        String ADD_TOPICMEMBER_PARAM_NULL = "008001";//课题id和人员id均不可为空
        String DELETE_TOPIC_WITH_CHILD_TOPIC = "008002";//该课题含有子课题，不可删除
        String DELETE_TOPIC_WITH_MEMBER = "008003";//该课题含有课题成员，不可删除
        String DELETE_TOPIC_WITHOUT_FIND = "008004";//未找到对应的课题
        String PARAM_MEMBERID_IS_NULL = "008005";//memberId不可为空
        String CASH_COUPON_IS_NULL = "008006";//未找到对应代金券
        String REVIWE_MEMBER_IS_NULL = "008007";//操作人不存在
        String MEMBER_IS_ALREADY_EXSIST = "008008";//人员已存在
        String APPROVE_AMOUNT_IS_NULL = "008009";//金额不可为空
        String FSTATU_IS_NOT_ACCEPT = "008010";//经费卡未受理
        String FSTATU_CAN_NOT_CHANGE = "008011";//状态不可修改
        String PARAM_FSTATU_IS_NULL = "008012";//状态不可为空
        String TOPIC_IS_EXSIST = "008013";//您已添加过此课题，不可重复添加
        String APPLY_MEMBER_IS_NULL = "008014";//申请人不存在
        String APPROVE_AMOUNT_IS_ILLEGEL = "008015";//金额不可小于零
        String PARAM_PAYTYPE_IS_NULL = "008016";//支付时支付方式不可为空
    }

    //支付管理模块
    public interface Payment {
        String PARAM_ORDERID_NOT_NULL = "009001";//订单id不可为空
        String ORDER_RECORD_IS_NULL = "009002";//未找到对应订单
        String MEMBER_RECORD_IS_NULL = "009003";//未找到对应预约人员
        String ORDER_BOOKERID_ISNOT_SAME = "009004";//当前操作人与预约人不一致
        String VOUCHER_OWNER_NOT_EXSIT = "009005";//经费卡/代金券负责人不存在
        String BOOKER_VOUCHER_AUTH_ERROR = "009006";//无该经费卡使用权限
        String VOUCHER_NOT_ENOUGH_MONEY = "009007";//金额不足
        String ORDER_BEYOND_TIME = "009008";//订单超出支付时间
        String BOOKER_ID_ISNOT_SAME = "009009";//订单对应的预约人不同
        String ORDER_TOTAL_PRICE_IS_NULL = "009010";//订单金额为空
        String TOPIC_ID_IS_NULL = "009011";//课题id不可为空
        String TOPIC_IS_NOT_EXSIST = "009012";//课题不存在
        String GET_FUNDS_ERROR = "009013";//获取经费卡余额出错
        String PARAM_ORDERID_MEMBERID_IS_NULL = "009014";//订单id和预约人id不可为空
        String ORDER_HAS_ALREADY_REFUND = "009015";//订单已退款
        String REFUND_ORDER_BEYOND_TIME = "009016";//超出时间不可退款
        String FUNDS_NOT_EXSIT = "009017";//经费卡不存在
        String ORDER_ALREADY_PAYED = "009018";//订单已支付
        String ALIPAY_REFUND_IS_EMPTY = "009019";//订单为支付宝付款暂不支持此方式退款
        String ORDER_PAY_RECORD_IS_NULL = "009020";//该条订单无支付记录，不可退款
        String PAYTYPE_IS_NOT_ALIPAY = "009021";//非支付宝付款
        String PARAM_PASSSBACK_IS_ERROR = "009022";//获取扩展信息失败
        String CREDIT_SCORE_NOT_ENOUGH = "009023";//信用积分不足
        String RECORD_IS_NULL = "009024";//无记录可供导出
        String GET_ORDERCONSUME_LIST_ERROR = "009025";//获取消费记录失败
        String EXPORT_ORDERCONSUME_ERROR = "009026";//导出消费记录出错
        String INST_NOT_HAS_PARTY = "009027";//订单中仪器没有对应的party
    }

    //平台管理
    public interface Platform {
        String PARAM_CODE_IS_ILEGAL = "010001";//传递的code格式有误
        String PLAT_HAS_INST = "010002";//平台下面有对应的仪器
        String PLAT_NAME_IS_EXSIST = "010003";//平台名称重复
    }

    //邮件管理
    public interface Email {
        String SEND_EMAIL_ERROR = "011001";//邮件发送失败
    }

}
