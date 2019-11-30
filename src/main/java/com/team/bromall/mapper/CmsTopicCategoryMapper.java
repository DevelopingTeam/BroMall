package com.team.bromall.mapper;

import com.team.bromall.model.CmsTopicCategory;
import com.team.bromall.model.CmsTopicCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    long countByExample(CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByExample(CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insert(CmsTopicCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insertSelective(CmsTopicCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    List<CmsTopicCategory> selectByExample(CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    CmsTopicCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExample(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKeySelective(CmsTopicCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKey(CmsTopicCategory record);
}