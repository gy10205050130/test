package yxinfo.ow.inf.service.news;

import yxinfo.ow.inf.dto.PageDTO;
import yxinfo.ow.inf.dto.news.LisNewsDTO;

import java.util.List;

/**
 * Created by cy on 2017/2/17.
 */
public interface OwNewsService {

    /**
     * 发布新闻
     *
     * @param lisNewsDTO
     * @return
     */
    Integer addNews(LisNewsDTO lisNewsDTO);

    /**
     * 通过id查询新闻
     *
     * @param newsId 新闻id
     * @return
     */
    LisNewsDTO getNewsById(Integer newsId);

    /**
     * 通过id更新新闻
     *
     * @param lisNewsDTO
     * @return
     */
    Integer updateNewsById(LisNewsDTO lisNewsDTO);

    /**
     * 分页获取新闻的列表
     *
     * @param pageQuery
     * @return
     */
    PageDTO<List<LisNewsDTO>> getLisNewsDtoIdxList(PageDTO<LisNewsDTO> pageQuery);

    /**
     * 通过id来删除新闻
     *
     * @param newsId
     * @return
     */
    Integer deleteNewsById(Integer newsId);

}
