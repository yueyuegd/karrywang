package info.karrywang.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNull() {
            addCriterion("BRANCHID is null");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNotNull() {
            addCriterion("BRANCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchidEqualTo(String value) {
            addCriterion("BRANCHID =", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotEqualTo(String value) {
            addCriterion("BRANCHID <>", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThan(String value) {
            addCriterion("BRANCHID >", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCHID >=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThan(String value) {
            addCriterion("BRANCHID <", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThanOrEqualTo(String value) {
            addCriterion("BRANCHID <=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLike(String value) {
            addCriterion("BRANCHID like", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotLike(String value) {
            addCriterion("BRANCHID not like", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidIn(List<String> values) {
            addCriterion("BRANCHID in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotIn(List<String> values) {
            addCriterion("BRANCHID not in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidBetween(String value1, String value2) {
            addCriterion("BRANCHID between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotBetween(String value1, String value2) {
            addCriterion("BRANCHID not between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBynameIsNull() {
            addCriterion("BYNAME is null");
            return (Criteria) this;
        }

        public Criteria andBynameIsNotNull() {
            addCriterion("BYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBynameEqualTo(String value) {
            addCriterion("BYNAME =", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotEqualTo(String value) {
            addCriterion("BYNAME <>", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameGreaterThan(String value) {
            addCriterion("BYNAME >", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameGreaterThanOrEqualTo(String value) {
            addCriterion("BYNAME >=", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLessThan(String value) {
            addCriterion("BYNAME <", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLessThanOrEqualTo(String value) {
            addCriterion("BYNAME <=", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLike(String value) {
            addCriterion("BYNAME like", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotLike(String value) {
            addCriterion("BYNAME not like", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameIn(List<String> values) {
            addCriterion("BYNAME in", values, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotIn(List<String> values) {
            addCriterion("BYNAME not in", values, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameBetween(String value1, String value2) {
            addCriterion("BYNAME between", value1, value2, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotBetween(String value1, String value2) {
            addCriterion("BYNAME not between", value1, value2, "byname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNull() {
            addCriterion("OFFICEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNotNull() {
            addCriterion("OFFICEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneEqualTo(String value) {
            addCriterion("OFFICEPHONE =", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotEqualTo(String value) {
            addCriterion("OFFICEPHONE <>", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThan(String value) {
            addCriterion("OFFICEPHONE >", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONE >=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThan(String value) {
            addCriterion("OFFICEPHONE <", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONE <=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLike(String value) {
            addCriterion("OFFICEPHONE like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotLike(String value) {
            addCriterion("OFFICEPHONE not like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIn(List<String> values) {
            addCriterion("OFFICEPHONE in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotIn(List<String> values) {
            addCriterion("OFFICEPHONE not in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneBetween(String value1, String value2) {
            addCriterion("OFFICEPHONE between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotBetween(String value1, String value2) {
            addCriterion("OFFICEPHONE not between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSkilllevelIsNull() {
            addCriterion("SKILLLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSkilllevelIsNotNull() {
            addCriterion("SKILLLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSkilllevelEqualTo(String value) {
            addCriterion("SKILLLEVEL =", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotEqualTo(String value) {
            addCriterion("SKILLLEVEL <>", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelGreaterThan(String value) {
            addCriterion("SKILLLEVEL >", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelGreaterThanOrEqualTo(String value) {
            addCriterion("SKILLLEVEL >=", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelLessThan(String value) {
            addCriterion("SKILLLEVEL <", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelLessThanOrEqualTo(String value) {
            addCriterion("SKILLLEVEL <=", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelLike(String value) {
            addCriterion("SKILLLEVEL like", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotLike(String value) {
            addCriterion("SKILLLEVEL not like", value, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelIn(List<String> values) {
            addCriterion("SKILLLEVEL in", values, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotIn(List<String> values) {
            addCriterion("SKILLLEVEL not in", values, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelBetween(String value1, String value2) {
            addCriterion("SKILLLEVEL between", value1, value2, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andSkilllevelNotBetween(String value1, String value2) {
            addCriterion("SKILLLEVEL not between", value1, value2, "skilllevel");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonIsNull() {
            addCriterion("VALIDCHGREASON is null");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonIsNotNull() {
            addCriterion("VALIDCHGREASON is not null");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonEqualTo(String value) {
            addCriterion("VALIDCHGREASON =", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonNotEqualTo(String value) {
            addCriterion("VALIDCHGREASON <>", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonGreaterThan(String value) {
            addCriterion("VALIDCHGREASON >", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDCHGREASON >=", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonLessThan(String value) {
            addCriterion("VALIDCHGREASON <", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonLessThanOrEqualTo(String value) {
            addCriterion("VALIDCHGREASON <=", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonLike(String value) {
            addCriterion("VALIDCHGREASON like", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonNotLike(String value) {
            addCriterion("VALIDCHGREASON not like", value, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonIn(List<String> values) {
            addCriterion("VALIDCHGREASON in", values, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonNotIn(List<String> values) {
            addCriterion("VALIDCHGREASON not in", values, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonBetween(String value1, String value2) {
            addCriterion("VALIDCHGREASON between", value1, value2, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidchgreasonNotBetween(String value1, String value2) {
            addCriterion("VALIDCHGREASON not between", value1, value2, "validchgreason");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNull() {
            addCriterion("VALIDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNotNull() {
            addCriterion("VALIDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidflagEqualTo(String value) {
            addCriterion("VALIDFLAG =", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotEqualTo(String value) {
            addCriterion("VALIDFLAG <>", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThan(String value) {
            addCriterion("VALIDFLAG >", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDFLAG >=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThan(String value) {
            addCriterion("VALIDFLAG <", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThanOrEqualTo(String value) {
            addCriterion("VALIDFLAG <=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLike(String value) {
            addCriterion("VALIDFLAG like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotLike(String value) {
            addCriterion("VALIDFLAG not like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagIn(List<String> values) {
            addCriterion("VALIDFLAG in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotIn(List<String> values) {
            addCriterion("VALIDFLAG not in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagBetween(String value1, String value2) {
            addCriterion("VALIDFLAG between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotBetween(String value1, String value2) {
            addCriterion("VALIDFLAG not between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andAcdqueueIsNull() {
            addCriterion("ACDQUEUE is null");
            return (Criteria) this;
        }

        public Criteria andAcdqueueIsNotNull() {
            addCriterion("ACDQUEUE is not null");
            return (Criteria) this;
        }

        public Criteria andAcdqueueEqualTo(String value) {
            addCriterion("ACDQUEUE =", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueNotEqualTo(String value) {
            addCriterion("ACDQUEUE <>", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueGreaterThan(String value) {
            addCriterion("ACDQUEUE >", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueGreaterThanOrEqualTo(String value) {
            addCriterion("ACDQUEUE >=", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueLessThan(String value) {
            addCriterion("ACDQUEUE <", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueLessThanOrEqualTo(String value) {
            addCriterion("ACDQUEUE <=", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueLike(String value) {
            addCriterion("ACDQUEUE like", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueNotLike(String value) {
            addCriterion("ACDQUEUE not like", value, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueIn(List<String> values) {
            addCriterion("ACDQUEUE in", values, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueNotIn(List<String> values) {
            addCriterion("ACDQUEUE not in", values, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueBetween(String value1, String value2) {
            addCriterion("ACDQUEUE between", value1, value2, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcdqueueNotBetween(String value1, String value2) {
            addCriterion("ACDQUEUE not between", value1, value2, "acdqueue");
            return (Criteria) this;
        }

        public Criteria andAcduseridIsNull() {
            addCriterion("ACDUSERID is null");
            return (Criteria) this;
        }

        public Criteria andAcduseridIsNotNull() {
            addCriterion("ACDUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andAcduseridEqualTo(String value) {
            addCriterion("ACDUSERID =", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridNotEqualTo(String value) {
            addCriterion("ACDUSERID <>", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridGreaterThan(String value) {
            addCriterion("ACDUSERID >", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridGreaterThanOrEqualTo(String value) {
            addCriterion("ACDUSERID >=", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridLessThan(String value) {
            addCriterion("ACDUSERID <", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridLessThanOrEqualTo(String value) {
            addCriterion("ACDUSERID <=", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridLike(String value) {
            addCriterion("ACDUSERID like", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridNotLike(String value) {
            addCriterion("ACDUSERID not like", value, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridIn(List<String> values) {
            addCriterion("ACDUSERID in", values, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridNotIn(List<String> values) {
            addCriterion("ACDUSERID not in", values, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridBetween(String value1, String value2) {
            addCriterion("ACDUSERID between", value1, value2, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduseridNotBetween(String value1, String value2) {
            addCriterion("ACDUSERID not between", value1, value2, "acduserid");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdIsNull() {
            addCriterion("ACDUSERPWD is null");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdIsNotNull() {
            addCriterion("ACDUSERPWD is not null");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdEqualTo(String value) {
            addCriterion("ACDUSERPWD =", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdNotEqualTo(String value) {
            addCriterion("ACDUSERPWD <>", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdGreaterThan(String value) {
            addCriterion("ACDUSERPWD >", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("ACDUSERPWD >=", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdLessThan(String value) {
            addCriterion("ACDUSERPWD <", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdLessThanOrEqualTo(String value) {
            addCriterion("ACDUSERPWD <=", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdLike(String value) {
            addCriterion("ACDUSERPWD like", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdNotLike(String value) {
            addCriterion("ACDUSERPWD not like", value, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdIn(List<String> values) {
            addCriterion("ACDUSERPWD in", values, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdNotIn(List<String> values) {
            addCriterion("ACDUSERPWD not in", values, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdBetween(String value1, String value2) {
            addCriterion("ACDUSERPWD between", value1, value2, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcduserpwdNotBetween(String value1, String value2) {
            addCriterion("ACDUSERPWD not between", value1, value2, "acduserpwd");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsIsNull() {
            addCriterion("ACWSECONDS is null");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsIsNotNull() {
            addCriterion("ACWSECONDS is not null");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsEqualTo(String value) {
            addCriterion("ACWSECONDS =", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsNotEqualTo(String value) {
            addCriterion("ACWSECONDS <>", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsGreaterThan(String value) {
            addCriterion("ACWSECONDS >", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsGreaterThanOrEqualTo(String value) {
            addCriterion("ACWSECONDS >=", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsLessThan(String value) {
            addCriterion("ACWSECONDS <", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsLessThanOrEqualTo(String value) {
            addCriterion("ACWSECONDS <=", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsLike(String value) {
            addCriterion("ACWSECONDS like", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsNotLike(String value) {
            addCriterion("ACWSECONDS not like", value, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsIn(List<String> values) {
            addCriterion("ACWSECONDS in", values, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsNotIn(List<String> values) {
            addCriterion("ACWSECONDS not in", values, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsBetween(String value1, String value2) {
            addCriterion("ACWSECONDS between", value1, value2, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andAcwsecondsNotBetween(String value1, String value2) {
            addCriterion("ACWSECONDS not between", value1, value2, "acwseconds");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("USERTYPE like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("USERTYPE not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andTrialIsNull() {
            addCriterion("trial is null");
            return (Criteria) this;
        }

        public Criteria andTrialIsNotNull() {
            addCriterion("trial is not null");
            return (Criteria) this;
        }

        public Criteria andTrialEqualTo(String value) {
            addCriterion("trial =", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotEqualTo(String value) {
            addCriterion("trial <>", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialGreaterThan(String value) {
            addCriterion("trial >", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialGreaterThanOrEqualTo(String value) {
            addCriterion("trial >=", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialLessThan(String value) {
            addCriterion("trial <", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialLessThanOrEqualTo(String value) {
            addCriterion("trial <=", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialLike(String value) {
            addCriterion("trial like", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotLike(String value) {
            addCriterion("trial not like", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialIn(List<String> values) {
            addCriterion("trial in", values, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotIn(List<String> values) {
            addCriterion("trial not in", values, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialBetween(String value1, String value2) {
            addCriterion("trial between", value1, value2, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotBetween(String value1, String value2) {
            addCriterion("trial not between", value1, value2, "trial");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andEntrymonthIsNull() {
            addCriterion("entryMonth is null");
            return (Criteria) this;
        }

        public Criteria andEntrymonthIsNotNull() {
            addCriterion("entryMonth is not null");
            return (Criteria) this;
        }

        public Criteria andEntrymonthEqualTo(Integer value) {
            addCriterion("entryMonth =", value, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthNotEqualTo(Integer value) {
            addCriterion("entryMonth <>", value, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthGreaterThan(Integer value) {
            addCriterion("entryMonth >", value, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("entryMonth >=", value, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthLessThan(Integer value) {
            addCriterion("entryMonth <", value, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthLessThanOrEqualTo(Integer value) {
            addCriterion("entryMonth <=", value, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthIn(List<Integer> values) {
            addCriterion("entryMonth in", values, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthNotIn(List<Integer> values) {
            addCriterion("entryMonth not in", values, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthBetween(Integer value1, Integer value2) {
            addCriterion("entryMonth between", value1, value2, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrymonthNotBetween(Integer value1, Integer value2) {
            addCriterion("entryMonth not between", value1, value2, "entrymonth");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNull() {
            addCriterion("entryTime is null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNotNull() {
            addCriterion("entryTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeEqualTo(Date value) {
            addCriterion("entryTime =", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotEqualTo(Date value) {
            addCriterion("entryTime <>", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThan(Date value) {
            addCriterion("entryTime >", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entryTime >=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThan(Date value) {
            addCriterion("entryTime <", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThanOrEqualTo(Date value) {
            addCriterion("entryTime <=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIn(List<Date> values) {
            addCriterion("entryTime in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotIn(List<Date> values) {
            addCriterion("entryTime not in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeBetween(Date value1, Date value2) {
            addCriterion("entryTime between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotBetween(Date value1, Date value2) {
            addCriterion("entryTime not between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeIsNull() {
            addCriterion("destoryTime is null");
            return (Criteria) this;
        }

        public Criteria andDestorytimeIsNotNull() {
            addCriterion("destoryTime is not null");
            return (Criteria) this;
        }

        public Criteria andDestorytimeEqualTo(Date value) {
            addCriterion("destoryTime =", value, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeNotEqualTo(Date value) {
            addCriterion("destoryTime <>", value, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeGreaterThan(Date value) {
            addCriterion("destoryTime >", value, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("destoryTime >=", value, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeLessThan(Date value) {
            addCriterion("destoryTime <", value, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeLessThanOrEqualTo(Date value) {
            addCriterion("destoryTime <=", value, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeIn(List<Date> values) {
            addCriterion("destoryTime in", values, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeNotIn(List<Date> values) {
            addCriterion("destoryTime not in", values, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeBetween(Date value1, Date value2) {
            addCriterion("destoryTime between", value1, value2, "destorytime");
            return (Criteria) this;
        }

        public Criteria andDestorytimeNotBetween(Date value1, Date value2) {
            addCriterion("destoryTime not between", value1, value2, "destorytime");
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