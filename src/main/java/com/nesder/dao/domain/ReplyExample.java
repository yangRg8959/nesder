package com.nesder.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.reply
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.reply
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.reply
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public ReplyExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.reply
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.reply
	 * @mbg.generated
	 */
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

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andCreate_dateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreate_dateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreate_dateEqualTo(Date value) {
			addCriterion("create_date =", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateGreaterThan(Date value) {
			addCriterion("create_date >", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateLessThan(Date value) {
			addCriterion("create_date <", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateIn(List<Date> values) {
			addCriterion("create_date in", values, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "create_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateIsNull() {
			addCriterion("modify_date is null");
			return (Criteria) this;
		}

		public Criteria andModify_dateIsNotNull() {
			addCriterion("modify_date is not null");
			return (Criteria) this;
		}

		public Criteria andModify_dateEqualTo(Date value) {
			addCriterion("modify_date =", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateNotEqualTo(Date value) {
			addCriterion("modify_date <>", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateGreaterThan(Date value) {
			addCriterion("modify_date >", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateGreaterThanOrEqualTo(Date value) {
			addCriterion("modify_date >=", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateLessThan(Date value) {
			addCriterion("modify_date <", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateLessThanOrEqualTo(Date value) {
			addCriterion("modify_date <=", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateIn(List<Date> values) {
			addCriterion("modify_date in", values, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateNotIn(List<Date> values) {
			addCriterion("modify_date not in", values, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateBetween(Date value1, Date value2) {
			addCriterion("modify_date between", value1, value2, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateNotBetween(Date value1, Date value2) {
			addCriterion("modify_date not between", value1, value2, "modify_date");
			return (Criteria) this;
		}

		public Criteria andAidIsNull() {
			addCriterion("aid is null");
			return (Criteria) this;
		}

		public Criteria andAidIsNotNull() {
			addCriterion("aid is not null");
			return (Criteria) this;
		}

		public Criteria andAidEqualTo(Integer value) {
			addCriterion("aid =", value, "aid");
			return (Criteria) this;
		}

		public Criteria andAidNotEqualTo(Integer value) {
			addCriterion("aid <>", value, "aid");
			return (Criteria) this;
		}

		public Criteria andAidGreaterThan(Integer value) {
			addCriterion("aid >", value, "aid");
			return (Criteria) this;
		}

		public Criteria andAidGreaterThanOrEqualTo(Integer value) {
			addCriterion("aid >=", value, "aid");
			return (Criteria) this;
		}

		public Criteria andAidLessThan(Integer value) {
			addCriterion("aid <", value, "aid");
			return (Criteria) this;
		}

		public Criteria andAidLessThanOrEqualTo(Integer value) {
			addCriterion("aid <=", value, "aid");
			return (Criteria) this;
		}

		public Criteria andAidIn(List<Integer> values) {
			addCriterion("aid in", values, "aid");
			return (Criteria) this;
		}

		public Criteria andAidNotIn(List<Integer> values) {
			addCriterion("aid not in", values, "aid");
			return (Criteria) this;
		}

		public Criteria andAidBetween(Integer value1, Integer value2) {
			addCriterion("aid between", value1, value2, "aid");
			return (Criteria) this;
		}

		public Criteria andAidNotBetween(Integer value1, Integer value2) {
			addCriterion("aid not between", value1, value2, "aid");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("uid is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("uid not between", value1, value2, "uid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.reply
	 * @mbg.generated
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.reply
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}