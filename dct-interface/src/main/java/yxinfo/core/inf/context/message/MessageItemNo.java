package yxinfo.core.inf.context.message;

/**
 * 消息项目编号
 * Created by dy on 2016/6/28.
 */
public interface MessageItemNo {

    // 化学试剂
    interface Chem {

        // 同意或驳回化学试剂领取申请
        String APPLEY_PASS_OR_NOT = "msg0001";

        // 化学试剂回收 #
        // String REAGENT_RECYCLE = "msg0002";

        // 化学试剂领取申请待审核
        String WAIT_APV_APPLEY = "msg0003";

        // 化学试剂被领用通知全部审核人
        String REAGENT_RECEIVE = "msg0004";

        // 试剂领取申请时, 通知五双同行人确认
        String NTF_MEMBER_SEC_CFM_4_APPLEY = "msg0026";

        // 试剂领取申请时, 五双同行人确认, 通知申请人
        String MEMBER_SEC_CFM_4_APPLEY = "msg0027";

        // 在待领用列表设置五双同行人时, 通知同行人确认
        String NTF_MEMBER_SEC_CFM_4_RECEIVE = "msg0028";

        // 在待领用列表设置五双同行人时, 同行人确认, 通知设置人
        String MEMBER_SEC_CFM_4_RECEIVE = "msg0029";

        // 同意或驳回入库确认
        String INTOWH_CFM_PASS_OR_NOT = "msg0030";

        // 入库确认
        String INTOWH_CFM = "msg0031";
    }

    // 仪器预约（原企业）
    interface Inst {

        // 同意/驳回仪器预约
        String INST_BESPEAK_PASS_OR_NOT = "msg0008";

        // 仪器预约待审核
        String WAIT_APV_INST_BESPEAK = "msg0010";
    }

    // 预警
    interface Warn {

        // 推送
        String PUSH = "msg0017";
    }

    // 电商
    interface Shop {

        // 同意或驳回购买订单
        String ORDER_PASS_OR_NOT = "msg0018";

        // 购买订单待审核
        String WAIT_APV_ORDER = "msg0019";

        // 询价单审核
        String WAIT_APV_EQRY = "msg0021";

        // 同意或驳回询价单
        String EQRY_PASS_OR_NOT = "msg0022";

        // 询价报价选择不通过
        String EQRY_CHOOSE_NOT_PASS = "msg0032";

        // 询价供应商报价已结束
        String EQRY_MER_OFFER_END = "msg0033";

        // 询价有供应商报价
        String EQRY_HAS_MER_OFFER = "msg0034";

        // 购买订单发货
        String ORDER_DELIVER_GOODS = "msg0036";

        // 购买订单确认收货并入库
        String ORDER_CONFIRM_RECEIPT_AND_INTO_WH = "msg0037";

        // 购买订单交易完成
        String ORDER_FINISH = "msg0038";
    }

    // 仪器预约（2.0）
    interface Instrument {

        // 仪器预约待审核
        String WAIT_APV_INSTRESER = "msg0024";

        // 同意或驳回审核
        String INSTRESER_APV_PASS_OR_NOT = "msg0025";
    }
}
