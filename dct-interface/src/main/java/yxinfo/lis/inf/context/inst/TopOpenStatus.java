package yxinfo.lis.inf.context.inst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 预约列表最前面的时间块的状态
 * <p>
 * Created by cy on 2016/12/16.
 */
public class TopOpenStatus {

    public static Map<String, List<Integer>> createTimeMap() {
        List<Integer> eightList = new ArrayList<Integer>();
        eightList.add(49);
        eightList.add(50);
        eightList.add(51);
        eightList.add(52);
        eightList.add(53);
        eightList.add(54);
        List<Integer> nineList = new ArrayList<Integer>();
        nineList.add(55);
        nineList.add(56);
        nineList.add(57);
        nineList.add(58);
        nineList.add(59);
        nineList.add(60);
        List<Integer> tenList = new ArrayList<Integer>();
        tenList.add(61);
        tenList.add(62);
        tenList.add(63);
        tenList.add(64);
        tenList.add(65);
        tenList.add(66);
        List<Integer> elevenList = new ArrayList<Integer>();
        elevenList.add(67);
        elevenList.add(68);
        elevenList.add(69);
        elevenList.add(70);
        elevenList.add(71);
        elevenList.add(72);
        List<Integer> twelveList = new ArrayList<Integer>();
        twelveList.add(73);
        twelveList.add(74);
        twelveList.add(75);
        twelveList.add(76);
        twelveList.add(77);
        twelveList.add(78);
        List<Integer> thirteenList = new ArrayList<Integer>();
        thirteenList.add(79);
        thirteenList.add(80);
        thirteenList.add(81);
        thirteenList.add(82);
        thirteenList.add(83);
        thirteenList.add(84);
        List<Integer> fourteenList = new ArrayList<Integer>();
        fourteenList.add(85);
        fourteenList.add(86);
        fourteenList.add(87);
        fourteenList.add(88);
        fourteenList.add(89);
        fourteenList.add(90);
        List<Integer> fifteenList = new ArrayList<Integer>();
        fifteenList.add(91);
        fifteenList.add(92);
        fifteenList.add(93);
        fifteenList.add(94);
        fifteenList.add(95);
        fifteenList.add(96);
        List<Integer> sixteenList = new ArrayList<Integer>();
        sixteenList.add(97);
        sixteenList.add(98);
        sixteenList.add(99);
        sixteenList.add(100);
        sixteenList.add(101);
        sixteenList.add(102);
        List<Integer> seventeenList = new ArrayList<Integer>();
        seventeenList.add(103);
        seventeenList.add(104);
        seventeenList.add(105);
        seventeenList.add(106);
        seventeenList.add(107);
        seventeenList.add(108);
        List<Integer> eighteenList = new ArrayList<Integer>();
        eighteenList.add(109);
        eighteenList.add(110);
        eighteenList.add(111);
        eighteenList.add(112);
        eighteenList.add(113);
        eighteenList.add(114);
        List<Integer> nineteenList = new ArrayList<Integer>();
        nineteenList.add(115);
        nineteenList.add(116);
        nineteenList.add(117);
        nineteenList.add(118);
        nineteenList.add(119);
        nineteenList.add(120);

        Map<String, List<Integer>> timeMap = new HashMap<String, List<Integer>>();
        timeMap.put("eight", eightList);
        timeMap.put("nine", nineList);
        timeMap.put("ten", tenList);
        timeMap.put("eleven", elevenList);
        timeMap.put("twelve", twelveList);
        timeMap.put("thirteen", thirteenList);
        timeMap.put("fourteen", fourteenList);
        timeMap.put("fifteen", fifteenList);
        timeMap.put("sixteen", sixteenList);
        timeMap.put("seventeen", seventeenList);
        timeMap.put("eighteen", eighteenList);
        timeMap.put("nineteen", nineteenList);

        return timeMap;
    }

    /**
     * 获取独立预约人可约时间段
     *
     * @return
     */
    public static List<Integer> getInstIndependentUserTimesList() {
        List<Integer> instIndependentUserTimesList = new ArrayList<Integer>();
        for (int i = 97; i <= 120; i++) {
            instIndependentUserTimesList.add(i);
        }
        return instIndependentUserTimesList;
    }
}
