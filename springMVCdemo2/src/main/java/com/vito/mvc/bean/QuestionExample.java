package com.vito.mvc.bean;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andPSexIsNull() {
            addCriterion("P_Sex is null");
            return (Criteria) this;
        }

        public Criteria andPSexIsNotNull() {
            addCriterion("P_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andPSexEqualTo(String value) {
            addCriterion("P_Sex =", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotEqualTo(String value) {
            addCriterion("P_Sex <>", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThan(String value) {
            addCriterion("P_Sex >", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThanOrEqualTo(String value) {
            addCriterion("P_Sex >=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThan(String value) {
            addCriterion("P_Sex <", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThanOrEqualTo(String value) {
            addCriterion("P_Sex <=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLike(String value) {
            addCriterion("P_Sex like", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotLike(String value) {
            addCriterion("P_Sex not like", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexIn(List<String> values) {
            addCriterion("P_Sex in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotIn(List<String> values) {
            addCriterion("P_Sex not in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexBetween(String value1, String value2) {
            addCriterion("P_Sex between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotBetween(String value1, String value2) {
            addCriterion("P_Sex not between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNull() {
            addCriterion("P_Age is null");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNotNull() {
            addCriterion("P_Age is not null");
            return (Criteria) this;
        }

        public Criteria andPAgeEqualTo(String value) {
            addCriterion("P_Age =", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotEqualTo(String value) {
            addCriterion("P_Age <>", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThan(String value) {
            addCriterion("P_Age >", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThanOrEqualTo(String value) {
            addCriterion("P_Age >=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThan(String value) {
            addCriterion("P_Age <", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThanOrEqualTo(String value) {
            addCriterion("P_Age <=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLike(String value) {
            addCriterion("P_Age like", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotLike(String value) {
            addCriterion("P_Age not like", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeIn(List<String> values) {
            addCriterion("P_Age in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotIn(List<String> values) {
            addCriterion("P_Age not in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeBetween(String value1, String value2) {
            addCriterion("P_Age between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotBetween(String value1, String value2) {
            addCriterion("P_Age not between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPConstellationIsNull() {
            addCriterion("P_Constellation is null");
            return (Criteria) this;
        }

        public Criteria andPConstellationIsNotNull() {
            addCriterion("P_Constellation is not null");
            return (Criteria) this;
        }

        public Criteria andPConstellationEqualTo(String value) {
            addCriterion("P_Constellation =", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotEqualTo(String value) {
            addCriterion("P_Constellation <>", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationGreaterThan(String value) {
            addCriterion("P_Constellation >", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("P_Constellation >=", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLessThan(String value) {
            addCriterion("P_Constellation <", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLessThanOrEqualTo(String value) {
            addCriterion("P_Constellation <=", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLike(String value) {
            addCriterion("P_Constellation like", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotLike(String value) {
            addCriterion("P_Constellation not like", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationIn(List<String> values) {
            addCriterion("P_Constellation in", values, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotIn(List<String> values) {
            addCriterion("P_Constellation not in", values, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationBetween(String value1, String value2) {
            addCriterion("P_Constellation between", value1, value2, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotBetween(String value1, String value2) {
            addCriterion("P_Constellation not between", value1, value2, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeIsNull() {
            addCriterion("P_Blood_Type is null");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeIsNotNull() {
            addCriterion("P_Blood_Type is not null");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeEqualTo(String value) {
            addCriterion("P_Blood_Type =", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotEqualTo(String value) {
            addCriterion("P_Blood_Type <>", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeGreaterThan(String value) {
            addCriterion("P_Blood_Type >", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("P_Blood_Type >=", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeLessThan(String value) {
            addCriterion("P_Blood_Type <", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("P_Blood_Type <=", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeLike(String value) {
            addCriterion("P_Blood_Type like", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotLike(String value) {
            addCriterion("P_Blood_Type not like", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeIn(List<String> values) {
            addCriterion("P_Blood_Type in", values, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotIn(List<String> values) {
            addCriterion("P_Blood_Type not in", values, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeBetween(String value1, String value2) {
            addCriterion("P_Blood_Type between", value1, value2, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotBetween(String value1, String value2) {
            addCriterion("P_Blood_Type not between", value1, value2, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskIsNull() {
            addCriterion("P_Occupation_Risk is null");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskIsNotNull() {
            addCriterion("P_Occupation_Risk is not null");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskEqualTo(String value) {
            addCriterion("P_Occupation_Risk =", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotEqualTo(String value) {
            addCriterion("P_Occupation_Risk <>", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskGreaterThan(String value) {
            addCriterion("P_Occupation_Risk >", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskGreaterThanOrEqualTo(String value) {
            addCriterion("P_Occupation_Risk >=", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskLessThan(String value) {
            addCriterion("P_Occupation_Risk <", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskLessThanOrEqualTo(String value) {
            addCriterion("P_Occupation_Risk <=", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskLike(String value) {
            addCriterion("P_Occupation_Risk like", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotLike(String value) {
            addCriterion("P_Occupation_Risk not like", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskIn(List<String> values) {
            addCriterion("P_Occupation_Risk in", values, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotIn(List<String> values) {
            addCriterion("P_Occupation_Risk not in", values, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskBetween(String value1, String value2) {
            addCriterion("P_Occupation_Risk between", value1, value2, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotBetween(String value1, String value2) {
            addCriterion("P_Occupation_Risk not between", value1, value2, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPEducationIsNull() {
            addCriterion("P_Education is null");
            return (Criteria) this;
        }

        public Criteria andPEducationIsNotNull() {
            addCriterion("P_Education is not null");
            return (Criteria) this;
        }

        public Criteria andPEducationEqualTo(String value) {
            addCriterion("P_Education =", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotEqualTo(String value) {
            addCriterion("P_Education <>", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationGreaterThan(String value) {
            addCriterion("P_Education >", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationGreaterThanOrEqualTo(String value) {
            addCriterion("P_Education >=", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLessThan(String value) {
            addCriterion("P_Education <", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLessThanOrEqualTo(String value) {
            addCriterion("P_Education <=", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLike(String value) {
            addCriterion("P_Education like", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotLike(String value) {
            addCriterion("P_Education not like", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationIn(List<String> values) {
            addCriterion("P_Education in", values, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotIn(List<String> values) {
            addCriterion("P_Education not in", values, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationBetween(String value1, String value2) {
            addCriterion("P_Education between", value1, value2, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotBetween(String value1, String value2) {
            addCriterion("P_Education not between", value1, value2, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusIsNull() {
            addCriterion("P_Marriage_Status is null");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusIsNotNull() {
            addCriterion("P_Marriage_Status is not null");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusEqualTo(String value) {
            addCriterion("P_Marriage_Status =", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotEqualTo(String value) {
            addCriterion("P_Marriage_Status <>", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusGreaterThan(String value) {
            addCriterion("P_Marriage_Status >", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("P_Marriage_Status >=", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusLessThan(String value) {
            addCriterion("P_Marriage_Status <", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusLessThanOrEqualTo(String value) {
            addCriterion("P_Marriage_Status <=", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusLike(String value) {
            addCriterion("P_Marriage_Status like", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotLike(String value) {
            addCriterion("P_Marriage_Status not like", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusIn(List<String> values) {
            addCriterion("P_Marriage_Status in", values, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotIn(List<String> values) {
            addCriterion("P_Marriage_Status not in", values, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusBetween(String value1, String value2) {
            addCriterion("P_Marriage_Status between", value1, value2, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotBetween(String value1, String value2) {
            addCriterion("P_Marriage_Status not between", value1, value2, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryIsNull() {
            addCriterion("P_Surgery_History is null");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryIsNotNull() {
            addCriterion("P_Surgery_History is not null");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryEqualTo(String value) {
            addCriterion("P_Surgery_History =", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotEqualTo(String value) {
            addCriterion("P_Surgery_History <>", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryGreaterThan(String value) {
            addCriterion("P_Surgery_History >", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("P_Surgery_History >=", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryLessThan(String value) {
            addCriterion("P_Surgery_History <", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryLessThanOrEqualTo(String value) {
            addCriterion("P_Surgery_History <=", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryLike(String value) {
            addCriterion("P_Surgery_History like", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotLike(String value) {
            addCriterion("P_Surgery_History not like", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryIn(List<String> values) {
            addCriterion("P_Surgery_History in", values, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotIn(List<String> values) {
            addCriterion("P_Surgery_History not in", values, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryBetween(String value1, String value2) {
            addCriterion("P_Surgery_History between", value1, value2, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotBetween(String value1, String value2) {
            addCriterion("P_Surgery_History not between", value1, value2, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPComparisonIsNull() {
            addCriterion("P_Comparison is null");
            return (Criteria) this;
        }

        public Criteria andPComparisonIsNotNull() {
            addCriterion("P_Comparison is not null");
            return (Criteria) this;
        }

        public Criteria andPComparisonEqualTo(String value) {
            addCriterion("P_Comparison =", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotEqualTo(String value) {
            addCriterion("P_Comparison <>", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonGreaterThan(String value) {
            addCriterion("P_Comparison >", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonGreaterThanOrEqualTo(String value) {
            addCriterion("P_Comparison >=", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonLessThan(String value) {
            addCriterion("P_Comparison <", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonLessThanOrEqualTo(String value) {
            addCriterion("P_Comparison <=", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonLike(String value) {
            addCriterion("P_Comparison like", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotLike(String value) {
            addCriterion("P_Comparison not like", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonIn(List<String> values) {
            addCriterion("P_Comparison in", values, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotIn(List<String> values) {
            addCriterion("P_Comparison not in", values, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonBetween(String value1, String value2) {
            addCriterion("P_Comparison between", value1, value2, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotBetween(String value1, String value2) {
            addCriterion("P_Comparison not between", value1, value2, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionIsNull() {
            addCriterion("P_Others’_Satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionIsNotNull() {
            addCriterion("P_Others’_Satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionEqualTo(String value) {
            addCriterion("P_Others’_Satisfaction =", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionNotEqualTo(String value) {
            addCriterion("P_Others’_Satisfaction <>", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionGreaterThan(String value) {
            addCriterion("P_Others’_Satisfaction >", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionGreaterThanOrEqualTo(String value) {
            addCriterion("P_Others’_Satisfaction >=", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionLessThan(String value) {
            addCriterion("P_Others’_Satisfaction <", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionLessThanOrEqualTo(String value) {
            addCriterion("P_Others’_Satisfaction <=", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionLike(String value) {
            addCriterion("P_Others’_Satisfaction like", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionNotLike(String value) {
            addCriterion("P_Others’_Satisfaction not like", value, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionIn(List<String> values) {
            addCriterion("P_Others’_Satisfaction in", values, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionNotIn(List<String> values) {
            addCriterion("P_Others’_Satisfaction not in", values, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionBetween(String value1, String value2) {
            addCriterion("P_Others’_Satisfaction between", value1, value2, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthers’SatisfactionNotBetween(String value1, String value2) {
            addCriterion("P_Others’_Satisfaction not between", value1, value2, "pOthers’Satisfaction");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeIsNull() {
            addCriterion("P_Change_Life is null");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeIsNotNull() {
            addCriterion("P_Change_Life is not null");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeEqualTo(String value) {
            addCriterion("P_Change_Life =", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotEqualTo(String value) {
            addCriterion("P_Change_Life <>", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeGreaterThan(String value) {
            addCriterion("P_Change_Life >", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeGreaterThanOrEqualTo(String value) {
            addCriterion("P_Change_Life >=", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeLessThan(String value) {
            addCriterion("P_Change_Life <", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeLessThanOrEqualTo(String value) {
            addCriterion("P_Change_Life <=", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeLike(String value) {
            addCriterion("P_Change_Life like", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotLike(String value) {
            addCriterion("P_Change_Life not like", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeIn(List<String> values) {
            addCriterion("P_Change_Life in", values, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotIn(List<String> values) {
            addCriterion("P_Change_Life not in", values, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeBetween(String value1, String value2) {
            addCriterion("P_Change_Life between", value1, value2, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotBetween(String value1, String value2) {
            addCriterion("P_Change_Life not between", value1, value2, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyIsNull() {
            addCriterion("P_Change_Destiny is null");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyIsNotNull() {
            addCriterion("P_Change_Destiny is not null");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyEqualTo(String value) {
            addCriterion("P_Change_Destiny =", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotEqualTo(String value) {
            addCriterion("P_Change_Destiny <>", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyGreaterThan(String value) {
            addCriterion("P_Change_Destiny >", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyGreaterThanOrEqualTo(String value) {
            addCriterion("P_Change_Destiny >=", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyLessThan(String value) {
            addCriterion("P_Change_Destiny <", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyLessThanOrEqualTo(String value) {
            addCriterion("P_Change_Destiny <=", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyLike(String value) {
            addCriterion("P_Change_Destiny like", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotLike(String value) {
            addCriterion("P_Change_Destiny not like", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyIn(List<String> values) {
            addCriterion("P_Change_Destiny in", values, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotIn(List<String> values) {
            addCriterion("P_Change_Destiny not in", values, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyBetween(String value1, String value2) {
            addCriterion("P_Change_Destiny between", value1, value2, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotBetween(String value1, String value2) {
            addCriterion("P_Change_Destiny not between", value1, value2, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeIsNull() {
            addCriterion("P_Kinsfolk_Attitude is null");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeIsNotNull() {
            addCriterion("P_Kinsfolk_Attitude is not null");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeEqualTo(String value) {
            addCriterion("P_Kinsfolk_Attitude =", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotEqualTo(String value) {
            addCriterion("P_Kinsfolk_Attitude <>", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeGreaterThan(String value) {
            addCriterion("P_Kinsfolk_Attitude >", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeGreaterThanOrEqualTo(String value) {
            addCriterion("P_Kinsfolk_Attitude >=", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeLessThan(String value) {
            addCriterion("P_Kinsfolk_Attitude <", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeLessThanOrEqualTo(String value) {
            addCriterion("P_Kinsfolk_Attitude <=", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeLike(String value) {
            addCriterion("P_Kinsfolk_Attitude like", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotLike(String value) {
            addCriterion("P_Kinsfolk_Attitude not like", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeIn(List<String> values) {
            addCriterion("P_Kinsfolk_Attitude in", values, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotIn(List<String> values) {
            addCriterion("P_Kinsfolk_Attitude not in", values, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeBetween(String value1, String value2) {
            addCriterion("P_Kinsfolk_Attitude between", value1, value2, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotBetween(String value1, String value2) {
            addCriterion("P_Kinsfolk_Attitude not between", value1, value2, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyIsNull() {
            addCriterion("P_Unhappiness_Family is null");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyIsNotNull() {
            addCriterion("P_Unhappiness_Family is not null");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyEqualTo(String value) {
            addCriterion("P_Unhappiness_Family =", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotEqualTo(String value) {
            addCriterion("P_Unhappiness_Family <>", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyGreaterThan(String value) {
            addCriterion("P_Unhappiness_Family >", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("P_Unhappiness_Family >=", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyLessThan(String value) {
            addCriterion("P_Unhappiness_Family <", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyLessThanOrEqualTo(String value) {
            addCriterion("P_Unhappiness_Family <=", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyLike(String value) {
            addCriterion("P_Unhappiness_Family like", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotLike(String value) {
            addCriterion("P_Unhappiness_Family not like", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyIn(List<String> values) {
            addCriterion("P_Unhappiness_Family in", values, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotIn(List<String> values) {
            addCriterion("P_Unhappiness_Family not in", values, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyBetween(String value1, String value2) {
            addCriterion("P_Unhappiness_Family between", value1, value2, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotBetween(String value1, String value2) {
            addCriterion("P_Unhappiness_Family not between", value1, value2, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderIsNull() {
            addCriterion("P_Mental_Disorder is null");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderIsNotNull() {
            addCriterion("P_Mental_Disorder is not null");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderEqualTo(String value) {
            addCriterion("P_Mental_Disorder =", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotEqualTo(String value) {
            addCriterion("P_Mental_Disorder <>", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderGreaterThan(String value) {
            addCriterion("P_Mental_Disorder >", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderGreaterThanOrEqualTo(String value) {
            addCriterion("P_Mental_Disorder >=", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderLessThan(String value) {
            addCriterion("P_Mental_Disorder <", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderLessThanOrEqualTo(String value) {
            addCriterion("P_Mental_Disorder <=", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderLike(String value) {
            addCriterion("P_Mental_Disorder like", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotLike(String value) {
            addCriterion("P_Mental_Disorder not like", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderIn(List<String> values) {
            addCriterion("P_Mental_Disorder in", values, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotIn(List<String> values) {
            addCriterion("P_Mental_Disorder not in", values, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderBetween(String value1, String value2) {
            addCriterion("P_Mental_Disorder between", value1, value2, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotBetween(String value1, String value2) {
            addCriterion("P_Mental_Disorder not between", value1, value2, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPSelfieIsNull() {
            addCriterion("P_Selfie is null");
            return (Criteria) this;
        }

        public Criteria andPSelfieIsNotNull() {
            addCriterion("P_Selfie is not null");
            return (Criteria) this;
        }

        public Criteria andPSelfieEqualTo(String value) {
            addCriterion("P_Selfie =", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotEqualTo(String value) {
            addCriterion("P_Selfie <>", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieGreaterThan(String value) {
            addCriterion("P_Selfie >", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieGreaterThanOrEqualTo(String value) {
            addCriterion("P_Selfie >=", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieLessThan(String value) {
            addCriterion("P_Selfie <", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieLessThanOrEqualTo(String value) {
            addCriterion("P_Selfie <=", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieLike(String value) {
            addCriterion("P_Selfie like", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotLike(String value) {
            addCriterion("P_Selfie not like", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieIn(List<String> values) {
            addCriterion("P_Selfie in", values, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotIn(List<String> values) {
            addCriterion("P_Selfie not in", values, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieBetween(String value1, String value2) {
            addCriterion("P_Selfie between", value1, value2, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotBetween(String value1, String value2) {
            addCriterion("P_Selfie not between", value1, value2, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionIsNull() {
            addCriterion("P_Appearance_Attention is null");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionIsNotNull() {
            addCriterion("P_Appearance_Attention is not null");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionEqualTo(String value) {
            addCriterion("P_Appearance_Attention =", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotEqualTo(String value) {
            addCriterion("P_Appearance_Attention <>", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionGreaterThan(String value) {
            addCriterion("P_Appearance_Attention >", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("P_Appearance_Attention >=", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionLessThan(String value) {
            addCriterion("P_Appearance_Attention <", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionLessThanOrEqualTo(String value) {
            addCriterion("P_Appearance_Attention <=", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionLike(String value) {
            addCriterion("P_Appearance_Attention like", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotLike(String value) {
            addCriterion("P_Appearance_Attention not like", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionIn(List<String> values) {
            addCriterion("P_Appearance_Attention in", values, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotIn(List<String> values) {
            addCriterion("P_Appearance_Attention not in", values, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionBetween(String value1, String value2) {
            addCriterion("P_Appearance_Attention between", value1, value2, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotBetween(String value1, String value2) {
            addCriterion("P_Appearance_Attention not between", value1, value2, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andDCharmIsNull() {
            addCriterion("D_Charm is null");
            return (Criteria) this;
        }

        public Criteria andDCharmIsNotNull() {
            addCriterion("D_Charm is not null");
            return (Criteria) this;
        }

        public Criteria andDCharmEqualTo(String value) {
            addCriterion("D_Charm =", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotEqualTo(String value) {
            addCriterion("D_Charm <>", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmGreaterThan(String value) {
            addCriterion("D_Charm >", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmGreaterThanOrEqualTo(String value) {
            addCriterion("D_Charm >=", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmLessThan(String value) {
            addCriterion("D_Charm <", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmLessThanOrEqualTo(String value) {
            addCriterion("D_Charm <=", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmLike(String value) {
            addCriterion("D_Charm like", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotLike(String value) {
            addCriterion("D_Charm not like", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmIn(List<String> values) {
            addCriterion("D_Charm in", values, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotIn(List<String> values) {
            addCriterion("D_Charm not in", values, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmBetween(String value1, String value2) {
            addCriterion("D_Charm between", value1, value2, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotBetween(String value1, String value2) {
            addCriterion("D_Charm not between", value1, value2, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveIsNull() {
            addCriterion("D_Subjective is null");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveIsNotNull() {
            addCriterion("D_Subjective is not null");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveEqualTo(String value) {
            addCriterion("D_Subjective =", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotEqualTo(String value) {
            addCriterion("D_Subjective <>", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveGreaterThan(String value) {
            addCriterion("D_Subjective >", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveGreaterThanOrEqualTo(String value) {
            addCriterion("D_Subjective >=", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveLessThan(String value) {
            addCriterion("D_Subjective <", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveLessThanOrEqualTo(String value) {
            addCriterion("D_Subjective <=", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveLike(String value) {
            addCriterion("D_Subjective like", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotLike(String value) {
            addCriterion("D_Subjective not like", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveIn(List<String> values) {
            addCriterion("D_Subjective in", values, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotIn(List<String> values) {
            addCriterion("D_Subjective not in", values, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveBetween(String value1, String value2) {
            addCriterion("D_Subjective between", value1, value2, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotBetween(String value1, String value2) {
            addCriterion("D_Subjective not between", value1, value2, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDModestyIsNull() {
            addCriterion("D_Modesty is null");
            return (Criteria) this;
        }

        public Criteria andDModestyIsNotNull() {
            addCriterion("D_Modesty is not null");
            return (Criteria) this;
        }

        public Criteria andDModestyEqualTo(String value) {
            addCriterion("D_Modesty =", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotEqualTo(String value) {
            addCriterion("D_Modesty <>", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyGreaterThan(String value) {
            addCriterion("D_Modesty >", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyGreaterThanOrEqualTo(String value) {
            addCriterion("D_Modesty >=", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyLessThan(String value) {
            addCriterion("D_Modesty <", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyLessThanOrEqualTo(String value) {
            addCriterion("D_Modesty <=", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyLike(String value) {
            addCriterion("D_Modesty like", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotLike(String value) {
            addCriterion("D_Modesty not like", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyIn(List<String> values) {
            addCriterion("D_Modesty in", values, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotIn(List<String> values) {
            addCriterion("D_Modesty not in", values, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyBetween(String value1, String value2) {
            addCriterion("D_Modesty between", value1, value2, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotBetween(String value1, String value2) {
            addCriterion("D_Modesty not between", value1, value2, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDAttentionIsNull() {
            addCriterion("D_Attention is null");
            return (Criteria) this;
        }

        public Criteria andDAttentionIsNotNull() {
            addCriterion("D_Attention is not null");
            return (Criteria) this;
        }

        public Criteria andDAttentionEqualTo(String value) {
            addCriterion("D_Attention =", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotEqualTo(String value) {
            addCriterion("D_Attention <>", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionGreaterThan(String value) {
            addCriterion("D_Attention >", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("D_Attention >=", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLessThan(String value) {
            addCriterion("D_Attention <", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLessThanOrEqualTo(String value) {
            addCriterion("D_Attention <=", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLike(String value) {
            addCriterion("D_Attention like", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotLike(String value) {
            addCriterion("D_Attention not like", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionIn(List<String> values) {
            addCriterion("D_Attention in", values, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotIn(List<String> values) {
            addCriterion("D_Attention not in", values, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionBetween(String value1, String value2) {
            addCriterion("D_Attention between", value1, value2, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotBetween(String value1, String value2) {
            addCriterion("D_Attention not between", value1, value2, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDExpressionIsNull() {
            addCriterion("D_Expression is null");
            return (Criteria) this;
        }

        public Criteria andDExpressionIsNotNull() {
            addCriterion("D_Expression is not null");
            return (Criteria) this;
        }

        public Criteria andDExpressionEqualTo(String value) {
            addCriterion("D_Expression =", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotEqualTo(String value) {
            addCriterion("D_Expression <>", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionGreaterThan(String value) {
            addCriterion("D_Expression >", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("D_Expression >=", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionLessThan(String value) {
            addCriterion("D_Expression <", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionLessThanOrEqualTo(String value) {
            addCriterion("D_Expression <=", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionLike(String value) {
            addCriterion("D_Expression like", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotLike(String value) {
            addCriterion("D_Expression not like", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionIn(List<String> values) {
            addCriterion("D_Expression in", values, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotIn(List<String> values) {
            addCriterion("D_Expression not in", values, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionBetween(String value1, String value2) {
            addCriterion("D_Expression between", value1, value2, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotBetween(String value1, String value2) {
            addCriterion("D_Expression not between", value1, value2, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionIsNull() {
            addCriterion("D_Extreme_Emotion is null");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionIsNotNull() {
            addCriterion("D_Extreme_Emotion is not null");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionEqualTo(String value) {
            addCriterion("D_Extreme_Emotion =", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotEqualTo(String value) {
            addCriterion("D_Extreme_Emotion <>", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionGreaterThan(String value) {
            addCriterion("D_Extreme_Emotion >", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionGreaterThanOrEqualTo(String value) {
            addCriterion("D_Extreme_Emotion >=", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionLessThan(String value) {
            addCriterion("D_Extreme_Emotion <", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionLessThanOrEqualTo(String value) {
            addCriterion("D_Extreme_Emotion <=", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionLike(String value) {
            addCriterion("D_Extreme_Emotion like", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotLike(String value) {
            addCriterion("D_Extreme_Emotion not like", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionIn(List<String> values) {
            addCriterion("D_Extreme_Emotion in", values, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotIn(List<String> values) {
            addCriterion("D_Extreme_Emotion not in", values, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionBetween(String value1, String value2) {
            addCriterion("D_Extreme_Emotion between", value1, value2, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotBetween(String value1, String value2) {
            addCriterion("D_Extreme_Emotion not between", value1, value2, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExpectationIsNull() {
            addCriterion("D_Expectation is null");
            return (Criteria) this;
        }

        public Criteria andDExpectationIsNotNull() {
            addCriterion("D_Expectation is not null");
            return (Criteria) this;
        }

        public Criteria andDExpectationEqualTo(String value) {
            addCriterion("D_Expectation =", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotEqualTo(String value) {
            addCriterion("D_Expectation <>", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationGreaterThan(String value) {
            addCriterion("D_Expectation >", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationGreaterThanOrEqualTo(String value) {
            addCriterion("D_Expectation >=", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationLessThan(String value) {
            addCriterion("D_Expectation <", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationLessThanOrEqualTo(String value) {
            addCriterion("D_Expectation <=", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationLike(String value) {
            addCriterion("D_Expectation like", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotLike(String value) {
            addCriterion("D_Expectation not like", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationIn(List<String> values) {
            addCriterion("D_Expectation in", values, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotIn(List<String> values) {
            addCriterion("D_Expectation not in", values, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationBetween(String value1, String value2) {
            addCriterion("D_Expectation between", value1, value2, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotBetween(String value1, String value2) {
            addCriterion("D_Expectation not between", value1, value2, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDDetailIsNull() {
            addCriterion("D_Detail is null");
            return (Criteria) this;
        }

        public Criteria andDDetailIsNotNull() {
            addCriterion("D_Detail is not null");
            return (Criteria) this;
        }

        public Criteria andDDetailEqualTo(String value) {
            addCriterion("D_Detail =", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotEqualTo(String value) {
            addCriterion("D_Detail <>", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailGreaterThan(String value) {
            addCriterion("D_Detail >", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailGreaterThanOrEqualTo(String value) {
            addCriterion("D_Detail >=", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLessThan(String value) {
            addCriterion("D_Detail <", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLessThanOrEqualTo(String value) {
            addCriterion("D_Detail <=", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLike(String value) {
            addCriterion("D_Detail like", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotLike(String value) {
            addCriterion("D_Detail not like", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailIn(List<String> values) {
            addCriterion("D_Detail in", values, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotIn(List<String> values) {
            addCriterion("D_Detail not in", values, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailBetween(String value1, String value2) {
            addCriterion("D_Detail between", value1, value2, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotBetween(String value1, String value2) {
            addCriterion("D_Detail not between", value1, value2, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDComprehensionIsNull() {
            addCriterion("D_Comprehension is null");
            return (Criteria) this;
        }

        public Criteria andDComprehensionIsNotNull() {
            addCriterion("D_Comprehension is not null");
            return (Criteria) this;
        }

        public Criteria andDComprehensionEqualTo(String value) {
            addCriterion("D_Comprehension =", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotEqualTo(String value) {
            addCriterion("D_Comprehension <>", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionGreaterThan(String value) {
            addCriterion("D_Comprehension >", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionGreaterThanOrEqualTo(String value) {
            addCriterion("D_Comprehension >=", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionLessThan(String value) {
            addCriterion("D_Comprehension <", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionLessThanOrEqualTo(String value) {
            addCriterion("D_Comprehension <=", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionLike(String value) {
            addCriterion("D_Comprehension like", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotLike(String value) {
            addCriterion("D_Comprehension not like", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionIn(List<String> values) {
            addCriterion("D_Comprehension in", values, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotIn(List<String> values) {
            addCriterion("D_Comprehension not in", values, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionBetween(String value1, String value2) {
            addCriterion("D_Comprehension between", value1, value2, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotBetween(String value1, String value2) {
            addCriterion("D_Comprehension not between", value1, value2, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchIsNull() {
            addCriterion("D_Internet_Research is null");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchIsNotNull() {
            addCriterion("D_Internet_Research is not null");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchEqualTo(String value) {
            addCriterion("D_Internet_Research =", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotEqualTo(String value) {
            addCriterion("D_Internet_Research <>", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchGreaterThan(String value) {
            addCriterion("D_Internet_Research >", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchGreaterThanOrEqualTo(String value) {
            addCriterion("D_Internet_Research >=", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchLessThan(String value) {
            addCriterion("D_Internet_Research <", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchLessThanOrEqualTo(String value) {
            addCriterion("D_Internet_Research <=", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchLike(String value) {
            addCriterion("D_Internet_Research like", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotLike(String value) {
            addCriterion("D_Internet_Research not like", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchIn(List<String> values) {
            addCriterion("D_Internet_Research in", values, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotIn(List<String> values) {
            addCriterion("D_Internet_Research not in", values, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchBetween(String value1, String value2) {
            addCriterion("D_Internet_Research between", value1, value2, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotBetween(String value1, String value2) {
            addCriterion("D_Internet_Research not between", value1, value2, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousIsNull() {
            addCriterion("D_Suspicious is null");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousIsNotNull() {
            addCriterion("D_Suspicious is not null");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousEqualTo(String value) {
            addCriterion("D_Suspicious =", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotEqualTo(String value) {
            addCriterion("D_Suspicious <>", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousGreaterThan(String value) {
            addCriterion("D_Suspicious >", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousGreaterThanOrEqualTo(String value) {
            addCriterion("D_Suspicious >=", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousLessThan(String value) {
            addCriterion("D_Suspicious <", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousLessThanOrEqualTo(String value) {
            addCriterion("D_Suspicious <=", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousLike(String value) {
            addCriterion("D_Suspicious like", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotLike(String value) {
            addCriterion("D_Suspicious not like", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousIn(List<String> values) {
            addCriterion("D_Suspicious in", values, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotIn(List<String> values) {
            addCriterion("D_Suspicious not in", values, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousBetween(String value1, String value2) {
            addCriterion("D_Suspicious between", value1, value2, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotBetween(String value1, String value2) {
            addCriterion("D_Suspicious not between", value1, value2, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDRepairIsNull() {
            addCriterion("D_Repair is null");
            return (Criteria) this;
        }

        public Criteria andDRepairIsNotNull() {
            addCriterion("D_Repair is not null");
            return (Criteria) this;
        }

        public Criteria andDRepairEqualTo(String value) {
            addCriterion("D_Repair =", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotEqualTo(String value) {
            addCriterion("D_Repair <>", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairGreaterThan(String value) {
            addCriterion("D_Repair >", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairGreaterThanOrEqualTo(String value) {
            addCriterion("D_Repair >=", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairLessThan(String value) {
            addCriterion("D_Repair <", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairLessThanOrEqualTo(String value) {
            addCriterion("D_Repair <=", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairLike(String value) {
            addCriterion("D_Repair like", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotLike(String value) {
            addCriterion("D_Repair not like", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairIn(List<String> values) {
            addCriterion("D_Repair in", values, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotIn(List<String> values) {
            addCriterion("D_Repair not in", values, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairBetween(String value1, String value2) {
            addCriterion("D_Repair between", value1, value2, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotBetween(String value1, String value2) {
            addCriterion("D_Repair not between", value1, value2, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDImpulsionIsNull() {
            addCriterion("D_Impulsion is null");
            return (Criteria) this;
        }

        public Criteria andDImpulsionIsNotNull() {
            addCriterion("D_Impulsion is not null");
            return (Criteria) this;
        }

        public Criteria andDImpulsionEqualTo(String value) {
            addCriterion("D_Impulsion =", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotEqualTo(String value) {
            addCriterion("D_Impulsion <>", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionGreaterThan(String value) {
            addCriterion("D_Impulsion >", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionGreaterThanOrEqualTo(String value) {
            addCriterion("D_Impulsion >=", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionLessThan(String value) {
            addCriterion("D_Impulsion <", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionLessThanOrEqualTo(String value) {
            addCriterion("D_Impulsion <=", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionLike(String value) {
            addCriterion("D_Impulsion like", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotLike(String value) {
            addCriterion("D_Impulsion not like", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionIn(List<String> values) {
            addCriterion("D_Impulsion in", values, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotIn(List<String> values) {
            addCriterion("D_Impulsion not in", values, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionBetween(String value1, String value2) {
            addCriterion("D_Impulsion between", value1, value2, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotBetween(String value1, String value2) {
            addCriterion("D_Impulsion not between", value1, value2, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDPriceIsNull() {
            addCriterion("D_Price is null");
            return (Criteria) this;
        }

        public Criteria andDPriceIsNotNull() {
            addCriterion("D_Price is not null");
            return (Criteria) this;
        }

        public Criteria andDPriceEqualTo(String value) {
            addCriterion("D_Price =", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotEqualTo(String value) {
            addCriterion("D_Price <>", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThan(String value) {
            addCriterion("D_Price >", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThanOrEqualTo(String value) {
            addCriterion("D_Price >=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThan(String value) {
            addCriterion("D_Price <", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThanOrEqualTo(String value) {
            addCriterion("D_Price <=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLike(String value) {
            addCriterion("D_Price like", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotLike(String value) {
            addCriterion("D_Price not like", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceIn(List<String> values) {
            addCriterion("D_Price in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotIn(List<String> values) {
            addCriterion("D_Price not in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceBetween(String value1, String value2) {
            addCriterion("D_Price between", value1, value2, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotBetween(String value1, String value2) {
            addCriterion("D_Price not between", value1, value2, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDSlanderIsNull() {
            addCriterion("D_Slander is null");
            return (Criteria) this;
        }

        public Criteria andDSlanderIsNotNull() {
            addCriterion("D_Slander is not null");
            return (Criteria) this;
        }

        public Criteria andDSlanderEqualTo(String value) {
            addCriterion("D_Slander =", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotEqualTo(String value) {
            addCriterion("D_Slander <>", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderGreaterThan(String value) {
            addCriterion("D_Slander >", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderGreaterThanOrEqualTo(String value) {
            addCriterion("D_Slander >=", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderLessThan(String value) {
            addCriterion("D_Slander <", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderLessThanOrEqualTo(String value) {
            addCriterion("D_Slander <=", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderLike(String value) {
            addCriterion("D_Slander like", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotLike(String value) {
            addCriterion("D_Slander not like", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderIn(List<String> values) {
            addCriterion("D_Slander in", values, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotIn(List<String> values) {
            addCriterion("D_Slander not in", values, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderBetween(String value1, String value2) {
            addCriterion("D_Slander between", value1, value2, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotBetween(String value1, String value2) {
            addCriterion("D_Slander not between", value1, value2, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDForwardnessIsNull() {
            addCriterion("D_Forwardness is null");
            return (Criteria) this;
        }

        public Criteria andDForwardnessIsNotNull() {
            addCriterion("D_Forwardness is not null");
            return (Criteria) this;
        }

        public Criteria andDForwardnessEqualTo(String value) {
            addCriterion("D_Forwardness =", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotEqualTo(String value) {
            addCriterion("D_Forwardness <>", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessGreaterThan(String value) {
            addCriterion("D_Forwardness >", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessGreaterThanOrEqualTo(String value) {
            addCriterion("D_Forwardness >=", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessLessThan(String value) {
            addCriterion("D_Forwardness <", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessLessThanOrEqualTo(String value) {
            addCriterion("D_Forwardness <=", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessLike(String value) {
            addCriterion("D_Forwardness like", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotLike(String value) {
            addCriterion("D_Forwardness not like", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessIn(List<String> values) {
            addCriterion("D_Forwardness in", values, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotIn(List<String> values) {
            addCriterion("D_Forwardness not in", values, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessBetween(String value1, String value2) {
            addCriterion("D_Forwardness between", value1, value2, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotBetween(String value1, String value2) {
            addCriterion("D_Forwardness not between", value1, value2, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDPraiseIsNull() {
            addCriterion("D_Praise is null");
            return (Criteria) this;
        }

        public Criteria andDPraiseIsNotNull() {
            addCriterion("D_Praise is not null");
            return (Criteria) this;
        }

        public Criteria andDPraiseEqualTo(String value) {
            addCriterion("D_Praise =", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotEqualTo(String value) {
            addCriterion("D_Praise <>", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseGreaterThan(String value) {
            addCriterion("D_Praise >", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseGreaterThanOrEqualTo(String value) {
            addCriterion("D_Praise >=", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseLessThan(String value) {
            addCriterion("D_Praise <", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseLessThanOrEqualTo(String value) {
            addCriterion("D_Praise <=", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseLike(String value) {
            addCriterion("D_Praise like", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotLike(String value) {
            addCriterion("D_Praise not like", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseIn(List<String> values) {
            addCriterion("D_Praise in", values, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotIn(List<String> values) {
            addCriterion("D_Praise not in", values, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseBetween(String value1, String value2) {
            addCriterion("D_Praise between", value1, value2, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotBetween(String value1, String value2) {
            addCriterion("D_Praise not between", value1, value2, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDQuarrelIsNull() {
            addCriterion("D_Quarrel is null");
            return (Criteria) this;
        }

        public Criteria andDQuarrelIsNotNull() {
            addCriterion("D_Quarrel is not null");
            return (Criteria) this;
        }

        public Criteria andDQuarrelEqualTo(String value) {
            addCriterion("D_Quarrel =", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotEqualTo(String value) {
            addCriterion("D_Quarrel <>", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelGreaterThan(String value) {
            addCriterion("D_Quarrel >", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelGreaterThanOrEqualTo(String value) {
            addCriterion("D_Quarrel >=", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelLessThan(String value) {
            addCriterion("D_Quarrel <", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelLessThanOrEqualTo(String value) {
            addCriterion("D_Quarrel <=", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelLike(String value) {
            addCriterion("D_Quarrel like", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotLike(String value) {
            addCriterion("D_Quarrel not like", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelIn(List<String> values) {
            addCriterion("D_Quarrel in", values, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotIn(List<String> values) {
            addCriterion("D_Quarrel not in", values, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelBetween(String value1, String value2) {
            addCriterion("D_Quarrel between", value1, value2, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotBetween(String value1, String value2) {
            addCriterion("D_Quarrel not between", value1, value2, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDArtDetailIsNull() {
            addCriterion("D_Art_Detail is null");
            return (Criteria) this;
        }

        public Criteria andDArtDetailIsNotNull() {
            addCriterion("D_Art_Detail is not null");
            return (Criteria) this;
        }

        public Criteria andDArtDetailEqualTo(String value) {
            addCriterion("D_Art_Detail =", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotEqualTo(String value) {
            addCriterion("D_Art_Detail <>", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailGreaterThan(String value) {
            addCriterion("D_Art_Detail >", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailGreaterThanOrEqualTo(String value) {
            addCriterion("D_Art_Detail >=", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailLessThan(String value) {
            addCriterion("D_Art_Detail <", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailLessThanOrEqualTo(String value) {
            addCriterion("D_Art_Detail <=", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailLike(String value) {
            addCriterion("D_Art_Detail like", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotLike(String value) {
            addCriterion("D_Art_Detail not like", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailIn(List<String> values) {
            addCriterion("D_Art_Detail in", values, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotIn(List<String> values) {
            addCriterion("D_Art_Detail not in", values, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailBetween(String value1, String value2) {
            addCriterion("D_Art_Detail between", value1, value2, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotBetween(String value1, String value2) {
            addCriterion("D_Art_Detail not between", value1, value2, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDScarIsNull() {
            addCriterion("D_Scar is null");
            return (Criteria) this;
        }

        public Criteria andDScarIsNotNull() {
            addCriterion("D_Scar is not null");
            return (Criteria) this;
        }

        public Criteria andDScarEqualTo(String value) {
            addCriterion("D_Scar =", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotEqualTo(String value) {
            addCriterion("D_Scar <>", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarGreaterThan(String value) {
            addCriterion("D_Scar >", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarGreaterThanOrEqualTo(String value) {
            addCriterion("D_Scar >=", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarLessThan(String value) {
            addCriterion("D_Scar <", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarLessThanOrEqualTo(String value) {
            addCriterion("D_Scar <=", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarLike(String value) {
            addCriterion("D_Scar like", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotLike(String value) {
            addCriterion("D_Scar not like", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarIn(List<String> values) {
            addCriterion("D_Scar in", values, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotIn(List<String> values) {
            addCriterion("D_Scar not in", values, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarBetween(String value1, String value2) {
            addCriterion("D_Scar between", value1, value2, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotBetween(String value1, String value2) {
            addCriterion("D_Scar not between", value1, value2, "dScar");
            return (Criteria) this;
        }

        public Criteria andDFailIsNull() {
            addCriterion("D_Fail is null");
            return (Criteria) this;
        }

        public Criteria andDFailIsNotNull() {
            addCriterion("D_Fail is not null");
            return (Criteria) this;
        }

        public Criteria andDFailEqualTo(String value) {
            addCriterion("D_Fail =", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotEqualTo(String value) {
            addCriterion("D_Fail <>", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailGreaterThan(String value) {
            addCriterion("D_Fail >", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailGreaterThanOrEqualTo(String value) {
            addCriterion("D_Fail >=", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailLessThan(String value) {
            addCriterion("D_Fail <", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailLessThanOrEqualTo(String value) {
            addCriterion("D_Fail <=", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailLike(String value) {
            addCriterion("D_Fail like", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotLike(String value) {
            addCriterion("D_Fail not like", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailIn(List<String> values) {
            addCriterion("D_Fail in", values, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotIn(List<String> values) {
            addCriterion("D_Fail not in", values, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailBetween(String value1, String value2) {
            addCriterion("D_Fail between", value1, value2, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotBetween(String value1, String value2) {
            addCriterion("D_Fail not between", value1, value2, "dFail");
            return (Criteria) this;
        }

        public Criteria andDNurseIsNull() {
            addCriterion("D_Nurse is null");
            return (Criteria) this;
        }

        public Criteria andDNurseIsNotNull() {
            addCriterion("D_Nurse is not null");
            return (Criteria) this;
        }

        public Criteria andDNurseEqualTo(String value) {
            addCriterion("D_Nurse =", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotEqualTo(String value) {
            addCriterion("D_Nurse <>", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseGreaterThan(String value) {
            addCriterion("D_Nurse >", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseGreaterThanOrEqualTo(String value) {
            addCriterion("D_Nurse >=", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseLessThan(String value) {
            addCriterion("D_Nurse <", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseLessThanOrEqualTo(String value) {
            addCriterion("D_Nurse <=", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseLike(String value) {
            addCriterion("D_Nurse like", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotLike(String value) {
            addCriterion("D_Nurse not like", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseIn(List<String> values) {
            addCriterion("D_Nurse in", values, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotIn(List<String> values) {
            addCriterion("D_Nurse not in", values, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseBetween(String value1, String value2) {
            addCriterion("D_Nurse between", value1, value2, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotBetween(String value1, String value2) {
            addCriterion("D_Nurse not between", value1, value2, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDPerfectIsNull() {
            addCriterion("D_Perfect is null");
            return (Criteria) this;
        }

        public Criteria andDPerfectIsNotNull() {
            addCriterion("D_Perfect is not null");
            return (Criteria) this;
        }

        public Criteria andDPerfectEqualTo(String value) {
            addCriterion("D_Perfect =", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotEqualTo(String value) {
            addCriterion("D_Perfect <>", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectGreaterThan(String value) {
            addCriterion("D_Perfect >", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectGreaterThanOrEqualTo(String value) {
            addCriterion("D_Perfect >=", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectLessThan(String value) {
            addCriterion("D_Perfect <", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectLessThanOrEqualTo(String value) {
            addCriterion("D_Perfect <=", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectLike(String value) {
            addCriterion("D_Perfect like", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotLike(String value) {
            addCriterion("D_Perfect not like", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectIn(List<String> values) {
            addCriterion("D_Perfect in", values, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotIn(List<String> values) {
            addCriterion("D_Perfect not in", values, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectBetween(String value1, String value2) {
            addCriterion("D_Perfect between", value1, value2, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotBetween(String value1, String value2) {
            addCriterion("D_Perfect not between", value1, value2, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDParanoidIsNull() {
            addCriterion("D_Paranoid is null");
            return (Criteria) this;
        }

        public Criteria andDParanoidIsNotNull() {
            addCriterion("D_Paranoid is not null");
            return (Criteria) this;
        }

        public Criteria andDParanoidEqualTo(String value) {
            addCriterion("D_Paranoid =", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotEqualTo(String value) {
            addCriterion("D_Paranoid <>", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidGreaterThan(String value) {
            addCriterion("D_Paranoid >", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidGreaterThanOrEqualTo(String value) {
            addCriterion("D_Paranoid >=", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidLessThan(String value) {
            addCriterion("D_Paranoid <", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidLessThanOrEqualTo(String value) {
            addCriterion("D_Paranoid <=", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidLike(String value) {
            addCriterion("D_Paranoid like", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotLike(String value) {
            addCriterion("D_Paranoid not like", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidIn(List<String> values) {
            addCriterion("D_Paranoid in", values, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotIn(List<String> values) {
            addCriterion("D_Paranoid not in", values, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidBetween(String value1, String value2) {
            addCriterion("D_Paranoid between", value1, value2, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotBetween(String value1, String value2) {
            addCriterion("D_Paranoid not between", value1, value2, "dParanoid");
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