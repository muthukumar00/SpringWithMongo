package com.example.service;

import java.util.Collection;
import java.util.List;

import com.example.model.EmpModel;

public interface EmpolyeeService {
	
	public void createEmployee(List<EmpModel> emp);
	public Collection<EmpModel> getEmployee();
}
