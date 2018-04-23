package yxinfo.ow.inf.mapper;

/**
 * Created by hanley on 2016/6/16.
 */
public interface RouteCode {

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
}

