package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/15.
 */
public class MerPlaceOrderDTO extends BaseDTO{

    private MerCoreDTO merCoreDTO;

    private List<MerGoodsCatDTO> merGoodsCatDTOList;

    private List<MerTranChannelDTO> merTranChannelDTOList;

    public MerCoreDTO getMerCoreDTO() {
        return merCoreDTO;
    }

    public void setMerCoreDTO(MerCoreDTO merCoreDTO) {
        this.merCoreDTO = merCoreDTO;
    }

    public List<MerGoodsCatDTO> getMerGoodsCatDTOList() {
        return merGoodsCatDTOList;
    }

    public void setMerGoodsCatDTOList(List<MerGoodsCatDTO> merGoodsCatDTOList) {
        this.merGoodsCatDTOList = merGoodsCatDTOList;
    }

    public List<MerTranChannelDTO> getMerTranChannelDTOList() {
        return merTranChannelDTOList;
    }

    public void setMerTranChannelDTOList(List<MerTranChannelDTO> merTranChannelDTOList) {
        this.merTranChannelDTOList = merTranChannelDTOList;
    }

    @Override
    public String toString() {
        return "MerPlaceOrderDTO{" +
                "merCoreDTO=" + merCoreDTO +
                ", merGoodsCatDTOList=" + merGoodsCatDTOList +
                ", merTranChannelDTOList=" + merTranChannelDTOList +
                '}';
    }
}
