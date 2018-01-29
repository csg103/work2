package com.xxx.data.product.entity.mybatis;

import java.util.ArrayList;
import java.util.List;

public class ProductPicListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductPicListExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdIsNull() {
            addCriterion("c_product_pic_list_id is null");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdIsNotNull() {
            addCriterion("c_product_pic_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdEqualTo(String value) {
            addCriterion("c_product_pic_list_id =", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdNotEqualTo(String value) {
            addCriterion("c_product_pic_list_id <>", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdGreaterThan(String value) {
            addCriterion("c_product_pic_list_id >", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_pic_list_id >=", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdLessThan(String value) {
            addCriterion("c_product_pic_list_id <", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_pic_list_id <=", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdLike(String value) {
            addCriterion("c_product_pic_list_id like", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdNotLike(String value) {
            addCriterion("c_product_pic_list_id not like", value, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdIn(List<String> values) {
            addCriterion("c_product_pic_list_id in", values, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdNotIn(List<String> values) {
            addCriterion("c_product_pic_list_id not in", values, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdBetween(String value1, String value2) {
            addCriterion("c_product_pic_list_id between", value1, value2, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicListIdNotBetween(String value1, String value2) {
            addCriterion("c_product_pic_list_id not between", value1, value2, "productPicListId");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIsNull() {
            addCriterion("c_product_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIsNotNull() {
            addCriterion("c_product_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlEqualTo(String value) {
            addCriterion("c_product_pic_url =", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotEqualTo(String value) {
            addCriterion("c_product_pic_url <>", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlGreaterThan(String value) {
            addCriterion("c_product_pic_url >", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_pic_url >=", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLessThan(String value) {
            addCriterion("c_product_pic_url <", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLessThanOrEqualTo(String value) {
            addCriterion("c_product_pic_url <=", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLike(String value) {
            addCriterion("c_product_pic_url like", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotLike(String value) {
            addCriterion("c_product_pic_url not like", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIn(List<String> values) {
            addCriterion("c_product_pic_url in", values, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotIn(List<String> values) {
            addCriterion("c_product_pic_url not in", values, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlBetween(String value1, String value2) {
            addCriterion("c_product_pic_url between", value1, value2, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotBetween(String value1, String value2) {
            addCriterion("c_product_pic_url not between", value1, value2, "productPicUrl");
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