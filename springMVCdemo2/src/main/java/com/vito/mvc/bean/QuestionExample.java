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

        public Criteria andPSexEqualTo(Byte value) {
            addCriterion("P_Sex =", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotEqualTo(Byte value) {
            addCriterion("P_Sex <>", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThan(Byte value) {
            addCriterion("P_Sex >", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Sex >=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThan(Byte value) {
            addCriterion("P_Sex <", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThanOrEqualTo(Byte value) {
            addCriterion("P_Sex <=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexIn(List<Byte> values) {
            addCriterion("P_Sex in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotIn(List<Byte> values) {
            addCriterion("P_Sex not in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexBetween(Byte value1, Byte value2) {
            addCriterion("P_Sex between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPAgeEqualTo(Byte value) {
            addCriterion("P_Age =", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotEqualTo(Byte value) {
            addCriterion("P_Age <>", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThan(Byte value) {
            addCriterion("P_Age >", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Age >=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThan(Byte value) {
            addCriterion("P_Age <", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThanOrEqualTo(Byte value) {
            addCriterion("P_Age <=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeIn(List<Byte> values) {
            addCriterion("P_Age in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotIn(List<Byte> values) {
            addCriterion("P_Age not in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeBetween(Byte value1, Byte value2) {
            addCriterion("P_Age between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPConstellationEqualTo(Byte value) {
            addCriterion("P_Constellation =", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotEqualTo(Byte value) {
            addCriterion("P_Constellation <>", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationGreaterThan(Byte value) {
            addCriterion("P_Constellation >", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Constellation >=", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLessThan(Byte value) {
            addCriterion("P_Constellation <", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLessThanOrEqualTo(Byte value) {
            addCriterion("P_Constellation <=", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationIn(List<Byte> values) {
            addCriterion("P_Constellation in", values, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotIn(List<Byte> values) {
            addCriterion("P_Constellation not in", values, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationBetween(Byte value1, Byte value2) {
            addCriterion("P_Constellation between", value1, value2, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPBloodTypeEqualTo(Byte value) {
            addCriterion("P_Blood_Type =", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotEqualTo(Byte value) {
            addCriterion("P_Blood_Type <>", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeGreaterThan(Byte value) {
            addCriterion("P_Blood_Type >", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Blood_Type >=", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeLessThan(Byte value) {
            addCriterion("P_Blood_Type <", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeLessThanOrEqualTo(Byte value) {
            addCriterion("P_Blood_Type <=", value, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeIn(List<Byte> values) {
            addCriterion("P_Blood_Type in", values, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotIn(List<Byte> values) {
            addCriterion("P_Blood_Type not in", values, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeBetween(Byte value1, Byte value2) {
            addCriterion("P_Blood_Type between", value1, value2, "pBloodType");
            return (Criteria) this;
        }

        public Criteria andPBloodTypeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPOccupationRiskEqualTo(Byte value) {
            addCriterion("P_Occupation_Risk =", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotEqualTo(Byte value) {
            addCriterion("P_Occupation_Risk <>", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskGreaterThan(Byte value) {
            addCriterion("P_Occupation_Risk >", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Occupation_Risk >=", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskLessThan(Byte value) {
            addCriterion("P_Occupation_Risk <", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskLessThanOrEqualTo(Byte value) {
            addCriterion("P_Occupation_Risk <=", value, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskIn(List<Byte> values) {
            addCriterion("P_Occupation_Risk in", values, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotIn(List<Byte> values) {
            addCriterion("P_Occupation_Risk not in", values, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskBetween(Byte value1, Byte value2) {
            addCriterion("P_Occupation_Risk between", value1, value2, "pOccupationRisk");
            return (Criteria) this;
        }

        public Criteria andPOccupationRiskNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPEducationEqualTo(Byte value) {
            addCriterion("P_Education =", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotEqualTo(Byte value) {
            addCriterion("P_Education <>", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationGreaterThan(Byte value) {
            addCriterion("P_Education >", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Education >=", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLessThan(Byte value) {
            addCriterion("P_Education <", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLessThanOrEqualTo(Byte value) {
            addCriterion("P_Education <=", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationIn(List<Byte> values) {
            addCriterion("P_Education in", values, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotIn(List<Byte> values) {
            addCriterion("P_Education not in", values, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationBetween(Byte value1, Byte value2) {
            addCriterion("P_Education between", value1, value2, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPMarriageStatusEqualTo(Byte value) {
            addCriterion("P_Marriage_Status =", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotEqualTo(Byte value) {
            addCriterion("P_Marriage_Status <>", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusGreaterThan(Byte value) {
            addCriterion("P_Marriage_Status >", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Marriage_Status >=", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusLessThan(Byte value) {
            addCriterion("P_Marriage_Status <", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusLessThanOrEqualTo(Byte value) {
            addCriterion("P_Marriage_Status <=", value, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusIn(List<Byte> values) {
            addCriterion("P_Marriage_Status in", values, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotIn(List<Byte> values) {
            addCriterion("P_Marriage_Status not in", values, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusBetween(Byte value1, Byte value2) {
            addCriterion("P_Marriage_Status between", value1, value2, "pMarriageStatus");
            return (Criteria) this;
        }

        public Criteria andPMarriageStatusNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPSurgeryHistoryEqualTo(Byte value) {
            addCriterion("P_Surgery_History =", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotEqualTo(Byte value) {
            addCriterion("P_Surgery_History <>", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryGreaterThan(Byte value) {
            addCriterion("P_Surgery_History >", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Surgery_History >=", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryLessThan(Byte value) {
            addCriterion("P_Surgery_History <", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryLessThanOrEqualTo(Byte value) {
            addCriterion("P_Surgery_History <=", value, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryIn(List<Byte> values) {
            addCriterion("P_Surgery_History in", values, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotIn(List<Byte> values) {
            addCriterion("P_Surgery_History not in", values, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryBetween(Byte value1, Byte value2) {
            addCriterion("P_Surgery_History between", value1, value2, "pSurgeryHistory");
            return (Criteria) this;
        }

        public Criteria andPSurgeryHistoryNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPComparisonEqualTo(Byte value) {
            addCriterion("P_Comparison =", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotEqualTo(Byte value) {
            addCriterion("P_Comparison <>", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonGreaterThan(Byte value) {
            addCriterion("P_Comparison >", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Comparison >=", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonLessThan(Byte value) {
            addCriterion("P_Comparison <", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonLessThanOrEqualTo(Byte value) {
            addCriterion("P_Comparison <=", value, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonIn(List<Byte> values) {
            addCriterion("P_Comparison in", values, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotIn(List<Byte> values) {
            addCriterion("P_Comparison not in", values, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonBetween(Byte value1, Byte value2) {
            addCriterion("P_Comparison between", value1, value2, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPComparisonNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Comparison not between", value1, value2, "pComparison");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionIsNull() {
            addCriterion("P_Others_Satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionIsNotNull() {
            addCriterion("P_Others_Satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionEqualTo(Byte value) {
            addCriterion("P_Others_Satisfaction =", value, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionNotEqualTo(Byte value) {
            addCriterion("P_Others_Satisfaction <>", value, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionGreaterThan(Byte value) {
            addCriterion("P_Others_Satisfaction >", value, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Others_Satisfaction >=", value, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionLessThan(Byte value) {
            addCriterion("P_Others_Satisfaction <", value, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionLessThanOrEqualTo(Byte value) {
            addCriterion("P_Others_Satisfaction <=", value, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionIn(List<Byte> values) {
            addCriterion("P_Others_Satisfaction in", values, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionNotIn(List<Byte> values) {
            addCriterion("P_Others_Satisfaction not in", values, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionBetween(Byte value1, Byte value2) {
            addCriterion("P_Others_Satisfaction between", value1, value2, "pOthersSatisfaction");
            return (Criteria) this;
        }

        public Criteria andPOthersSatisfactionNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Others_Satisfaction not between", value1, value2, "pOthersSatisfaction");
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

        public Criteria andPChangeLifeEqualTo(Byte value) {
            addCriterion("P_Change_Life =", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotEqualTo(Byte value) {
            addCriterion("P_Change_Life <>", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeGreaterThan(Byte value) {
            addCriterion("P_Change_Life >", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Change_Life >=", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeLessThan(Byte value) {
            addCriterion("P_Change_Life <", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeLessThanOrEqualTo(Byte value) {
            addCriterion("P_Change_Life <=", value, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeIn(List<Byte> values) {
            addCriterion("P_Change_Life in", values, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotIn(List<Byte> values) {
            addCriterion("P_Change_Life not in", values, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeBetween(Byte value1, Byte value2) {
            addCriterion("P_Change_Life between", value1, value2, "pChangeLife");
            return (Criteria) this;
        }

        public Criteria andPChangeLifeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPChangeDestinyEqualTo(Byte value) {
            addCriterion("P_Change_Destiny =", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotEqualTo(Byte value) {
            addCriterion("P_Change_Destiny <>", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyGreaterThan(Byte value) {
            addCriterion("P_Change_Destiny >", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Change_Destiny >=", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyLessThan(Byte value) {
            addCriterion("P_Change_Destiny <", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyLessThanOrEqualTo(Byte value) {
            addCriterion("P_Change_Destiny <=", value, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyIn(List<Byte> values) {
            addCriterion("P_Change_Destiny in", values, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotIn(List<Byte> values) {
            addCriterion("P_Change_Destiny not in", values, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyBetween(Byte value1, Byte value2) {
            addCriterion("P_Change_Destiny between", value1, value2, "pChangeDestiny");
            return (Criteria) this;
        }

        public Criteria andPChangeDestinyNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPKinsfolkAttitudeEqualTo(Byte value) {
            addCriterion("P_Kinsfolk_Attitude =", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotEqualTo(Byte value) {
            addCriterion("P_Kinsfolk_Attitude <>", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeGreaterThan(Byte value) {
            addCriterion("P_Kinsfolk_Attitude >", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Kinsfolk_Attitude >=", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeLessThan(Byte value) {
            addCriterion("P_Kinsfolk_Attitude <", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeLessThanOrEqualTo(Byte value) {
            addCriterion("P_Kinsfolk_Attitude <=", value, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeIn(List<Byte> values) {
            addCriterion("P_Kinsfolk_Attitude in", values, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotIn(List<Byte> values) {
            addCriterion("P_Kinsfolk_Attitude not in", values, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeBetween(Byte value1, Byte value2) {
            addCriterion("P_Kinsfolk_Attitude between", value1, value2, "pKinsfolkAttitude");
            return (Criteria) this;
        }

        public Criteria andPKinsfolkAttitudeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPUnhappinessFamilyEqualTo(Byte value) {
            addCriterion("P_Unhappiness_Family =", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotEqualTo(Byte value) {
            addCriterion("P_Unhappiness_Family <>", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyGreaterThan(Byte value) {
            addCriterion("P_Unhappiness_Family >", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Unhappiness_Family >=", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyLessThan(Byte value) {
            addCriterion("P_Unhappiness_Family <", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyLessThanOrEqualTo(Byte value) {
            addCriterion("P_Unhappiness_Family <=", value, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyIn(List<Byte> values) {
            addCriterion("P_Unhappiness_Family in", values, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotIn(List<Byte> values) {
            addCriterion("P_Unhappiness_Family not in", values, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyBetween(Byte value1, Byte value2) {
            addCriterion("P_Unhappiness_Family between", value1, value2, "pUnhappinessFamily");
            return (Criteria) this;
        }

        public Criteria andPUnhappinessFamilyNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPMentalDisorderEqualTo(Byte value) {
            addCriterion("P_Mental_Disorder =", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotEqualTo(Byte value) {
            addCriterion("P_Mental_Disorder <>", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderGreaterThan(Byte value) {
            addCriterion("P_Mental_Disorder >", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Mental_Disorder >=", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderLessThan(Byte value) {
            addCriterion("P_Mental_Disorder <", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderLessThanOrEqualTo(Byte value) {
            addCriterion("P_Mental_Disorder <=", value, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderIn(List<Byte> values) {
            addCriterion("P_Mental_Disorder in", values, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotIn(List<Byte> values) {
            addCriterion("P_Mental_Disorder not in", values, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderBetween(Byte value1, Byte value2) {
            addCriterion("P_Mental_Disorder between", value1, value2, "pMentalDisorder");
            return (Criteria) this;
        }

        public Criteria andPMentalDisorderNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPSelfieEqualTo(Byte value) {
            addCriterion("P_Selfie =", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotEqualTo(Byte value) {
            addCriterion("P_Selfie <>", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieGreaterThan(Byte value) {
            addCriterion("P_Selfie >", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Selfie >=", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieLessThan(Byte value) {
            addCriterion("P_Selfie <", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieLessThanOrEqualTo(Byte value) {
            addCriterion("P_Selfie <=", value, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieIn(List<Byte> values) {
            addCriterion("P_Selfie in", values, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotIn(List<Byte> values) {
            addCriterion("P_Selfie not in", values, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieBetween(Byte value1, Byte value2) {
            addCriterion("P_Selfie between", value1, value2, "pSelfie");
            return (Criteria) this;
        }

        public Criteria andPSelfieNotBetween(Byte value1, Byte value2) {
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

        public Criteria andPAppearanceAttentionEqualTo(Byte value) {
            addCriterion("P_Appearance_Attention =", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotEqualTo(Byte value) {
            addCriterion("P_Appearance_Attention <>", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionGreaterThan(Byte value) {
            addCriterion("P_Appearance_Attention >", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Appearance_Attention >=", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionLessThan(Byte value) {
            addCriterion("P_Appearance_Attention <", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionLessThanOrEqualTo(Byte value) {
            addCriterion("P_Appearance_Attention <=", value, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionIn(List<Byte> values) {
            addCriterion("P_Appearance_Attention in", values, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotIn(List<Byte> values) {
            addCriterion("P_Appearance_Attention not in", values, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionBetween(Byte value1, Byte value2) {
            addCriterion("P_Appearance_Attention between", value1, value2, "pAppearanceAttention");
            return (Criteria) this;
        }

        public Criteria andPAppearanceAttentionNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDCharmEqualTo(Byte value) {
            addCriterion("D_Charm =", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotEqualTo(Byte value) {
            addCriterion("D_Charm <>", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmGreaterThan(Byte value) {
            addCriterion("D_Charm >", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Charm >=", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmLessThan(Byte value) {
            addCriterion("D_Charm <", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmLessThanOrEqualTo(Byte value) {
            addCriterion("D_Charm <=", value, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmIn(List<Byte> values) {
            addCriterion("D_Charm in", values, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotIn(List<Byte> values) {
            addCriterion("D_Charm not in", values, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmBetween(Byte value1, Byte value2) {
            addCriterion("D_Charm between", value1, value2, "dCharm");
            return (Criteria) this;
        }

        public Criteria andDCharmNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDSubjectiveEqualTo(Byte value) {
            addCriterion("D_Subjective =", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotEqualTo(Byte value) {
            addCriterion("D_Subjective <>", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveGreaterThan(Byte value) {
            addCriterion("D_Subjective >", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Subjective >=", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveLessThan(Byte value) {
            addCriterion("D_Subjective <", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveLessThanOrEqualTo(Byte value) {
            addCriterion("D_Subjective <=", value, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveIn(List<Byte> values) {
            addCriterion("D_Subjective in", values, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotIn(List<Byte> values) {
            addCriterion("D_Subjective not in", values, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveBetween(Byte value1, Byte value2) {
            addCriterion("D_Subjective between", value1, value2, "dSubjective");
            return (Criteria) this;
        }

        public Criteria andDSubjectiveNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDModestyEqualTo(Byte value) {
            addCriterion("D_Modesty =", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotEqualTo(Byte value) {
            addCriterion("D_Modesty <>", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyGreaterThan(Byte value) {
            addCriterion("D_Modesty >", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Modesty >=", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyLessThan(Byte value) {
            addCriterion("D_Modesty <", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyLessThanOrEqualTo(Byte value) {
            addCriterion("D_Modesty <=", value, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyIn(List<Byte> values) {
            addCriterion("D_Modesty in", values, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotIn(List<Byte> values) {
            addCriterion("D_Modesty not in", values, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyBetween(Byte value1, Byte value2) {
            addCriterion("D_Modesty between", value1, value2, "dModesty");
            return (Criteria) this;
        }

        public Criteria andDModestyNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDAttentionEqualTo(Byte value) {
            addCriterion("D_Attention =", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotEqualTo(Byte value) {
            addCriterion("D_Attention <>", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionGreaterThan(Byte value) {
            addCriterion("D_Attention >", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Attention >=", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLessThan(Byte value) {
            addCriterion("D_Attention <", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLessThanOrEqualTo(Byte value) {
            addCriterion("D_Attention <=", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionIn(List<Byte> values) {
            addCriterion("D_Attention in", values, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotIn(List<Byte> values) {
            addCriterion("D_Attention not in", values, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionBetween(Byte value1, Byte value2) {
            addCriterion("D_Attention between", value1, value2, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDExpressionEqualTo(Byte value) {
            addCriterion("D_Expression =", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotEqualTo(Byte value) {
            addCriterion("D_Expression <>", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionGreaterThan(Byte value) {
            addCriterion("D_Expression >", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Expression >=", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionLessThan(Byte value) {
            addCriterion("D_Expression <", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionLessThanOrEqualTo(Byte value) {
            addCriterion("D_Expression <=", value, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionIn(List<Byte> values) {
            addCriterion("D_Expression in", values, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotIn(List<Byte> values) {
            addCriterion("D_Expression not in", values, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionBetween(Byte value1, Byte value2) {
            addCriterion("D_Expression between", value1, value2, "dExpression");
            return (Criteria) this;
        }

        public Criteria andDExpressionNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDExtremeEmotionEqualTo(Byte value) {
            addCriterion("D_Extreme_Emotion =", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotEqualTo(Byte value) {
            addCriterion("D_Extreme_Emotion <>", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionGreaterThan(Byte value) {
            addCriterion("D_Extreme_Emotion >", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Extreme_Emotion >=", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionLessThan(Byte value) {
            addCriterion("D_Extreme_Emotion <", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionLessThanOrEqualTo(Byte value) {
            addCriterion("D_Extreme_Emotion <=", value, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionIn(List<Byte> values) {
            addCriterion("D_Extreme_Emotion in", values, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotIn(List<Byte> values) {
            addCriterion("D_Extreme_Emotion not in", values, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionBetween(Byte value1, Byte value2) {
            addCriterion("D_Extreme_Emotion between", value1, value2, "dExtremeEmotion");
            return (Criteria) this;
        }

        public Criteria andDExtremeEmotionNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDExpectationEqualTo(Byte value) {
            addCriterion("D_Expectation =", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotEqualTo(Byte value) {
            addCriterion("D_Expectation <>", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationGreaterThan(Byte value) {
            addCriterion("D_Expectation >", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Expectation >=", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationLessThan(Byte value) {
            addCriterion("D_Expectation <", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationLessThanOrEqualTo(Byte value) {
            addCriterion("D_Expectation <=", value, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationIn(List<Byte> values) {
            addCriterion("D_Expectation in", values, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotIn(List<Byte> values) {
            addCriterion("D_Expectation not in", values, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationBetween(Byte value1, Byte value2) {
            addCriterion("D_Expectation between", value1, value2, "dExpectation");
            return (Criteria) this;
        }

        public Criteria andDExpectationNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDDetailEqualTo(Byte value) {
            addCriterion("D_Detail =", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotEqualTo(Byte value) {
            addCriterion("D_Detail <>", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailGreaterThan(Byte value) {
            addCriterion("D_Detail >", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Detail >=", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLessThan(Byte value) {
            addCriterion("D_Detail <", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLessThanOrEqualTo(Byte value) {
            addCriterion("D_Detail <=", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailIn(List<Byte> values) {
            addCriterion("D_Detail in", values, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotIn(List<Byte> values) {
            addCriterion("D_Detail not in", values, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailBetween(Byte value1, Byte value2) {
            addCriterion("D_Detail between", value1, value2, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDComprehensionEqualTo(Byte value) {
            addCriterion("D_Comprehension =", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotEqualTo(Byte value) {
            addCriterion("D_Comprehension <>", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionGreaterThan(Byte value) {
            addCriterion("D_Comprehension >", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Comprehension >=", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionLessThan(Byte value) {
            addCriterion("D_Comprehension <", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionLessThanOrEqualTo(Byte value) {
            addCriterion("D_Comprehension <=", value, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionIn(List<Byte> values) {
            addCriterion("D_Comprehension in", values, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotIn(List<Byte> values) {
            addCriterion("D_Comprehension not in", values, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionBetween(Byte value1, Byte value2) {
            addCriterion("D_Comprehension between", value1, value2, "dComprehension");
            return (Criteria) this;
        }

        public Criteria andDComprehensionNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDInternetResearchEqualTo(Byte value) {
            addCriterion("D_Internet_Research =", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotEqualTo(Byte value) {
            addCriterion("D_Internet_Research <>", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchGreaterThan(Byte value) {
            addCriterion("D_Internet_Research >", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Internet_Research >=", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchLessThan(Byte value) {
            addCriterion("D_Internet_Research <", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchLessThanOrEqualTo(Byte value) {
            addCriterion("D_Internet_Research <=", value, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchIn(List<Byte> values) {
            addCriterion("D_Internet_Research in", values, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotIn(List<Byte> values) {
            addCriterion("D_Internet_Research not in", values, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchBetween(Byte value1, Byte value2) {
            addCriterion("D_Internet_Research between", value1, value2, "dInternetResearch");
            return (Criteria) this;
        }

        public Criteria andDInternetResearchNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDSuspiciousEqualTo(Byte value) {
            addCriterion("D_Suspicious =", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotEqualTo(Byte value) {
            addCriterion("D_Suspicious <>", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousGreaterThan(Byte value) {
            addCriterion("D_Suspicious >", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Suspicious >=", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousLessThan(Byte value) {
            addCriterion("D_Suspicious <", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousLessThanOrEqualTo(Byte value) {
            addCriterion("D_Suspicious <=", value, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousIn(List<Byte> values) {
            addCriterion("D_Suspicious in", values, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotIn(List<Byte> values) {
            addCriterion("D_Suspicious not in", values, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousBetween(Byte value1, Byte value2) {
            addCriterion("D_Suspicious between", value1, value2, "dSuspicious");
            return (Criteria) this;
        }

        public Criteria andDSuspiciousNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDRepairEqualTo(Byte value) {
            addCriterion("D_Repair =", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotEqualTo(Byte value) {
            addCriterion("D_Repair <>", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairGreaterThan(Byte value) {
            addCriterion("D_Repair >", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Repair >=", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairLessThan(Byte value) {
            addCriterion("D_Repair <", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairLessThanOrEqualTo(Byte value) {
            addCriterion("D_Repair <=", value, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairIn(List<Byte> values) {
            addCriterion("D_Repair in", values, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotIn(List<Byte> values) {
            addCriterion("D_Repair not in", values, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairBetween(Byte value1, Byte value2) {
            addCriterion("D_Repair between", value1, value2, "dRepair");
            return (Criteria) this;
        }

        public Criteria andDRepairNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDImpulsionEqualTo(Byte value) {
            addCriterion("D_Impulsion =", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotEqualTo(Byte value) {
            addCriterion("D_Impulsion <>", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionGreaterThan(Byte value) {
            addCriterion("D_Impulsion >", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Impulsion >=", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionLessThan(Byte value) {
            addCriterion("D_Impulsion <", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionLessThanOrEqualTo(Byte value) {
            addCriterion("D_Impulsion <=", value, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionIn(List<Byte> values) {
            addCriterion("D_Impulsion in", values, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotIn(List<Byte> values) {
            addCriterion("D_Impulsion not in", values, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionBetween(Byte value1, Byte value2) {
            addCriterion("D_Impulsion between", value1, value2, "dImpulsion");
            return (Criteria) this;
        }

        public Criteria andDImpulsionNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDPriceEqualTo(Byte value) {
            addCriterion("D_Price =", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotEqualTo(Byte value) {
            addCriterion("D_Price <>", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThan(Byte value) {
            addCriterion("D_Price >", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Price >=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThan(Byte value) {
            addCriterion("D_Price <", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThanOrEqualTo(Byte value) {
            addCriterion("D_Price <=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceIn(List<Byte> values) {
            addCriterion("D_Price in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotIn(List<Byte> values) {
            addCriterion("D_Price not in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceBetween(Byte value1, Byte value2) {
            addCriterion("D_Price between", value1, value2, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDSlanderEqualTo(Byte value) {
            addCriterion("D_Slander =", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotEqualTo(Byte value) {
            addCriterion("D_Slander <>", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderGreaterThan(Byte value) {
            addCriterion("D_Slander >", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Slander >=", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderLessThan(Byte value) {
            addCriterion("D_Slander <", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderLessThanOrEqualTo(Byte value) {
            addCriterion("D_Slander <=", value, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderIn(List<Byte> values) {
            addCriterion("D_Slander in", values, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotIn(List<Byte> values) {
            addCriterion("D_Slander not in", values, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderBetween(Byte value1, Byte value2) {
            addCriterion("D_Slander between", value1, value2, "dSlander");
            return (Criteria) this;
        }

        public Criteria andDSlanderNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDForwardnessEqualTo(Byte value) {
            addCriterion("D_Forwardness =", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotEqualTo(Byte value) {
            addCriterion("D_Forwardness <>", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessGreaterThan(Byte value) {
            addCriterion("D_Forwardness >", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Forwardness >=", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessLessThan(Byte value) {
            addCriterion("D_Forwardness <", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessLessThanOrEqualTo(Byte value) {
            addCriterion("D_Forwardness <=", value, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessIn(List<Byte> values) {
            addCriterion("D_Forwardness in", values, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotIn(List<Byte> values) {
            addCriterion("D_Forwardness not in", values, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessBetween(Byte value1, Byte value2) {
            addCriterion("D_Forwardness between", value1, value2, "dForwardness");
            return (Criteria) this;
        }

        public Criteria andDForwardnessNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDPraiseEqualTo(Byte value) {
            addCriterion("D_Praise =", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotEqualTo(Byte value) {
            addCriterion("D_Praise <>", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseGreaterThan(Byte value) {
            addCriterion("D_Praise >", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Praise >=", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseLessThan(Byte value) {
            addCriterion("D_Praise <", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseLessThanOrEqualTo(Byte value) {
            addCriterion("D_Praise <=", value, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseIn(List<Byte> values) {
            addCriterion("D_Praise in", values, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotIn(List<Byte> values) {
            addCriterion("D_Praise not in", values, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseBetween(Byte value1, Byte value2) {
            addCriterion("D_Praise between", value1, value2, "dPraise");
            return (Criteria) this;
        }

        public Criteria andDPraiseNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDQuarrelEqualTo(Byte value) {
            addCriterion("D_Quarrel =", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotEqualTo(Byte value) {
            addCriterion("D_Quarrel <>", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelGreaterThan(Byte value) {
            addCriterion("D_Quarrel >", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Quarrel >=", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelLessThan(Byte value) {
            addCriterion("D_Quarrel <", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelLessThanOrEqualTo(Byte value) {
            addCriterion("D_Quarrel <=", value, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelIn(List<Byte> values) {
            addCriterion("D_Quarrel in", values, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotIn(List<Byte> values) {
            addCriterion("D_Quarrel not in", values, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelBetween(Byte value1, Byte value2) {
            addCriterion("D_Quarrel between", value1, value2, "dQuarrel");
            return (Criteria) this;
        }

        public Criteria andDQuarrelNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDArtDetailEqualTo(Byte value) {
            addCriterion("D_Art_Detail =", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotEqualTo(Byte value) {
            addCriterion("D_Art_Detail <>", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailGreaterThan(Byte value) {
            addCriterion("D_Art_Detail >", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Art_Detail >=", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailLessThan(Byte value) {
            addCriterion("D_Art_Detail <", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailLessThanOrEqualTo(Byte value) {
            addCriterion("D_Art_Detail <=", value, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailIn(List<Byte> values) {
            addCriterion("D_Art_Detail in", values, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotIn(List<Byte> values) {
            addCriterion("D_Art_Detail not in", values, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailBetween(Byte value1, Byte value2) {
            addCriterion("D_Art_Detail between", value1, value2, "dArtDetail");
            return (Criteria) this;
        }

        public Criteria andDArtDetailNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDScarEqualTo(Byte value) {
            addCriterion("D_Scar =", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotEqualTo(Byte value) {
            addCriterion("D_Scar <>", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarGreaterThan(Byte value) {
            addCriterion("D_Scar >", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Scar >=", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarLessThan(Byte value) {
            addCriterion("D_Scar <", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarLessThanOrEqualTo(Byte value) {
            addCriterion("D_Scar <=", value, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarIn(List<Byte> values) {
            addCriterion("D_Scar in", values, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotIn(List<Byte> values) {
            addCriterion("D_Scar not in", values, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarBetween(Byte value1, Byte value2) {
            addCriterion("D_Scar between", value1, value2, "dScar");
            return (Criteria) this;
        }

        public Criteria andDScarNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDFailEqualTo(Byte value) {
            addCriterion("D_Fail =", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotEqualTo(Byte value) {
            addCriterion("D_Fail <>", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailGreaterThan(Byte value) {
            addCriterion("D_Fail >", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Fail >=", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailLessThan(Byte value) {
            addCriterion("D_Fail <", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailLessThanOrEqualTo(Byte value) {
            addCriterion("D_Fail <=", value, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailIn(List<Byte> values) {
            addCriterion("D_Fail in", values, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotIn(List<Byte> values) {
            addCriterion("D_Fail not in", values, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailBetween(Byte value1, Byte value2) {
            addCriterion("D_Fail between", value1, value2, "dFail");
            return (Criteria) this;
        }

        public Criteria andDFailNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDNurseEqualTo(Byte value) {
            addCriterion("D_Nurse =", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotEqualTo(Byte value) {
            addCriterion("D_Nurse <>", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseGreaterThan(Byte value) {
            addCriterion("D_Nurse >", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Nurse >=", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseLessThan(Byte value) {
            addCriterion("D_Nurse <", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseLessThanOrEqualTo(Byte value) {
            addCriterion("D_Nurse <=", value, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseIn(List<Byte> values) {
            addCriterion("D_Nurse in", values, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotIn(List<Byte> values) {
            addCriterion("D_Nurse not in", values, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseBetween(Byte value1, Byte value2) {
            addCriterion("D_Nurse between", value1, value2, "dNurse");
            return (Criteria) this;
        }

        public Criteria andDNurseNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDPerfectEqualTo(Byte value) {
            addCriterion("D_Perfect =", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotEqualTo(Byte value) {
            addCriterion("D_Perfect <>", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectGreaterThan(Byte value) {
            addCriterion("D_Perfect >", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Perfect >=", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectLessThan(Byte value) {
            addCriterion("D_Perfect <", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectLessThanOrEqualTo(Byte value) {
            addCriterion("D_Perfect <=", value, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectIn(List<Byte> values) {
            addCriterion("D_Perfect in", values, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotIn(List<Byte> values) {
            addCriterion("D_Perfect not in", values, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectBetween(Byte value1, Byte value2) {
            addCriterion("D_Perfect between", value1, value2, "dPerfect");
            return (Criteria) this;
        }

        public Criteria andDPerfectNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDParanoidEqualTo(Byte value) {
            addCriterion("D_Paranoid =", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotEqualTo(Byte value) {
            addCriterion("D_Paranoid <>", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidGreaterThan(Byte value) {
            addCriterion("D_Paranoid >", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Paranoid >=", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidLessThan(Byte value) {
            addCriterion("D_Paranoid <", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidLessThanOrEqualTo(Byte value) {
            addCriterion("D_Paranoid <=", value, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidIn(List<Byte> values) {
            addCriterion("D_Paranoid in", values, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotIn(List<Byte> values) {
            addCriterion("D_Paranoid not in", values, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidBetween(Byte value1, Byte value2) {
            addCriterion("D_Paranoid between", value1, value2, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andDParanoidNotBetween(Byte value1, Byte value2) {
            addCriterion("D_Paranoid not between", value1, value2, "dParanoid");
            return (Criteria) this;
        }

        public Criteria andJudgementIsNull() {
            addCriterion("Judgement is null");
            return (Criteria) this;
        }

        public Criteria andJudgementIsNotNull() {
            addCriterion("Judgement is not null");
            return (Criteria) this;
        }

        public Criteria andJudgementEqualTo(Byte value) {
            addCriterion("Judgement =", value, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementNotEqualTo(Byte value) {
            addCriterion("Judgement <>", value, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementGreaterThan(Byte value) {
            addCriterion("Judgement >", value, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementGreaterThanOrEqualTo(Byte value) {
            addCriterion("Judgement >=", value, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementLessThan(Byte value) {
            addCriterion("Judgement <", value, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementLessThanOrEqualTo(Byte value) {
            addCriterion("Judgement <=", value, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementIn(List<Byte> values) {
            addCriterion("Judgement in", values, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementNotIn(List<Byte> values) {
            addCriterion("Judgement not in", values, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementBetween(Byte value1, Byte value2) {
            addCriterion("Judgement between", value1, value2, "judgement");
            return (Criteria) this;
        }

        public Criteria andJudgementNotBetween(Byte value1, Byte value2) {
            addCriterion("Judgement not between", value1, value2, "judgement");
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