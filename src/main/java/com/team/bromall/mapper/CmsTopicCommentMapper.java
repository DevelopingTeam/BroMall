package com.team.bromall.mapper;

import com.team.bromall.model.CmsTopicComment;
import com.team.bromall.model.CmsTopicCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    long countByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insert(CmsTopicComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insertSelective(CmsTopicComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    List<CmsTopicComment> selectByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    CmsTopicComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExample(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKeySelective(CmsTopicComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKey(CmsTopicComment record);
}