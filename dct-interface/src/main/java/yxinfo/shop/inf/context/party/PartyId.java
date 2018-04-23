package yxinfo.shop.inf.context.party;

/**
 * Created by dy on 2016/8/16.
 */
public interface PartyId {

    // 平台
    int PLAT_PARTY_ID = 1;

    // 中医药大学
    int ZCMU_PARTY_ID = 2;

    // 浙江元欣大学
    int YX_SCHOOL_PARTY_ID = 99;

    //暂时定义一个可以直接插入的partyId串
    String PARTY_ID_NO_LIMIT = "1";

    //所有的平台id（元欣不在此列）
    String PARTY_ID_EXCEPT_PLAT = "2,99";

    //在商户主页中使用方只看到合作的分类（有此需求的使用方id）
    String GOODS_IN_COLLABORATE_PARTYID = "2";
}
