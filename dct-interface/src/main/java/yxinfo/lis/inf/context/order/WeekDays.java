package yxinfo.lis.inf.context.order;

/**
 * Created by xww on 2016/10/30.
 */
public enum WeekDays {

    ORDER_TIMES_NO_ONE("1", "星期一"),
    ORDER_TIMES_NO_TWO("2", "星期二"),
    ORDER_TIMES_NO_THREE("3", "星期三"),
    ORDER_TIMES_NO_FOUR("4", "星期四"),
    ORDER_TIMES_NO_FIVE("5", "星期五"),
    ORDER_TIMES_NO_SIX("6", "星期六"),
    ORDER_TIMES_NO_SEVEN("0", "星期天");


    private String weeksNo;
    private String weekName;

    WeekDays(String weeksNo, String weekName) {
        this.weeksNo = weeksNo;
        this.weekName = weekName;
    }

    public static String getWeekName(String weeksNo){
        WeekDays[] values = WeekDays.values();
        for(WeekDays item : values){
            if(item.weeksNo.equals(weeksNo)){
                return item.weekName;
            }
        }
        return null;
    }

}
