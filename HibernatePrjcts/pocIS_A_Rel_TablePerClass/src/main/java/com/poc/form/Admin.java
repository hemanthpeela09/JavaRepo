package com.poc.form;

public class Admin extends Employee {
	private String branchName;

	public Admin(int id, String name, String email, int salary, String branchName) {
		super(id, name, email, salary);
		this.setBranchName(branchName);
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
