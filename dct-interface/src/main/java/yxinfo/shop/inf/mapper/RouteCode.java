package yxinfo.shop.inf.mapper;

/**
 * Created by hanley on 2016/6/16.
 */
public interface RouteCode {

    // 订单模块（100）
    public interface Order {
        // 下单
        String PLACE_ORDER = "100001";
        // 支付线上购买订单
        String ORDER_TRAN_ONLINE = "100002";
        // 提交订单审核
        String SUBMIT_APV = "100003";
        // 下单并提交审核
        String PLACE_ORDER_SUBMIT_APV = "100004";
        // 审核订单
        String APV_ORDER = "100005";
        // 我的订单列表
        String MY_ORDER_PAGE = "100006";
        // 我的订单详情
        String MY_ORDER_DETAIL = "100007";
        // 待审核订单列表
        String WAIT_APV_ORDER = "100008";
        // 已审核订单列表
        String HAS_APV_ORDER = "100009";
        // 取消订单
        String CANCEL_ORDER = "100010";
        // 商户订单列表
        String MER_ORDER_PAGE = "100011";
        // 商户订单详情
        String MER_ORDER_DETAIL = "100012";
        // 发货
        String DELIVER_GOODS = "100013";
        // 确认收货
        String CONFIRM_RECEIPT = "100014";
        // 获取待上传准购证明细
        String WAIT_ALLOW_CERT = "100015";
        // 分配准购批号
        String HANDLE_WAIT_ALLOW_CERT = "100016";
        // 分页查询准购批次
        String GET_ORDER_ALLOW_CERT_PAGE = "100017";
        // 上传准购证
        String UPLOAD_ORDER_ALLOW_CERT = "100018";
        // 分页查询待报销经费支付订单
        String GET_WAIT_EXPENSE_ORDER_PAGE = "100019";
        // 报销经费支付订单
        String EXPENSE_ORDER = "100020";
        // 审核订单详情
        String APV_ORDER_DETAIL = "100021";
        // 线下支付确认收款
        String OFFLINE_CONFIRM_RECEIPT_MONEY = "100022";
        // 商户订单统计
        String MER_ORDER_STATS = "100023";
        // 查询化学品
        String CHEM_SEARCH_CHEM = "100024";
        // 待入库列表
        String WAIT_INTOWH_PAGE = "100025";
        // 已入库列表
        String HAS_INTOWH_PAGE = "100026";
        // 商户订单总金额
        String MER_ORDER_SUM_PRICE = "100027";
        // 待报销经费支付订单总实付金额
        String WAIT_EXPENSE_ORDER_SUM_PRICE = "100028";
        // 已报销订单列表
        String HAS_EXPENSE_ORDER_PAGE = "100029";
        // 报销单详情
        String EXPENSE_DETAIL = "100030";
        // 报销单订单明细
        String EXPENSE_ORDERS = "100031";
        // 撤销报销单
        String REVOKE_EXPENSE_ORDERS = "100032";
        // 撤销订单审核
        String REVOKE_ORDER_APV = "100033";
        // 记录签名
        String MARK_SIGN = "100034";
        // 获取签名
        String GET_SIGN = "100035";
        // 检查是否可签名
        String CK_CAN_SIGN = "100036";
        // 下单前检查
        String CHECK_PLACE_ORDER = "100037";
        // 超级管理员订单列表
        String ADMIN_ORDER_PAGE = "100038";
        // 超级管理员订单详情
        String ADMIN_ORDER_DETAIL = "100039";
        // 使用方管理员订单列表
        String PARTY_ORDER_PAGE = "100040";
        // 使用方管理员订单详情
        String PARTY_ORDER_DETAIL = "100041";
        // 超级管理员订单统计
        String ADMIN_ORDER_STATS = "100042";
        // 使用方管理员订单统计
        String PARTY_ORDER_STATS = "100043";
        // 元欣追溯TV版交易总览
        String TRAN_DCT_TV_SUMMARY = "100044";
    }

    public interface Merchant {
        //验证商户名称是否存在
        String CHECK_MERCORE_FNAME = "102001";
        //获取首页合作商家
        String GET_MERPARTY_LIST = "102002";
        //获取首页热门商家
        String GET_MERCORE_LIST = "102003";
        //获取合作商家
        String GET_MERGOODSCAT_LIST = "102004";
        //保存商家认证资料
        String SAVE_MERMATERIAL = "102005";
        //供应商详情
        String GET_MERCOREDET_FORMANAGER = "102006";
        //供应商审核
        String CHECK_MERCORE_DET = "102007";
        //修改商家认证资料
        String UPDATE_MERMATERIAL = "102008";
        //商户搜索
        String SEARCH_MERCORE = "102009";
        //全部供应商
        String GET_MERCORE_DET_LIST = "102010";
        //获取供应商支付渠道
        String GET_TRANCHANNERL_LIST = "102011";
        //根据商户id获取商户仓库
        String GET_WAREHOUSE_LIST = "102012";
        //根据成员id获取商户
        String GET_MERCORE_BYMEMBERID = "102013";
        //根据商户id获取商户认证资料
        String GET_MERREGISTER = "102014";
        //保存或修改商户仓库
        String SAVEORUPDATE_WAREHOUSE = "102015";
        //供应商部分详情
        String GET_MERCORE_DET_FORMERHOME = "102016";
        //获取指定供应商
        String GET_MERCORE_FORMANAGER = "102017";
        //供应商审核不通过
        String CHECK_MERCORE_DISAGREE = "102018";
        //供应商审核不通过
        String CHECK_MERCOREDISAGREE_FORADMIN = "102019";
        //供应商审核
        String CHECK_MERCOREDET_FORADMIN = "102020";
        //供应商详情
        String GET_MERCOREDET_FORADMIN = "102021";
    }

    // 用户模块（103）
    public interface Member {
        // 校验用户名是否已注册
        String LGNAME_HAS_REG = "103001";
        // 用户注册
        String REGISTER = "103002";
        // 更新用户
        String UPDATE = "103003";
        // 获取用户信息
        String GET = "103004";
        // 用户登录
        String LOGIN = "103005";
        // 修改用户密码
        String UPDATE_PWD = "103006";
        // 加入购物车
        String CART_ADD = "103007";
        // 购物车列表
        String CART_LIST = "103008";
        // 购物车中商品移到收藏
        String CART_MOVE_TO_FAVORITE = "103009";
        // 从购物车移除
        String CART_DELETE = "103010";
        // 添加收货地址
        String CNEE_ADD = "103011";
        // 添加收货更新
        String CNEE_UPDATE = "103012";
        // 删除收货地址
        String CNEE_DELETE = "103013";
        // 添加发票
        String INV_ADD = "103014";
        // 编辑用户发票
        String INV_UPDATE = "103015";
        // 用户发票列表
        String MEMBER_INV_LIST = "103016";
        // 用户收货地址
        String MEMBER_CNEE_LIST = "103017";
        // 获取购物车商品数量
        String CART_COUNT = "103018";
        // 添加收藏
        String FAVORITE_INSERT = "103019";
        // 删除用户收藏
        String FAVORITE_DELETE = "103020";
        // 分页查询用户收藏
        String FAVORITE_PAGE_LIST = "103021";
        // 更新购物车数量
        String CART_UPDATE_NUM = "103022";
        // 根据id列表删除购物车
        String CART_DELETE_LIST = "103023";
        // 移动购物车商品到收藏
        String CART_MOVE_TO_FAVORITE_LIST = "103024";
        // 按卡号获取经费负责人
        String GET_FUNDSPERSON_BY_CARDNO = "103025";
        // 获取用户订单显示信息
        String MEMBER_ORDER_INFO = "103026";
        // 设置默认收货地址
        String CNEE_SET_DEFAULT = "103027";
        // 根据用户名字获取用户列表
        String GET_BY_REALNAME = "103028";
        // 更新手机号（登录名）
        String UPDATE_MOBILE = "103029";
        // 用户认证
        String MEMBER_AUTH = "103030";
        // 获取用户认证信息
        String GET_MEMBER_AUTH = "103031";
        // 商户注册
        String MER_REGISTER = "103032";
        // 浙江中医药大学免密登录
        String ZCMU_NP_LOGIN = "103033";
        // 更新AccessToken
        String UPDATE_ACCESS_TOK = "103034";
        // 浙江中医药大学绑定手机发送验证码
        String ZCMU_SEND_VCODE_BIND_MOBILE = "103035";
        // 浙江中医药大学绑定手机
        String ZCMU_BIND_MOBILE = "103036";
        // 续期AccessToken
        String EXTEND_ACCESS_TOK = "103037";
        // 意见反馈
        String SUGGEST = "103038";
        // 根据U-Centre用户id自动注册
        String REGISTER_FROM_UCENTRE = "103039";
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
        String GET_MER_GOODSCAT_LIST = "104021";//获取商户添加商品时的分类
        String GET_MER_GOODSBRAND_LIST = "104022";//获取商户对应的品牌集合

        String GET_GOODSAPVLIST_FORADMIN = "104023"; //获取审核列表 admin后台待审核
        String GET_PENDING_GOODSAPVLIST_FOPARTY = "104024"; //获取审核列表 使用方后台待审核
        String GET_ALREADY_GOODSAPVLIST_FOPARTY = "104025"; //获取审核列表 使用方后台已审核
        String AGREE_GOODSAPV_FORADMIN = "104026"; //同意审核
        String AGREE_GOODSAPV_FOPARTY = "104027"; //同意审核
        String SHELVE_GOODS_FORADMIN = "104028"; //下架商品
        String SHELVE_GOODS_FORPARTY = "104029"; //下架商品
        String GET_GOODSAPV_FORADMIN = "104030"; //审核查看详情
        String GET_GOODSAPV_FORPARTY = "104031"; //审核查看详情

        String GET_HOTGOODS_FORAPP = "104032"; //获取热门商品
        String GET_HOTGOODSLIST_FOADMIN = "104033"; //获取热门商品列表
        String DELETE_HOTGOODS_FOADMIN = "104034"; //删除热门商品
        String ADD_HOTGOODS_FOADMIN = "104035"; //添加热门商品

        String GET_MERGOODSBRAND_LIST = "104036";//获取商户品牌集合

    }

    // 支付模块（105）
    public interface Tran {
        // 获取使用方支付渠道
        String GET_TRAN_CHANNEL_PARTY = "105001";
    }

    // 使用方模块（106）
    public interface Party {
        // 按名称搜索使用方
        String GET_PARTY_LIST_BY_NAME = "106001";
    }

    // 评价模块（107）
    public interface Cmnt {
        // 评价订单
        String CMNT_ORDER = "107001";
        // 评论时获取订单明细
        String GET_CMNT_ORDER_DETAIL = "107002";
        // 获取商品评论
        String GET_GOODS_CMNT = "107003";
        // 获取商户评分概况
        String GET_MER_CMNT_SUMMARY = "107004";
        // 商户评论列表
        String GET_CMNT_CTX_BY_MER = "107005";
        // 使用方差评列表
        String GET_BAD_CMNT_CTX_BY_PARTY = "107006";
        // 使用方获取评论详情
        String GET_CMNT_CTX_DETAIL_BY_PARTY = "107007";
        // 使用方删除评论
        String DEL_CMNT_CTX_DETAIL_BY_PARTY = "107008";
        // 获取商户首页评分概况
        String GET_MER_IDX_CMNT_SUMMARY = "107009";
        // 用户评论列表
        String GET_CMNT_CTX_BY_MEMBER = "107010";
    }

    // 询价模块（108）
    public interface Eqry {
        // 买家询价单列表
        String MY_EQRY_PAGE = "108001";
        // 提交询价单
        String SUBMIT_EQRY = "108002";
        // 审核询价单
        String APV_EQRY = "108003";
        // 使用方询价详情
        String EQRY_DETAIL_PARTY = "108004";
        // 商户询价单列表 - 进行中
        String MER_EQRY_PAGE_ON_MER_OFFER = "108005";
        // 商户询价单列表 - 历史
        String MER_EQRY_PAGE_HISTORY = "108006";
        // 商户询价单详情
        String MER_EQRY_DETAIL = "108007";
        // 买家询价单详情
        String MY_EQRY_DETAIL = "108008";
        // 买家商户出价列表
        String MY_EQRY_MER_OFFER_PAGE = "108009";
        // 使用方商户出价列表
        String PARTY_EQRY_MER_OFFER_PAGE = "108010";
        // 商户报价
        String MER_OFFER = "108011";
        // 选择商户报价
        String CHOOSE_MER_OFFER = "108012";
        // 审核选择的商户报价
        String APV_CHOOSE_OFFER = "108013";
        // 取消询价
        String CANCEL_EQRY = "108014";
        // 待审核报价选择列表
        String WAIT_APV_CHOOSE_OFFER = "108015";
        // 已审核报价选择列表
        String HAS_APV_CHOOSE_OFFER = "108016";
        // 商户询价单列表 - 我参与的
        String MER_EQRY_PAGE_INVOLVED = "108017";
        // 使用方询价单列表 - 线下处理（失败）
        String PARTY_EQRY_PAGE_FAIL = "108018";
        // 使用方询价单列表 - 被关闭的
        String PARTY_EQRY_PAGE_CLOSE = "108019";
        // 获取询价单基本信息及需求描述
        String GET_EQRY_WITH_DESC = "108020";
        // 撤销询价审核
        String REVOKE_EQRY_APV = "108021";
    }

    // 经费卡模块
    public interface funds {
        //根据经费卡号、项目负责人名称获取项目名称
        String GET_FUNDSLIST_BY_CARDANDNAME = "110001";
        //根据经费卡号、项目负责人名称获取项目名称
        String GET_FUNDSDTO_BY_CARDANDNAME = "110002";
        //根据卡号获取余额
        String GET_FUNDS_BY_CODE = "110003";
        //根据经费负责人、项目名称查询卡号
        String GET_FUNDSLIST_BY_MEMBERANDNAME = "110004";
        //根据经费负责人、卡号集合查询项目名称
        String GET_FUNDSLIST_BY_MEMBERANDCODELIST = "110005";
    }
}

