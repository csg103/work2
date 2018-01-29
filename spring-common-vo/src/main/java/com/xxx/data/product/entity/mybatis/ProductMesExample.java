package com.xxx.data.product.entity.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductMesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductMesExample() {
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
            addCriterion("c_product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("c_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("c_product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("c_product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("c_product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("c_product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("c_product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("c_product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("c_product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("c_product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("c_product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("c_product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("c_product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("c_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("c_product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("c_product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("c_product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("c_product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("c_product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("c_product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("c_product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("c_product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("c_product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("c_product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("c_product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIsNull() {
            addCriterion("c_product_introduction is null");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIsNotNull() {
            addCriterion("c_product_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionEqualTo(String value) {
            addCriterion("c_product_introduction =", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotEqualTo(String value) {
            addCriterion("c_product_introduction <>", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionGreaterThan(String value) {
            addCriterion("c_product_introduction >", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_introduction >=", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLessThan(String value) {
            addCriterion("c_product_introduction <", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLessThanOrEqualTo(String value) {
            addCriterion("c_product_introduction <=", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLike(String value) {
            addCriterion("c_product_introduction like", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotLike(String value) {
            addCriterion("c_product_introduction not like", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIn(List<String> values) {
            addCriterion("c_product_introduction in", values, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotIn(List<String> values) {
            addCriterion("c_product_introduction not in", values, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionBetween(String value1, String value2) {
            addCriterion("c_product_introduction between", value1, value2, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotBetween(String value1, String value2) {
            addCriterion("c_product_introduction not between", value1, value2, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdIsNull() {
            addCriterion("c_product_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdIsNotNull() {
            addCriterion("c_product_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdEqualTo(String value) {
            addCriterion("c_product_owner_id =", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotEqualTo(String value) {
            addCriterion("c_product_owner_id <>", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdGreaterThan(String value) {
            addCriterion("c_product_owner_id >", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_owner_id >=", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdLessThan(String value) {
            addCriterion("c_product_owner_id <", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_owner_id <=", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdLike(String value) {
            addCriterion("c_product_owner_id like", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotLike(String value) {
            addCriterion("c_product_owner_id not like", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdIn(List<String> values) {
            addCriterion("c_product_owner_id in", values, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotIn(List<String> values) {
            addCriterion("c_product_owner_id not in", values, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdBetween(String value1, String value2) {
            addCriterion("c_product_owner_id between", value1, value2, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotBetween(String value1, String value2) {
            addCriterion("c_product_owner_id not between", value1, value2, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("c_product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("c_product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(String value) {
            addCriterion("c_product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(String value) {
            addCriterion("c_product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(String value) {
            addCriterion("c_product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(String value) {
            addCriterion("c_product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLike(String value) {
            addCriterion("c_product_type_id like", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotLike(String value) {
            addCriterion("c_product_type_id not like", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<String> values) {
            addCriterion("c_product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<String> values) {
            addCriterion("c_product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(String value1, String value2) {
            addCriterion("c_product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(String value1, String value2) {
            addCriterion("c_product_type_id not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeIsNull() {
            addCriterion("c_product_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeIsNotNull() {
            addCriterion("c_product_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeEqualTo(Date value) {
            addCriterionForJDBCDate("c_product_creat_time =", value, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_product_creat_time <>", value, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("c_product_creat_time >", value, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_product_creat_time >=", value, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeLessThan(Date value) {
            addCriterionForJDBCDate("c_product_creat_time <", value, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_product_creat_time <=", value, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeIn(List<Date> values) {
            addCriterionForJDBCDate("c_product_creat_time in", values, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_product_creat_time not in", values, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_product_creat_time between", value1, value2, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_product_creat_time not between", value1, value2, "productCreatTime");
            return (Criteria) this;
        }

        public Criteria andProductCreaterIsNull() {
            addCriterion("c_product_creater is null");
            return (Criteria) this;
        }

        public Criteria andProductCreaterIsNotNull() {
            addCriterion("c_product_creater is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreaterEqualTo(String value) {
            addCriterion("c_product_creater =", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotEqualTo(String value) {
            addCriterion("c_product_creater <>", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterGreaterThan(String value) {
            addCriterion("c_product_creater >", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_creater >=", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterLessThan(String value) {
            addCriterion("c_product_creater <", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterLessThanOrEqualTo(String value) {
            addCriterion("c_product_creater <=", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterLike(String value) {
            addCriterion("c_product_creater like", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotLike(String value) {
            addCriterion("c_product_creater not like", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterIn(List<String> values) {
            addCriterion("c_product_creater in", values, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotIn(List<String> values) {
            addCriterion("c_product_creater not in", values, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterBetween(String value1, String value2) {
            addCriterion("c_product_creater between", value1, value2, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotBetween(String value1, String value2) {
            addCriterion("c_product_creater not between", value1, value2, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdIsNull() {
            addCriterion("c_product_top_pic_list_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdIsNotNull() {
            addCriterion("c_product_top_pic_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id =", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id <>", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdGreaterThan(String value) {
            addCriterion("c_product_top_pic_list_id >", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id >=", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdLessThan(String value) {
            addCriterion("c_product_top_pic_list_id <", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id <=", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdLike(String value) {
            addCriterion("c_product_top_pic_list_id like", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotLike(String value) {
            addCriterion("c_product_top_pic_list_id not like", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdIn(List<String> values) {
            addCriterion("c_product_top_pic_list_id in", values, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotIn(List<String> values) {
            addCriterion("c_product_top_pic_list_id not in", values, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdBetween(String value1, String value2) {
            addCriterion("c_product_top_pic_list_id between", value1, value2, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotBetween(String value1, String value2) {
            addCriterion("c_product_top_pic_list_id not between", value1, value2, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdIsNull() {
            addCriterion("c_product_middle_pic_list_id is null");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdIsNotNull() {
            addCriterion("c_product_middle_pic_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id =", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id <>", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdGreaterThan(String value) {
            addCriterion("c_product_middle_pic_list_id >", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id >=", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdLessThan(String value) {
            addCriterion("c_product_middle_pic_list_id <", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id <=", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdLike(String value) {
            addCriterion("c_product_middle_pic_list_id like", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotLike(String value) {
            addCriterion("c_product_middle_pic_list_id not like", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdIn(List<String> values) {
            addCriterion("c_product_middle_pic_list_id in", values, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotIn(List<String> values) {
            addCriterion("c_product_middle_pic_list_id not in", values, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdBetween(String value1, String value2) {
            addCriterion("c_product_middle_pic_list_id between", value1, value2, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotBetween(String value1, String value2) {
            addCriterion("c_product_middle_pic_list_id not between", value1, value2, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageIsNull() {
            addCriterion("c_product_details_page is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageIsNotNull() {
            addCriterion("c_product_details_page is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageEqualTo(String value) {
            addCriterion("c_product_details_page =", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotEqualTo(String value) {
            addCriterion("c_product_details_page <>", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageGreaterThan(String value) {
            addCriterion("c_product_details_page >", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_details_page >=", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageLessThan(String value) {
            addCriterion("c_product_details_page <", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageLessThanOrEqualTo(String value) {
            addCriterion("c_product_details_page <=", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageLike(String value) {
            addCriterion("c_product_details_page like", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotLike(String value) {
            addCriterion("c_product_details_page not like", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageIn(List<String> values) {
            addCriterion("c_product_details_page in", values, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotIn(List<String> values) {
            addCriterion("c_product_details_page not in", values, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageBetween(String value1, String value2) {
            addCriterion("c_product_details_page between", value1, value2, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotBetween(String value1, String value2) {
            addCriterion("c_product_details_page not between", value1, value2, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("c_product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("c_product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Integer value) {
            addCriterion("c_product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Integer value) {
            addCriterion("c_product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Integer value) {
            addCriterion("c_product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Integer value) {
            addCriterion("c_product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("c_product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Integer> values) {
            addCriterion("c_product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Integer> values) {
            addCriterion("c_product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Integer value1, Integer value2) {
            addCriterion("c_product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("c_product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("c_product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("c_product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("c_product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("c_product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("c_product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("c_product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("c_product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("c_product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("c_product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("c_product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("c_product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("c_product_price not between", value1, value2, "productPrice");
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