package com.poc.form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm{
	
	private String id;
    private String name;
    private String email;
    private String mobile;
    private String address;
    private String createdDate;
    private String courseName;
    private double courseFee;
    
    
  
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getMobile() {
        return mobile;
    }
  
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
  
    
  
    public String getEmail() {
        return email;
    }
  
    public void setEmail(String email) {
        this.email = email;
    }
  
    public String getAddress() {
        return address;
    }
  
    public void setAddress(String address) {
        this.address = address;
    }
  
   
}
