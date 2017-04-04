package com.poc.form;

public class SEmployee extends Employee {
	private String tool;

	public SEmployee(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.setTool(tool);
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}
	
	
	
	
}
