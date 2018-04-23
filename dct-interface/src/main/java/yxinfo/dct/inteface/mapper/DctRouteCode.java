package yxinfo.dct.inteface.mapper;

/**
 * Created by hanley on 2016/6/16.
 */
public interface DctRouteCode {

    /**
     * 试题
     */
    // 添加类目信息
    String ADD_CATEG = "103001";
    // 添加类目试题
    String ADD_CATEG_QUESTS = "103002";
    // 根据类目查询试题信息
    String GET_QUESTS_BY_CATEGID = "103003";
    // 获取类目集合
    String GET_CATEG_LIST = "103004";

    /**
     * 实验室
     */
    // 插入一条实验室记录
    String ADD_LAB = "104001";
    // 主键查询实验室记录
    String GET_LAB_BY_KEY = "104002";
    // 分页查询实验室记录
    String GET_PAGE_LABS = "104003";
    // 删除实验室记录
    String DELETE_LAB = "104004";
    // 查询实验室记录（所有）
    String GET_LABS = "104005";
    // 更新实验室记录
    String UPDATE_LAB = "104006";
    // 查询实验室负责人
    String GET_LAB_MANAGER = "104007";
    // 删除实验室负责人
    String DELETE_LABMANAGER_BY_KEY = "104008";
    // 导入实验室
    String IMPORT_LAB = "104009";
    // 导出实验室
    String EXPORT_LAB = "104010";

    /**
     * 课题日志
     */
    // 学生添加课题日志-存草稿
    String ADDTOPICLOG_DRAFT_FORSTUDENT = "105001";
    // 学生添加课题日志-提交
    String ADDTOPICLOG_SUBMITTED_FORSTUDENT = "105002";
    // 学生端修改课题日志-存草稿
    String UPDATETOPICLOG_DRAFT_FORSTUDENT = "105003";
    // 学生端修改课题日志-提交
    String UPDATETOPICLOG_SUBMITTED_FORSTUDENT = "105004";
    // 我的课题日志列表
    String GET_TOPICLOGLIST_FORSELF = "105005";
    // 学生的课题日志
    String GET_TOPICLOGLIST_FORSTUDENT = "105006";
    // 根据日志id查询详细信息
    String GET_TOPICLOG_BYKEY = "105007";
    // 老师添加课题日志-存草稿
    String ADDTOPICLOG_DRAFT_FORTEACHER = "105008";
    // 老师添加课题日志-提交
    String ADDTOPICLOG_SUBMITTED_FORTEACHER = "105009";
    // 老师端修改课题日志-存草稿
    String UPDATETOPICLOG_DRAFT_FORTEACHER = "105010";
    // 老师端修改课题日志-提交
    String UPDATETOPICLOG_SUBMITTED_FORTEACHER = "105011";
    // 老师端审阅
    String APV_TOPICLOG = "105012";

    /**
     * 仓库
     */
    // 添加仓库
    String ADD_WH = "106001";
    // 更新仓库
    String UPDATE_WH = "106002";
    // 删除仓库信息
    String DELETE_WH = "106003";
    // 查询仓库集合
    String GET_WH_LIST = "106004";
    // 分页查询仓库集合
    String GET_WH_PAGE_LIST = "106005";
    // 根据id获取仓库
    String GET_WH_BY_KEY = "106006";
    // 获取第一条仓库信息
    String GET_WH_ON_TOP = "106007";

    /**
     * 设备
     */
    // 添加设备
    String ADD_EQUIPMENT = "107001";
    // 删除设备
    String DELETE_EQUIPMENT = "107002";
    // 更新设备
    String MODIFY_EQUIPMENT = "107003";
    // 根据ID获取设备信息
    String GET_EQUIPMENT = "107004";
    // 分页查询设备信息
    String GET_EQUIPMENT_LIST = "107005";
    // 添加Rfid卡
    String ADD_RFID = "107006";
    // 删除Rfid卡
    String DELETE_RFID = "107007";
    // 更新Rfid卡
    String MODIFY_RFID = "107008";
    // 根据ID获取Rfid卡信息
    String GET_RFID = "107009";
    // 分页查询Rfid卡信息
    String GET_RFID_LIST = "107010";
    // 根据Fcode获取Rfid卡信息
    String GET_RFID_FCODE = "107011";

    /**
     * 化学试剂
     */
    // 搜索化学品
    String CHEM_SEARCH_CHEM = "108003";
    // 回收列表
    String CHEM_RECYCLE_LIST = "108009";
    // 获取单位列表
    String CHEM_UNIT_LIST = "108012";
    // 获取规格列表
    String CHEM_SPEC_LIST = "108013";
    // 入库
    String CHEM_ADD_REAGENT = "108014";
    // 试剂列表
    String CHEM_REAGENT_LIST = "108016";
    // 获取化学品详情
    String CHEM_GET_CHEM = "108018";
    // 试剂轨迹列表
    String CHEM_TRAJ_LIST = "108030";
    // 试剂轨迹列表（不分页）
    String CHEM_TRAJ_LIST_NO_PAGE = "108031";
    // 试剂列表导出
    String CHEM_REAGENT_LIST_EXPORT = "108032";
    // 获取试剂信息（根据ID）
    String CHEM_GET_REAGENT_BY_KEY = "108034";
    // 试剂轨迹
    String CHEM_ADD_TRAJ = "108035";
    // 试剂列表（领用预警）
    String CHEM_RECEIVE_IN_REAGENT_IDS = "108036";
    // 添加化学品
    String CHEM_CHEMICAL_ADD = "108039";
    // 修改化学品
    String CHEM_CATEGORY_EDIT = "108040";
    // 混放预警试剂列表
    String CHEM_REAGENT_LIST_FOR_MIX = "108041";
    // 根据ID获取试剂轨迹
    String CHEM_GET_TRAJ_KEY = "108042";
    // PDA入库
    String CHEM_ADD_REAGENT_PDA = "108043";
    // 入库记录
    String CHEM_GET_INTOWH_BATCH_PAGE = "108044";
    // 根据入库记录修改试剂
    String CHEM_EDIT_REAGENT_BY_BATCH = "108045";
    // 库存试剂列表
    String CHEM_STOCK_LIST = "108047";
    // 库存试剂归属明细
    String GET_BELONG_MBR_LIST = "108049";
    // 我的试剂列表
    String MY_REAGENT = "108050";
    // 我的试剂数量
    String MY_REAGENT_COUNT = "108051";
    // 根据二维码获取试剂信息或回收桶信息
    String CHEM_GET_REAGENT_OR_BUCKET_INFO = "108053";
    // 提醒回收危废
    String HW_REMIND_RECYC_BUCKET = "108054";
    // 获取危废回收者对应的产生者组织
    String HW_GET_RECYC_ORG_LIST = "108055";
    // 待回收危废列表
    String HW_GET_RECYC_WAIT_PAGE = "108056";
    // 根据RFID码获取回收桶信息
    String HW_GET_BUCKET_INFO_BY_RFCODE = "108057";
    // 废液回收
    String HW_RECYC_LIQUID = "108058";
    // 空瓶回收
    String HW_RECYC_BOTTLE = "108059";
    // 已回收列表（危废回收者）
    String HW_HAS_RECYC_LIST = "108060";
    // 已回收列表（危废产生者）
    String HW_HAS_RECYC_LIST_PRODUCER = "108061";
    // 危废回收统计（危废回收者）
    String HW_GET_STAT_YEAR = "108062";
    // 危废回收统计（危废产生者）
    String HW_GET_STAT_YEAR_PRODUCER = "108063";
    // 获取危废性质列表
    String HW_GET_NATURES = "108064";
    // 绑定废液桶
    String HW_ADD_BUCKET = "108065";
    // 获取废液桶列表
    String HW_GET_RECYC_BUCKET_PAGE = "108066";
    // 删除废液桶
    String HW_DELETE_RECYC_BUCKET = "108067";
    // 添加危化品目录
    String MSDS_ADD = "108069";
    // 获取危化品目录详情
    String MSDS_GET_BY_ID = "108070";
    // 编辑危化品目录
    String MSDS_EDIT = "108071";
    // 危化品目录列表
    String MSDS_PAGE = "108072";
    // TV展示总览
    String CHEM_TV_SUMMARY = "108076";
    // 已回收列表导出（危废回收者）
    String HW_HAS_RECYC_EXPORT = "108077";
    // 已回收列表导出（危废产生者）
    String HW_HAS_RECYC_EXPORT_PRODUCER = "108078";
    // 获取入库确认
    String GET_INTOWH_CONFIRM = "108100";
    // 入库确认
    String CONFIRM_INTOWH = "108101";
    // 可调配试剂
    String ALLOCATABLE_REAGENT = "108102";
    // 按瓶数申领时获取库存
    String GET_TOTAL_ON_APPLY_4_NUM = "108103";
    // 按瓶数申领时分配库存
    String ALLOT_ON_APPLY_4_NUM = "108104";
    // 按瓶申请领取
    String APPLY_4_NUM = "108105";
    // 领取申请详情
    String APPLY_CORE_DETAIL = "108106";
    // 领取申请详情（同行人确认）
    String APPLY_CORE_DETAIL_TOGETHER = "108107";
    // 审核领取申请
    String APPLY_APPROVE = "108108";
    // 领用
    String RECEIVE = "108109";
    // 领用时获取试剂信息
    String GET_REAGENT_INFO_RECEIVE = "108110";
    // 领取申请同行人确认
    String APPLY_TOGETHER_CFM = "108111";
    // 管理员待领用列表
    String MANAGER_APPLY_LIST = "108112";
    // 用户领取申请列表
    String MEMBER_APPLY_LIST = "108113";
    // 管理员已领用列表
    String MANAGER_RECEIVE_LIST = "108114";
    // 管理员已领用列表（按日归类）
    String MANAGER_RECEIVE_LIST_BY_DAY = "108115";
    // 管理员领用列表搜索
    String MANAGER_RECEIVE_LIST_SCH = "108116";
    // 管理员领用排行
    String MANAGER_RECEIVE_RANK = "108117";
    // 我的试剂搜索
    String MY_REAGENT_SCH = "108118";
    // 全局搜索
    String GLOBAL_SEARCH = "108119";
    // 试剂回收记录
    String GET_RECYCLE_REAGENT_PAGE = "108120";
    // 获取试剂信息
    String GET_REAGENT_INFO = "108121";
    // 试剂回收
    String CHEM_RECYCLE = "108122";
    // 试剂回库
    String CHEM_RECYCLE_BACK_WAREHOUSE = "108123";
    // 扫码确认入库
    String CONFIRM_INTOWH_BY_QR = "108124";
    // 商城待入库列表
    String WAIT_INTO_WH_FROM_SHOP_PAGE = "108125";
    // 库存试剂与耗材搜索
    String CHEM_SCH_STOCK_AND_SUP_SHELVES= "108126";
    // 商城入库
    String INTO_WH_FROM_SHOP = "108127";
    // 设置领用同行人
    String SET_MEMBER_SEC = "108128";
    // 同意设置领用同行人
    String AGREE_SET_MEMBER_SEC = "108129";
    // 热门搜索
    String HOT_SCH = "108130";
    // 按量申领时获取库存
    String GET_TOTAL_ON_APPLY_4_CAPACITY = "108131";
    // 按量申领时分配库存
    String ALLOT_ON_APPLY_4_CAPACITY = "108132";
    // 按量申请领取
    String APPLY_4_CAPACITY = "108133";
    // 报损时扫码获取试剂汇总信息
    String GET_REAGENT_INFO_DAMAGED = "108134";
    // 报损
    String REPORT_DAMAGED = "108135";
    // 报损记录列表
    String DAMAGED_PAGE = "108136";
    // 全局扫码获取信息
    String GLOBAL_GET_INFO_QR = "108137";
    // 试剂回收记录详情
    String GET_RECYCLE_DETAIL = "108138";
    // 试剂与试剂轨迹
    String CHEM_TRAJ_LIST_NO_PAGE_AND_REAGENT = "108139";

    // 获取库存的化学品规（企业）
    String CHEM_GET_SPEC_QY = "108023";
    // 回收列表（扩展搜索）
    String CHEM_RECYCLE_LIST_EX = "108020";
    // 仓管回收（回库）列表
    String CHEM_RECYCLE_ALL_LIST = "108026";


    /**
     * 项目
     */
    // 搜索项目列表
    String PRO_SEARCH_LIST = "120001";
    // 项目后台列表
    String PRO_BACKEND_LIST = "120002";
    // 添加项目
    String PRO_ADD = "120003";
    // 修改项目
    String PRO_UPDATE = "120004";
    // 获取本周的实验项目
    String PRO_WEEK_OF_PROJECT_PAGELIST = "120005";

    /**
     * 仪器
     */
    // 搜索仪器列表
    String INST_SEARCH_LIST = "130001";
    // 仪器预约列表
    String INSTBESPEAK_LIST = "130002";
    // 查看预约详情
    String INSTBESPEAK_DETAIL = "130003";
    // 提交仪器预约
    String INSTBESPEAK_ADD = "130004";
    // 修改仪器使用时间
    String INSTBESPEAK_UPDATE_USETIME = "130005";
    // 仪器预约审核
    String INSTBESPEAK_APPROVE = "130006";
    // 获取仪器预约列表(后台)
    String INSTBESPEAK_BACKEND_List = "130007";
    // 仪器后台列表
    String INST_BACKEND_LIST = "130008";
    // 添加仪器
    String INST_ADD = "130009";
    // 修改仪器
    String INST_UPDATE = "130010";
    // 添加仪器监控设备
    String INST_CTRL_EQU_INSERT = "130011";

    /**
     * 预警
     */
    // 新增预警规则
    String ADD_WARNRULE = "114001";
    // 获取预警规则列表
    String GET_WARNRULE_LIST = "114002";
    // 分页获取预警规则列表
    String GET_WARNRULE_PAGE_LIST = "114003";
    // 删除预警规则列表记录
    String DELETE_WARNRULE = "114004";
    // 新增预警记录
    String ADD_WARNRECORD= "114005";
    // 更新预警记录
    String UPDATE_WARNRECORD = "114006";
    // 查询预警记录
    String GET_WARNRECORDLIST = "114007";
    // 添加预警记录日志
    String ADD_WARNRECORDLOG = "114008";
    // 查询预警记录日志
    String GET_WARNRECORDLOGLIST = "114009";
    // 查看盘点预警详情
    String GET_WARN_CHECK_DETAIL = "114010";
    // 关闭或搁置预警信息
    String WARN_CLOSE_OR_DELAY = "114011";
    // app获取预警首页
    String WARN_SHOW_4_APP = "114013";
    // app获取预警信息列表
    String WARNRECORD_PAGE_4_APP = "114014";
    String WARNPERSON_ADD = "114015";
    String WARNPERSON_UPDATE = "114016";
    String WARNPERSON_DELETE = "114017";
    String WARNPERSON_PAGE_LIST = "114018";
    String WARN_ITEMNO_LIST = "114019";
    String WARN_ENVIRONMENT_PAGE_LIST = "114020";
    String WARNRULE_ENVIRONMENT_EDIT = "114021";
    String WARNRULE_ENVIRONMENT_PAGE_LIST = "114022";

    /**
     * 库存盘点
     */
    // 提交盘点结果
    String CHECK_SUBMIT = "115001";
    // 获取盘点试剂轨迹
    String CHECK_CHEM_TRAJ = "115002";

    /**
     * 视频监控
     */
    // 视频监控地址分页
    String GET_VMONPLACE_LIST = "116001";
    // 根据地址id获取监控设备
    String GET_VMONMONITOR_LIST = "116002";
    // 添加视频监控地址
    String ADD_PLACE = "116003";
    // 更新视频监控地址
    String UPDATE_PLACE = "116004";
    // 删除视频监控地址
    String DELETE_PLACE = "116005";
    // 添加监控设备
    String ADD_MONITOR = "116006";
    // 更新监控设备
    String UPDATE_MONITOR = "116007";
    // 删除监控设备
    String DELETE_MONITOR = "116008";
    // 监控设备分页
    String GET_MONITOR_LIST = "116009";
    // 根据地址id获取监控设备
    String GET_VMONMONITOR = "116010";

    /**
     * 智能中控器
     */
    // 实验室消息
    String CTRL_LAB_MSG_SHOW = "117001";
    // 仪器解绑
    String CTRL_INST_UNBUNDING = "117002";
    // 设备信息
    String CTRL_EQU_INST_SHOW = "117003";

    /**
     * 消息队列
     */
    // 在消息队列发布消息
    String MQ_PRODUCE = "118001";


    /**
     * 耗材模块
     */
    //获取库位列表
    String GET_SHELVES_PAGELIST = "121001";
    //添加库位
    String ADD_SHELVES = "121002";
    //删除库位
    String DELETE_SHELVES = "121003";
    //扫描二维码绑定库位
    //String BIND_SHELVES = "121004";
    //获取耗材入库记录
    String GET_STOCKRECORDS_PAGELIST = "121005";
    //删除耗材入库记录
    String DELETE_STOCKRECORDS = "121006";
    //耗材入库
    String IN_STOCK = "121007";
    //领用列表
    String GET_RECEIVE_PAGELIST = "121008";
    //耗材搜索
    String GET_STOCK_PAGELIST = "121009";
    //扫码获取库位下库存
    String GET_STOCKLIST_BYRFID = "121010";
    //耗材领用
    String OUT_STOCK = "121011";
    //耗材库存列表
    String GET_ALLSTOCK_PAGELIST = "121012";
    //库存用完提醒列表
    String GET_STOCKWARN_PAGELIST = "121013";

    /**
     * 仪器预约
     */
    //仪器预约列表
    String GET_INSTRESER_PAGELIST = "122001";
    //发布仪器预约
    String PUBLISH_INSTRUMENT = "122002";
    //搜索仪器
    String SEARCH_INSTRUMENT = "122003";
    //仪器预约记录
    String GET_INSTRESERHISTORY_PAGELIST = "122004";
    //查看预约详情
    String GET_INSTRESERDET_FORAPP = "122005";
    //查看预约详情
    String GET_INSTRESERDET_FORPAD = "122006";
    //开始使用
    String START_USING = "122007";
    //结束使用
    String END_USE = "122008";
    //仪器预约审核
    String APV_INSTRUMENT = "122009";
    //绑定文件
    String BIND_INSTRESER_FILE = "122010";
    //查看预约详情
    String GET_INSTRESERDET_FORAPV = "122011";
}

