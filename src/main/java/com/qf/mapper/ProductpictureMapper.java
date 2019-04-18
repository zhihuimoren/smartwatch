package com.qf.mapper;

import com.qf.entity.Productpicture;
import com.qf.entity.ProductpictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductpictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int countByExample(ProductpictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int deleteByExample(ProductpictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int deleteByPrimaryKey(Integer pictureid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int insert(Productpicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int insertSelective(Productpicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    List<Productpicture> selectByExample(ProductpictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    Productpicture selectByPrimaryKey(Integer pictureid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Productpicture record, @Param("example") ProductpictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByExample(@Param("record") Productpicture record, @Param("example") ProductpictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByPrimaryKeySelective(Productpicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productpicture
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByPrimaryKey(Productpicture record);
}