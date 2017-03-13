package com.poc.form;

public class Student {
	
	  private int id;
	  private String name;
	  private String email;
	  private String address;
	  private String createdDate;
	  private String courseName;
	  
	  public String getCreatedDate()
	  {
	    return this.createdDate;
	  }
	  
	  public void setCreatedDate(String createdDate)
	  {
	    this.createdDate = createdDate;
	  }
	  
	  public int getId()
	  {
	    return this.id;
	  }
	  
	  public void setId(int id)
	  {
	    this.id = id;
	  }
	  
	  public String getName()
	  {
	    return this.name;
	  }
	  
	  public void setName(String name)
	  {
	    this.name = name;
	  }
	  
	  public String getEmail()
	  {
	    return this.email;
	  }
	  
	  public void setEmail(String email)
	  {
	    this.email = email;
	  }
	  
	  public String getAddress()
	  {
	    return this.address;
	  }
	  
	  public void setAddress(String address)
	  {
	    this.address = address;
	  }
	  
	  public String getCourseName()
	  {
	    return this.courseName;
	  }
	  
	  public void setCourseName(String courseName)
	  {
	    this.courseName = courseName;
	  }
}
