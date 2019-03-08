package com.howtodoinjava.dept.vo;

import java.util.List;

public class Department {

	private String id;
	private String name;
	private List<Object> emps;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Object> getEmps() {
		return emps;
	}
	public void setEmps(List<Object> emps) {
		this.emps = emps;
	}
	
}
