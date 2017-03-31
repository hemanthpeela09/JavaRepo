package com.poc.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class UserResult extends ActionForm{
	
	private int min;
	private int max;
	private List<UserForm> list = new ArrayList<UserForm>();
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public List<UserForm> getList() {
		return list;
	}
	public void setList(List<UserForm> list) {
		this.list = list;
	}
}
