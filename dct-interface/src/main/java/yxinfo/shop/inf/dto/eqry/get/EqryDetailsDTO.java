package yxinfo.shop.inf.dto.eqry.get;

import yxinfo.dct.inteface.dto.approve.ApproveExecFlowDTO;
import yxinfo.dct.inteface.dto.base.MemberDTO;
import yxinfo.dct.inteface.dto.chem.apply.biz.ChemAReceiveNodeDTO;
import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.eqry.EqryCoreDTO;

import java.util.List;

/**
 * Created by dy on 2016/8/24.
 */
public class EqryDetailsDTO extends BaseDTO {

    private static final long serialVersionUID = 1361664012444849225L;

    // 订单详情
    private EqryCoreDTO eqry;

    // 审核方案
    private List<ApproveExecFlowDTO> execFlows;

    // 审核节点信息
    private List<ChemAReceiveNodeDTO> approveNodes;

    // 当前所处审核步骤
    private Integer onStep;

    // 审核状态（u未提交, o审核中, s审核通过, f审核不通过, i已作废）
    private String status;

    // 申请人
    private MemberDTO member;

    // 审核记录id
    private Integer approveRecodeId;

    // 审核itemNo
    private String itemNo;

    // 选择的报价
    private List<ChooseOfferRetDTO> chooseOffers;

    public EqryCoreDTO getEqry() {
        return eqry;
    }

    public void setEqry( EqryCoreDTO eqry ) {
        this.eqry = eqry;
    }

    public List<ApproveExecFlowDTO> getExecFlows() {
        return execFlows;
    }

    public void setExecFlows( List<ApproveExecFlowDTO> execFlows ) {
        this.execFlows = execFlows;
    }

    public List<ChemAReceiveNodeDTO> getApproveNodes() {
        return approveNodes;
    }

    public void setApproveNodes( List<ChemAReceiveNodeDTO> approveNodes ) {
        this.approveNodes = approveNodes;
    }

    public Integer getOnStep() {
        return onStep;
    }

    public void setOnStep( Integer onStep ) {
        this.onStep = onStep;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus( String status ) {
        this.status = status;
    }

    public MemberDTO getMember() {
        return member;
    }

    public void setMember( MemberDTO member ) {
        this.member = member;
    }

    public Integer getApproveRecodeId() {
        return approveRecodeId;
    }

    public void setApproveRecodeId( Integer approveRecodeId ) {
        this.approveRecodeId = approveRecodeId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo( String itemNo ) {
        this.itemNo = itemNo;
    }

    public List<ChooseOfferRetDTO> getChooseOffers() {
        return chooseOffers;
    }

    public void setChooseOffers( List<ChooseOfferRetDTO> chooseOffers ) {
        this.chooseOffers = chooseOffers;
    }
}
