package yxinfo.dct.inteface.context.instrument;

/**
 * Created by ZH on 2017/1/3.
 */
public interface InstReserCoreFstatus {

    //1审核中，2待使用，3已驳回，4使用中 5 已使用
    String REVIWING = "1";
    String TO_BE_USED = "2";
    String REJECT = "3";
    String USEING = "4";
    String USED = "5";

}
