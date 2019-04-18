package com.qf.mapper;

import com.qf.entity.Productcollection;
import com.qf.entity.ProductcollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int countByExample(ProductcollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int deleteByExample(ProductcollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int deleteByPrimaryKey(Integer collectionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int insert(Productcollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int insertSelective(Productcollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    List<Productcollection> selectByExample(ProductcollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    Productcollection selectByPrimaryKey(Integer collectionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Productcollection record, @Param("example") ProductcollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByExample(@Param("record") Productcollection record, @Param("example") ProductcollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByPrimaryKeySelective(Productcollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productcollection
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    int updateByPrimaryKey(Productcollection record);
}