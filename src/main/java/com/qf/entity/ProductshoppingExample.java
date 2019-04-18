package com.qf.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductshoppingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public ProductshoppingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
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
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
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

        public Criteria andShoppingidIsNull() {
            addCriterion("shoppingId is null");
            return (Criteria) this;
        }

        public Criteria andShoppingidIsNotNull() {
            addCriterion("shoppingId is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingidEqualTo(Integer value) {
            addCriterion("shoppingId =", value, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidNotEqualTo(Integer value) {
            addCriterion("shoppingId <>", value, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidGreaterThan(Integer value) {
            addCriterion("shoppingId >", value, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingId >=", value, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidLessThan(Integer value) {
            addCriterion("shoppingId <", value, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingId <=", value, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidIn(List<Integer> values) {
            addCriterion("shoppingId in", values, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidNotIn(List<Integer> values) {
            addCriterion("shoppingId not in", values, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidBetween(Integer value1, Integer value2) {
            addCriterion("shoppingId between", value1, value2, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingId not between", value1, value2, "shoppingid");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberIsNull() {
            addCriterion("shoppingNumber is null");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberIsNotNull() {
            addCriterion("shoppingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberEqualTo(Integer value) {
            addCriterion("shoppingNumber =", value, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberNotEqualTo(Integer value) {
            addCriterion("shoppingNumber <>", value, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberGreaterThan(Integer value) {
            addCriterion("shoppingNumber >", value, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingNumber >=", value, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberLessThan(Integer value) {
            addCriterion("shoppingNumber <", value, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingNumber <=", value, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberIn(List<Integer> values) {
            addCriterion("shoppingNumber in", values, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberNotIn(List<Integer> values) {
            addCriterion("shoppingNumber not in", values, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberBetween(Integer value1, Integer value2) {
            addCriterion("shoppingNumber between", value1, value2, "shoppingnumber");
            return (Criteria) this;
        }

        public Criteria andShoppingnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingNumber not between", value1, value2, "shoppingnumber");
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
     * This class corresponds to the database table productshopping
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 18 11:06:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productshopping
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
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