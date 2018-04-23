package yxinfo.dct.inteface.context.base;

/**
 * 终端类型编号
 * Created by dy on 2016/8/10.
 */
public interface TerminalCode {

    // 实验室APP（学校版）
    String DCT_APP_SCHOOL = "T0001";

    // 电视展示APP
    String DCT_PC = "T0003";

    // 大仪共享PC
    String LIS_PC = "lis01";

    // 大仪共享APP
    String LIS_APP = "lis02";

    // ``````````````````````````````````````````````````````````````
    // 实验室APP（学校版）测试环境
    String DCT_APP_SCHOOL_DEBUG = "te001";

    // 电视展示APP测试环境
    String DCT_PC_DEBUG = "te003";

    // 大仪共享PC测试环境
    String LIS_PC_DEBUG = "lis01";

    // 大仪共享APP测试环境
    String LIS_APP_DEBUG = "lis02";
}
