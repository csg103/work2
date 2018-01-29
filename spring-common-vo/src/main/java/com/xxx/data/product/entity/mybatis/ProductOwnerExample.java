package com.xxx.data.product.entity.mybatis;

import java.util.ArrayList;
import java.util.List;

public class ProductOwnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductOwnerExample() {
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

        public Criteria andOwerIdIsNull() {
            addCriterion("c_ower_Id is null");
            return (Criteria) this;
        }

        public Criteria andOwerIdIsNotNull() {
            addCriterion("c_ower_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOwerIdEqualTo(String value) {
            addCriterion("c_ower_Id =", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotEqualTo(String value) {
            addCriterion("c_ower_Id <>", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdGreaterThan(String value) {
            addCriterion("c_ower_Id >", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_Id >=", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdLessThan(String value) {
            addCriterion("c_ower_Id <", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdLessThanOrEqualTo(String value) {
            addCriterion("c_ower_Id <=", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdLike(String value) {
            addCriterion("c_ower_Id like", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotLike(String value) {
            addCriterion("c_ower_Id not like", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdIn(List<String> values) {
            addCriterion("c_ower_Id in", values, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotIn(List<String> values) {
            addCriterion("c_ower_Id not in", values, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdBetween(String value1, String value2) {
            addCriterion("c_ower_Id between", value1, value2, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotBetween(String value1, String value2) {
            addCriterion("c_ower_Id not between", value1, value2, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerNameIsNull() {
            addCriterion("c_ower_name is null");
            return (Criteria) this;
        }

        public Criteria andOwerNameIsNotNull() {
            addCriterion("c_ower_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwerNameEqualTo(String value) {
            addCriterion("c_ower_name =", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameNotEqualTo(String value) {
            addCriterion("c_ower_name <>", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameGreaterThan(String value) {
            addCriterion("c_ower_name >", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_name >=", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameLessThan(String value) {
            addCriterion("c_ower_name <", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameLessThanOrEqualTo(String value) {
            addCriterion("c_ower_name <=", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameLike(String value) {
            addCriterion("c_ower_name like", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameNotLike(String value) {
            addCriterion("c_ower_name not like", value, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameIn(List<String> values) {
            addCriterion("c_ower_name in", values, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameNotIn(List<String> values) {
            addCriterion("c_ower_name not in", values, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameBetween(String value1, String value2) {
            addCriterion("c_ower_name between", value1, value2, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerNameNotBetween(String value1, String value2) {
            addCriterion("c_ower_name not between", value1, value2, "owerName");
            return (Criteria) this;
        }

        public Criteria andOwerDescriIsNull() {
            addCriterion("c_ower_descri is null");
            return (Criteria) this;
        }

        public Criteria andOwerDescriIsNotNull() {
            addCriterion("c_ower_descri is not null");
            return (Criteria) this;
        }

        public Criteria andOwerDescriEqualTo(String value) {
            addCriterion("c_ower_descri =", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriNotEqualTo(String value) {
            addCriterion("c_ower_descri <>", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriGreaterThan(String value) {
            addCriterion("c_ower_descri >", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_descri >=", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriLessThan(String value) {
            addCriterion("c_ower_descri <", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriLessThanOrEqualTo(String value) {
            addCriterion("c_ower_descri <=", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriLike(String value) {
            addCriterion("c_ower_descri like", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriNotLike(String value) {
            addCriterion("c_ower_descri not like", value, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriIn(List<String> values) {
            addCriterion("c_ower_descri in", values, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriNotIn(List<String> values) {
            addCriterion("c_ower_descri not in", values, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriBetween(String value1, String value2) {
            addCriterion("c_ower_descri between", value1, value2, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerDescriNotBetween(String value1, String value2) {
            addCriterion("c_ower_descri not between", value1, value2, "owerDescri");
            return (Criteria) this;
        }

        public Criteria andOwerSexIsNull() {
            addCriterion("c_ower_sex is null");
            return (Criteria) this;
        }

        public Criteria andOwerSexIsNotNull() {
            addCriterion("c_ower_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOwerSexEqualTo(String value) {
            addCriterion("c_ower_sex =", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexNotEqualTo(String value) {
            addCriterion("c_ower_sex <>", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexGreaterThan(String value) {
            addCriterion("c_ower_sex >", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_sex >=", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexLessThan(String value) {
            addCriterion("c_ower_sex <", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexLessThanOrEqualTo(String value) {
            addCriterion("c_ower_sex <=", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexLike(String value) {
            addCriterion("c_ower_sex like", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexNotLike(String value) {
            addCriterion("c_ower_sex not like", value, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexIn(List<String> values) {
            addCriterion("c_ower_sex in", values, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexNotIn(List<String> values) {
            addCriterion("c_ower_sex not in", values, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexBetween(String value1, String value2) {
            addCriterion("c_ower_sex between", value1, value2, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerSexNotBetween(String value1, String value2) {
            addCriterion("c_ower_sex not between", value1, value2, "owerSex");
            return (Criteria) this;
        }

        public Criteria andOwerTelIsNull() {
            addCriterion("c_ower_tel is null");
            return (Criteria) this;
        }

        public Criteria andOwerTelIsNotNull() {
            addCriterion("c_ower_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOwerTelEqualTo(String value) {
            addCriterion("c_ower_tel =", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelNotEqualTo(String value) {
            addCriterion("c_ower_tel <>", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelGreaterThan(String value) {
            addCriterion("c_ower_tel >", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_tel >=", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelLessThan(String value) {
            addCriterion("c_ower_tel <", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelLessThanOrEqualTo(String value) {
            addCriterion("c_ower_tel <=", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelLike(String value) {
            addCriterion("c_ower_tel like", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelNotLike(String value) {
            addCriterion("c_ower_tel not like", value, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelIn(List<String> values) {
            addCriterion("c_ower_tel in", values, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelNotIn(List<String> values) {
            addCriterion("c_ower_tel not in", values, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelBetween(String value1, String value2) {
            addCriterion("c_ower_tel between", value1, value2, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerTelNotBetween(String value1, String value2) {
            addCriterion("c_ower_tel not between", value1, value2, "owerTel");
            return (Criteria) this;
        }

        public Criteria andOwerAddressIsNull() {
            addCriterion("c_ower_address is null");
            return (Criteria) this;
        }

        public Criteria andOwerAddressIsNotNull() {
            addCriterion("c_ower_address is not null");
            return (Criteria) this;
        }

        public Criteria andOwerAddressEqualTo(String value) {
            addCriterion("c_ower_address =", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressNotEqualTo(String value) {
            addCriterion("c_ower_address <>", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressGreaterThan(String value) {
            addCriterion("c_ower_address >", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_address >=", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressLessThan(String value) {
            addCriterion("c_ower_address <", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressLessThanOrEqualTo(String value) {
            addCriterion("c_ower_address <=", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressLike(String value) {
            addCriterion("c_ower_address like", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressNotLike(String value) {
            addCriterion("c_ower_address not like", value, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressIn(List<String> values) {
            addCriterion("c_ower_address in", values, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressNotIn(List<String> values) {
            addCriterion("c_ower_address not in", values, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressBetween(String value1, String value2) {
            addCriterion("c_ower_address between", value1, value2, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerAddressNotBetween(String value1, String value2) {
            addCriterion("c_ower_address not between", value1, value2, "owerAddress");
            return (Criteria) this;
        }

        public Criteria andOwerMailIsNull() {
            addCriterion("c_ower_mail is null");
            return (Criteria) this;
        }

        public Criteria andOwerMailIsNotNull() {
            addCriterion("c_ower_mail is not null");
            return (Criteria) this;
        }

        public Criteria andOwerMailEqualTo(String value) {
            addCriterion("c_ower_mail =", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailNotEqualTo(String value) {
            addCriterion("c_ower_mail <>", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailGreaterThan(String value) {
            addCriterion("c_ower_mail >", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailGreaterThanOrEqualTo(String value) {
            addCriterion("c_ower_mail >=", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailLessThan(String value) {
            addCriterion("c_ower_mail <", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailLessThanOrEqualTo(String value) {
            addCriterion("c_ower_mail <=", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailLike(String value) {
            addCriterion("c_ower_mail like", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailNotLike(String value) {
            addCriterion("c_ower_mail not like", value, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailIn(List<String> values) {
            addCriterion("c_ower_mail in", values, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailNotIn(List<String> values) {
            addCriterion("c_ower_mail not in", values, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailBetween(String value1, String value2) {
            addCriterion("c_ower_mail between", value1, value2, "owerMail");
            return (Criteria) this;
        }

        public Criteria andOwerMailNotBetween(String value1, String value2) {
            addCriterion("c_ower_mail not between", value1, value2, "owerMail");
            return (Criteria) this;
        }

        public Criteria andText1IsNull() {
            addCriterion("c_text1 is null");
            return (Criteria) this;
        }

        public Criteria andText1IsNotNull() {
            addCriterion("c_text1 is not null");
            return (Criteria) this;
        }

        public Criteria andText1EqualTo(String value) {
            addCriterion("c_text1 =", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotEqualTo(String value) {
            addCriterion("c_text1 <>", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThan(String value) {
            addCriterion("c_text1 >", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThanOrEqualTo(String value) {
            addCriterion("c_text1 >=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThan(String value) {
            addCriterion("c_text1 <", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThanOrEqualTo(String value) {
            addCriterion("c_text1 <=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Like(String value) {
            addCriterion("c_text1 like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotLike(String value) {
            addCriterion("c_text1 not like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1In(List<String> values) {
            addCriterion("c_text1 in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotIn(List<String> values) {
            addCriterion("c_text1 not in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Between(String value1, String value2) {
            addCriterion("c_text1 between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotBetween(String value1, String value2) {
            addCriterion("c_text1 not between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText2IsNull() {
            addCriterion("c_text2 is null");
            return (Criteria) this;
        }

        public Criteria andText2IsNotNull() {
            addCriterion("c_text2 is not null");
            return (Criteria) this;
        }

        public Criteria andText2EqualTo(String value) {
            addCriterion("c_text2 =", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotEqualTo(String value) {
            addCriterion("c_text2 <>", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThan(String value) {
            addCriterion("c_text2 >", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThanOrEqualTo(String value) {
            addCriterion("c_text2 >=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThan(String value) {
            addCriterion("c_text2 <", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThanOrEqualTo(String value) {
            addCriterion("c_text2 <=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Like(String value) {
            addCriterion("c_text2 like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotLike(String value) {
            addCriterion("c_text2 not like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2In(List<String> values) {
            addCriterion("c_text2 in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotIn(List<String> values) {
            addCriterion("c_text2 not in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Between(String value1, String value2) {
            addCriterion("c_text2 between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotBetween(String value1, String value2) {
            addCriterion("c_text2 not between", value1, value2, "text2");
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