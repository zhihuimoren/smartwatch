package com.qf.mapper;

import com.qf.entity.Productshopping;
import com.qf.entity.ProductshoppingExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProductshoppingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int countByExample(ProductshoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int deleteByExample(ProductshoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int deleteByPrimaryKey(Integer shoppingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int insert(Productshopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int insertSelective(Productshopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    List<Productshopping> selectByExample(ProductshoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    Productshopping selectByPrimaryKey(Integer shoppingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Productshopping record, @Param("example") ProductshoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByExample(@Param("record") Productshopping record, @Param("example") ProductshoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByPrimaryKeySelective(Productshopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    int updateByPrimaryKey(Productshopping record);

    List<Map> getcart(int userId);
}