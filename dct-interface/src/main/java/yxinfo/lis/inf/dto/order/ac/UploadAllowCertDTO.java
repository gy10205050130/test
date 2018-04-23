package yxinfo.lis.inf.dto.order.ac;

import org.hibernate.validator.constraints.NotEmpty;
import yxinfo.lis.inf.context.ErrorCode;
import yxinfo.lis.inf.dto.BaseDTO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dy on 2016/8/27.
 */
public class UploadAllowCertDTO extends BaseDTO {

    private static final long serialVersionUID = -6574686553751544937L;

    @NotEmpty( message = ErrorCode.NOT_EMPTY )
    private List<String> batchNos;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer allowCert;

    @NotNull( message = ErrorCode.NOT_NULL )
    private Integer partyId;

    public List<String> getBatchNos() {
        return batchNos;
    }

    public void setBatchNos( List<String> batchNos ) {
        this.batchNos = batchNos;
    }

    public Integer getAllowCert() {
        return allowCert;
    }

    public void setAllowCert( Integer allowCert ) {
        this.allowCert = allowCert;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId( Integer partyId ) {
        this.partyId = partyId;
    }
}
