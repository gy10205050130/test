package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2016/9/1.
 */
public class MerExamineDTO extends BaseDTO{

    /**
     * 合作分类
     */
    private List<MerPartyDTO> merPartyDTOList;

    private MerAuthDTO merAuthDTO;

    public List<MerPartyDTO> getMerPartyDTOList() {
        return merPartyDTOList;
    }

    public void setMerPartyDTOList(List<MerPartyDTO> merPartyDTOList) {
        this.merPartyDTOList = merPartyDTOList;
    }

    public MerAuthDTO getMerAuthDTO() {
        return merAuthDTO;
    }

    public void setMerAuthDTO(MerAuthDTO merAuthDTO) {
        this.merAuthDTO = merAuthDTO;
    }

    @Override
    public String toString() {
        return "MerExamineDTO{" +
                "merPartyDTOList=" + merPartyDTOList +
                ", merAuthDTO=" + merAuthDTO +
                '}';
    }
}
