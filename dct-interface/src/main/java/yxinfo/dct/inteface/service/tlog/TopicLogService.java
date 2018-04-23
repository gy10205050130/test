package yxinfo.dct.inteface.service.tlog;

import yxinfo.dct.inteface.dto.PageDTO;
import yxinfo.dct.inteface.dto.tlog.TopicLogDTO;

import java.util.List;


/**
 * 课题日志service
 *
 *
 * Created by cy on 2016/6/22.
 */
public interface TopicLogService {

    /**
     * 添加课题日志
     *
     * @param topicLogDTO
     * @return
     */
    Integer addTopicLogDTOForTeacher(TopicLogDTO topicLogDTO, Integer type );

    /**
     * 添加课题日志
     *
     * @param topicLogDTO
     * @return
     */
    Integer addTopicLogDTOForStudent(TopicLogDTO topicLogDTO, Integer type );

    /**
     * 老师端修改课题日志
     * @param topicLogDTO
     * @param type 1.存草稿，2提交
     * @return
     */
    Integer updateTopicLogDTOForTeacher (TopicLogDTO topicLogDTO ,Integer type );

    /**
     * 学生端修改课题日志
     * @param topicLogDTO
     * @param type 1.存草稿，2提交
     * @return
     */
    Integer updateTopicLogDTOForStudent(TopicLogDTO topicLogDTO,Integer type);

    /**
     * 老师审阅课题日志
     * @param topicLogDTO
     * @return
     */
    Integer updateTopicLogDTOForReview ( TopicLogDTO topicLogDTO );

    /**
     * 课题日志列表分页
     * @param queryPage
     * @param type 1.我的课题日志 2.学生的日志
     * @return
     */
    PageDTO<List<TopicLogDTO>> getTopicLogDTOPageList ( PageDTO<TopicLogDTO> queryPage , Integer type );

    /**
     * 获取课题日志详情
     * @param id
     * @return
     */
    TopicLogDTO getTopicLogDTOByKey ( Integer id );
}
