package com.cts.struts2.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class RegAction extends ActionSupport {
	private String name;
	private String phone;
	private String email;
	private String gender;
	private String country;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String execute(){  
		if(StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(phone) 
			&& StringUtils.isNotEmpty(email)) {
			return "success";
		} else {
			return "error";
		}
	}
	
	public void validate() {
		if(StringUtils.isEmpty(name)) {
			addFieldError("name", getText("error.name"));
		}
		if(StringUtils.isEmpty(phone)) {
			addFieldError("phone", getText("error.phone"));
		}
		if(StringUtils.isEmpty(phone)) {
			addFieldError("email", getText("error.email"));
		}
		super.validate();
	}
}
