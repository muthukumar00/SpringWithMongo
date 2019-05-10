package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class EmpModel {
	
	@Id
	private int id;
	private String name;
	private String designation;
	
	EmpModel() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String toString() {
		return "Employee[id="+ id + "name=" + name + "designation=" + designation + "]"; 
	}
	
	
}
