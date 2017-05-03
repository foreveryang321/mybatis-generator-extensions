package cn.tisson.wechat.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmTDictQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public EmTDictQuery() {
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andDictKeyIsNull() {
            addCriterion("DICT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andDictKeyIsNotNull() {
            addCriterion("DICT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andDictKeyEqualTo(String value) {
            addCriterion("DICT_KEY =", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotEqualTo(String value) {
            addCriterion("DICT_KEY <>", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyGreaterThan(String value) {
            addCriterion("DICT_KEY >", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_KEY >=", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyLessThan(String value) {
            addCriterion("DICT_KEY <", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyLessThanOrEqualTo(String value) {
            addCriterion("DICT_KEY <=", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyLike(String value) {
            addCriterion("DICT_KEY like", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotLike(String value) {
            addCriterion("DICT_KEY not like", value, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyIn(List<String> values) {
            addCriterion("DICT_KEY in", values, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotIn(List<String> values) {
            addCriterion("DICT_KEY not in", values, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyBetween(String value1, String value2) {
            addCriterion("DICT_KEY between", value1, value2, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictKeyNotBetween(String value1, String value2) {
            addCriterion("DICT_KEY not between", value1, value2, "dictKey");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNull() {
            addCriterion("DICT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNotNull() {
            addCriterion("DICT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDictValueEqualTo(String value) {
            addCriterion("DICT_VALUE =", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotEqualTo(String value) {
            addCriterion("DICT_VALUE <>", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThan(String value) {
            addCriterion("DICT_VALUE >", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE >=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThan(String value) {
            addCriterion("DICT_VALUE <", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE <=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLike(String value) {
            addCriterion("DICT_VALUE like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotLike(String value) {
            addCriterion("DICT_VALUE not like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueIn(List<String> values) {
            addCriterion("DICT_VALUE in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotIn(List<String> values) {
            addCriterion("DICT_VALUE not in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueBetween(String value1, String value2) {
            addCriterion("DICT_VALUE between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotBetween(String value1, String value2) {
            addCriterion("DICT_VALUE not between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictInfoIsNull() {
            addCriterion("DICT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andDictInfoIsNotNull() {
            addCriterion("DICT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andDictInfoEqualTo(String value) {
            addCriterion("DICT_INFO =", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoNotEqualTo(String value) {
            addCriterion("DICT_INFO <>", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoGreaterThan(String value) {
            addCriterion("DICT_INFO >", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_INFO >=", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoLessThan(String value) {
            addCriterion("DICT_INFO <", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoLessThanOrEqualTo(String value) {
            addCriterion("DICT_INFO <=", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoLike(String value) {
            addCriterion("DICT_INFO like", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoNotLike(String value) {
            addCriterion("DICT_INFO not like", value, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoIn(List<String> values) {
            addCriterion("DICT_INFO in", values, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoNotIn(List<String> values) {
            addCriterion("DICT_INFO not in", values, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoBetween(String value1, String value2) {
            addCriterion("DICT_INFO between", value1, value2, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andDictInfoNotBetween(String value1, String value2) {
            addCriterion("DICT_INFO not between", value1, value2, "dictInfo");
            return (Criteria) this;
        }

        public Criteria andCreatedtIsNull() {
            addCriterion("CREATEDT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtIsNotNull() {
            addCriterion("CREATEDT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtEqualTo(Date value) {
            addCriterion("CREATEDT =", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtNotEqualTo(Date value) {
            addCriterion("CREATEDT <>", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtGreaterThan(Date value) {
            addCriterion("CREATEDT >", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDT >=", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtLessThan(Date value) {
            addCriterion("CREATEDT <", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDT <=", value, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtIn(List<Date> values) {
            addCriterion("CREATEDT in", values, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtNotIn(List<Date> values) {
            addCriterion("CREATEDT not in", values, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtBetween(Date value1, Date value2) {
            addCriterion("CREATEDT between", value1, value2, "createdt");
            return (Criteria) this;
        }

        public Criteria andCreatedtNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDT not between", value1, value2, "createdt");
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