package yxinfo.shop.inf.dto.eqry.apv;

import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;
import yxinfo.shop.inf.dto.eqry.EqryOfferDTO;

/**
 * Created by dy on 2016/8/25.
 */
public class ChooseApvRdDTO extends BaseDTO {

    private static final long serialVersionUID = 6077239444817241898L;

    // 询价单信息
    private EqryCoreDTO eqry;

    // 申请人
    private MemberDTO member;

    // 状态（s审核通过, f审核不通过）
    private String status;

    // 审核记录id
    private Integer approveRecodeId;

    // 当前审核所处步骤
    private Integer onStep;

    // 审核itemNo
    private String itemNo;

    // 当前选择的报价
    private EqryOfferDTO choose;

    // 选择报价的次数
    private Integer chooseNum;

    // 最低报价
    private EqryOfferDTO minOffer;

    public EqryCoreDTO getEqry() {
        return eqry;
    }

    public void setEqry( EqryCoreDTO eqry ) {
        this.eqry = eqry;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public Integer getOnStep() {
        return onStep;
    }

    public void setOnStep( Integer onStep ) {
        this.onStep = onStep;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }

    public EqryOfferDTO getChoose() {
        return choose;
    }

    public void setChoose( EqryOfferDTO choose ) {
        this.choose = choose;
    }

    public Integer getChooseNum() {
        return chooseNum;
    }

    public void setChooseNum( Integer chooseNum ) {
        this.chooseNum = chooseNum;
    }

    public EqryOfferDTO getMinOffer() {
        return minOffer;
    }

    public void setMinOffer( EqryOfferDTO minOffer ) {
        this.minOffer = minOffer;
    }
}
