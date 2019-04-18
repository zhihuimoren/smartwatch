package com.qf.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductappraiseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public ProductappraiseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
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
     * This method corresponds to the database table productappraise
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
     * This method corresponds to the database table productappraise
     *
     * @mbggenerated Thu Apr 18 11:06:59 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productappraise
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
     * This class corresponds to the database table productappraise
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

        public Criteria andAppraiseidIsNull() {
            addCriterion("appraiseId is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseidIsNotNull() {
            addCriterion("appraiseId is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseidEqualTo(Integer value) {
            addCriterion("appraiseId =", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotEqualTo(Integer value) {
            addCriterion("appraiseId <>", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidGreaterThan(Integer value) {
            addCriterion("appraiseId >", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraiseId >=", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidLessThan(Integer value) {
            addCriterion("appraiseId <", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidLessThanOrEqualTo(Integer value) {
            addCriterion("appraiseId <=", value, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidIn(List<Integer> values) {
            addCriterion("appraiseId in", values, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotIn(List<Integer> values) {
            addCriterion("appraiseId not in", values, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidBetween(Integer value1, Integer value2) {
            addCriterion("appraiseId between", value1, value2, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andAppraiseidNotBetween(Integer value1, Integer value2) {
            addCriterion("appraiseId not between", value1, value2, "appraiseid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andHeadurlIsNull() {
            addCriterion("headurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadurlIsNotNull() {
            addCriterion("headurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadurlEqualTo(String value) {
            addCriterion("headurl =", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotEqualTo(String value) {
            addCriterion("headurl <>", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlGreaterThan(String value) {
            addCriterion("headurl >", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlGreaterThanOrEqualTo(String value) {
            addCriterion("headurl >=", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLessThan(String value) {
            addCriterion("headurl <", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLessThanOrEqualTo(String value) {
            addCriterion("headurl <=", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLike(String value) {
            addCriterion("headurl like", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotLike(String value) {
            addCriterion("headurl not like", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlIn(List<String> values) {
            addCriterion("headurl in", values, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotIn(List<String> values) {
            addCriterion("headurl not in", values, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlBetween(String value1, String value2) {
            addCriterion("headurl between", value1, value2, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotBetween(String value1, String value2) {
            addCriterion("headurl not between", value1, value2, "headurl");
            return (Criteria) this;
        }

        public Criteria andAccessgradeIsNull() {
            addCriterion("accessGrade is null");
            return (Criteria) this;
        }

        public Criteria andAccessgradeIsNotNull() {
            addCriterion("accessGrade is not null");
            return (Criteria) this;
        }

        public Criteria andAccessgradeEqualTo(Integer value) {
            addCriterion("accessGrade =", value, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeNotEqualTo(Integer value) {
            addCriterion("accessGrade <>", value, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeGreaterThan(Integer value) {
            addCriterion("accessGrade >", value, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("accessGrade >=", value, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeLessThan(Integer value) {
            addCriterion("accessGrade <", value, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeLessThanOrEqualTo(Integer value) {
            addCriterion("accessGrade <=", value, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeIn(List<Integer> values) {
            addCriterion("accessGrade in", values, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeNotIn(List<Integer> values) {
            addCriterion("accessGrade not in", values, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeBetween(Integer value1, Integer value2) {
            addCriterion("accessGrade between", value1, value2, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("accessGrade not between", value1, value2, "accessgrade");
            return (Criteria) this;
        }

        public Criteria andAccessimgIsNull() {
            addCriterion("accessImg is null");
            return (Criteria) this;
        }

        public Criteria andAccessimgIsNotNull() {
            addCriterion("accessImg is not null");
            return (Criteria) this;
        }

        public Criteria andAccessimgEqualTo(String value) {
            addCriterion("accessImg =", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgNotEqualTo(String value) {
            addCriterion("accessImg <>", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgGreaterThan(String value) {
            addCriterion("accessImg >", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgGreaterThanOrEqualTo(String value) {
            addCriterion("accessImg >=", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgLessThan(String value) {
            addCriterion("accessImg <", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgLessThanOrEqualTo(String value) {
            addCriterion("accessImg <=", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgLike(String value) {
            addCriterion("accessImg like", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgNotLike(String value) {
            addCriterion("accessImg not like", value, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgIn(List<String> values) {
            addCriterion("accessImg in", values, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgNotIn(List<String> values) {
            addCriterion("accessImg not in", values, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgBetween(String value1, String value2) {
            addCriterion("accessImg between", value1, value2, "accessimg");
            return (Criteria) this;
        }

        public Criteria andAccessimgNotBetween(String value1, String value2) {
            addCriterion("accessImg not between", value1, value2, "accessimg");
            return (Criteria) this;
        }

        public Criteria andProbucttypeIsNull() {
            addCriterion("probuctType is null");
            return (Criteria) this;
        }

        public Criteria andProbucttypeIsNotNull() {
            addCriterion("probuctType is not null");
            return (Criteria) this;
        }

        public Criteria andProbucttypeEqualTo(Integer value) {
            addCriterion("probuctType =", value, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeNotEqualTo(Integer value) {
            addCriterion("probuctType <>", value, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeGreaterThan(Integer value) {
            addCriterion("probuctType >", value, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("probuctType >=", value, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeLessThan(Integer value) {
            addCriterion("probuctType <", value, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeLessThanOrEqualTo(Integer value) {
            addCriterion("probuctType <=", value, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeIn(List<Integer> values) {
            addCriterion("probuctType in", values, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeNotIn(List<Integer> values) {
            addCriterion("probuctType not in", values, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeBetween(Integer value1, Integer value2) {
            addCriterion("probuctType between", value1, value2, "probucttype");
            return (Criteria) this;
        }

        public Criteria andProbucttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("probuctType not between", value1, value2, "probucttype");
            return (Criteria) this;
        }

        public Criteria andAccesstextIsNull() {
            addCriterion("accessText is null");
            return (Criteria) this;
        }

        public Criteria andAccesstextIsNotNull() {
            addCriterion("accessText is not null");
            return (Criteria) this;
        }

        public Criteria andAccesstextEqualTo(String value) {
            addCriterion("accessText =", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextNotEqualTo(String value) {
            addCriterion("accessText <>", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextGreaterThan(String value) {
            addCriterion("accessText >", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextGreaterThanOrEqualTo(String value) {
            addCriterion("accessText >=", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextLessThan(String value) {
            addCriterion("accessText <", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextLessThanOrEqualTo(String value) {
            addCriterion("accessText <=", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextLike(String value) {
            addCriterion("accessText like", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextNotLike(String value) {
            addCriterion("accessText not like", value, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextIn(List<String> values) {
            addCriterion("accessText in", values, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextNotIn(List<String> values) {
            addCriterion("accessText not in", values, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextBetween(String value1, String value2) {
            addCriterion("accessText between", value1, value2, "accesstext");
            return (Criteria) this;
        }

        public Criteria andAccesstextNotBetween(String value1, String value2) {
            addCriterion("accessText not between", value1, value2, "accesstext");
            return (Criteria) this;
        }

        public Criteria andProductclassidIsNull() {
            addCriterion("productclassid is null");
            return (Criteria) this;
        }

        public Criteria andProductclassidIsNotNull() {
            addCriterion("productclassid is not null");
            return (Criteria) this;
        }

        public Criteria andProductclassidEqualTo(Integer value) {
            addCriterion("productclassid =", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidNotEqualTo(Integer value) {
            addCriterion("productclassid <>", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidGreaterThan(Integer value) {
            addCriterion("productclassid >", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productclassid >=", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidLessThan(Integer value) {
            addCriterion("productclassid <", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidLessThanOrEqualTo(Integer value) {
            addCriterion("productclassid <=", value, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidIn(List<Integer> values) {
            addCriterion("productclassid in", values, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidNotIn(List<Integer> values) {
            addCriterion("productclassid not in", values, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidBetween(Integer value1, Integer value2) {
            addCriterion("productclassid between", value1, value2, "productclassid");
            return (Criteria) this;
        }

        public Criteria andProductclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("productclassid not between", value1, value2, "productclassid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table productappraise
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
     * This class corresponds to the database table productappraise
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