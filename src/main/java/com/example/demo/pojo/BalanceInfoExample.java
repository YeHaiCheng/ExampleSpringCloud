package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BalanceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeIsNull() {
            addCriterion("MAINTAIN_FEE is null");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeIsNotNull() {
            addCriterion("MAINTAIN_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeEqualTo(Long value) {
            addCriterion("MAINTAIN_FEE =", value, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeNotEqualTo(Long value) {
            addCriterion("MAINTAIN_FEE <>", value, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeGreaterThan(Long value) {
            addCriterion("MAINTAIN_FEE >", value, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("MAINTAIN_FEE >=", value, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeLessThan(Long value) {
            addCriterion("MAINTAIN_FEE <", value, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeLessThanOrEqualTo(Long value) {
            addCriterion("MAINTAIN_FEE <=", value, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeIn(List<Long> values) {
            addCriterion("MAINTAIN_FEE in", values, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeNotIn(List<Long> values) {
            addCriterion("MAINTAIN_FEE not in", values, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeBetween(Long value1, Long value2) {
            addCriterion("MAINTAIN_FEE between", value1, value2, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andMaintainFeeNotBetween(Long value1, Long value2) {
            addCriterion("MAINTAIN_FEE not between", value1, value2, "maintainFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeIsNull() {
            addCriterion("STUFF_FEE is null");
            return (Criteria) this;
        }

        public Criteria andStuffFeeIsNotNull() {
            addCriterion("STUFF_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andStuffFeeEqualTo(Long value) {
            addCriterion("STUFF_FEE =", value, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeNotEqualTo(Long value) {
            addCriterion("STUFF_FEE <>", value, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeGreaterThan(Long value) {
            addCriterion("STUFF_FEE >", value, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("STUFF_FEE >=", value, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeLessThan(Long value) {
            addCriterion("STUFF_FEE <", value, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeLessThanOrEqualTo(Long value) {
            addCriterion("STUFF_FEE <=", value, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeIn(List<Long> values) {
            addCriterion("STUFF_FEE in", values, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeNotIn(List<Long> values) {
            addCriterion("STUFF_FEE not in", values, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeBetween(Long value1, Long value2) {
            addCriterion("STUFF_FEE between", value1, value2, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andStuffFeeNotBetween(Long value1, Long value2) {
            addCriterion("STUFF_FEE not between", value1, value2, "stuffFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseIsNull() {
            addCriterion("GUARANTEE_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseIsNotNull() {
            addCriterion("GUARANTEE_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseEqualTo(String value) {
            addCriterion("GUARANTEE_PROMISE =", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseNotEqualTo(String value) {
            addCriterion("GUARANTEE_PROMISE <>", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseGreaterThan(String value) {
            addCriterion("GUARANTEE_PROMISE >", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_PROMISE >=", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseLessThan(String value) {
            addCriterion("GUARANTEE_PROMISE <", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_PROMISE <=", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseLike(String value) {
            addCriterion("GUARANTEE_PROMISE like", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseNotLike(String value) {
            addCriterion("GUARANTEE_PROMISE not like", value, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseIn(List<String> values) {
            addCriterion("GUARANTEE_PROMISE in", values, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseNotIn(List<String> values) {
            addCriterion("GUARANTEE_PROMISE not in", values, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseBetween(String value1, String value2) {
            addCriterion("GUARANTEE_PROMISE between", value1, value2, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andGuaranteePromiseNotBetween(String value1, String value2) {
            addCriterion("GUARANTEE_PROMISE not between", value1, value2, "guaranteePromise");
            return (Criteria) this;
        }

        public Criteria andNoticeItemIsNull() {
            addCriterion("NOTICE_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andNoticeItemIsNotNull() {
            addCriterion("NOTICE_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeItemEqualTo(String value) {
            addCriterion("NOTICE_ITEM =", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemNotEqualTo(String value) {
            addCriterion("NOTICE_ITEM <>", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemGreaterThan(String value) {
            addCriterion("NOTICE_ITEM >", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_ITEM >=", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemLessThan(String value) {
            addCriterion("NOTICE_ITEM <", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_ITEM <=", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemLike(String value) {
            addCriterion("NOTICE_ITEM like", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemNotLike(String value) {
            addCriterion("NOTICE_ITEM not like", value, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemIn(List<String> values) {
            addCriterion("NOTICE_ITEM in", values, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemNotIn(List<String> values) {
            addCriterion("NOTICE_ITEM not in", values, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemBetween(String value1, String value2) {
            addCriterion("NOTICE_ITEM between", value1, value2, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andNoticeItemNotBetween(String value1, String value2) {
            addCriterion("NOTICE_ITEM not between", value1, value2, "noticeItem");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIsNull() {
            addCriterion("BALANCE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIsNotNull() {
            addCriterion("BALANCE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("BALANCE_DATE =", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BALANCE_DATE <>", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BALANCE_DATE >", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BALANCE_DATE >=", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateLessThan(Date value) {
            addCriterionForJDBCDate("BALANCE_DATE <", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BALANCE_DATE <=", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("BALANCE_DATE in", values, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BALANCE_DATE not in", values, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BALANCE_DATE between", value1, value2, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BALANCE_DATE not between", value1, value2, "balanceDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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