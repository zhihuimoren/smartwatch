package com.qf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public ProductinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
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
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
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

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductmsgIsNull() {
            addCriterion("productMsg is null");
            return (Criteria) this;
        }

        public Criteria andProductmsgIsNotNull() {
            addCriterion("productMsg is not null");
            return (Criteria) this;
        }

        public Criteria andProductmsgEqualTo(String value) {
            addCriterion("productMsg =", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgNotEqualTo(String value) {
            addCriterion("productMsg <>", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgGreaterThan(String value) {
            addCriterion("productMsg >", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgGreaterThanOrEqualTo(String value) {
            addCriterion("productMsg >=", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgLessThan(String value) {
            addCriterion("productMsg <", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgLessThanOrEqualTo(String value) {
            addCriterion("productMsg <=", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgLike(String value) {
            addCriterion("productMsg like", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgNotLike(String value) {
            addCriterion("productMsg not like", value, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgIn(List<String> values) {
            addCriterion("productMsg in", values, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgNotIn(List<String> values) {
            addCriterion("productMsg not in", values, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgBetween(String value1, String value2) {
            addCriterion("productMsg between", value1, value2, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProductmsgNotBetween(String value1, String value2) {
            addCriterion("productMsg not between", value1, value2, "productmsg");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesIsNull() {
            addCriterion("ProbuctSales is null");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesIsNotNull() {
            addCriterion("ProbuctSales is not null");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesEqualTo(Integer value) {
            addCriterion("ProbuctSales =", value, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesNotEqualTo(Integer value) {
            addCriterion("ProbuctSales <>", value, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesGreaterThan(Integer value) {
            addCriterion("ProbuctSales >", value, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProbuctSales >=", value, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesLessThan(Integer value) {
            addCriterion("ProbuctSales <", value, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesLessThanOrEqualTo(Integer value) {
            addCriterion("ProbuctSales <=", value, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesIn(List<Integer> values) {
            addCriterion("ProbuctSales in", values, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesNotIn(List<Integer> values) {
            addCriterion("ProbuctSales not in", values, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesBetween(Integer value1, Integer value2) {
            addCriterion("ProbuctSales between", value1, value2, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProbuctsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("ProbuctSales not between", value1, value2, "probuctsales");
            return (Criteria) this;
        }

        public Criteria andProductstockIsNull() {
            addCriterion("productStock is null");
            return (Criteria) this;
        }

        public Criteria andProductstockIsNotNull() {
            addCriterion("productStock is not null");
            return (Criteria) this;
        }

        public Criteria andProductstockEqualTo(Integer value) {
            addCriterion("productStock =", value, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockNotEqualTo(Integer value) {
            addCriterion("productStock <>", value, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockGreaterThan(Integer value) {
            addCriterion("productStock >", value, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("productStock >=", value, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockLessThan(Integer value) {
            addCriterion("productStock <", value, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockLessThanOrEqualTo(Integer value) {
            addCriterion("productStock <=", value, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockIn(List<Integer> values) {
            addCriterion("productStock in", values, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockNotIn(List<Integer> values) {
            addCriterion("productStock not in", values, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockBetween(Integer value1, Integer value2) {
            addCriterion("productStock between", value1, value2, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductstockNotBetween(Integer value1, Integer value2) {
            addCriterion("productStock not between", value1, value2, "productstock");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("productPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("productPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("productPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("productPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("productPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("productPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andAdverturlIsNull() {
            addCriterion("advertUrl is null");
            return (Criteria) this;
        }

        public Criteria andAdverturlIsNotNull() {
            addCriterion("advertUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAdverturlEqualTo(String value) {
            addCriterion("advertUrl =", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlNotEqualTo(String value) {
            addCriterion("advertUrl <>", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlGreaterThan(String value) {
            addCriterion("advertUrl >", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlGreaterThanOrEqualTo(String value) {
            addCriterion("advertUrl >=", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlLessThan(String value) {
            addCriterion("advertUrl <", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlLessThanOrEqualTo(String value) {
            addCriterion("advertUrl <=", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlLike(String value) {
            addCriterion("advertUrl like", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlNotLike(String value) {
            addCriterion("advertUrl not like", value, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlIn(List<String> values) {
            addCriterion("advertUrl in", values, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlNotIn(List<String> values) {
            addCriterion("advertUrl not in", values, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlBetween(String value1, String value2) {
            addCriterion("advertUrl between", value1, value2, "adverturl");
            return (Criteria) this;
        }

        public Criteria andAdverturlNotBetween(String value1, String value2) {
            addCriterion("advertUrl not between", value1, value2, "adverturl");
            return (Criteria) this;
        }

        public Criteria andProductclassidIsNull() {
            addCriterion("productClassId is null");
            return (Criteria) this;
        }

        public Criteria andProductclassidIsNotNull() {
            addCriterion("productClassId is not null");
            return (Criteria) this;
        }

        public Criteria andProductclassidEqualTo(Integer value) {
            addCriterion("productClassId =", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidNotEqualTo(Integer value) {
            addCriterion("productClassId <>", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidGreaterThan(Integer value) {
            addCriterion("productClassId >", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productClassId >=", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidLessThan(Integer value) {
            addCriterion("productClassId <", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidLessThanOrEqualTo(Integer value) {
            addCriterion("productClassId <=", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidIn(List<Integer> values) {
            addCriterion("productClassId in", values, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidNotIn(List<Integer> values) {
            addCriterion("productClassId not in", values, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidBetween(Integer value1, Integer value2) {
            addCriterion("productClassId between", value1, value2, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("productClassId not between", value1, value2, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("provider is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("provider is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(String value) {
            addCriterion("provider =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("provider <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(String value) {
            addCriterion("provider >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("provider >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(String value) {
            addCriterion("provider <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("provider <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLike(String value) {
            addCriterion("provider like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotLike(String value) {
            addCriterion("provider not like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<String> values) {
            addCriterion("provider in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<String> values) {
            addCriterion("provider not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("provider between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("provider not between", value1, value2, "provider");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productinfo
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 18 11:00:21 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productinfo
     *
     * @mbggenerated Thu Apr 18 11:00:21 CST 2019
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