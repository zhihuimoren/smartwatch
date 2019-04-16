package com.qf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductorderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public ProductorderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberIsNull() {
            addCriterion("buyNumber is null");
            return (Criteria) this;
        }

        public Criteria andBuynumberIsNotNull() {
            addCriterion("buyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBuynumberEqualTo(Integer value) {
            addCriterion("buyNumber =", value, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberNotEqualTo(Integer value) {
            addCriterion("buyNumber <>", value, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberGreaterThan(Integer value) {
            addCriterion("buyNumber >", value, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyNumber >=", value, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberLessThan(Integer value) {
            addCriterion("buyNumber <", value, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberLessThanOrEqualTo(Integer value) {
            addCriterion("buyNumber <=", value, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberIn(List<Integer> values) {
            addCriterion("buyNumber in", values, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberNotIn(List<Integer> values) {
            addCriterion("buyNumber not in", values, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberBetween(Integer value1, Integer value2) {
            addCriterion("buyNumber between", value1, value2, "buynumber");
            return (Criteria) this;
        }

        public Criteria andBuynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("buyNumber not between", value1, value2, "buynumber");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andOrderaddressIsNull() {
            addCriterion("orderAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderaddressIsNotNull() {
            addCriterion("orderAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderaddressEqualTo(String value) {
            addCriterion("orderAddress =", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotEqualTo(String value) {
            addCriterion("orderAddress <>", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressGreaterThan(String value) {
            addCriterion("orderAddress >", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressGreaterThanOrEqualTo(String value) {
            addCriterion("orderAddress >=", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressLessThan(String value) {
            addCriterion("orderAddress <", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressLessThanOrEqualTo(String value) {
            addCriterion("orderAddress <=", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressLike(String value) {
            addCriterion("orderAddress like", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotLike(String value) {
            addCriterion("orderAddress not like", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressIn(List<String> values) {
            addCriterion("orderAddress in", values, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotIn(List<String> values) {
            addCriterion("orderAddress not in", values, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressBetween(String value1, String value2) {
            addCriterion("orderAddress between", value1, value2, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotBetween(String value1, String value2) {
            addCriterion("orderAddress not between", value1, value2, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrdercreateIsNull() {
            addCriterion("orderCreate is null");
            return (Criteria) this;
        }

        public Criteria andOrdercreateIsNotNull() {
            addCriterion("orderCreate is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercreateEqualTo(Date value) {
            addCriterionForJDBCDate("orderCreate =", value, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderCreate <>", value, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateGreaterThan(Date value) {
            addCriterionForJDBCDate("orderCreate >", value, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderCreate >=", value, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateLessThan(Date value) {
            addCriterionForJDBCDate("orderCreate <", value, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderCreate <=", value, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateIn(List<Date> values) {
            addCriterionForJDBCDate("orderCreate in", values, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderCreate not in", values, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderCreate between", value1, value2, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdercreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderCreate not between", value1, value2, "ordercreate");
            return (Criteria) this;
        }

        public Criteria andOrdernoteIsNull() {
            addCriterion("orderNote is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoteIsNotNull() {
            addCriterion("orderNote is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoteEqualTo(String value) {
            addCriterion("orderNote =", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteNotEqualTo(String value) {
            addCriterion("orderNote <>", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteGreaterThan(String value) {
            addCriterion("orderNote >", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteGreaterThanOrEqualTo(String value) {
            addCriterion("orderNote >=", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteLessThan(String value) {
            addCriterion("orderNote <", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteLessThanOrEqualTo(String value) {
            addCriterion("orderNote <=", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteLike(String value) {
            addCriterion("orderNote like", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteNotLike(String value) {
            addCriterion("orderNote not like", value, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteIn(List<String> values) {
            addCriterion("orderNote in", values, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteNotIn(List<String> values) {
            addCriterion("orderNote not in", values, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteBetween(String value1, String value2) {
            addCriterion("orderNote between", value1, value2, "ordernote");
            return (Criteria) this;
        }

        public Criteria andOrdernoteNotBetween(String value1, String value2) {
            addCriterion("orderNote not between", value1, value2, "ordernote");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productorder
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 16 16:28:15 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productorder
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}