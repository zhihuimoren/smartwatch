package com.qf.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
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
     * This method corresponds to the database table address
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
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Apr 16 16:28:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
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
     * This class corresponds to the database table address
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

        public Criteria andAddressidIsNull() {
            addCriterion("addressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("addressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("addressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("addressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("addressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("addressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<Integer> values) {
            addCriterion("addressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<Integer> values) {
            addCriterion("addressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("addressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("addressId not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneIsNull() {
            addCriterion("recriverPhone is null");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneIsNotNull() {
            addCriterion("recriverPhone is not null");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneEqualTo(String value) {
            addCriterion("recriverPhone =", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneNotEqualTo(String value) {
            addCriterion("recriverPhone <>", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneGreaterThan(String value) {
            addCriterion("recriverPhone >", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("recriverPhone >=", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneLessThan(String value) {
            addCriterion("recriverPhone <", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneLessThanOrEqualTo(String value) {
            addCriterion("recriverPhone <=", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneLike(String value) {
            addCriterion("recriverPhone like", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneNotLike(String value) {
            addCriterion("recriverPhone not like", value, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneIn(List<String> values) {
            addCriterion("recriverPhone in", values, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneNotIn(List<String> values) {
            addCriterion("recriverPhone not in", values, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneBetween(String value1, String value2) {
            addCriterion("recriverPhone between", value1, value2, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecriverphoneNotBetween(String value1, String value2) {
            addCriterion("recriverPhone not between", value1, value2, "recriverphone");
            return (Criteria) this;
        }

        public Criteria andRecrivernameIsNull() {
            addCriterion("recriverName is null");
            return (Criteria) this;
        }

        public Criteria andRecrivernameIsNotNull() {
            addCriterion("recriverName is not null");
            return (Criteria) this;
        }

        public Criteria andRecrivernameEqualTo(String value) {
            addCriterion("recriverName =", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameNotEqualTo(String value) {
            addCriterion("recriverName <>", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameGreaterThan(String value) {
            addCriterion("recriverName >", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("recriverName >=", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameLessThan(String value) {
            addCriterion("recriverName <", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameLessThanOrEqualTo(String value) {
            addCriterion("recriverName <=", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameLike(String value) {
            addCriterion("recriverName like", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameNotLike(String value) {
            addCriterion("recriverName not like", value, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameIn(List<String> values) {
            addCriterion("recriverName in", values, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameNotIn(List<String> values) {
            addCriterion("recriverName not in", values, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameBetween(String value1, String value2) {
            addCriterion("recriverName between", value1, value2, "recrivername");
            return (Criteria) this;
        }

        public Criteria andRecrivernameNotBetween(String value1, String value2) {
            addCriterion("recriverName not between", value1, value2, "recrivername");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressIsNull() {
            addCriterion("specificAddress is null");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressIsNotNull() {
            addCriterion("specificAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressEqualTo(String value) {
            addCriterion("specificAddress =", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressNotEqualTo(String value) {
            addCriterion("specificAddress <>", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressGreaterThan(String value) {
            addCriterion("specificAddress >", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressGreaterThanOrEqualTo(String value) {
            addCriterion("specificAddress >=", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressLessThan(String value) {
            addCriterion("specificAddress <", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressLessThanOrEqualTo(String value) {
            addCriterion("specificAddress <=", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressLike(String value) {
            addCriterion("specificAddress like", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressNotLike(String value) {
            addCriterion("specificAddress not like", value, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressIn(List<String> values) {
            addCriterion("specificAddress in", values, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressNotIn(List<String> values) {
            addCriterion("specificAddress not in", values, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressBetween(String value1, String value2) {
            addCriterion("specificAddress between", value1, value2, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andSpecificaddressNotBetween(String value1, String value2) {
            addCriterion("specificAddress not between", value1, value2, "specificaddress");
            return (Criteria) this;
        }

        public Criteria andIsdefauitIsNull() {
            addCriterion("isDefauit is null");
            return (Criteria) this;
        }

        public Criteria andIsdefauitIsNotNull() {
            addCriterion("isDefauit is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefauitEqualTo(Integer value) {
            addCriterion("isDefauit =", value, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitNotEqualTo(Integer value) {
            addCriterion("isDefauit <>", value, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitGreaterThan(Integer value) {
            addCriterion("isDefauit >", value, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDefauit >=", value, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitLessThan(Integer value) {
            addCriterion("isDefauit <", value, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitLessThanOrEqualTo(Integer value) {
            addCriterion("isDefauit <=", value, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitIn(List<Integer> values) {
            addCriterion("isDefauit in", values, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitNotIn(List<Integer> values) {
            addCriterion("isDefauit not in", values, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitBetween(Integer value1, Integer value2) {
            addCriterion("isDefauit between", value1, value2, "isdefauit");
            return (Criteria) this;
        }

        public Criteria andIsdefauitNotBetween(Integer value1, Integer value2) {
            addCriterion("isDefauit not between", value1, value2, "isdefauit");
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
     * This class corresponds to the database table address
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
     * This class corresponds to the database table address
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