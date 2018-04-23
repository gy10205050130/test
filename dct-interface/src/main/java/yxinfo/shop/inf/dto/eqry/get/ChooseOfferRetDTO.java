package yxinfo.shop.inf.dto.eqry.get;

import yxinfo.shop.inf.dto.BaseDTO;

import java.util.Date;

public class ChooseOfferRetDTO extends BaseDTO {

    private static final long serialVersionUID = 6088082268580796729L;

    private Integer price;

    private String merName;

    private String chooseNote;

    private Date chooseAt;

    private String rejectNote;

    private Date rejectAt;

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price ) {
        this.price = price;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName( String merName ) {
        this.merName = merName;
    }

    public String getChooseNote() {
        return chooseNote;
    }

    public void setChooseNote( String chooseNote ) {
        this.chooseNote = chooseNote;
    }

    public Date getChooseAt() {
        return chooseAt;
    }

    public void setChooseAt( Date chooseAt ) {
        this.chooseAt = chooseAt;
    }

    public String getRejectNote() {
        return rejectNote;
    }

    public void setRejectNote( String rejectNote ) {
        this.rejectNote = rejectNote;
    }

    public Date getRejectAt() {
        return rejectAt;
    }

    public void setRejectAt( Date rejectAt ) {
        this.rejectAt = rejectAt;
    }
}