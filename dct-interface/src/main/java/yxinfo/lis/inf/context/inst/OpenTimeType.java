package yxinfo.lis.inf.context.inst;

/**
 * Created by xww on 2016/9/9.
 */
public interface OpenTimeType {

    // 周一到周五
    Integer WORK_DAY = 1;

    // 周六到周日
    Integer HOLIDAYS = 2;

    // 周一到周日
    Integer WORK_HOLIDAYS = 3;

    //不开放
    Integer NOT_OPEN = 4;

}
