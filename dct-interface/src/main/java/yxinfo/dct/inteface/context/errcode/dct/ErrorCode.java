package yxinfo.dct.inteface.context.errcode.dct;

/**
 * Created by hanley on 2016/6/21.
 */
public interface ErrorCode {

    String SUCCESS = "0";

    // 参数长度错误
    String LENGTH = "000004";
    // 没有数据
    String NO_DATA = "000017";
    // 参数不能为空
    String PARAM_NOT_NULL = "001000";

    // 用户不存在
    String USER_NOT_FOUND = "001001";
    // 组织id不能为空
    String ORG_ID_NOT_NULL = "001004";
    // 手机号码不能为空
    String MOBILE_NOT_EMPTY = "001006";
    // 名称不能为空
    String NAME_NOT_EMPTY = "001009";
    // 用户id不能为空
    String MEMBER_ID_NOT_EMPTY = "001010";
    // 组织不存在
    String ORG_NOT_EXIST = "001025";

    // 文件上传失败
    String UPLOAD_ERROR = "010006";

    /**
     * 试题异常
     */
    // 类目ID须为整数且长度小于10
    String QUESTION_CATEGID_LENGTH = "003029";
    // 类目ID不可为空
    String QUESTION_CATEGID_NOTNULL = "003031";
    // 类目名称长度须小于255
    String QUESTION_FCATEGNAME_LENGTH = "003001";
    // 类目名称不能为空
    String QUESTION_FCATEGNAME_NOTNULL = "003002";
    // 试题标题的长度为1
    String QUESTION_QUESTTYPE_LENGTH = "003005";
    // 试题类型不可为空
    String QUESTION_QUESTTYPE_NOTNULL = "003006";
    // 试题解析的长度须小于2000
    String QUESTION_QUESTANALYSE_LENGTH = "003007";
    // 试题解析不可为空
    String QUESTION_QUESTANALYSE_NOTNULL = "003008";
    // 试题答案的长度须小于255
    String QUESTION_QUESTANSWER_LENGTH = "003009";
    // 试题答案不可为空
    String QUESTION_QUESTANSWER_NOTNULL = "003010";
    // 试题内容的长度须小于2000
    String QUESTION_QUESTCONTEXT_LENGTH = "003013";
    // 试题内容不可为空
    String QUESTION_QUESTCONTEXT_NOTNULL = "003014";
    // 试题选项编号的长度为1
    String QUESTION_QUESTOPTCODE_LENGTH = "003015";
    // 试题选项编号不可为空
    String QUESTION_QUESTOPTCODE_NOTNULL = "003016";
    // 试题选项内容的长度为500
    String QUESTION_QUESTOPTTEXT_LENGTH = "003017";
    // 试题选项内容不可为空
    String QUESTION_QUESTOPTTEXT_NOTNULL = "003018";
    // 插入试题类目表失败
    String QUESTION_INSERT_CATEG_ERROR = "003019";
    // 新增类目试题信息
    String QUESTION_ADDCATEGQUEST_ERROR = "003020";
    // 插入试题表失败
    String QUESTION_INSERT_QUQUEST_ERROR = "003021";
    // 插入试题类目关系表失败
    String QUESTION_INSERT_QUESTCATEG_ERROR = "003022";
    // 插入试题解析表失败
    String QUESTION_INSERT_QUESTANALYSE_ERROR = "003023";
    // 插入试题答案失败
    String QUESTION_INSERT_QUESTANSWER_ERROR = "003024";
    // 插入试题内容失败
    String QUESTION_INSERT_QUESTCONTEXT_ERROR = "003025";
    // 插入试题选项表失败
    String QUESTION_INSERT_QUESTOPT_ERROR = "003026";
    // 根据类目查询试题失败
    String QUESTION_SEARCH_QUESTSBYCATEGID_ERROR = "003027";
    // 查询类目失败
    String QUESTION_SEARCH_CATEGS_ERROR = "003028";
    // 类目描述的长度须小于255
    String QUESTION_CATEGDESCRIBE_LENGTH = "003040";
    // 组织id不可为空
    String LAB_ORGID_ISNULL_ERROR = "003043";
    // 登录人id不可为空
    String LAB_MEMBERID_ISNULL_ERROR = "003044";
    // 未找到对应的类目
    String QUESTION_INSERT_CATEGID_ERROR = "003041";
    // 试题类型的格式有误
    String QUESTION_INSERT_FTYPEVALUE_ERROR = "003042";

    /**
     * 实验室异常
     */
    // 实验室名称的长度须小于100
    String LAB_LABNAME_LENGTH = "004001";
    // 实验室名称不可为空
    String LAB_LABNAME_NOTNULL = "004002";
    // 实验室编号的长度须小于100
    String LAB_LABCODE_LENGTH = "004003";
    // 实验室编号不可为空
    String LAB_LABCODE_NOTNULL = "004004";
    // 实验室状态的长度须小于1
    String LAB_LABSTATUS_LENGTH = "004005";
    // 实验室状态不可为空
    String LAB_LABSTATUS_NOTNULL = "004006";
    // 实验室级别的长度须小于100
    String LAB_LABLEVEL_LENGTH = "004007";
    // 组织id须为整数且长度小于10
    String LAB_ORGID_LENGTH = "004008";
    // 组织id不可为空
    String LAB_ORGID_NOTNULL = "004009";
    // 实验室上级id须为整数且长度小于10
    String LAB_PID_LENGTH = "004010";
    // 实验室备注的长度须小于255
    String LAB_LABREMARK_LENGTH = "004011";
    // id须为整数且长度小于10
    String LAB_LABID_LENGTH = "004012";
    // id不可为空
    String LAB_LABID_NOTNULL = "004013";
    // 实验室管理员id须为整数且长度小于10
    String LAB_LABMEMBERID_LENGTH = "004014";
    // 实验室管理员id不可为空
    String LAB_LABMEMBERID_NOTNULL = "004015";
    // 实验室管理员类型的长度须小于1
    String LAB_FTYPE_LENGTH = "004016";
    // 实验室管理员类型不可为空
    String LAB_FTYPE_NOTNULL = "004017";
    // 实验室负责人删除失败
    String LAB_DELETE_LABMANAGER_ERROR = "004022";
    // 根据实验室id删除失败
    String LAB_DELETE_LAB_ERROR = "004018";
    // 查询实验室信息失败
    String LAB_SEARCH_LAB_ERROR = "004019";
    // 查询实验室负责人信息失败
    String LAB_SEARCH_LABMANAG_ERROR = "004020";
    // 更新实验室信息失败
    String LAB_UPDATE_LAB_ERROR = "004021";
    // 插入实验室负责人信息失败
    String LAB_INSERT_LABMANAGER_ERROR = "004023";
    // 插入实验室信息失败
    String LAB_INSERT_LAB_ERROR = "004024";
    // 联系电话长度应小于20
    String LAB_LABMEPHONE_LENGTH = "004025";
    // 联系电话不可为空
    String LAB_LABMEPHONE_NOTNULL = "004026";
    // 查询时fid不可为空
    String LAB_SEARCH_LABFID_ERROR = "004027";
    // 危险源的长度须小于255
    String LAB_LABDANGERSOURCE_LENGTH = "004028";
    // rfid设备号的长度须小于100
    String LAB_RFFCODE_LENGTH = "004029";
    // 导入实验室失败
    String LAB_IMPORT_LAB_ERROR = "004030";
    // 验证实验室字段失败
    String LAB_IMPORT_CHECKLAB_ERROR = "004031";
    // 转化导入实体失败
    String LAB_IMPORT_TRANSFORMLAB_ERROR = "004032";
    // 处理导入实验室中的实验室管理人员失败
    String LAB_IMPORT_MANALAB_ERROR = "004033";
    // 上传文件到服务器失败
    String UPLOAD_FILE_ERROR = "004034";
    // 导出excel失败
    String EXPORT_LAB_ERROR = "004035";
    // 楼宇及房间号的长度须小于50
    String LAB_ROOMNUM_LENGTH = "004036";
    // 实验室位置的长度须小于100
    String LAB_ADDRESS_LENGTH = "004037";
    // 实验室类型的长度须小于2
    String LAB_PURPOSE_LENGTH = "004038";
    // 配置key不能为空
    String FKEY_NOT_NULL = "004039";
    // 配置值不能为空
    String VAL_NOT_NULL = "004040";
    String EDIT_SETTINGS_ERROR = "004041";

    /**
     * 课题日志异常
     */
    // 添加课题日志信息失败
    String TOPICLOG_INSERT_TOPICLOG_ERROR = "005001";
    // 添加课题日志内容信息失败
    String TOPICLOG_INSERT_TOPICLOGCTX_ERROR = "005002";
    // 添加课题日志与试剂关系表信息失败
    String TOPICLOG_INSERT_TOPICLOGREAG_ERROR = "005003";
    // 查询课题日志信息出错
    String TOPICLOG_SEARCH_TOPICLOG_ERROR = "005004";
    // 课题日志DTO转Model出错
    String TOPICLOG_TRANSFORM_TOPICLOG_ERROR = "005005";
    // 调用服务获取人员名称或实验室名称出错
    String TOPICLOG_SEARCH_NAME_ERROR = "005006";
    // 获取课题日志内容出错
    String TOPICLOG_SEARCH_TOPICLOGCTX_ERROR = "005007";
    // 获取课题日志对应试剂内容出错
    String TOPICLOG_SEARCH_TOPICLOGREAGENT_ERROR = "005008";
    // 更新课题日志表出错
    String TOPICLOG_UPDATE_TOPICLOG_ERROR = "005009";
    // 更新课题日志内容表出错
    String TOPICLOG_UPDATE_TOPICLOGCTX_ERROR = "005010";
    // 更新课题日志与试剂关系表出错
    String TOPICLOG_UPDATE_TOPICLOGREAGENT_ERROR = "005011";
    // 日志id须为整数且长度小于10
    String TOPICLOG_LOGID_LENGTH = "005012";
    // 日志id不可为空
    String TOPICLOG_LOGID_NOTNULL = "005013";
    // 使用成员id须为整数且长度小于10
    String TOPICLOG_MEMBERID_LENGTH = "005014";
    // 使用成员id不可为空
    String TOPICLOG_MEMBERID_NOTNULL = "005015";
    // 课题名称应小于100
    String TOPICLOG_ISSUESNAME_LENGTH = "005016";
    // 课题名称不可为空
    String TOPICLOG_ISSUESNAME_NOTNULL = "005017";
    // 课题类型长度须小于2
    String TOPICLOG_PURPOSE_LENGTH = "005018";
    // 实验时长须为整数且长度小于10
    String TOPICLOG_EXPTLENGTH_LENGTH = "005022";
    // 实验室id须为整数且长度小于10
    String TOPICLOG_LABID_LENGTH = "005023";
    // 教师id须为整数且长度小于10
    String TOPICLOG_TEACHERID_LENGTH = "005025";
    // 课题日志内容长度须小于2000
    String TOPICLOG_CONTEXT_LENGTH = "005027";
    // 试剂id须为整数且长度小于10
    String TOPICLOG_REAGENTID_LENGTH = "005028";
    // 试剂id不可为空
    String TOPICLOG_REAGENTID_NOTNULL = "005029";
    // 试剂用量的长度须小于255
    String TOPICLOG_USED_LENGTH = "005030";
    // 试剂用量不可为空
    String TOPICLOG_USED_NOTNULL = "005031";
    // 添加课题日志中实验内容对应图片失败
    String TOPICLOG_INSERT_TOPICLOGIMG_ERROR = "005032";
    // 静态资源id须为整数且长度小于10
    String TOPICLOG_STATICID_LENGTH = "005033";
    // 静态资源id不可为空
    String TOPICLOG_STATICID_NOTNULL = "005034";
    // 保存课题日志中的日志与图片关系表出错
    String TOPICLOG_UPDATE_TOPICLOGIMG_ERROR = "005035";
    // 获取课题日志内容中对应图片出错
    String TOPICLOG_SEARCH_TOPICLOGCTXIMG_ERROR = "005036";
    // token为必传字段
    String TOPICLOG_EXPORT_TOKEN_ERROR = "005037";

    /**
     * 仓库管理异常
     */
    // 新增仓库信息错误
    String WH_INSERT_WH_ERROR = "006001";
    // 新增仓库管理人信息出错
    String WH_INSERT_WHMANAGER_ERROR = "006002";
    // 更新仓库信息出错
    String WH_UPDATE_WH_ERROR = "006003";
    // 更新仓库管理人信息出错
    String WH_UPDATE_WHMANAGER_ERROR = "006004";
    // 删除仓库信息出错
    String WH_DELETE_WH_ERROR = "006005";
    // 删除仓库管理人信息出错
    String WH_DELETE_WHMANAGER_ERROR = "006006";
    // 仓库id须为整数且长度小于10
    String WH_WHID_LENGTH = "006007";
    // 仓库id不可为空
    String WH_WHID_NOTNULL = "006008";
    // 仓库类型的长度须小于2
    String WH_WHTYPE_LENGTH = "006009";
    // 仓库类型不可为空
    String WH_WHTYPE_NOTNULL = "006010";
    // 仓库编号的长度须小于100
    String WH_WHCODE_LENGTH = "006011";
    // 仓库编号不可为空
    String WH_WHCODE_NOTNULL = "006012";
    // 仓库名称的长度须小于255
    String WH_WHNAME_LENGTH = "006013";
    // 仓库名称不可为空
    String WH_WHNAME_NOTNULL = "006014";
    // 仓库管理人id须为整数且长度小于10
    String WH_MEMBERID_LENGTH = "006015";
    // 仓库管理人id不可为空
    String WH_MEMBERID_NOTNULL = "006016";
    // 查询仓库信息出错
    String WH_SEARCH_WH_ERROR = "006017";
    // 地址的长度须小于100
    String WH_ADDRESS_LENGTH = "006018";
    // 面积的长度须小于50
    String WH_AREA_LENGTH = "006019";

    /**
     * 设备管理异常
     */
    // 新增设备信息出错
    String EQU_INSERT_EQUIPMENT_ERROR ="007001";
    // 删除设备信息出错
    String EQU_DELETE_EQUIPMENT_ERROR ="007002";
    // 更新设备信息出错
    String EQU_UPDATE_EQUIPMENT_ERROR ="007003";
    // 查询设备信息出错
    String EQU_SEARCH_EQUIPMENT_ERROR ="007004";
    // 新增RFID卡信息出错
    String EQU_INSERT_EQURFID_ERROR ="007005";
    // 删除RFID卡信息出错
    String EQU_DELETE_EQURFID_ERROR ="007006";
    // 更新RFID卡信息出错
    String EQU_UPDATE_EQURFID_ERROR ="007008";
    // 查询RFID卡信息出错
    String EQU_SEARCH_EQURFID_ERROR ="007009";
    // Rfid卡id必须为整数且长度小于10
    String EQU_RFIDID_LENGTH = "007010";
    // Rfid卡id不可为空
    String EQU_RFIDID_NOTNULL = "007011";
    // Rfid码长度必须小于100
    String EQU_RFIDFCODE_LENGTH = "007012";
    // Rfid码不可为空
    String EQU_RFIDFCODE_NOTNULL = "007013";
    // Rfid卡状态长度必须小于2
    String EQU_RFIDSTATUS_LENGTH = "007014";
    // Rfid卡状态不可为空
    String EQU_RFIDSTATUS_NOTNULL = "007015";
    // 设备id必须为整数且长度小于10
    String EQU_EQUIPMENTID_LENGTH = "007016";
    // 设备id不可为空
    String EQU_EQUIPMENTID_NOTNULL = "007017";
    // 组织id必须为整数且长度小于10
    String EQU_EQUIPMENT_ORGID_LENGTH = "007018";
    // 组织id不可为空
    String EQU_EQUIPMENTID_ORGID_NOTNULL = "007019";
    // 物理地址长度必须小于255
    String EQU_EQUIPMENT_MACADDRESS_LENGTH = "007020";
    // 物理地址不可为空
    String EQU_EQUIPMENTID_MACADDRESS_NOTNULL = "007021";
    // 使用时间不能为空
    String EQU_RFIDIDUSEAT_NOTNULL_ = "007022";
    // 设备编号不能为空
    String EQU_EQUIPMENTID_EQUNO_NOTNULL = "007023";

    /**
     * 化学试剂管理异常
     */
    // 回收的试剂不是使用中状态
    String CHEM_RECYCLE_REAGENT_NOT_ON_USE = "008002";
    // 领取的试剂不是库存中
    String CHEM_RECEIVE_REAGENT_NOT_ON_WH = "008003";
    // 不可领取试剂
    String CHEM_REAGENT_CAN_NOT_RECEIVE = "008004";
    // 库存不足
    String CHEM_RECEIVE_NO_STOCK = "008005";
    // 扫描的rfid码对应的试剂不存在
    String CHEM_REAGENT_RFID_NOT_EXIST = "008006";
    // 扫描的rfid码不存在
    String CHEM_RFID_NOT_EXIST = "008001";
    // 仓库不存在
    String CHEM_NO_WH = "008027";
    // 统计项目不能为空
    String CHEM_ITEM_NO_NOT_EMPTY = "008028";
    // 化学品id不能为空
    String CHEM_CHEM_ID_NOT_EMPTY = "008007";
    // 规格id不能为空
    String CHEM_SPEC_NOT_EMPTY = "008008";
    // 容量不能为空
    String CHEM_CAPACITY_NOT_EMPTY = "008009";
    // 计量单位id不能为空
    String CHEM_UNIT_NOT_EMPTY = "008020";
    // 用户id不能为空
    String CHEM_MEMBER_ID_NOT_EMPTY = "008022";
    // 组织id不能为空
    String CHEM_ORG_ID_NOT_EMPTY = "008023";
    // 仓库id不能为空
    String CHEM_WH_ID_NOT_EMPTY = "008024";
    // 实验室id不能为空
    String CHEM_LAB_ID_NOT_EMPTY = "008025";
    // 化学试剂状态不能为空
    String CHEM_STATUS_NOT_EMPTY = "008026";
    // 化学品申请人id不能为空
    String CHEM_APLY_MEMBER_ID_NOT_EMPTY = "008010";
    // 申请人组织不能为空
    String CHEM_APLY_ORG_ID_NOT_EMPTY = "008011";
    // 课题名称不能为空
    String CHEM_APLY_ISSUESNAME_NOT_EMPTY = "008012";
    // 课题名称长度必须小于30
    String CHEM_APLY_ISSUESNAME_LENGTH = "008013";
    // 用途不能为空
    String CHEM_APLY_PURPOSE_NOT_EMPTY = "008014";
    // 用途长度必须小于30
    String CHEM_APLY_PURPOSE_LENGTH = "008015";
    // 预约领取时间不能为空
    String CHEM_APLY_APPOINT_AT_NOT_EMPTY = "008016";
    // 申请领取的化学试剂不能为空
    String CHEM_APLY_REAGENTS_NOT_EMPTY = "008017";
    // 审核老师/仓库管理员id不能为空
    String CHEM_APLY_APPROVE_M_ID_NOT_EMPTY = "008018";
    // 试剂所属组织不能为空
    String CHEM_REAGENT_ORG_ID_NOT_EMPTY = "008019";
    // rfid码不能为空
    String CHEM_REAGENT_RF_CODE_NOT_EMPTY = "008021";
    // 额外信息不能为空
    String CHEM_MSG_ID_NOT_EMPTY = "008029";
    // 用量大于剩余量
    String CHEM_USED_TOO_LARGE = "008030";
    // 用量不能为空
    String CHEM_USED_NOT_EMPTY = "008031";
    // 不可回收试剂
    String CHEM_REAGENT_CAN_NOT_RECYCLE = "008032";
    // 试剂id不能为空
    String CHEM_REAGENT_ID_NOT_EMPTY = "008033";
    // 申领记录id不能为空
    String CHEM_AR_ID_NOT_EMPTY = "008034";
    // CAS不能为空
    String CHEM_CAS_NOT_EMPTY = "008035";
    // 非库存中的试剂不能修改
    String CHEM_REAGENT_EDIT_NOT_IN_WH = "008036";
    // 入库记录ID不能为空
    String CHEM_INTOWH_BATCH_ID_NOT_EMPTY = "008037";
    // 化学试剂名称重复
    String CHEM_NAME_REPEAT = "008038";
    // 二维码已被使用
    String CHEM_RFCODE_HAS_ADD = "008039";
    // 二维码不合法
    String CHEM_QR_ERROR = "008040";
    // 危废回收桶不存在
    String HW_BUCKET_NOT_EXIST = "008041";
    // 未配置危废回收公司
    String HW_RECYC_ORG_NOT_EXIST = "008042";
    // 请上传现场图片
    String HW_PIC_IDS_NOT_NULL = "008043";
    // 请输入危废重量
    String HW_WEIGHT_NOT_NULL = "008044";
    // 空瓶RFID码不能为空
    String HW_RF_CODES_NOT_NULL = "008045";
    // 废液桶id不能为空
    String HW_BUCKET_ID_NOT_NULL = "008046";
    // RFID类型标志不能为空
    String HW_RFID_FLAG_NOT_NULL = "008047";
    // 试剂所属组织不同
    String HW_REAGENT_NOT_SAME_ORG = "008048";
    // 请输入编码
    String HW_BUCKET_CODE_NOT_NULL = "008049";
    // 请选择桶名称
    String HW_BUCKET_NATURE_ID_NOT_NULL = "008050";
    // 请选择所属实验室
    String HW_BUCKET_SITE_ID_NOT_NULL = "008051";
    // 所属实验室不存在
    String HW_BUCKET_SITE_NOT_EXIST = "008052";
    // 请选择危废类别
    String HW_BUCKET_CATEGORY_NOT_NULL = "008053";
    // 危废类别不合法
    String HW_BUCKET_CATEGORY_ILLEGAL = "008054";
    // 扫描的二维码已被使用
    String HW_BUCKET_RF_CODE_EXIST = "008055";
    // 请扫描二维码
    String HW_BUCKET_RF_CODE_NOT_NULL = "008056";
    // 此编码已被使用
    String HW_BUCKET_CODE_EXIST = "008057";
    // 申领审核未通过或已逾期
    String CHEM_AR_RECEIVE_STA_ERR = "008058";
    // 此试剂不属于该申领单指定的采购人，无法领取
    String CHEM_AR_REAGENT_NOT_BELONG = "008059";
    // 此试剂用途与申领单用途不匹配，无法领取
    String CHEM_AR_REAGENT_PURPOSE_ERR = "008060";
    // 危险化学品目录id不能为空
    String MSDS_ID_NOT_NULL = "008061";
    // 请输入化学品中文名称
    String MSDS_CN_NAME_NOT_NULL = "008062";
    // 化学品中文名称重复
    String MSDS_CN_NAME_REPEAT = "008063";
    // 化学品名称不存在
    String CHEM_NOT_EXIST = "008064";
    // 未配置仓库管理员，请联系管理员
    String NOT_SET_WH_MANAGER_ROLE_ID = "008065";
    // 入库记录不可编辑
    String INTO_WH_BATCH_CAN_NOT_EDIT = "008066";
    // 已确认或驳回的入库确认
    String INTO_WH_BATCH_CAN_NOT_CONFIRM = "008067";
    // 待确认的入库记录不存在
    String INTO_WH_BATCH_NOT_EXIST = "008068";
    // 化学品名称不能为空
    String CHEM_CHEM_NAME_NOT_EMPTY = "008069";
    // 数量不能为空
    String CHEM_COUNT_NOT_EMPTY = "008070";
    // 请选择同行人
    String CHEM_TOGETHER_NOT_EMPTY = "008071";
    // 申请领取的化学试剂分配情况不能为空
    String CHEM_APLY_REAGENTS_ALLOT_NOT_EMPTY = "008072";
    // 试剂归属人不存在
    String CHEM_BELONG_TO_CODE_NOT_EXIST = "008073";
    // 已经同意或拒绝的同行确认
    String APPLY_TOGETHER_HAS_CONFIRM = "008074";
    // 不能选择自己作为同行人
    String CHEM_TOGETHER_NOT_ME = "008075";
    // 请由另一领用人扫码确认回收
    String CHEM_REAGENT_RECYCLE_OTHER_RCV_CFM = "008076";
    // 请由另一仓库管理员扫码确认回收
    String CHEM_REAGENT_RECYCLE_OTHER_WH_MANAGER_CFM = "008077";
    // 请由领用人扫码确认回收
    String CHEM_REAGENT_RECYCLE_RCV_CFM = "008078";
    // 请由仓库管理员扫码确认回收
    String CHEM_REAGENT_RECYCLE_WH_MANAGER_CFM = "008079";
    // 扫描的二维码与入库的试剂不一致
    String CFM_QR_NOT_MEET_INTOWH = "008080";
    // 订单明细id不能为空
    String CHEM_ORDER_DETAIL_ID_NOT_EMPTY = "008081";
    // 订单信息不存在
    String CHEM_ORDER_NOT_EXIST = "008082";
    // 未配置试剂对应的商品分类，请联系管理员
    String NOT_SET_REAGENT_CAT_ID = "008083";
    // 二维码不正确
    String CHEM_INTOWH_ADD_REAGENT_ERROR = "008084";
    // 订单已入库
    String CHEM_ORDER_NOT_HAS_INTIWH = "008085";
    // 请先设置领用同行人
    String CHEM_RECEIVE_MUST_SET_MEMBER_SEC = "008086";
    // 已设置领用同行人
    String CHEM_RECEIVE_HAS_SET_MEMBER_SEC = "008087";
    // 不是待领用的领取申请
    String APPLY_NOT_WAIT = "008088";
    // 不能设置自己为领用同行人
    String CHEM_RECEIVE_MEMBER_SEC_NOT_OWN = "008089";
    // 不需要同行人的领取申请
    String CHEM_RECEIVE_NOT_NEED_MEMBER_SEC = "008090";
    // 二维码已被使用
    String CHEM_QR_HAS_USED = "008091";
    // 二维码重复
    String CHEM_QR_REPEAT = "008092";
    // 二维码不存在
    String CHEM_SHOP_QR_NOT_EXIST = "008093";
    // 未配置申请领取方式，请联系管理员
    String NOT_SET_APPLY_MODE = "008094";
    // 已被领取
    String CHEM_SHOP_HAS_RECEIVE = "008095";
    // 试剂已报损
    String CHEM_REAGENT_HAS_REPORT_DAMAGED = "008096";

    /**
     * 仪器异常
     */
    // 项目ID不能为空
    String INST_BESPEAK_PROID_NOT_EMPTY = "011001";
    // 仪器预约用途不能为空
    String INST_BESPEAK_USE_NOT_EMPTY = "011002";
    // 预约仪器不能为空
    String INST_BESPEAK_INST_NOT_NULL = "011003";
    // 预约开始时间不能为空
    String INST_BESPEAK_STARTTIME_NOT_EMPTY = "011004";
    // 预约结束时间不能为空
    String INST_BESPEAK_ENDTIME_NOT_EMPTY = "011005";
    // 预约时间应大于当前系统时间
    String INST_BESPEAK_TIME_IS_LESS= "011006";
    // 预约结束时间应该大于预约开始时间
    String INST_BESPEAK_ENDTIME_IS_LESS = "011007";
    // 仪器id不能为空
    String INST_BESPEAK_INSTID_NOT_NULL = "011008";
    // 预约id不能为空
    String INST_BESPEAK_INSTBSKID_NOT_NULL = "011009";
    // 扫码的设备未找到
    String INST_BESPEAK_INST_NOT_FOUND = "011010";
    String INST_BESPEAK_ADD_ERROR = "011011";
    String INST_BESPEAK_UPDATE_USETIME_ERROR = "011012";
    // 仪器名称不能为空
    String INST_FNAME_NOT_EMPTY = "011013";
    // 添加仪器失败
    String INST_ADD_ERROR = "011014";
    // 修改仪器失败
    String INST_UPDATE_ERROR = "011015";
    String INSTRUNRECORD_INSERT_ERROR = "011016";
    String INSTRUNRECORD_UPDATE_ERROR = "011017";

    /**
     * 盘点异常
     */
    // 组织ID不能为空
    String CHECK_RECODE_ORGID_NOT_EMPTY = "012001";
    // 盘点人ID不能为空
    String CHECK_RECODE_MEMBERID_NOT_EMPTY = "012002";
    // 仓库ID不能为空
    String CHECK_RECODE_WHID_NOT_EMPTY = "012003";
    // 盘点试剂不能为空
    String CHECK_RECODE_RFIDLIST_NOT_EMPTY = "012004";
    // 盘点失败
    String CHECK_RECODE_SUBMIT_ERROR = "012005";
    // 盘点记录试剂ID不能为空
    String CHECK_RECODE_CHECKCHEMID_NOT_NULL = "012006";
    // 查询盘点试剂轨迹失败
    String CHECK_RECODE_GET_TARJ_ERROR = "012007";

    /**
     * 预警异常
     */
    // 获取预警规则列表失败
    String GET_WARNRULE_LIST_ERROR = "013001";
    // 新增预警规则列表失败
    String ADD_WARNRULE_ERROR = "013002";
    // 新增预警记录失败
    String ADD_WARNRECORD_ERROR = "013003";
    // 更新预警记录失败
    String UPDATE_WARNRECORD_ERROR = "013004";
    // 查询预警记录失败
    String GET_WARNRECORDLIST_ERROR = "013005";
    // 添加预警记录日志失败
    String ADD_WARNRECORDLOG_ERROR = "013006";
    // 查询预警记录日志失败
    String GET_WARNRECORDLOGLIST__ERROR = "013007";
    // 删除预警规则失败
    String DELETE_WARNRULE_ERROR = "013008";
    // 更新预警规则失败
    String UPDATE_WARNRULE_ERROR = "013019";
    // 预警项目不能为空
    String ITEM_NO_NOT_NULL = "013009";
    // 状态不能为空
    String STATUS_NOT_NULL = "013010";
    // 预警关闭失败
    String WARN_CLOSE_ERROR = "013011";
    // 预警搁置失败
    String WARN_DELAY_ERROR = "013012";
    // 未找到回收记录的信息
    String RECYCLE_IS_NULL = "013036";
    // 预警项目编号长度必须小于6
    String WARN_ITEMNO_LENGTH = "013013";
    // 预警项目编号不可为空
    String WARN_ITEMNO_NOTNULL = "013014";
    // 预警事物标识必须为整数且长度小于10
    String WARN_WARNFOR_LENGTH = "013015";
    // 限制范围左值长度必须小于200
    String WARN_LIMITLEFT_LENGTH = "013016";
    // 限制范围右值长度必须小于200
    String WARN_LIMITRIGHT_LENGTH = "013017";
    // 成员id必须为整数且长度小于10
    String WARN_MEMBERID_LENGTH = "013018";
    // 生成一条预警记录失败
    String TASK_GET_WARNRECORD_ERROR = "013020";
    // 获取人员领用化学品记录出错
    String TASK_GET_CHEMLIST_ERROR = "013021";
    // 预警信息已经关闭，不能重复操作
    String WARN_IS_CLOSED = "013022";
    // 预警信息已经搁置，不能重复操作
    String WARN_IS_DELAYED = "013023";
    // 查询所有组织出错
    String GET_ORGLIST_ERROR = "013024";
    // 处理领用后超出未出现时间的处理业务出错
    String HANDLER_BEYOND_TIME_ERROR = "013025";
    // 处理领用超出数量的处理业务出错
    String HANDLER_BEYOND_QUANTITY_ERROR = "013026";
    // 获取首页信息预警信息失败
    String GET_HOMEPAGE_WARNINFO__ERROR = "013027";
    // 获取首页预警信息时ItemNo为必传项
    String GET_WARNINFO_ITEMNO_ERROR = "013028";
    // 查看试剂使用量是否超出限额出错
    String TASK_GET_RECYCLEUSERD_ERROR = "013029";
    // 验证预警记录是否存在出错
    String TASK_ISEXIST_WARNRECORD_ERROR = "013030";
    // 预警类型不能为空
    String WARN_PERSON_ITEMNO_NOT_NULL = "013031";
    String WARN_PERSON_ADD_ERROR = "013032";
    String WARN_PERSON_UPDATE_ERROR = "013033";
    String WARN_PERSON_DELETE_ERROR = "013034";
    // 该预警规则已存在
    String ADD_WARNRULE_IS_EXIST_ERROR = "013035";

    /**
     * 项目管理异常
     */
    // 项目名称不能为空
    String PRO_FNAME_NOT_EMPTY = "014001";
    String PRO_ADD_ERROR = "014002";
    String PRO_UPDATE_ERROR = "014003";

    /**
     * 视频监控异常
     */
    // 分页查询视频监控地址失败
    String GET_PLACE_LIST_ERROR ="016001";
    // 添加视频监控地址失败
    String ADD_PLACE_ERROR ="016002";
    // 更新视频监控地址失败
    String UPDATE_PLACE_ERROR ="016003";
    // 删除视频监控地址失败
    String DELETE_PLACE_ERROR ="016004";
    // 根据地址id获取监控设备失败
    String GET_MONITOR_LIST_BYPLACEID_ERROR ="016005";
    // 更新监控设备失败
    String UPDATE_MONITOR_ERROR ="016006";
    // 添加监控设备失败
    String ADD_MONITOR_ERROR ="016007";
    // 删除监控设备失败
    String DELETE_MONITOR_ERROR ="016008";
    // 视频监控地址id不允许为空
    String PLACE_ID_NOT_NULL = "016009";
    // 分页查询监控设备失败
    String GET_MONITOR_LIST_ERROR ="016010";
    // 根据id查询视频监控地址失败
    String GET_PLACE_BYKEY_ERROR ="016011";
    // 视频监控地址id必须为整数且长度小于10
    String VMON_PLACEID_LENGTH ="016012";
    // 视频监控地址id不能为空
    String VMON_PLACEID_NOTNULL = "016013";
    // 视频监控地址长度必须小于255
    String VMON_PLACEADDRESS_LENGTH ="016014";
    // 视频监控地址不能为空
    String VMON_PLACEADDRESS_NOTNULL = "016015";
    // 监控设备id必须为整数且长度小于10
    String VMON_MONITORID_LENGTH ="016016";
    // 监控设备id不能为空
    String VMON_MONITORID_NOTNULL = "016017";
    // 监控设备ip长度必须小于100
    String VMON_MONITORIP_LENGTH = "016018";
    // 监控设备端口长度必须小于20
    String VMON_MONITORPORT_LENGTH = "016019";
    // 监控设备用户名长度必须小于100
    String VMON_MONITORIPUSERNAME_LENGTH = "016020";
    // 监控设备密码长度必须小于100
    String VMON_MONITORPWD_LENGTH = "016021";

    /**
     * 智能中控器
     */
    // 插入仪器监控设备失败
    String CTRL_INSERT_EQU4INST_ERROR = "017001";
    // 仪器id不能为空
    String INST_ID_NOT_NULL = "017002";
    String EDIT_INSTRUNRECORD_ERROR = "017003";
    String GET_INSTRUNRECORD_ERROR = "017004";
    String EQU_PURPOSE_NOT_EMPTY = "017005";
    String EQU_SITE_ID_NOT_NULL = "017006";
    String CTRL_GET_TEMP_HUM_ERROR = "017007";
    String CTRL_EQU_NOT_EXIST = "017008";
    String EDIT_TEMP_HUM_ERROR = "017009";
    String EQU_PURPOSE_ERROR = "017010";
    String EQU_EXIST = "017011";
    String INST_HAVE_EQU = "017012";
    String EQU_HAVE_INST = "017013";
    String INST_UNBUNDING_ERROR = "017014";


    /**
     * 仪器预约
     */
    // 预约时间不能跨天
    String INSTRESERTIME_NOTCROSSDAY = "018001";
    // 预约仪器不能为空
    String INSTRESER_NOTNULL = "018002";
    // 未找到仪器负责人
    String INSTRUMENT_MANAGER_NOTFOUND = "018003";
    // 您预约的仪器不为一个负责人，请分批次预约
    String INSTRUMENT_MANAGER_NOTONE = "018004";
    // 获取审核记录失败
    String GETAPVDETAIL_ERROR = "018005";
    // 非法设备
    String ILLEGAL_EQUIPMENT = "018006";
    // 仪器预约id不能为空
    String INSTRESERID_NOTNULL = "018007";
    // 未到预约开始使用时间
    String INSTRESERTIME_NOTBEGIN = "018008";
    // 已超过预约结束时间,请重新预约
    String INSTRESERTIME_ISOVER = "018009";
    // 预约时间冲突
    String INSTRESERTIME_ERROR = "018010";

    /**
     * 耗材模块
     */
    // 领用数量必须大于0
    String RECEIVE_NUM_ERROR = "019001";
    // 领取数量和领取记录id不允许为空
    String RECEIVENUM_NOTNULL = "019002";
    // 二维码已存在
    String QECODE_ISEXIST = "019003";
    // 该库位下还有未领用耗材不允许删除库位
    String DELETE_SUPSHELVES_ERROR = "019004";
    // 查询不到库存
    String STOCK_NOTFOUND = "019005";
    // 入库数量必须大于0
    String INSTOCK_ERROR = "019006";
    // 获取库位信息失败
    String SUPSTOCK_NOTFOUND = "019007";
    // 领用参数异常
    String RECEIVE_ERROR = "019008";
    // 库位名称已存在
    String FNAME_ISEXIST = "019009";
    // 根据id获取耗材入库记录失败
    String GET_STOCKRECORDS_ERROR = "019010";
    // 库存不足
    String STOCK_INSU = "019011";


    /**
     * 课题日志模块
     */
    //课题日志实验室不能为空
    String TLOG_LAB_NOTNULL = "020001";
    //课题日志化学试剂不能为空
    String TLOG_CHEM_NOTNULL = "020002";
    //审阅参数不能为空
    String REVIEW_ERROR = "020003";
    //二维码解码失败
    String RFIDCODE_ERROR = "020004";
    //获取化学试剂信息失败
    String GET_CHEM_ERROR = "020005";
    //试剂用量不能为空
    String CHEM_USED_ERROR = "020006";
}
