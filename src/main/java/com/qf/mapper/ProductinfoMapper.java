package com.qf.mapper;

import com.qf.entity.Productinfo;
import com.qf.entity.ProductinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int countByExample(ProductinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int deleteByExample(ProductinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int deleteByPrimaryKey(Integer productid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int insert(Productinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int insertSelective(Productinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    List<Productinfo> selectByExample(ProductinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    Productinfo selectByPrimaryKey(Integer productid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByExample(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByPrimaryKeySelective(Productinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByPrimaryKey(Productinfo record);
}