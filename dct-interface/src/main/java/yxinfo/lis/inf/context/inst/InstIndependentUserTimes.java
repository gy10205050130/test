package yxinfo.lis.inf.context.inst;

/**
 * Created by xww on 2016/11/21.
 */
public interface InstIndependentUserTimes {

    // 独立预约人能预约的时间段
/*    Integer[] instIndependentUserTimes = new Integer[]{33, 34, 35, 36, 37, 38, 39, 40};*/

    Integer[] instIndependentUserTimes = new Integer[]{97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};

    // 非独立预约人能预约的时间段
    //Integer[] instUnIndependentUserTimes = new Integer[]{19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};

    Integer[] instUnIndependentUserTimes = new Integer[]{55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96};

    // 独立预约人不能预约的星期
    Integer[] InstIndependentUserWeeks = new Integer[]{};

    //越界时间
    Integer[] overTime = new Integer[]{54, 121};

}
