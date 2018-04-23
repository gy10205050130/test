package yxinfo.dct.inteface.context.mq;

/**
 * 消息标签
 * Created by dy on 2016/8/4.
 */
public interface MqTag {

    interface Warn {

        // 预警
        String WARN = "TAG_DCT_WARN";
    }

    interface Monitor {

        // 监控-湿度
        String HUM = "TAG_DCT_MONITOR_HUM";

        // 监控-插座
        String SOCKET = "TAG_DCT_MONITOR_SOCKET";

        // 监控-温度
        String TEMP = "TAG_DCT_MONITOR_TEMP";
    }

    interface Chem {

        // 试剂轨迹详情
        String CHEM_TRAJ_DETAIL = "TAG_DCT_CHEM_TRAJ_DETAIL";

        // 采购入库成功
        String CHEM_4SHOP_INTOWH_SUCCESS = "TAG_DCT_CHEM_4SHOP_INTOWH_SUCCESS";
    }

    interface Message {

        // 消息
        String MESSAGE = "TAG_DCT_MESSAGE";
    }
}
