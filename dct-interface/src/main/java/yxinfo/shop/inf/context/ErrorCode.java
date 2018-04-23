package yxinfo.shop.inf.context;

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
    // 拒绝访问
    String REFUSE_ACCESS = "000016";
    // 没有数据
    String NO_DATA = "000017";
    // 系统异常
    String U_CENTRE_ERROR = "000900";
    // 系统异常
    String SYS_ERROR = "0009999";

    // 商户模块（ 002 ）
    public interface Merchant {
        //商户关联成员已存在
        String CHECK_MERMEMBER_ERROR = "002001";
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
        //添加购物车失败
        String MEMBER_CART_ADD_ERROR = "003007";
        //添加收货地址失败
        String MEMBER_CNEE_ADD_ERROR = "003008";
        //用户名或密码填写错误
        String LOGINNAME_OR_PWD_ERROR = "003009";
        //移入我的收藏失败
        String MOVE_TO_FAVORITE_ERROR = "003010";
        //删除购物车失败
        String MEMBER_CART_DELETE_ERROR = "003011";
        //修改收货地址失败
        String MEMBER_CNEE_UPDATE_ERROR = "003012";
        //删除收货地址失败
        String MEMBER_CNEE_DELETE_ERROR = "003013";
        //用户发票添加失败
        String MEMBER_INV_ADD_ERROR = "003014";
        //用户发票修改失败
        String MEMBER_INV_UPDATE_ERROR = "003015";
        //查看用户购物车失败
        String MEMBER_CART_GETLIST_ERROR = "003016";
        //插入用户经费卡失败
        String MEMBERFUNDSCARD_INSERT_ERROR = "003017";
        //删除用户经费卡失败
        String MEMBERFUNDSCARD_DELETE_ERROR = "003018";
        //插入经费卡负责人失败
        String MEMBERFUNDSPERSON_INSERT_ERROR = "003019";
        //修改经费卡负责人失败
        String MEMBERFUNDSPERSON_UPDATE_ERROR = "003020";
        //用户id不能为空
        String MEMBER_ID_NOT_NULL = "003021";
        //删除收藏失败
        String MEMBER_FAVORITE_DELETE_ERROR = "003022";
        //修改购物车商品数量失败
        String MEMBERCART_UPDATENUM_ERROR = "003023";
        //设为默认地址失败
        String MEMBERCNEE_SET_DEFAULT_ERROR = "003024";
        //用户认证失败
        String MEMBER_AUTH_ERROR = "003025";
        //原密码不正确
        String OLD_PWD_IS_ERROR = "003026";
        //请先验证手机验证码
        String USER_REGISTER_MUST_VCODE = "003027";
        //禁止登录的用户
        String USER_IS_DEL = "003028";
        //不允许登录的使用方
        String LOGIN_PARTY_NOT_ALLOW = "003029";
        //浙江中医药大学绑定手机时验证加密信息不通过
        String ZCMU_BIND_MOBILE_CK_VERIFY_ERR = "003030";
        //您尚未录入资料
        String ZCMU_BIND_MOBILE_NOT_INPUT = "003031";
        //加入购物车的数量不能大于库存
        String ADD_TO_CART_MORE_THAN_STOCK = "003032";
        //购物车已满
        String CART_NUM_LIMIT = "003033";
        //您所在的单位未开通采购商城功能
        String ORG_NOT_PARTY = "003034";
        //用户不存在
        String MEMBER_NOT_EXIST = "003035";
    }

    //商品模块(004)
    public interface Goods {

        String UPDATE_GOODSCORE_ERROR = "004001";//更新商品信息出错
        String GET_PARAM_PARTYID_ERROR = "004002";//partyId不可为空
        String GET_MERCOREDTO_ERROR = "004003";//查询商户信息失败

        String ADD_GOODSCORE_ISNULL_ERROR = "004004";//商品规格列表不可为空
        String GET_PARAM_MERID_ERROR = "004005";//商户id不可为空
        String GOODS_ISSHELVE_ERROR = "004006";//该商品未下架
        String GET_AREADTO_ERROR = "004007";//获取始发地失败
        String TRANS_GOODSDATE_ERROR = "004008";//传递数据有误
        String GOODSSTOCK_THANZERO_ERROR = "004009";//库存不足
        String UPDATE_GOODSSORT_PARAM_ERROR = "004010";//参数传递有误
        String ADD_MERBIZSCOPE_NULL_ERROR = "004011";//无该商品的上传资质
        String ADD_GOODSIDX_NOTCATID_ERROR = "004012";//非该合作方的合作分类不可上架
        String GET_CHEMCHEMICAL_ERROR = "004013";//获取化学品详细信息出错
        String UPDATE_WITHOUT_CATID = "004014";//商品分类不可修改
        String ADD_MERFSTATUS_ERROR = "004015"; //商户未启用
        String APV_GOODS_ERROR = "004016"; //未查询到该商品
    }

    // 订单模块（005）
    public interface Order {
        //用户不属于使用方
        String MBR_NOT_BELONG_TO_PARTY = "005001";
        //用户不存在
        String MEMBER_NOT_EXIST = "005002";
        //经费负责人不存在
        String FUNDS_PERSON_NOT_EXIST = "005003";
        //无法识别的支付渠道类型
        String TRAN_CHANNEL_TYPE_ILLEGAL = "005004";
        //无法识别的支付渠道
        String TRAN_CHANNEL_ID_ILLEGAL = "005005";
        //购买数量不能为0
        String PLACE_GOODS_NUM_ZERO = "005006";
        //下单的商品已被修改
        String PLACE_GOODS_BE_MODIFIED = "005007";
        //不允许购买的商品(匹配不到审核流程)
        String PLACE_GOODS_REFUSE = "005008";
        //购买的商品已下架
        String PLACE_GOODS_IS_NOT_SHELVE = "005009";
        //批量支付订单的支付渠道不一致
        String PAYMENT_CHL_NOT_CONSISTENT = "005010";
        //商户未开通此支付渠道
        String TRAN_CHANNEL_MER_NOT_ALLOW = "005011";
        //支付请求的订单全部无效
        String TRAN_ORDER_ALL_INVALID = "005012";
        //提交审核的订单全部无效
        String APV_ORDER_ALL_INVALID = "005013";
        //不能提交审核的订单
        String APV_ORDER_REFUSE = "005014";
        //您的经费支付未报销订单数将超过{0}单的限制, 请先报销后再下单购买, 谢谢!
        String FUNDS_PAY_ON_PUR_TOO_MUCH = "005015";
        //下单的商品已卖完
        String PLACE_GOODS_NO_STOCK = "005016";
        //提交订单审核失败
        String SUBMIT_APV_ORDER_FAIL = "005017";
        //选择的支付渠道必须是线下支付类型
        String NOT_OFFLINE_TRAN_CHL = "005018";
        //必须是待审核的订单
        String ORDER_MUST_BE_WAIT_APV = "005019";
        //只能操作自己的订单
        String ORDER_MUST_BE_OWN = "005020";
        //订单审核信息不全
        String ORDER_NO_APV_MSG = "005021";
        //必须是线上支付订单
        String NOT_ONLINE_TRAN_CHL_ORDER = "005022";
        //订单已支付
        String ORDER_HAS_PAY = "005023";
        //审核订单失败
        String APV_ORDER_FAIL = "005024";
        //订单对应的审核记录不存在
        String APV_RECODE_NOT_EXIST = "005025";
        //审核订单不存在
        String APV_ORDER_NOT_EXIST = "005026";
        //订单审核extraMsg解析异常
        String APV_EXTRAMSG_PARSE_ERROR = "005027";
        //请使用自己的发票信息
        String ORDER_INV_NOT_OWN = "005028";
        //请使用自己的收货信息
        String ORDER_CNEE_NOT_OWN = "005029";
        //订单审核信息不存在
        String ORDER_APV_NOT_EXIST = "005030";
        //订单不存在
        String ORDER_NOT_EXIST = "005031";
        //使用方不存在
        String PARTY_NOT_EXIST = "005032";
        //不能取消的订单
        String CAN_NOT_CANCEL_ORDER = "005033";
        //商户不存在
        String MER_NOT_EXIST = "005034";
        //不能发货的订单
        String CAN_NOT_DELIVER_GOODS = "005035";
        //不能确认收货的订单
        String CAN_NOT_CONFIRM_RECEIPT = "005036";
        //已分配准购批号
        String HAS_ALLOW_CERT = "005037";
        //没有待分配准购批号的订单
        String NO_WAIT_ALLOW_CERT_ORDER = "005038";
        //不是线下支付订单
        String NOT_OFFLINE_PAY = "005039";
        //不能确认收款的订单
        String CAN_NOT_CONFIRM_RECEIPT_MONEY = "005040";
        //只有种类、纯度、单位及商家相同的订单才能合并
        String ONLY_SAME_KIND_CAN_ALLOW_CERT = "005041";
        //准购证量超限
        String ALLOW_CERT_CAPACITY_LMT = "005042";
        //认证后才可购买
        String PLACE_ORDER_MUST_AUTH = "005043";
        //选择的支付渠道必须是在线支付类型
        String NOT_ONLINE_TRAN_CHL = "005044";
        //不能购买自己的商品
        String CAN_NOT_PLACE_MY_GOODS = "005045";
        //经费卡支付金额与订单总金额不符
        String FUNDS_PAY_AMT_NOT_MEET = "005046";
        //没有待报销的订单
        String NO_ORDER_WAIT_EXPE = "005047";
        //报销订单失败
        String EXPE_ORDER_FAIL = "005048";
        //撤销报销单失败
        String REVOKE_EXPE_ORDER_FAIL = "005049";
        //请使用自己的经费卡
        String FUNDS_CARD_NOT_BELONG = "005050";
        //无法撤销订单审核
        String CAN_NOT_REVOKE_ORDER_APV = "005051";
        //经费卡余额不足
        String FUNDS_NO_BAL = "005052";
        //下单金额超过{0}元的限制
        String PARTY_PLACE_ORDER_SINGLE_AMT_LIMIT = "005053";
        //报销后才能确认收款
        String CAN_NOT_CONFIRM_RECEIPT_MONEY_EXPE = "005054";
        //经费卡余额不足
        String FUNDS_BAL_NOT_ENOUGH = "005055";
        //商户已确认收款，报销单无法撤销
        String CAN_NOT_REVOKE_EXPENSE_BY_PAY = "005056";
    }

    // 评论模块（006）
    public interface Cmnt {
        //只能评价自己的订单
        String CMNT_MUST_BE_OWN = "006001";
        //订单已评价
        String ORDER_HAS_CMNT = "006002";
    }

    // 询价模块（007）
    public interface Eqry {
        //必须是选择报价中的询价单才能选择报价
        String CHOOSE_MUST_ON_CHOOSE = "007001";
        //当前选择报价在审核中或已询价成功, 无法选择报价
        String CHOOSE_ON_APV_OR_HAS_SUCESS = "007002";
        //您已报价
        String HAS_OFFER = "007003";
        //报价已结束
        String OFFER_HAS_END = "007004";
        //询价单已关闭
        String OFFER_HAS_CLOSE = "007005";
        //询价的商品在售
        String EQRY_GOODS_IN_SALE = "007006";
        //无法撤销询价审核
        String CAN_NOT_REVOKE_EQRY_APV = "007007";
    }

    public interface Stock{
        //二维码不能为空
        String RFID_CODES_NOT_NULL ="010001";
        //获取组织数据异常
        String ORG_NOT_NULL = "010002";
        //容量不能为空
        String CAPACITY_NOT_NULL = "010003";
        //商品已经被领用
        String STOCK_ISUSED = "010004";
        //查询不到商品
        String STOCK_NOT_FOUND = "010005";
        //已领用无法修改
        String STOCK_ISUSED_BACK_ERROR ="010006";
        //单位无法匹配
        String UNIT_NOT_FOUND = "010007";
        //商品数据异常
        String GOODS_ERROR = "010008";
        //获取纯度数据异常
        String PURITY_NOT_NULL ="010009";
        //订单数据异常
        String ORDER_NOT_NULL ="010010";
        //二维码已经被使用
        String RFID_CODE_ISUSED ="010011";
    }
}
