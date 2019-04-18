package com.qf.mapper;

import com.qf.entity.Registcode;
import com.qf.entity.RegistcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistcodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int countByExample(RegistcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int deleteByExample(RegistcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int deleteByPrimaryKey(Integer codeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int insert(Registcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int insertSelective(Registcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    List<Registcode> selectByExample(RegistcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    Registcode selectByPrimaryKey(Integer codeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Registcode record, @Param("example") RegistcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByExample(@Param("record") Registcode record, @Param("example") RegistcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByPrimaryKeySelective(Registcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registcode
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByPrimaryKey(Registcode record);
}