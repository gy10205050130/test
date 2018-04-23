package yxinfo.dct.inteface.dto.instrument;

import yxinfo.dct.inteface.dto.BaseDTO;

import java.util.List;

/**
 * Created by ZH on 2017/1/4.
 */
public class InstReserDTO extends BaseDTO {

    private Integer instId;

    private String fname;

    private List<InstReserDetailDTO> instReserDetailDTOs;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public List<InstReserDetailDTO> getInstReserDetailDTOs() {
        return instReserDetailDTOs;
    }

    public void setInstReserDetailDTOs(List<InstReserDetailDTO> instReserDetailDTOs) {
        this.instReserDetailDTOs = instReserDetailDTOs;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    @Override
    public String toString() {
        return "InstReserDTO{" +
                "instId=" + instId +
                ", fname='" + fname + '\'' +
                ", instReserDetailDTOs=" + instReserDetailDTOs +
                '}';
    }
}
