package yxinfo.shop.inf.dto.mer;

import yxinfo.shop.inf.dto.BaseDTO;
import yxinfo.shop.inf.dto.goods.GoodsCatDTO;

import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public class MerGoodsCatListDTO extends BaseDTO {

    private GoodsCatDTO goodsCatDTO;

    private List < MerCoreDTO > merCoreDTOList;

    public GoodsCatDTO getGoodsCatDTO() {
        return goodsCatDTO;
    }

    public void setGoodsCatDTO(GoodsCatDTO goodsCatDTO) {
        this.goodsCatDTO = goodsCatDTO;
    }

    public List<MerCoreDTO> getMerCoreDTOList() {
        return merCoreDTOList;
    }

    public void setMerCoreDTOList(List<MerCoreDTO> merCoreDTOList) {
        this.merCoreDTOList = merCoreDTOList;
    }

    @Override
    public String toString() {
        return "MerGoodsCatListDTO{" +
                "goodsCatDTO=" + goodsCatDTO +
                ", merCoreDTOList=" + merCoreDTOList +
                '}';
    }
}
