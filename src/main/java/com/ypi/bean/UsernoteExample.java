package com.ypi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsernoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsernoteExample() {
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

        public Criteria andNoteTitleIsNull() {
            addCriterion("note_title is null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNotNull() {
            addCriterion("note_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleEqualTo(String value) {
            addCriterion("note_title =", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotEqualTo(String value) {
            addCriterion("note_title <>", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThan(String value) {
            addCriterion("note_title >", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("note_title >=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThan(String value) {
            addCriterion("note_title <", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("note_title <=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLike(String value) {
            addCriterion("note_title like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotLike(String value) {
            addCriterion("note_title not like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIn(List<String> values) {
            addCriterion("note_title in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotIn(List<String> values) {
            addCriterion("note_title not in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleBetween(String value1, String value2) {
            addCriterion("note_title between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotBetween(String value1, String value2) {
            addCriterion("note_title not between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteBodyIsNull() {
            addCriterion("note_body is null");
            return (Criteria) this;
        }

        public Criteria andNoteBodyIsNotNull() {
            addCriterion("note_body is not null");
            return (Criteria) this;
        }

        public Criteria andNoteBodyEqualTo(String value) {
            addCriterion("note_body =", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyNotEqualTo(String value) {
            addCriterion("note_body <>", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyGreaterThan(String value) {
            addCriterion("note_body >", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyGreaterThanOrEqualTo(String value) {
            addCriterion("note_body >=", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyLessThan(String value) {
            addCriterion("note_body <", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyLessThanOrEqualTo(String value) {
            addCriterion("note_body <=", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyLike(String value) {
            addCriterion("note_body like", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyNotLike(String value) {
            addCriterion("note_body not like", value, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyIn(List<String> values) {
            addCriterion("note_body in", values, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyNotIn(List<String> values) {
            addCriterion("note_body not in", values, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyBetween(String value1, String value2) {
            addCriterion("note_body between", value1, value2, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteBodyNotBetween(String value1, String value2) {
            addCriterion("note_body not between", value1, value2, "noteBody");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNull() {
            addCriterion("note_time is null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNotNull() {
            addCriterion("note_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeEqualTo(Date value) {
            addCriterion("note_time =", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotEqualTo(Date value) {
            addCriterion("note_time <>", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThan(Date value) {
            addCriterion("note_time >", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("note_time >=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThan(Date value) {
            addCriterion("note_time <", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThanOrEqualTo(Date value) {
            addCriterion("note_time <=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIn(List<Date> values) {
            addCriterion("note_time in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotIn(List<Date> values) {
            addCriterion("note_time not in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeBetween(Date value1, Date value2) {
            addCriterion("note_time between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotBetween(Date value1, Date value2) {
            addCriterion("note_time not between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteStatusIsNull() {
            addCriterion("note_status is null");
            return (Criteria) this;
        }

        public Criteria andNoteStatusIsNotNull() {
            addCriterion("note_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoteStatusEqualTo(Integer value) {
            addCriterion("note_status =", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusNotEqualTo(Integer value) {
            addCriterion("note_status <>", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusGreaterThan(Integer value) {
            addCriterion("note_status >", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("note_status >=", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusLessThan(Integer value) {
            addCriterion("note_status <", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("note_status <=", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusIn(List<Integer> values) {
            addCriterion("note_status in", values, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusNotIn(List<Integer> values) {
            addCriterion("note_status not in", values, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusBetween(Integer value1, Integer value2) {
            addCriterion("note_status between", value1, value2, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("note_status not between", value1, value2, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteLevelIsNull() {
            addCriterion("note_level is null");
            return (Criteria) this;
        }

        public Criteria andNoteLevelIsNotNull() {
            addCriterion("note_level is not null");
            return (Criteria) this;
        }

        public Criteria andNoteLevelEqualTo(Integer value) {
            addCriterion("note_level =", value, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelNotEqualTo(Integer value) {
            addCriterion("note_level <>", value, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelGreaterThan(Integer value) {
            addCriterion("note_level >", value, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("note_level >=", value, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelLessThan(Integer value) {
            addCriterion("note_level <", value, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelLessThanOrEqualTo(Integer value) {
            addCriterion("note_level <=", value, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelIn(List<Integer> values) {
            addCriterion("note_level in", values, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelNotIn(List<Integer> values) {
            addCriterion("note_level not in", values, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelBetween(Integer value1, Integer value2) {
            addCriterion("note_level between", value1, value2, "noteLevel");
            return (Criteria) this;
        }

        public Criteria andNoteLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("note_level not between", value1, value2, "noteLevel");
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