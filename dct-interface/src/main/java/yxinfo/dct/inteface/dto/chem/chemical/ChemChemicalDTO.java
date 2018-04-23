package yxinfo.dct.inteface.dto.chem.chemical;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.dct.inteface.context.errcode.dct.ErrorCode;
import yxinfo.dct.inteface.dto.BaseDTO;
import yxinfo.dct.inteface.validation.groups.Add;
import yxinfo.dct.inteface.validation.groups.Update;

import javax.validation.constraints.NotNull;

/**
 * 化学品DTO
 * Created by dy on 2016/6/21.
 */
public class ChemChemicalDTO extends BaseDTO {

    private static final long serialVersionUID = 3260127290853065121L;

    @NotNull( groups = Update.class, message = ErrorCode.CHEM_CHEM_ID_NOT_EMPTY )
    private Integer id;

    // 名称
    @NotEmpty( groups = Add.class, message = ErrorCode.NAME_NOT_EMPTY )
    private String fname;

    // 英文名称
    private String enName;

    // CAS码
    private String cas;

    // 名称拼音
    private String pyinName;

    // 名称长度
    private Integer nameLen;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName( String enName ) {
        this.enName = enName;
    }

    public String getCas() {
        return cas;
    }

    public void setCas( String cas ) {
        this.cas = cas;
    }

    public String getPyinName() {
        return pyinName;
    }

    public void setPyinName( String pyinName ) {
        this.pyinName = pyinName;
    }

    public Integer getNameLen() {
        return nameLen;
    }

    public void setNameLen( Integer nameLen ) {
        this.nameLen = nameLen;
    }
}
