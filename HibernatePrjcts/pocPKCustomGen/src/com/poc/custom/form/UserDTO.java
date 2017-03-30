package com.poc.custom.form;

import org.apache.struts.action.ActionForm;

public class UserDTO extends ActionForm{
	
	private String acctno;
    private String name;
    private String email;
    private String gender;
    private String mobile;
    private String address;
    private String username;
    private String password;
  
    public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
        return gender;
    }
  
    public void setGender(String gender) {
        this.gender = gender;
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
  
    public String getUsername() {
        return username;
    }
  
    public void setUsername(String username) {
        this.username = username;
    }
  
    public String getPassword() {
        return password;
    }
  
    public void setPassword(String password) {
        this.password = password;
    }
}
