package com.qf.entity;

public class Productclass {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productclass.productClassId
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    private Integer productclassid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productclass.productClassName
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    private String productclassname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productclass.productClassId
     *
     * @return the value of productclass.productClassId
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    public Integer getProductclassid() {
        return productclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productclass.productClassId
     *
     * @param productclassid the value for productclass.productClassId
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    public void setProductclassid(Integer productclassid) {
        this.productclassid = productclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productclass.productClassName
     *
     * @return the value of productclass.productClassName
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    public String getProductclassname() {
        return productclassname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productclass.productClassName
     *
     * @param productclassname the value for productclass.productClassName
     *
     * @mbggenerated Thu Apr 18 09:23:53 CST 2019
     */
    public void setProductclassname(String productclassname) {
        this.productclassname = productclassname == null ? null : productclassname.trim();
    }
}