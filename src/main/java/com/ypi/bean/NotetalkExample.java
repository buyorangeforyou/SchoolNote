package com.ypi.bean;

import java.util.ArrayList;
import java.util.List;

public class NotetalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotetalkExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountIsNull() {
            addCriterion("talker_account is null");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountIsNotNull() {
            addCriterion("talker_account is not null");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountEqualTo(String value) {
            addCriterion("talker_account =", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountNotEqualTo(String value) {
            addCriterion("talker_account <>", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountGreaterThan(String value) {
            addCriterion("talker_account >", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("talker_account >=", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountLessThan(String value) {
            addCriterion("talker_account <", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountLessThanOrEqualTo(String value) {
            addCriterion("talker_account <=", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountLike(String value) {
            addCriterion("talker_account like", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountNotLike(String value) {
            addCriterion("talker_account not like", value, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountIn(List<String> values) {
            addCriterion("talker_account in", values, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountNotIn(List<String> values) {
            addCriterion("talker_account not in", values, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountBetween(String value1, String value2) {
            addCriterion("talker_account between", value1, value2, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerAccountNotBetween(String value1, String value2) {
            addCriterion("talker_account not between", value1, value2, "talkerAccount");
            return (Criteria) this;
        }

        public Criteria andTalkerNickIsNull() {
            addCriterion("talker_nick is null");
            return (Criteria) this;
        }

        public Criteria andTalkerNickIsNotNull() {
            addCriterion("talker_nick is not null");
            return (Criteria) this;
        }

        public Criteria andTalkerNickEqualTo(String value) {
            addCriterion("talker_nick =", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickNotEqualTo(String value) {
            addCriterion("talker_nick <>", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickGreaterThan(String value) {
            addCriterion("talker_nick >", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickGreaterThanOrEqualTo(String value) {
            addCriterion("talker_nick >=", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickLessThan(String value) {
            addCriterion("talker_nick <", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickLessThanOrEqualTo(String value) {
            addCriterion("talker_nick <=", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickLike(String value) {
            addCriterion("talker_nick like", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickNotLike(String value) {
            addCriterion("talker_nick not like", value, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickIn(List<String> values) {
            addCriterion("talker_nick in", values, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickNotIn(List<String> values) {
            addCriterion("talker_nick not in", values, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickBetween(String value1, String value2) {
            addCriterion("talker_nick between", value1, value2, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkerNickNotBetween(String value1, String value2) {
            addCriterion("talker_nick not between", value1, value2, "talkerNick");
            return (Criteria) this;
        }

        public Criteria andTalkBodyIsNull() {
            addCriterion("talk_body is null");
            return (Criteria) this;
        }

        public Criteria andTalkBodyIsNotNull() {
            addCriterion("talk_body is not null");
            return (Criteria) this;
        }

        public Criteria andTalkBodyEqualTo(String value) {
            addCriterion("talk_body =", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyNotEqualTo(String value) {
            addCriterion("talk_body <>", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyGreaterThan(String value) {
            addCriterion("talk_body >", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyGreaterThanOrEqualTo(String value) {
            addCriterion("talk_body >=", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyLessThan(String value) {
            addCriterion("talk_body <", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyLessThanOrEqualTo(String value) {
            addCriterion("talk_body <=", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyLike(String value) {
            addCriterion("talk_body like", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyNotLike(String value) {
            addCriterion("talk_body not like", value, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyIn(List<String> values) {
            addCriterion("talk_body in", values, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyNotIn(List<String> values) {
            addCriterion("talk_body not in", values, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyBetween(String value1, String value2) {
            addCriterion("talk_body between", value1, value2, "talkBody");
            return (Criteria) this;
        }

        public Criteria andTalkBodyNotBetween(String value1, String value2) {
            addCriterion("talk_body not between", value1, value2, "talkBody");
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