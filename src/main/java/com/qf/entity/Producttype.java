package com.qf.entity;

public class Producttype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column producttype.typeId
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column producttype.typeName
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    private String typename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column producttype.parentId
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    private Integer parentid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column producttype.typeId
     *
     * @return the value of producttype.typeId
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column producttype.typeId
     *
     * @param typeid the value for producttype.typeId
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column producttype.typeName
     *
     * @return the value of producttype.typeName
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    public String getTypename() {
        return typename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column producttype.typeName
     *
     * @param typename the value for producttype.typeName
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column producttype.parentId
     *
     * @return the value of producttype.parentId
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column producttype.parentId
     *
     * @param parentid the value for producttype.parentId
     *
     * @mbggenerated Thu Apr 18 10:34:30 CST 2019
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}