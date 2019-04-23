package com.qf.entity;

import java.util.Date;

public class Productorder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.orderId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private Integer orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.orderNumber
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private String ordernumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.buyNumber
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private Integer buynumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.receiver
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private String receiver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.orderAddress
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private String orderaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.orderStatus
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private Integer orderstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.orderCreate
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private Date ordercreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.orderNote
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.productId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private Integer productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.userId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    private Integer userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.orderId
     *
     * @return the value of productorder.orderId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.orderId
     *
     * @param orderid the value for productorder.orderId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.orderNumber
     *
     * @return the value of productorder.orderNumber
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.orderNumber
     *
     * @param ordernumber the value for productorder.orderNumber
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.buyNumber
     *
     * @return the value of productorder.buyNumber
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public Integer getBuynumber() {
        return buynumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.buyNumber
     *
     * @param buynumber the value for productorder.buyNumber
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setBuynumber(Integer buynumber) {
        this.buynumber = buynumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.receiver
     *
     * @return the value of productorder.receiver
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.receiver
     *
     * @param receiver the value for productorder.receiver
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.orderAddress
     *
     * @return the value of productorder.orderAddress
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public String getOrderaddress() {
        return orderaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.orderAddress
     *
     * @param orderaddress the value for productorder.orderAddress
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setOrderaddress(String orderaddress) {
        this.orderaddress = orderaddress == null ? null : orderaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.orderStatus
     *
     * @return the value of productorder.orderStatus
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public Integer getOrderstatus() {
        return orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.orderStatus
     *
     * @param orderstatus the value for productorder.orderStatus
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.orderCreate
     *
     * @return the value of productorder.orderCreate
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public Date getOrdercreate() {
        return ordercreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.orderCreate
     *
     * @param ordercreate the value for productorder.orderCreate
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setOrdercreate(Date ordercreate) {
        this.ordercreate = ordercreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.orderNote
     *
     * @return the value of productorder.orderNote
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.productId
     *
     * @return the value of productorder.productId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.productId
     *
     * @param productid the value for productorder.productId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.userId
     *
     * @return the value of productorder.userId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.userId
     *
     * @param userid the value for productorder.userId
     *
     * @mbggenerated Sun Apr 14 15:07:44 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}