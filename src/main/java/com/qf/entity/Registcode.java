package com.qf.entity;

import java.util.Date;

public class Registcode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registcode.codeId
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    private Integer codeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registcode.Phone
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registcode.CodeMsg
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    private Integer codemsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column registcode.date
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registcode.codeId
     *
     * @return the value of registcode.codeId
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public Integer getCodeid() {
        return codeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registcode.codeId
     *
     * @param codeid the value for registcode.codeId
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registcode.Phone
     *
     * @return the value of registcode.Phone
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registcode.Phone
     *
     * @param phone the value for registcode.Phone
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registcode.CodeMsg
     *
     * @return the value of registcode.CodeMsg
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public Integer getCodemsg() {
        return codemsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registcode.CodeMsg
     *
     * @param codemsg the value for registcode.CodeMsg
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setCodemsg(Integer codemsg) {
        this.codemsg = codemsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registcode.date
     *
     * @return the value of registcode.date
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registcode.date
     *
     * @param date the value for registcode.date
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }
}