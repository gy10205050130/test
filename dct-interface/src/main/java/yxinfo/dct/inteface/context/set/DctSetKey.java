package yxinfo.dct.inteface.context.set;

/**
 * Created by dy on 2016/12/5.
 */
public interface DctSetKey {

    interface Core {
        // 仓库管理员角色id
        String WH_MANAGER_ROLE_ID = "chem_core_wh_manager_role_id";

        // 上传地址
        String UPLOAD_URL = "chem_core_upload_url";
    }

    interface Apply {
        // 化学试剂申领单审核限制天数，超过则失效
        String APV_EXPIRED_DAYS = "chem_ar_apv_expired_days";

        // 未领用的化学试剂申领单自审核通过之日起的失效天数
        String RECEIVE_EXPIRED_DAYS = "chem_ar_receive_expired_days";

        // 申领模式（1按瓶，2按量）
        String APPLY_MODE = "chem_ar_apply_mode";
    }

    interface Reagent {
        // 剧毒品双人管理类型
        String DOUBLE_MGT_TYPE = "chem_reagent_double_mgt_type";

        // 自入库时间（intowh_at）后多少天可调配
        String BECOME_ALLOCABLE_DAYS = "chem_reagent_become_allocable_days";

        // 无归属试剂称呼
        String ALLOT_NAME = "chem_reagent_allot_name";

        // 试剂领用五双确认有效时间（秒）
        String RECEIVE_CFM_VALID = "chem_reagent_receive_cfm_valid";
    }

    interface Chem4Shop {
        // 剧毒品双人管理类型
        String REAGENT_CAT_ID = "chem_chem4shop_reagent_cat_id";
    }
}
