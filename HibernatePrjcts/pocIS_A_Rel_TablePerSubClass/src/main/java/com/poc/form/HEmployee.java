package com.poc.form;

public class HEmployee extends Employee {
	private int wrkngHrs;
	
	public HEmployee(int id, String name, String email, int salary, int wrkngHrs) {
		super(id, name, email, salary);
		this.setWrkngHrs(wrkngHrs);
	}

	public int getWrkngHrs() {
		return wrkngHrs;
	}

	public void setWrkngHrs(int wrkngHrs) {
		this.wrkngHrs = wrkngHrs;
	}
	
}
