package com.nesder.dao.domain;

public class Channel {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.name
	 * @mbg.generated
	 */
	private Integer name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.created_account
	 * @mbg.generated
	 */
	private Integer created_account;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.mid
	 * @mbg.generated
	 */
	private Integer mid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.id
	 * @return  the value of public.channel.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.id
	 * @param id  the value for public.channel.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.name
	 * @return  the value of public.channel.name
	 * @mbg.generated
	 */
	public Integer getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.name
	 * @param name  the value for public.channel.name
	 * @mbg.generated
	 */
	public void setName(Integer name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.created_account
	 * @return  the value of public.channel.created_account
	 * @mbg.generated
	 */
	public Integer getCreated_account() {
		return created_account;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.created_account
	 * @param created_account  the value for public.channel.created_account
	 * @mbg.generated
	 */
	public void setCreated_account(Integer created_account) {
		this.created_account = created_account;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.mid
	 * @return  the value of public.channel.mid
	 * @mbg.generated
	 */
	public Integer getMid() {
		return mid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.mid
	 * @param mid  the value for public.channel.mid
	 * @mbg.generated
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}
}