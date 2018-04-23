package yxinfo.lis.inf.context.order;

import yxinfo.lis.inf.context.inst.TopOpenStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 预约时间片段
 * <p>
 * Created by cy on 2016/10/15.
 */
public enum OrderTimes {

 /*   ORDER_TIMES_NO_ONE("17", "08:00", "08:30", "08:00-08:30"),
    ORDER_TIMES_NO_TWO("18", "08:30", "09:00", "08:30-09:00"),
    ORDER_TIMES_NO_THREE("19", "09:00", "09:30", "09:00-09:30"),
    ORDER_TIMES_NO_FOUR("20", "09:30", "10:00", "09:30-10:00"),
    ORDER_TIMES_NO_FIVE("21", "10:00", "10:30", "10:00-10:30"),
    ORDER_TIMES_NO_SIX("22", "10:30", "11:00", "10:30-11:00"),
    ORDER_TIMES_NO_SEVEN("23", "11:00", "11:30", "11:00-11:30"),
    ORDER_TIMES_NO_EIGHT("24", "11:30", "12:00", "11:30-12:00"),
    ORDER_TIMES_NO_NINE("25", "12:00", "12:30", "12:00-12:30"),
    ORDER_TIMES_NO_TEN("26", "12:30", "13:00", "12:30-13:00"),
    ORDER_TIMES_NO_ELEVEN("27", "13:00", "13:30", "13:00-13:30"),
    ORDER_TIMES_NO_TWELVE("28", "13:30", "14:00", "13:30-14:00"),
    ORDER_TIMES_NO_THIRTEEN("29", "14:00", "14:30", "14:00-14:30"),
    ORDER_TIMES_NO_FORETEEN("30", "14:30", "15:00", "14:30-15:00"),
    ORDER_TIMES_NO_FIFTEEN("31", "15:00", "15:30", "15:00-15:30"),
    ORDER_TIMES_NO_SIXTEEN("32", "15:30", "16:00", "15:30-16:00"),
    ORDER_TIMES_NO_SEVENTEEN("33", "16:00", "16:30", "16:00-16:30"),
    ORDER_TIMES_NO_EIGHTEEN("34", "16:30", "17:00", "16:30-17:00"),
    ORDER_TIMES_NO_NINETEEN("35", "17:00", "17:30", "17:00-17:30"),
    ORDER_TIMES_NO_TWENTY("36", "17:30", "18:00", "17:30-18:00"),
    ORDER_TIMES_NO_TWENTY_ONE("37", "18:00", "18:30", "18:00-18:30"),
    ORDER_TIMES_NO_TWENTY_TWO("38", "18:30", "19:00", "18:30-19:00"),
    ORDER_TIMES_NO_TWENTY_THREE("39", "19:00", "19:30", "19:00-19:30"),
    ORDER_TIMES_NO_TWENTY_FOUR("40", "19:30", "20:00", "19:30-20:00");*/

    ORDER_TIMES_NO_FORTY_NINE("49", "08:00", "08:10", "08:00-08:10", "8-49"),
    ORDER_TIMES_NO_FIFTY("50", "08:10", "08:20", "08:10-08:20", "8-50"),
    ORDER_TIMES_NO_FIFTY_ONE("51", "08:20", "08:30", "08:20-08:30", "8-51"),
    ORDER_TIMES_NO_FIFTY_TWO("52", "08:30", "08:40", "08:30-08:40", "8-52"),
    ORDER_TIMES_NO_FIFTY_THREE("53", "08:40", "08:50", "08:40-08:50", "8-53"),
    ORDER_TIMES_NO_FIFTY_FOUR("54", "08:50", "09:00", "08:50-09:00", "8-54"),

    ORDER_TIMES_NO_FORTY_FIVE("55", "09:00", "09:10", "09:00-09:10", "9-55"),
    ORDER_TIMES_NO_FIFTY_SIX("56", "09:10", "09:20", "09:10-09:20", "9-56"),
    ORDER_TIMES_NO_FIFTY_SEVEN("57", "09:20", "09:30", "09:20-09:30", "9-57"),
    ORDER_TIMES_NO_FIFTY_EIGHT("58", "09:30", "09:40", "09:30-09:40", "9-58"),
    ORDER_TIMES_NO_FIFTY_NINE("59", "09:40", "09:50", "09:40-09:50", "9-59"),
    ORDER_TIMES_NO_SIXTY("60", "09:50", "10:00", "09:50-10:00", "9-60"),

    ORDER_TIMES_NO_SIXTY_ONE("61", "10:00", "10:10", "10:00-10:10", "10-61"),
    ORDER_TIMES_NO_SIXTY_TWO("62", "10:10", "10:20", "10:10-10:20", "10-62"),
    ORDER_TIMES_NO_SIXTY_THREE("63", "10:20", "10:30", "10:20-10:30", "10-63"),
    ORDER_TIMES_NO_SIXTY_FOUR("64", "10:30", "10:40", "10:30-10:40", "10-64"),
    ORDER_TIMES_NO_SIXTY_FIVE("65", "10:40", "10:50", "10:40-10:50", "10-65"),
    ORDER_TIMES_NO_SIXTY_SIX("66", "10:50", "11:00", "10:50-11:00", "10-66"),

    ORDER_TIMES_NO_SIXTY_SENVEN("67", "11:00", "11:10", "11:00-11:10", "11-67"),
    ORDER_TIMES_NO_SIXTY_EIGHT("68", "11:10", "11:20", "11:10-11:20", "11-68"),
    ORDER_TIMES_NO_SIXTY_NINE("69", "11:20", "11:30", "11:20-11:30", "11-69"),
    ORDER_TIMES_NO_SEVENTY("70", "11:30", "11:40", "11:30-11:40", "11-70"),
    ORDER_TIMES_NO_SEVENTY_ONE("71", "11:40", "11:50", "11:40-11:50", "11-71"),
    ORDER_TIMES_NO_SEVENTY_TWO("72", "11:50", "12:00", "11:50-12:00", "11-72"),

    ORDER_TIMES_NO_SENVEN_THREE("73", "12:00", "12:10", "12:00-12:10", "12-73"),
    ORDER_TIMES_NO_SENVEN_FOUR("74", "12:10", "12:20", "12:10-12:20", "12-74"),
    ORDER_TIMES_NO_SENVEN_FIVE("75", "12:20", "12:30", "12:20-12:30", "12-75"),
    ORDER_TIMES_NO_SENVEN_SIX("76", "12:30", "12:40", "12:30-12:40", "12-76"),
    ORDER_TIMES_NO_SENVEN_SEVEN("77", "12:40", "12:50", "12:40-12:50", "12-77"),
    ORDER_TIMES_NO_SENVEN_EIGHT("78", "12:50", "13:00", "12:50-13:00", "12-78"),

    ORDER_TIMES_NO_SENVEN_NINE("79", "13:00", "13:10", "13:00-13:10", "13-79"),
    ORDER_TIMES_NO_EIGHTY("80", "13:10", "13:20", "13:10-13:20", "13-80"),
    ORDER_TIMES_NO_EIGHTY_ONE("81", "13:20", "13:30", "13:20-13:30", "13-81"),
    ORDER_TIMES_NO_EIGHTY_TWO("82", "13:30", "13:40", "13:30-13:40", "13-82"),
    ORDER_TIMES_NO_EIGHTY_THREE("83", "13:40", "13:50", "13:40-13:50", "13-83"),
    ORDER_TIMES_NO_EIGHTY_FOUR("84", "13:50", "14:00", "13:50-14:00", "13-84"),

    ORDER_TIMES_NO_EIGHTY_FIVE("85", "14:00", "14:10", "14:00-14:10", "14-85"),
    ORDER_TIMES_NO_EIGHTY_SIX("86", "14:10", "14:20", "14:10-14:20", "14-86"),
    ORDER_TIMES_NO_EIGHTY_SEVEN("87", "14:20", "14:30", "14:20-14:30", "14-87"),
    ORDER_TIMES_NO_EIGHTY_EIGHT("88", "14:30", "14:40", "14:30-14:40", "14-88"),
    ORDER_TIMES_NO_EIGHTY_NINE("89", "14:40", "14:50", "14:40-14:50", "14-89"),
    ORDER_TIMES_NO_NINETY("90", "14:50", "15:00", "14:50-15:00", "14-90"),

    ORDER_TIMES_NO_NINETY_ONE("91", "15:00", "15:10", "15:00-15:10", "15-91"),
    ORDER_TIMES_NO_NINETY_TWO("92", "15:10", "15:20", "15:10-15:20", "15-92"),
    ORDER_TIMES_NO_NINETY_THREE("93", "15:20", "15:30", "15:20-15:30", "15-93"),
    ORDER_TIMES_NO_NINETY_FOUR("94", "15:30", "15:40", "15:30-15:40", "15-94"),
    ORDER_TIMES_NO_NINETY_FIVE("95", "15:40", "15:50", "15:40-15:50", "15-95"),
    ORDER_TIMES_NO_NINETY_SIX("96", "15:50", "16:00", "15:50-16:00", "15-96"),

    ORDER_TIMES_NO_NINETY_SEVEN("97", "16:00", "16:10", "16:00-16:10", "16-97"),
    ORDER_TIMES_NO_NINETY_EIGHT("98", "16:10", "16:20", "16:10-16:20", "16-98"),
    ORDER_TIMES_NO_NINETY_NINE("99", "16:20", "16:30", "16:20-16:30", "16-99"),
    ORDER_TIMES_NO_ONE_HUNDRED("100", "16:30", "16:40", "16:30-16:40", "16-100"),
    ORDER_TIMES_NO_ONE_HUNDRED_ONE("101", "16:40", "16:50", "16:40-16:50", "16-101"),
    ORDER_TIMES_NO_ONE_HUNDRED_TWO("102", "16:50", "17:00", "16:50-17:00", "16-102"),

    ORDER_TIMES_NO_ONE_HUNDRED_THREE("103", "17:00", "17:10", "17:00-17:10", "17-103"),
    ORDER_TIMES_NO_ONE_HUNDRED_FOUR("104", "17:10", "17:20", "17:10-17:20", "17-104"),
    ORDER_TIMES_NO_ONE_HUNDRED_FIVE("105", "17:20", "17:30", "17:20-17:30", "17-105"),
    ORDER_TIMES_NO_ONE_HUNDRED_SIX("106", "17:30", "17:40", "17:30-17:40", "17-106"),
    ORDER_TIMES_NO_ONE_HUNDRED_SEVEN("107", "17:40", "17:50", "17:40-17:50", "17-107"),
    ORDER_TIMES_NO_ONE_HUNDRED_EIGHT("108", "17:50", "18:00", "17:50-18:00", "17-108"),

    ORDER_TIMES_NO_ONE_HUNDRED_NINE("109", "18:00", "18:10", "18:00-18:10", "18-109"),
    ORDER_TIMES_NO_ONE_HUNDRED_TEN("110", "18:10", "18:20", "18:10-18:20", "18-110"),
    ORDER_TIMES_NO_ONE_HUNDRED_ELEVEN("111", "18:20", "18:30", "18:20-18:30", "18-111"),
    ORDER_TIMES_NO_ONE_HUNDRED_TWELVE("112", "18:30", "18:40", "18:30-18:40", "18-112"),
    ORDER_TIMES_NO_ONE_HUNDRED_THIRTEEN("113", "18:40", "18:50", "18:40-18:50", "18-113"),
    ORDER_TIMES_NO_ONE_HUNDRED_FOURTEEN("114", "18:50", "19:00", "18:50-19:00", "18-114"),

    ORDER_TIMES_NO_ONE_HUNDRED_FIFTEEN("115", "19:00", "19:10", "19:00-19:10", "19-115"),
    ORDER_TIMES_NO_ONE_HUNDRED_SIXTEEN("116", "19:10", "19:20", "19:10-19:20", "19-116"),
    ORDER_TIMES_NO_ONE_HUNDRED_SEVENTEEN("117", "19:20", "19:30", "19:20-19:30", "19-117"),
    ORDER_TIMES_NO_ONE_HUNDRED_EIGHTEEN("118", "19:30", "19:40", "19:30-19:40", "19-118"),
    ORDER_TIMES_NO_ONE_HUNDRED_NINETEEN("119", "19:40", "19:50", "19:40-19:50", "19-119"),
    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY("120", "19:50", "20:00", "19:50-20:00", "19-120");

//    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY_ONE("121", "20:00", "20:10", "20:00-20:10", "20-121"),
//    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY_TWO("122", "20:10", "20:20", "20:10-20:20", "20-122"),
//    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY_THREE("123", "20:20", "20:30", "20:20-20:30", "20-123"),
//    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY_FOUR("124", "20:30", "20:40", "20:30-20:40", "20-124"),
//    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY_FIVE("125", "20:40", "20:50", "20:40-20:50", "20-125"),
//    ORDER_TIMES_NO_ONE_HUNDRED_TWENTY_SIX("126", "20:50", "21:00", "20:50-21:00", "20-126");

    private String timesNo;
    private String minDate;
    private String maxDate;
    private String times;
    private String timesGroup;

/*    OrderTimes(String timesNo, String minDate, String maxDate, String times) {
        this.timesNo = timesNo;
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.times = times;
    }*/

    OrderTimes(String timesNo, String minDate, String maxDate, String times, String timesGroup) {
        this.timesNo = timesNo;
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.times = times;
        this.timesGroup = timesGroup;
    }

    public static String getTimeNo(String times) {
        OrderTimes[] values = OrderTimes.values();
        for (OrderTimes item : values) {
            if (item.times.equals(times)) {
                return item.timesNo;
            }
        }
        return null;
    }

    public static String getMinDate(String timesNo) {
        OrderTimes[] values = OrderTimes.values();
        for (OrderTimes item : values) {
            if (item.timesNo.equals(timesNo)) {
                return item.minDate;
            }
        }
        return null;
    }

    public static String getMaxDate(String timesNo) {
        OrderTimes[] values = OrderTimes.values();
        for (OrderTimes item : values) {
            if (item.timesNo.equals(timesNo)) {
                return item.maxDate;
            }
        }
        return null;
    }

    public static String getTimesGroup(String timesNo) {
        OrderTimes[] values = OrderTimes.values();
        for (OrderTimes item : values) {
            if (item.timesNo.equals(timesNo)) {
                return item.timesGroup;
            }
        }
        return null;
    }

    public static String getTimes(String timesNo) {
        OrderTimes[] values = OrderTimes.values();
        for (OrderTimes item : values) {
            if (item.timesNo.equals(timesNo)) {
                return item.times;
            }
        }
        return null;
    }

    //查看当前时间处于第几段中
    public static String getItemNoAfterCurrentDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        String currentTime = format.format(date);
        String minDate = "";
        String maxDate = "";
        String currentItemNo = "";
        for (int i = 120; 48 < i; i--) {
            minDate = getMinDate(String.valueOf(i));
            if (minDate != null && !minDate.equals("")) {
                if (currentTime.compareTo(minDate) >= 0) {
                    maxDate = getMaxDate(String.valueOf(i));
                    if (currentTime.compareTo(maxDate) >= 0) {
                        currentItemNo = String.valueOf(121);
                    } else {
                        currentItemNo = String.valueOf(i);
                    }
                    break;
                }
            }
        }
        if (currentItemNo == null || currentItemNo.equals("")) {
            currentItemNo = String.valueOf(47);
        }
        return currentItemNo;
    }

    /**
     * 判断当天的每个大时间段的状态(map中地值 1：白色可点  2：红色不可点 3：独立预约人绿色 4：过了时间、不开放灰色)
     *
     * @param appointedTimes 已预约的时间段 indepFlag 是否是独立预约人标记（true 不是， false 是独立预约人）
     * @return
     */
    public static Map<String, String> getTimesStatus(String[] appointedTimes, Boolean indepFlag, String queryDate) {
        List<Integer> appointedTimeList = new ArrayList<Integer>();
        if (appointedTimes != null && appointedTimes.length > 0) {
            for (int i = 0; i < appointedTimes.length; i++) {
                appointedTimeList.add(Integer.parseInt(appointedTimes[i]));
            }
        }
        Map<String, String> result = new HashMap<String, String>();
        Integer currentTime = Integer.parseInt(getItemNoAfterCurrentDate());//获取当前的时间所处时间段
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date queryTime = format.parse(queryDate);
            if (queryTime.after(new Date())) {
                currentTime = 0;//比当前时间大
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Map<String, List<Integer>> map = TopOpenStatus.createTimeMap();
        for (String key : map.keySet()) {
            if (key.equals("eight")) {
                result.put("eight", "4");//设置八点的不开放
            } else {
                getTimeStatus(key, map.get(key), result, appointedTimeList, currentTime, indepFlag);
            }
        }
        return result;
    }

    private static void getTimeStatus(String key, List<Integer> numLists, Map<String, String> map, List<Integer> appointedTimeList, Integer currentTime, Boolean indepFlag) {
        List<Integer> instIndependentUserTimesList = TopOpenStatus.getInstIndependentUserTimesList();
        List<Integer> numList = new ArrayList<Integer>();
        numList = numLists;
        numList.removeAll(appointedTimeList);
        List<Integer> subList = null;
        if (numList == null || numList.size() == 0) {
            map.put(key, "2");
        } else {
            subList = new ArrayList<Integer>();
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) >= currentTime) {
                    subList.add(numList.get(i));
                }
            }
            if (subList == null || subList.size() == 0) {
                map.put(key, "4");
            } else {
                if (!indepFlag) {
                    map.put(key, "1");
                } else {
                    subList.removeAll(instIndependentUserTimesList);
                    if (subList == null || subList.size() == 0) {
                        map.put(key, "3");
                    } else {
                        map.put(key, "1");
                    }
                }
            }
        }
    }
}
