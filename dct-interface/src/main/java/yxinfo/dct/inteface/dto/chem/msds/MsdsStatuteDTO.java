package yxinfo.dct.inteface.dto.chem.msds;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.Date;

public class MsdsStatuteDTO extends BaseDTO {

    private Integer msdsId;

    // 运输信息_危险货物编号
    private String dangerGoodsNo;

    // 运输信息_UN编号
    private String unNo;

    // 运输信息_包装标志
    private String packingMark;

    // 运输信息_包装类别
    private String packingCate;

    // 运输信息_包装方法
    private String packingMethod;

    private Date updateAt;

    // 运输信息_运输注意事项
    private String transCautions;

    // 法规信息_法规信息
    private String statuteInfo;

    public Integer getMsdsId() {
        return msdsId;
    }

    public void setMsdsId( Integer msdsId ) {
        this.msdsId = msdsId;
    }

    public String getDangerGoodsNo() {
        return dangerGoodsNo;
    }

    public void setDangerGoodsNo( String dangerGoodsNo ) {
        this.dangerGoodsNo = dangerGoodsNo;
    }

    public String getUnNo() {
        return unNo;
    }

    public void setUnNo( String unNo ) {
        this.unNo = unNo;
    }

    public String getPackingMark() {
        return packingMark;
    }

    public void setPackingMark( String packingMark ) {
        this.packingMark = packingMark;
    }

    public String getPackingCate() {
        return packingCate;
    }

    public void setPackingCate( String packingCate ) {
        this.packingCate = packingCate;
    }

    public String getPackingMethod() {
        return packingMethod;
    }

    public void setPackingMethod( String packingMethod ) {
        this.packingMethod = packingMethod;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt( Date updateAt ) {
        this.updateAt = updateAt;
    }

    public String getTransCautions() {
        return transCautions;
    }

    public void setTransCautions( String transCautions ) {
        this.transCautions = transCautions;
    }

    public String getStatuteInfo() {
        return statuteInfo;
    }

    public void setStatuteInfo( String statuteInfo ) {
        this.statuteInfo = statuteInfo;
    }
}