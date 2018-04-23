package yxinfo.lis.inf.service.topic;

import yxinfo.lis.inf.dto.PageDTO;
import yxinfo.lis.inf.dto.mbr.MemberCoreDTO;
import yxinfo.lis.inf.dto.topic.LisTopicDTO;
import yxinfo.lis.inf.dto.topic.LisTopicMemberDTO;

import java.util.List;

/**
 * Created by cy on 2016/10/11.
 * <p>
 * 课题的service
 */
public interface TopicService {

    /**
     * 添加课题
     *
     * @param dto
     * @return
     */
    Integer addTopic(LisTopicDTO dto);

    /**
     * 新增一个人员到课题下
     *
     * @param topicMemberDTO
     * @return
     */
    Integer addTopicMember(LisTopicMemberDTO topicMemberDTO);

    /**
     * 获取课题记录
     *
     * @return
     */
    List<LisTopicDTO> getLisTopicList(LisTopicDTO dto);

    /**
     * 分页获取课题记录
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<LisTopicDTO>> getPageLisTopicList(PageDTO<LisTopicDTO> queryPage);

    /**
     * 获取课题下的人员信息分页
     *
     * @param queryPage
     * @return
     */
    PageDTO<List<LisTopicMemberDTO>> getPageTopicMemberList(PageDTO<LisTopicDTO> queryPage);

    /**
     * 根据课题id获取人员信息（包括子节点的课题下的人员）
     *
     * @param dto
     * @return
     */
    List<LisTopicMemberDTO> getTopicMemberWithChildList(LisTopicDTO dto);

    /**
     * 删除课题对应的人员
     *
     * @param topicMemberDTO
     * @return
     */
    Integer deleteTopicMember(LisTopicMemberDTO topicMemberDTO);

    /**
     * 删除课题
     *
     * @param lisTopicDTO
     * @return
     */
    Integer deleteTopicById(LisTopicDTO lisTopicDTO);

    /**
     * 更新课题
     *
     * @param lisTopicDTO
     * @return
     */
    Integer updateTopic(LisTopicDTO lisTopicDTO);

    /**
     * 根据父节点获取课题信息
     *
     * @param id
     * @return
     */
    List<LisTopicDTO> getChildTopicListByPid(Integer id);

    /**
     * 根据课题id获取人员
     *
     * @param id
     * @return
     */
    List<LisTopicMemberDTO> getTopicMemberList(Integer id);

    /**
     * 根据成员id获取课题
     *
     * @param lisTopicDTO
     * @return
     */
    List<LisTopicDTO> getTopicDtoListByMemberId(LisTopicDTO lisTopicDTO);

    /**
     * 条件查询课题列表（不需要partyid）
     *
     * @param lisTopicDTO
     * @return
     */
    List<LisTopicDTO> getTopicDtoList(LisTopicDTO lisTopicDTO);

    /**
     * 判断是否是课题组成员
     *
     * @param dto
     * @return
     */
    Boolean isTopicMember(MemberCoreDTO dto);

    /**
     * 根据课题id获取课题
     *
     * @param topicId
     * @return
     */
    LisTopicDTO getLisTopicByKey(Integer topicId);

    /**
     * 获取课题列表(必传memberid，经费卡、代金券,预付款支付选择时查询用)
     *
     * @param lisTopicDTO
     * @return
     */
    PageDTO<List<LisTopicDTO>> getLisTopicListOnPay(PageDTO<LisTopicDTO> lisTopicDTO);
}
