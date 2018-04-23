package yxinfo.lis.inf.context.mbr;

/**
 * @author lovetcat
 * @date 2016/8/1 16:52
 */
public interface MemberCoreType {

    //有课题的校内人员
    int MEMBER_HAVE_TOPIC = 1;

    //附属医院人员
    int MEMBER_SUBSIDIARY_HOSPITAL = 2;

    //校外人员（包括无课题的非附属医院的校内人员）
    int MEMBER_OUTSIDE_PARTY = 3;

    Integer INIT_CREDIT_SCORE = 12;

}
