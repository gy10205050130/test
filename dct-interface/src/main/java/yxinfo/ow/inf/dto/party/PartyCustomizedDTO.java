package yxinfo.ow.inf.dto.party;

import yxinfo.ow.inf.dto.BaseDTO;

/**
 * @author tj
 * @date 2016/9/26 11:22
 */
public class PartyCustomizedDTO extends BaseDTO {
    ////单位id
    private Integer partyId;

    //logo图片id
    private String logos;

    //标题图片id
    private String banners;

    //轮播图片id
    private String carousels;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getLogos() {
        return logos;
    }

    public void setLogos(String logos) {
        this.logos = logos;
    }

    public String getBanners() {
        return banners;
    }

    public void setBanners(String banners) {
        this.banners = banners;
    }

    public String getCarousels() {
        return carousels;
    }

    public void setCarousels(String carousels) {
        this.carousels = carousels;
    }
}
