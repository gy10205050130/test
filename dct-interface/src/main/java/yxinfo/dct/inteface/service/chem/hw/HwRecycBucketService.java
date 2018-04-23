package yxinfo.dct.inteface.service.chem.hw;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.hw.HwRecycBucketDTO;

import java.util.List;

/**
 * Created by dy on 2016/11/3.
 */
public interface HwRecycBucketService {

    /**
     * 获取废液桶信息
     * @param id     废液桶id, id/rfcode必传其一
     * @param rfcode 废液桶RFID码
     * @param qr     RFID码加密方式, true二维码/false标签码
     * @return
     */
    HwRecycBucketDTO getHwRecycBucket( Integer id, String rfcode, boolean qr );

    /**
     * 添加废液桶
     * @code 108065
     * @param bucket
     * @param qr RFID码加密方式, true二维码/false标签码
     */
    void addRecycBucket( HwRecycBucketDTO bucket, boolean qr );

    /**
     * 获取废液桶列表
     * @code 108066
     * @param schPage
     * @return
     */
    PageDTO<List<HwRecycBucketDTO>> getHwRecycBucketPage( PageDTO<HwRecycBucketDTO> schPage );

    /**
     * 删除废液桶
     * @code 108067
     * @param bucketId
     */
    void deleteBucket( Integer bucketId );
}
