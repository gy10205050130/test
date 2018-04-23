package yxinfo.lis.inf.mapper;

/**
 * Created by hanley on 2016/6/16.
 */
public interface RouteCode {

    // 订单模块（100）
    public interface Order {
        // 下单
        String ADD_ORDER = "100001";
        // 我的预约
        String MY_ORDER = "100002";
        // 我的审核
        String MY_APV = "100003";
        // 更新预约订单详情
        String UPDATE_ORDER = "100004";
        // 删除订单
        String DELETE_ORDER = "100005";
        // 通过订单id查询订单的详情
        String SEARCH_ORDER_BYID = "100006";
        // 取消预约
        String CANCEL_ORDER = "100007";
        // 通过审核
        String MARLBORO_ORDER = "100008";
        // 未通过审核
        String FAIL_ORDER = "100009";
        // 完成订单
        String FINISH_ORDER = "100010";
        // 通过订单状态来分页获取我的预约
        String GET_MYORDER_BYID = "100011";
        // 通过订单状态来查询我的审核
        String GET_MYAPV_BYID = "100012";
        // 订单评价
        String JUDGE_ORDER = "100013";
        // 获取评价标签
        String GET_JUDGE_TAG = "100014";
        // 获取审核通过的时间段
        String GET_PASS_TIME = "100015";
        // 最新预约订单
        String NEW_ORDER = "100016";
        // 通过订单id获取评价
        String GET_JUDGE_BYID = "100017";
        // 通过订单编号来获取订单详情
        String GET_ORDER_BYORDERNO = "100018";
        // 完成支付
        String FINISH_PAY = "100019";
        // 获取仪器的评价信息
        String GET_JUDGEINFO = "100020";
        // 退款订单中
        String REFUND_ORDER = "100021";
        // 退款成功
        String REFUND_SUCCESS = "100022";

    }

    //仪器模块（102）
    public interface Instrument {

        //获取仪器信息
        String GET_INSTRUMENT_LIST = "102001";
        //删除仪器
        String DELETE_INSTRUMENT = "102002";
        //通过关键字来搜索仪器
        String SEARCH_INSTRUMENT_BYKEYWORD = "102003";
        //发布仪器详情
        String SAVE_INSTRUMENT = "102004";
        //修改仪器
        String UPDATE_INSTRUMENT = "102005";
        //上传仪器图片
        String UPLOAD_INSTPIC = "102006";
        //删除仪器图片
        String DELETE_INSTPIC = "102007";
        //编辑仪器图片
        String UPADTE_INSTPIC = "102008";
        //通过仪器id和图片静态资源id来搜索图片
        String SEARCH_INSTOIC = "102009";
        //查询服务领域
        String SEARCH_SERVICE_AREA = "102010";
        //院系数据字典
        String SEARCH_DEPARTMENT_DIC = "102011";
        //部门数据字典
        String SEARCH_SECTOR_DIC = "102012";
        //根据id获取仪器信息
        String GET_INSTRUMENT_BYID = "102013";
        //获取仪器信息(无登录)
        String GET_INSTRUMENT_LIST_NOLOGIN = "102014";
        //通过关键字来搜索仪器
        String SEARCH_INSTRUMENT_BYKEYWORD_NOLOGIN = "102015";
        //根据id获取仪器信息(无登录)
        String GET_INSTRUMENT_BYID_NOLOGIN = "102016";
        //根据订单编号查询设备绑定信息
        String GET_INSTBINDLE_LIST = "102017";
        //绑定设备Mac地址
        String BINDLE_INSTMAC = "102018";
        //开启设备
        String START_INST = "102019";
        //结束设备
        String END_INST = "102020";
        //收藏和取消仪器
        String COLLECTION_INST = "102021";
        //获取仪器列表
        String GET_COLLECTION_INST = "102022";
        //添加仪器收费规则
        String INST_CHARGE_RULE = "102023";
        //查询独立资格上机人员
        String GET_INSTINDEPENDENT_USER = "102025";
        //获取仪器列表
        String GET_INSTLIST = "102026";
        //通过平台id来获取仪器列表
        String GET_INSTLIST_BYGROUPID = "102027";
        //获取独立资格人信息
        String GET_INSTUSER = "102028";
        //删除独立资格人
        String DELETE_INSTUSER = "102029";
        //添加独立资格人
        String ADD_INSTUSER = "102030";
        //删除绑定设备
        String DELETE_INST = "102031";
        //编辑绑定设备
        String UPDATE_INST = "102032";
        //通过partyId来获取仪器列表
        String GET_INSTLIST_BYPARTYID = "102033";
        //通过mbrId来获取仪器列表
        String GET_INSTLIST_BYMBRID = "102034";
        //通过条件获取仪器列表
        String GET_INSTLIST_BYCONDITION = "102035";
        //查询实验室信息查询
        String GET_LABINFO = "102036";
        //根据id获取仪器详情
        String GET_INSTDTOINFO = "102037";
        //新增电源控制器信息
        String ADD_POWER_CONTROLLER_LIST = "102038";
        //获取实验室监控数据
        String LAB_INFP_LIST = "102039";

    }


    // 用户模块（103）
    public interface Member {
        // 校验用户名是否已注册
        String LGNAME_HAS_REG = "103001";
        // 添加用户
        String ADD = "103002";
        // 用户注册
        String REGISTER = "103003";
        // 获取用户信息
        String GET = "103004";
        // 用户登录
        String LOGIN = "103005";
        // 修改用户密码
        String UPDATE_PWD = "103006";
        // 删除用户
        String DELETE = "103007";
        // 修改用户信息
        String UPDATE = "103008";
        // 根据用户名字获取用户列表
        String GET_BY_REALNAME = "103009";
        // 分页查询用户信息列表
        String PAGE_MEMBERCORELIST = "103010";
        // 更新手机号（登录名）
        String UPDATE_MOBILE = "103029";
        // 用户认证
        String MEMBER_AUTH = "103030";
        // 获取用户认证信息
        String GET_MEMBER_AUTH = "103031";
        //获取组织（有父子节点）
        String GET_GROUPS_WITH_CHILD = "103032";
        //修改用户的角色信息
        String UPDATE_MEMBER_ROLE = "103033";
        //获取角色集合
        String GET_ROLE_LIST = "103034";
        //添加单位预付款分配记录
        String ADD_ADVANCE_CHARGE_INFO = "103035";
        //获取预付款记录
        String GET_ADVANCE_CHARGE_PAGE_LIST = "103036";

    }

    //商品模块(104000)
    public interface Goods {

        String GET_GOODSCAT_LIST = "104001";//获取商品类目（接入方）
        String GET_GOODSAPVCAT = "104002";//获取审核类目dto
        String GET_GOODSCAT_MER_LIST = "104003";//商户获取商品类目
        String GET_GOODSBRAND_LIST = "104004";//获取品牌集合
        String GET_GOODSCAT_BY_KEY = "104005";//主键获取分类信息
        String GET_GOODSCATPROP_LIST = "104006";//根据id获取分类扩展属性
        String GET_GOODSPROPVAL_LIST = "104007";//获取属性的下拉值
        String GET_GOODSCAT_NORELATION_LIST = "104008";//获取采购目录集合（没有父子关系,根据id查询时获取该分类下的所有分类， 不包含自身）

        String ADD_UPDATE_GOODS = "104009";//添加或更新商品
        String GET_GOODSSPECEX_MER_LIST = "104010";//获取商品一览信息（商家一览商品信息, 商家浏览自己的商品，平铺数据，后台查询）
        String GET_GOODS_BY_KEY = "104011";//根据商品id获取商品
        String GET_GOODS_IDX_LIST = "104012";//分页获取商品列表（根据分类查询，页面展示不是平铺，查询索引表）
        String GET_GOODSSPECEX_IDX_LIST = "104013";// 条件查询商品信息（页面展示为平铺，查询索引表）
        String GET_GOODSCORE_MER_LIST = "104014";//分页获取商品列表（根据分类查询，页面展示不是平铺，查询商品基础表）
        String GET_GOODSSPECEX_BY_KEY = "104015";//根据商品id获取单条商品
        String DELETE_GOODS = "104016";//删除商品
        String SHELVE_GOODS = "104017";//下架商品
        String GET_GOODSSPECEX_MER2_LIST = "104018";//获取商品一览信息（商家一览商品信息, 商家浏览自己的商品，平铺数据， 商城查询）
        String UPDATE_MER_GOODS_SORT = "104019";//置顶商品
        String GET_GOODSCAT_NOCHILD_LIST = "104020";//获取所有的最小级节点的分类
        String GET_MER_GOODSCAT_LIST = "104021";//获取所有的最小级节点的分类

    }

    // 支付模块（105）
    public interface Tran {
        // 获取使用方支付渠道
        String GET_TRAN_CHANNEL_PARTY = "105001";
    }

    //单位模块（106）
    public interface Party {
        // 按名称搜索单位
        String GET_PARTY_LIST_BY_NAME = "106001";
        // 按id搜索单位
        String GET_PARTY_LIST_BY_ID = "106002";
        // 按用户搜索单位
        String GET_PARTY_LIST_BY_MemberCore = "106003";
        // 保存单位信息
        String SAVE_PARTY = "106004";
        //根据id获取单位（未登录）
        String GET_PARTY_BY_KEY = "106005";
        //获取单位集合
        String GET_PARTY_LIST = "106006";
    }

    //新闻模块(107)
    public interface LisNews {

        // 发布新闻
        String ADD_NEWS = "107001";
        // 分页查询新闻
        String SEARCH_NEWS = "107002";
        // 删除新闻
        String DELETE_NEWS = "107003";
        // 更新新闻
        String UPDATE_NEWS = "107004";
        // 新闻点击量
        String NEWS_HITS = "107005";

    }

    //课题
    public interface Topic {
        //新增/更新课题
        String ADD_UPDATE_TOPIC = "108001";
        //新增课题成员
        String ADD_TOPIC_MEMBER = "108002";
        //获取课题集合
        String GET_LISTOPIC_LIST = "108003";
        //获取课题下所有成员（包含子课题）
        String GET_LISTOPIC_ALL_MEMBER = "108004";
        //删除课题成员
        String DELETE_TOPIC_MEMBER = "108005";
        //删除课题
        String DELETE_TOPIC = "108006";
        //根据pid获取课题
        String GET_CHILD_TOPIC_LIST = "108007";
        //获取此课题下成员
        String GET_TOPIC_MEMBER_LIST = "108008";
        //根据成员id获取课题
        String GET_TOPIC_BY_MEMBERID = "108009";
        //分页获取课题信息
        String GET_TOPIC_LIST_PAGE = "108010";
        //分页获取课题成员信息
        String GET_TOPIC_MEMBER_LIST_PAGE = "108011";
        //分页获取代金券信息
        String GET_PAGE_CASHCOUPON_LIST = "108012";
        //新增代金券
        String ADD_CASH_COUPON = "108013";
        //更新代金券
        String UPDATE_CASH_COUPON = "108014";
        //根据id获取代金券
        String GET_CASH_COUPON_BYKEY = "108015";
        //支付时模糊检索课题
        String GET_TOPIC_LIST_ON_PAY = "108016";
        //dct服务中获取课题
        String GET_TOPIC_FROM_DCT = "108017";

    }

    //支付
    public interface Payment {

        //支付宝支付时获取签名
        String GET_SIGN_FOR_ALIPAY = "109001";
        //获取用户的支付方式
        String GET_MEMBER_PAY_TYPE = "109002";
        //代金券支付
        String PAY_BY_MEMBER_VOUCHER = "109003";
        //经费卡支付
        String PAY_BY_FUNDS_CARD = "109004";
        //退款
        String REFUND_APPOINT_ORDER = "109005";
        //获取消费一览信息
        String GET_ORDER_CONSUME_LIST = "109006";
        //获取退款的dto
        String GET_REFUND_ORDER_INFO = "109007";
        //手机支付中获取支付宝请求dto
        String PAY_BY_ALIPAY_FOR_APP = "109008";
        //导出消费记录
        String DOWNLOAD_ORDERCONSUME_LIST = "109010";
        //通过预付款支付
        String PAY_BY_IMPREST_MONEY = "109011";
    }

    //平台管理
    public interface Platform {
        //获取平台list
        String GET_PAGE_PLATFORM_LIST = "110001";
        //新增平台信息
        String ADD_PLATFORM_INFO = "110002";
        //更新平台信息
        String UPDATE_PLATFORM_INFO = "110003";
        //删除平台信息
        String DELETE_PLATFORM_INFO = "110004";
        //根据id获取平台信息
        String GET_PLATFORM_BY_KEY = "110005";
    }

    //基础工具
    public interface BaseMethod {
        //获取仪器分类信息
        String GET_INST_CLASSI_LIST = "111001";
        //获取学科领域
        String GET_PAGE_SCIENCE_FIELD = "111002";
        //获取仪器分类信息（包含下一分类）
        String GET_INST_CLASSI_CHILD_LIST = "111003";
        //获取国家集合
        String GET_COUNTRY_LIST = "111004";
    }

    //仪器使用汇总
    public interface Summary {
        //获取仪器使用一览
        String GET_PAGE_INSTUSESUMMARY_LIST = "112001";
        //首页中获取仪器使用信息（按月份）
        String GET_HOME_PAGE_INST_USESUMMARY = "112002";
        //获取仪器的使用排行
        String GET_PAGE_SORT_USESUMMARY_LIST = "112003";
    }

    //邮件管理
    public interface Email {
        //给平台发送邮件
        String SEND_EMAIL_TO_PLAT = "113001";
    }

    //追溯地图
    public interface TraceMap {
        //获取单位预警及化学品信息
        String GET_PARTYS_WARN_INFO = "114001";
    }
}

