package yxinfo.dct.inteface.service.chem.chem;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.chem.chemical.*;

import java.util.List;

/**
 * 化学品名称服务
 * Created by dy on 2016/6/22.
 */
public interface ChemChemicalService {

    /**
     * 分页查询化学品名称
     * @code 108003
     * @param chemChemicalPage
     * @return
     */
    PageDTO<List<ChemChemicalDTO>> getChemPage( PageDTO<ChemChemicalDTO> chemChemicalPage );

    /**
     * 根据id获取化学品名称
     * @code 108018
     * @param id
     * @return
     */
    ChemChemicalDTO getChemKey( Integer id );

    /**
     * 根据名称获取化学品名称
     * @param chemName
     * @return
     */
    ChemChemicalDTO getChemName( String chemName );

    /**
     * 根据cas获取化学品名称
     * @param cas
     * @return
     */
    List<ChemChemicalDTO> getChemByCas( String cas );

    /**
     * 单位列表
     * @code 108012
     * @return
     */
    List<ChemUnitDTO> getUnits();

    /**
     * 根据id获取单位
     * @param id
     * @return
     */
    ChemUnitDTO getUnit( Integer id );

    /**
     * 规格列表
     * @code 108013
     * @return
     */
    List<ChemSpecDTO> getSpecs();

    /**
     * 根据id获取规格
     * @param id
     * @return
     */
    ChemSpecDTO getSpec( Integer id );

    /**
     * 添加化学品名称
     * @code 108039
     * @param chemicalDTO
     * @return
     */
    int addChem( ChemChemicalDTO chemicalDTO );

    /**
     * 修改化学品名称
     * @code 108040
     * @param chemicalDTO
     * @return
     */
    int editChem( ChemChemicalDTO chemicalDTO );
}
